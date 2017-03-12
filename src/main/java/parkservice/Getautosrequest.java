
package parkservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getautosrequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getautosrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all minOccurs="0">
 *         &lt;element name="iets" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getautosrequest", propOrder = {

})
public class Getautosrequest {

    protected String iets;

    /**
     * Gets the value of the iets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIets() {
        return iets;
    }

    /**
     * Sets the value of the iets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIets(String value) {
        this.iets = value;
    }

}
