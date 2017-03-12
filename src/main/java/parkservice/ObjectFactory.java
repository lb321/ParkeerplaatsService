
package parkservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the parkservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Getaantallenresponse_QNAME = new QName("http://parkeerplaatsservice/berichten/getaantallenresponse", "getaantallenresponse");
    private final static QName _Getaantallen_QNAME = new QName("http://parkeerplaatsservice/berichten/getaantallenrequest", "getaantallen");
    private final static QName _Nieuweautorequest_QNAME = new QName("http://parkeerplaatsservice/berichten/nieuweautorequest", "nieuweautorequest");
    private final static QName _Getautosrequest_QNAME = new QName("http://parkeerplaatsservice/berichten/getautosrequest", "getautosrequest");
    private final static QName _Nieuweautoresponse_QNAME = new QName("http://parkeerplaatsservice/berichten/nieuweautoresponse", "nieuweautoresponse");
    private final static QName _Verwijderautorequest_QNAME = new QName("http://parkeerplaatsservice/berichten/verwijderautorequest", "verwijderautorequest");
    private final static QName _Automerk_QNAME = new QName("http://parkeerplaatsservice/enums/automerk", "automerk");
    private final static QName _Auto_QNAME = new QName("http://parkeerplaatsservice/objecten/auto", "auto");
    private final static QName _Getautosresponse_QNAME = new QName("http://parkeerplaatsservice/berichten/getautosresponse", "getautosresponse");
    private final static QName _Fault_QNAME = new QName("http://parkeerplaatsservice/errors/fault", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: parkservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Getaantallenrequest }
     * 
     */
    public Getaantallenrequest createGetaantallenrequest() {
        return new Getaantallenrequest();
    }

    /**
     * Create an instance of {@link Getaantallenresponse }
     * 
     */
    public Getaantallenresponse createGetaantallenresponse() {
        return new Getaantallenresponse();
    }

    /**
     * Create an instance of {@link Nieuweautorequest }
     * 
     */
    public Nieuweautorequest createNieuweautorequest() {
        return new Nieuweautorequest();
    }

    /**
     * Create an instance of {@link Auto }
     * 
     */
    public Auto createAuto() {
        return new Auto();
    }

    /**
     * Create an instance of {@link Nieuweautoresponse }
     * 
     */
    public Nieuweautoresponse createNieuweautoresponse() {
        return new Nieuweautoresponse();
    }

    /**
     * Create an instance of {@link Getautosrequest }
     * 
     */
    public Getautosrequest createGetautosrequest() {
        return new Getautosrequest();
    }

    /**
     * Create an instance of {@link Getautosresponse }
     * 
     */
    public Getautosresponse createGetautosresponse() {
        return new Getautosresponse();
    }

    /**
     * Create an instance of {@link Verwijderautorequest }
     * 
     */
    public Verwijderautorequest createVerwijderautorequest() {
        return new Verwijderautorequest();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getaantallenresponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/getaantallenresponse", name = "getaantallenresponse")
    public JAXBElement<Getaantallenresponse> createGetaantallenresponse(Getaantallenresponse value) {
        return new JAXBElement<Getaantallenresponse>(_Getaantallenresponse_QNAME, Getaantallenresponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getaantallenrequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/getaantallenrequest", name = "getaantallen")
    public JAXBElement<Getaantallenrequest> createGetaantallen(Getaantallenrequest value) {
        return new JAXBElement<Getaantallenrequest>(_Getaantallen_QNAME, Getaantallenrequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nieuweautorequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/nieuweautorequest", name = "nieuweautorequest")
    public JAXBElement<Nieuweautorequest> createNieuweautorequest(Nieuweautorequest value) {
        return new JAXBElement<Nieuweautorequest>(_Nieuweautorequest_QNAME, Nieuweautorequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getautosrequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/getautosrequest", name = "getautosrequest")
    public JAXBElement<Getautosrequest> createGetautosrequest(Getautosrequest value) {
        return new JAXBElement<Getautosrequest>(_Getautosrequest_QNAME, Getautosrequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nieuweautoresponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/nieuweautoresponse", name = "nieuweautoresponse")
    public JAXBElement<Nieuweautoresponse> createNieuweautoresponse(Nieuweautoresponse value) {
        return new JAXBElement<Nieuweautoresponse>(_Nieuweautoresponse_QNAME, Nieuweautoresponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verwijderautorequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/verwijderautorequest", name = "verwijderautorequest")
    public JAXBElement<Verwijderautorequest> createVerwijderautorequest(Verwijderautorequest value) {
        return new JAXBElement<Verwijderautorequest>(_Verwijderautorequest_QNAME, Verwijderautorequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Automerk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/enums/automerk", name = "automerk")
    public JAXBElement<Automerk> createAutomerk(Automerk value) {
        return new JAXBElement<Automerk>(_Automerk_QNAME, Automerk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/objecten/auto", name = "auto")
    public JAXBElement<Auto> createAuto(Auto value) {
        return new JAXBElement<Auto>(_Auto_QNAME, Auto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getautosresponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/berichten/getautosresponse", name = "getautosresponse")
    public JAXBElement<Getautosresponse> createGetautosresponse(Getautosresponse value) {
        return new JAXBElement<Getautosresponse>(_Getautosresponse_QNAME, Getautosresponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkeerplaatsservice/errors/fault", name = "fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

}
