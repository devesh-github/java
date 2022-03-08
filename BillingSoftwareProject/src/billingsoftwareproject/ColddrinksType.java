
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colddrinksType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="colddrinksType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Coke"/>
 *     &lt;enumeration value="Pepsi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "colddrinksType")
@XmlEnum
public enum ColddrinksType {

    @XmlEnumValue("Coke")
    COKE("Coke"),
    @XmlEnumValue("Pepsi")
    PEPSI("Pepsi");
    private final String value;

    ColddrinksType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColddrinksType fromValue(String v) {
        for (ColddrinksType c: ColddrinksType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
