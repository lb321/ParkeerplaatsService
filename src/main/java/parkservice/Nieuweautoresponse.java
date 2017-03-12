
package parkservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nieuweautoresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nieuweautoresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gelukt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nieuweautoresponse", namespace = "http://parkeerplaatsservice/berichten/nieuweautoresponse", propOrder = {

})
public class Nieuweautoresponse {

    protected boolean gelukt;

    /**
     * Gets the value of the gelukt property.
     * 
     */
    public boolean isGelukt() {
        return gelukt;
    }

    /**
     * Sets the value of the gelukt property.
     * 
     */
    public void setGelukt(boolean value) {
        this.gelukt = value;
    }

}
