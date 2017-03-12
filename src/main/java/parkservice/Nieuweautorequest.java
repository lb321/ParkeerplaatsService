
package parkservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nieuweautorequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nieuweautorequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="kenteken" type="{http://parkeerplaatsservice/objecten/auto}kenteken"/>
 *         &lt;element name="merk" type="{http://parkeerplaatsservice/enums/automerk}automerk" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nieuweautorequest", namespace = "http://parkeerplaatsservice/berichten/nieuweautorequest", propOrder = {

})
public class Nieuweautorequest {

    @XmlElement(required = true)
    protected String kenteken;
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
