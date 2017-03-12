
package parkservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getautosresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getautosresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auto" type="{http://parkeerplaatsservice/objecten/auto}auto" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getautosresponse", namespace = "http://parkeerplaatsservice/berichten/getautosresponse", propOrder = {
    "auto"
})
public class Getautosresponse {

    @XmlElement(required = true)
    protected List<Auto> auto;

    /**
     * Gets the value of the auto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Auto }
     * 
     * 
     */
    public List<Auto> getAuto() {
        if (auto == null) {
            auto = new ArrayList<Auto>();
        }
        return this.auto;
    }

}
