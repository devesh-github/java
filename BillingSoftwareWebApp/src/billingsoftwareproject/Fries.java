
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="friesType" type="{http://BillingSoftwareProject/}friesType"/>
 *         &lt;element name="friesPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fries", propOrder = {
    "friesType",
    "friesPrice"
})
public class Fries {

    @XmlElement(required = true)
    protected FriesType friesType;
    protected int friesPrice;

    /**
     * Gets the value of the friesType property.
     * 
     * @return
     *     possible object is
     *     {@link FriesType }
     *     
     */
    public FriesType getFriesType() {
        return friesType;
    }

    /**
     * Sets the value of the friesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FriesType }
     *     
     */
    public void setFriesType(FriesType value) {
        this.friesType = value;
    }

    /**
     * Gets the value of the friesPrice property.
     * 
     */
    public int getFriesPrice() {
        return friesPrice;
    }

    /**
     * Sets the value of the friesPrice property.
     * 
     */
    public void setFriesPrice(int value) {
        this.friesPrice = value;
    }

}
