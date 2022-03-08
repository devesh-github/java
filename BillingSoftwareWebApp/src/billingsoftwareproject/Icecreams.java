
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for icecreams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="icecreams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="icecreamsType" type="{http://BillingSoftwareProject/}icecreamsType"/>
 *         &lt;element name="icecreamsPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "icecreams", propOrder = {
    "icecreamsType",
    "icecreamsPrice"
})
public class Icecreams {

    @XmlElement(required = true)
    protected IcecreamsType icecreamsType;
    protected int icecreamsPrice;

    /**
     * Gets the value of the icecreamsType property.
     * 
     * @return
     *     possible object is
     *     {@link IcecreamsType }
     *     
     */
    public IcecreamsType getIcecreamsType() {
        return icecreamsType;
    }

    /**
     * Sets the value of the icecreamsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcecreamsType }
     *     
     */
    public void setIcecreamsType(IcecreamsType value) {
        this.icecreamsType = value;
    }

    /**
     * Gets the value of the icecreamsPrice property.
     * 
     */
    public int getIcecreamsPrice() {
        return icecreamsPrice;
    }

    /**
     * Sets the value of the icecreamsPrice property.
     * 
     */
    public void setIcecreamsPrice(int value) {
        this.icecreamsPrice = value;
    }

}
