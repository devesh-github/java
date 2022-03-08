
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for burgherType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="burgherType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonVegBurgher"/>
 *     &lt;enumeration value="VegBurgher"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "burgherType")
@XmlEnum
public enum BurgherType {

    @XmlEnumValue("NonVegBurgher")
    NON_VEG_BURGHER("NonVegBurgher"),
    @XmlEnumValue("VegBurgher")
    VEG_BURGHER("VegBurgher");
    private final String value;

    BurgherType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BurgherType fromValue(String v) {
        for (BurgherType c: BurgherType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
