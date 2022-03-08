
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for burgher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="burgher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="burgherType" type="{http://BillingSoftwareProject/}burgherType"/>
 *         &lt;element name="burgherPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "burgher", propOrder = {
    "burgherType",
    "burgherPrice"
})
public class Burgher {

    @XmlElement(required = true)
    protected BurgherType burgherType;
    protected int burgherPrice;

    /**
     * Gets the value of the burgherType property.
     * 
     * @return
     *     possible object is
     *     {@link BurgherType }
     *     
     */
    public BurgherType getBurgherType() {
        return burgherType;
    }

    /**
     * Sets the value of the burgherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurgherType }
     *     
     */
    public void setBurgherType(BurgherType value) {
        this.burgherType = value;
    }

    /**
     * Gets the value of the burgherPrice property.
     * 
     */
    public int getBurgherPrice() {
        return burgherPrice;
    }

    /**
     * Sets the value of the burgherPrice property.
     * 
     */
    public void setBurgherPrice(int value) {
        this.burgherPrice = value;
    }

}
