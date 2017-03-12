
package parkservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for automerk.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="automerk">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Audi"/>
 *     &lt;enumeration value="Volkswagen"/>
 *     &lt;enumeration value="Volvo"/>
 *     &lt;enumeration value="BMW"/>
 *     &lt;enumeration value="Mercedes"/>
 *     &lt;enumeration value="Toyota"/>
 *     &lt;enumeration value="Seat"/>
 *     &lt;enumeration value="Opel"/>
 *     &lt;enumeration value="Saab"/>
 *     &lt;enumeration value="Honda"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "automerk", namespace = "http://parkeerplaatsservice/enums/automerk")
@XmlEnum
public enum Automerk {

    @XmlEnumValue("Audi")
    AUDI("Audi"),
    @XmlEnumValue("Volkswagen")
    VOLKSWAGEN("Volkswagen"),
    @XmlEnumValue("Volvo")
    VOLVO("Volvo"),
    BMW("BMW"),
    @XmlEnumValue("Mercedes")
    MERCEDES("Mercedes"),
    @XmlEnumValue("Toyota")
    TOYOTA("Toyota"),
    @XmlEnumValue("Seat")
    SEAT("Seat"),
    @XmlEnumValue("Opel")
    OPEL("Opel"),
    @XmlEnumValue("Saab")
    SAAB("Saab"),
    @XmlEnumValue("Honda")
    HONDA("Honda");
    private final String value;

    Automerk(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Automerk fromValue(String v) {
        for (Automerk c: Automerk.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
