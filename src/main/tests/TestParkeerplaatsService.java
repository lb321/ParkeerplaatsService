import model.JsonConverter;
import model.Parkeerplaats;
import model.ParkeerplaatsServiceImpl;
import org.junit.Before;
import org.junit.Test;
import parkservice.*;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertTrue;

public class TestParkeerplaatsService {
    private int aantalVrij;
    private int aantalBezet;
    private Parkeerplaats parkeerplaats;
    private ObjectFactory factory = new ObjectFactory();
    private ParkeerplaatsServiceImpl parkeerplaatsService = new ParkeerplaatsServiceImpl();

    @Before
    public void setUp(){
        parkeerplaats = JsonConverter.getParkeerplaats();
        aantalVrij = parkeerplaats.getVrij();
        aantalBezet = parkeerplaats.getBezet();
    }

    @Test
    public void getAantalParkeerplaatsen(){//kijk of totaal =  bezet + vrij
        Getaantallenrequest request = factory.createGetaantallenrequest();
        Getaantallenresponse response = parkeerplaatsService.getAantalParkeerplaatsen(request);
        assertTrue(response.getTotaal().equals(response.getBezet().add(response.getVrij())));
    }

    @Test
    public void testNieuweAuto() throws Exception {
        Nieuweautorequest request = factory.createNieuweautorequest();
        request.setKenteken("xx-00-xx");
        request.setMerk(Automerk.values()[ThreadLocalRandom.current().nextInt(0, Automerk.values().length)]);
        parkeerplaatsService.nieuweAuto(request);
        parkeerplaats = JsonConverter.getParkeerplaats();
        assertTrue(parkeerplaats.getVrij() == aantalVrij - 1 && parkeerplaats.getBezet() == aantalBezet + 1);
    }

    @Test
    public void testVerwijderAuto() throws Exception {
        Verwijderautorequest request = factory.createVerwijderautorequest();
        request.setKenteken("xx-00-xx");
        parkeerplaatsService.verwijderAuto(request);
        parkeerplaats = JsonConverter.getParkeerplaats();
        assertTrue(parkeerplaats.getVrij() == aantalVrij + 1 && parkeerplaats.getBezet() == aantalBezet - 1);
    }

    @Test
    public void testGetGeparkeerdeAutos() {
        Getautosrequest request = factory.createGetautosrequest();
        Getautosresponse response = parkeerplaatsService.getGeparkeerdeAutos(request);
        assertTrue(response.getAuto().size() == parkeerplaats.getBezet());
    }

}
