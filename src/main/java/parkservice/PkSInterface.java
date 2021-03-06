
package parkservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PkS-Interface", targetNamespace = "http://parkeerplaatsservice/berichten/message")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PkSInterface {


    /**
     * 
     * @param getrequest
     * @return
     *     returns parkservice.Getaantallenresponse
     * @throws Inputfault
     */
    @WebMethod
    @WebResult(name = "getaantallenresponse", targetNamespace = "http://parkeerplaatsservice/berichten/getaantallenresponse", partName = "getresponse")
    public Getaantallenresponse getAantalParkeerplaatsen(
        @WebParam(name = "getaantallen", targetNamespace = "http://parkeerplaatsservice/berichten/getaantallenrequest", partName = "getrequest")
        Getaantallenrequest getrequest)
        throws Inputfault
    ;

    /**
     * 
     * @param nieuwrequest
     * @return
     *     returns parkservice.Nieuweautoresponse
     * @throws Inputfault
     */
    @WebMethod
    @WebResult(name = "nieuweautoresponse", targetNamespace = "http://parkeerplaatsservice/berichten/nieuweautoresponse", partName = "nieuwresponse")
    public Nieuweautoresponse nieuweAuto(
        @WebParam(name = "nieuweautorequest", targetNamespace = "http://parkeerplaatsservice/berichten/nieuweautorequest", partName = "nieuwrequest")
        Nieuweautorequest nieuwrequest)
        throws Inputfault
    ;

    /**
     * 
     * @param getautosrequest
     * @return
     *     returns parkservice.Getautosresponse
     * @throws Inputfault
     */
    @WebMethod
    @WebResult(name = "getautosresponse", targetNamespace = "http://parkeerplaatsservice/berichten/getautosresponse", partName = "getautosresponse")
    public Getautosresponse getGeparkeerdeAutos(
        @WebParam(name = "getautosrequest", targetNamespace = "http://parkeerplaatsservice/berichten/getautosrequest", partName = "getautosrequest")
        Getautosrequest getautosrequest)
        throws Inputfault
    ;

    /**
     * 
     * @param verwijderautorequest
     * @return
     *     returns parkservice.Nieuweautoresponse
     * @throws Inputfault
     */
    @WebMethod
    @WebResult(name = "nieuweautoresponse", targetNamespace = "http://parkeerplaatsservice/berichten/nieuweautoresponse", partName = "nieuwresponse")
    public Nieuweautoresponse verwijderAuto(
        @WebParam(name = "verwijderautorequest", targetNamespace = "http://parkeerplaatsservice/berichten/verwijderautorequest", partName = "verwijderautorequest")
        Verwijderautorequest verwijderautorequest)
        throws Inputfault
    ;

}
