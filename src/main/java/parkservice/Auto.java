
package parkservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for auto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kenteken" type="{http://parkeerplaatsservice/objecten/auto}kenteken"/>
 *         &lt;element name="aankomst" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="vertrek" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="merk" type="{http://parkeerplaatsservice/enums/automerk}automerk"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auto", namespace = "http://parkeerplaatsservice/objecten/auto", propOrder = {
    "kenteken",
    "aankomst",
    "vertrek",
    "merk"
})
public class Auto {

    @XmlElement(required = true)
    protected String kenteken;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aankomst;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vertrek;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Automerk merk;

    /**
     * Gets the value of the kenteken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKenteken() {
        return kenteken;
    }

    /**
     * Sets the value of the kenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKenteken(String value) {
        this.kenteken = value;
    }

    /**
     * Gets the value of the aankomst property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAankomst() {
        return aankomst;
    }

    /**
     * Sets the value of the aankomst property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAankomst(XMLGregorianCalendar value) {
        this.aankomst = value;
    }

    /**
     * Gets the value of the vertrek property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVertrek() {
        return vertrek;
    }

    /**
     * Sets the value of the vertrek property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVertrek(XMLGregorianCalendar value) {
        this.vertrek = value;
    }

    /**
     * Gets the value of the merk property.
     * 
     * @return
     *     possible object is
     *     {@link Automerk }
     *     
     */
    public Automerk getMerk() {
        return merk;
    }

    /**
     * Sets the value of the merk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Automerk }
     *     
     */
    public void setMerk(Automerk value) {
        this.merk = value;
    }

}
