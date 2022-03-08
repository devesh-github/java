
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toysType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="toysType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Toy1"/>
 *     &lt;enumeration value="Toy2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "toysType")
@XmlEnum
public enum ToysType {

    @XmlEnumValue("Toy1")
    TOY_1("Toy1"),
    @XmlEnumValue("Toy2")
    TOY_2("Toy2");
    private final String value;

    ToysType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToysType fromValue(String v) {
        for (ToysType c: ToysType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
