
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colddrinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="colddrinks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colddrinksType" type="{http://BillingSoftwareProject/}colddrinksType"/>
 *         &lt;element name="colddrinksPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "colddrinks", propOrder = {
    "colddrinksType",
    "colddrinksPrice"
})
public class Colddrinks {

    @XmlElement(required = true)
    protected ColddrinksType colddrinksType;
    protected int colddrinksPrice;

    /**
     * Gets the value of the colddrinksType property.
     * 
     * @return
     *     possible object is
     *     {@link ColddrinksType }
     *     
     */
    public ColddrinksType getColddrinksType() {
        return colddrinksType;
    }

    /**
     * Sets the value of the colddrinksType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColddrinksType }
     *     
     */
    public void setColddrinksType(ColddrinksType value) {
        this.colddrinksType = value;
    }

    /**
     * Gets the value of the colddrinksPrice property.
     * 
     */
    public int getColddrinksPrice() {
        return colddrinksPrice;
    }

    /**
     * Sets the value of the colddrinksPrice property.
     * 
     */
    public void setColddrinksPrice(int value) {
        this.colddrinksPrice = value;
    }

}
