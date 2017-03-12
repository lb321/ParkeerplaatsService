package model;

import parkservice.*;

import javax.jws.WebService;
import java.math.BigInteger;
import java.util.Date;

@WebService(endpointInterface = "parkservice.PkSInterface")
public class ParkeerplaatsServiceImpl implements PkSInterface {
    private ObjectFactory factory = new ObjectFactory();

    @Override
    public Getaantallenresponse getAantalParkeerplaatsen(Getaantallenrequest getrequest) {
        Parkeerplaats parkeerplaats = JsonConverter.getParkeerplaats();
        Getaantallenresponse response = factory.createGetaantallenresponse();
        response.setVrij(BigInteger.valueOf(parkeerplaats.getVrij()));
        response.setTotaal(BigInteger.valueOf(parkeerplaats.getTotaal()));
        response.setBezet(BigInteger.valueOf(parkeerplaats.getBezet()));
        return response;
    }

    @Override
    public Nieuweautoresponse nieuweAuto(Nieuweautorequest nieuwrequest) throws Inputfault{
        Nieuweautoresponse response = factory.createNieuweautoresponse();
        try {
            String kenteken = nieuwrequest.getKenteken();
            if(kenteken.length() != 8)
                throw new Exception(kenteken + " is geen geldig kenteken");
            Auto auto = new Auto();
            auto.setKenteken(nieuwrequest.getKenteken());
            auto.setAankomst(DateConverter.javaDateToXmlDate(new Date()));
            auto.setMerk(nieuwrequest.getMerk());
            JsonConverter.getParkeerplaats().voegAutoToe(auto);
            response.setGelukt(true);
        } catch (Exception e) {
            response.setGelukt(false);
            Fault faultInfo = factory.createFault();
            faultInfo.setMessage(e.getMessage());
            throw new Inputfault("Fout met nieuwe auto toevoegen",faultInfo);
        }
        return response;
    }

    @Override
    public Getautosresponse getGeparkeerdeAutos(Getautosrequest getautosrequest) {
        Parkeerplaats parkeerplaats = JsonConverter.getParkeerplaats();
        Getautosresponse response = factory.createGetautosresponse();
        response.getAuto().addAll(parkeerplaats.getAutos());
        return response;
    }

    @Override
    public Nieuweautoresponse verwijderAuto(Verwijderautorequest verwijderautorequest) throws Inputfault {
        Nieuweautoresponse response = factory.createNieuweautoresponse();
        try {
            JsonConverter.getParkeerplaats().verwijderAuto(verwijderautorequest.getKenteken());
            response.setGelukt(true);
        } catch (Exception e) {
            response.setGelukt(false);
            Fault faultInfo = factory.createFault();
            faultInfo.setMessage(e.getMessage());
            throw new Inputfault("Fout met auto verwijderen",faultInfo);
        }
        return response;
    }
}
