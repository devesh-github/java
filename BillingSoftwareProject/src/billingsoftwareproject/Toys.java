
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for toys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="toys">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toysType" type="{http://BillingSoftwareProject/}toysType"/>
 *         &lt;element name="toysPrice" type="{http://BillingSoftwareProject/}toysPrice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toys", propOrder = {
    "toysType",
    "toysPrice"
})
public class Toys {

    @XmlElement(required = true)
    protected ToysType toysType;
    protected int toysPrice;

    /**
     * Gets the value of the toysType property.
     * 
     * @return
     *     possible object is
     *     {@link ToysType }
     *     
     */
    public ToysType getToysType() {
        return toysType;
    }

    /**
     * Sets the value of the toysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToysType }
     *     
     */
    public void setToysType(ToysType value) {
        this.toysType = value;
    }

    /**
     * Gets the value of the toysPrice property.
     * 
     */
    public int getToysPrice() {
        return toysPrice;
    }

    /**
     * Sets the value of the toysPrice property.
     * 
     */
    public void setToysPrice(int value) {
        this.toysPrice = value;
    }

}
