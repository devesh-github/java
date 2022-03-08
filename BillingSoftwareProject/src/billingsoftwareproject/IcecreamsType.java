
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for icecreamsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="icecreamsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Chocolate"/>
 *     &lt;enumeration value="Butterscotch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "icecreamsType")
@XmlEnum
public enum IcecreamsType {

    @XmlEnumValue("Chocolate")
    CHOCOLATE("Chocolate"),
    @XmlEnumValue("Butterscotch")
    BUTTERSCOTCH("Butterscotch");
    private final String value;

    IcecreamsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IcecreamsType fromValue(String v) {
        for (IcecreamsType c: IcecreamsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
