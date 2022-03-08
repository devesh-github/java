
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for friesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="friesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonVegfries"/>
 *     &lt;enumeration value="Vegfries"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "friesType")
@XmlEnum
public enum FriesType {

    @XmlEnumValue("NonVegfries")
    NON_VEGFRIES("NonVegfries"),
    @XmlEnumValue("Vegfries")
    VEGFRIES("Vegfries");
    private final String value;

    FriesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FriesType fromValue(String v) {
        for (FriesType c: FriesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
