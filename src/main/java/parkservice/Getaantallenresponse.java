
package parkservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getaantallenresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getaantallenresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bezet" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="vrij" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="totaal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getaantallenresponse", namespace = "http://parkeerplaatsservice/berichten/getaantallenresponse", propOrder = {

})
public class Getaantallenresponse {

    @XmlElement(required = true)
    protected BigInteger bezet;
    @XmlElement(required = true)
    protected BigInteger vrij;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totaal;

    /**
     * Gets the value of the bezet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBezet() {
        return bezet;
    }

    /**
     * Sets the value of the bezet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBezet(BigInteger value) {
        this.bezet = value;
    }

    /**
     * Gets the value of the vrij property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVrij() {
        return vrij;
    }

    /**
     * Sets the value of the vrij property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVrij(BigInteger value) {
        this.vrij = value;
    }

    /**
     * Gets the value of the totaal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotaal() {
        return totaal;
    }

    /**
     * Sets the value of the totaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotaal(BigInteger value) {
        this.totaal = value;
    }

}
