
package billingsoftwareproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="burgher" type="{http://BillingSoftwareProject/}burgher"/>
 *         &lt;element name="colddrinks" type="{http://BillingSoftwareProject/}colddrinks"/>
 *         &lt;element name="fries" type="{http://BillingSoftwareProject/}fries"/>
 *         &lt;element name="toys" type="{http://BillingSoftwareProject/}toys"/>
 *         &lt;element name="icecreams" type="{http://BillingSoftwareProject/}icecreams"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMenu", propOrder = {
    "burgher",
    "colddrinks",
    "fries",
    "toys",
    "icecreams"
})
public class GetMenu {

    @XmlElement(required = true)
    protected Burgher burgher;
    @XmlElement(required = true)
    protected Colddrinks colddrinks;
    @XmlElement(required = true)
    protected Fries fries;
    @XmlElement(required = true)
    protected Toys toys;
    @XmlElement(required = true)
    protected Icecreams icecreams;

    /**
     * Gets the value of the burgher property.
     * 
     * @return
     *     possible object is
     *     {@link Burgher }
     *     
     */
    public Burgher getBurgher() {
        return burgher;
    }

    /**
     * Sets the value of the burgher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Burgher }
     *     
     */
    public void setBurgher(Burgher value) {
        this.burgher = value;
    }

    /**
     * Gets the value of the colddrinks property.
     * 
     * @return
     *     possible object is
     *     {@link Colddrinks }
     *     
     */
    public Colddrinks getColddrinks() {
        return colddrinks;
    }

    /**
     * Sets the value of the colddrinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Colddrinks }
     *     
     */
    public void setColddrinks(Colddrinks value) {
        this.colddrinks = value;
    }

    /**
     * Gets the value of the fries property.
     * 
     * @return
     *     possible object is
     *     {@link Fries }
     *     
     */
    public Fries getFries() {
        return fries;
    }

    /**
     * Sets the value of the fries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fries }
     *     
     */
    public void setFries(Fries value) {
        this.fries = value;
    }

    /**
     * Gets the value of the toys property.
     * 
     * @return
     *     possible object is
     *     {@link Toys }
     *     
     */
    public Toys getToys() {
        return toys;
    }

    /**
     * Sets the value of the toys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Toys }
     *     
     */
    public void setToys(Toys value) {
        this.toys = value;
    }

    /**
     * Gets the value of the icecreams property.
     * 
     * @return
     *     possible object is
     *     {@link Icecreams }
     *     
     */
    public Icecreams getIcecreams() {
        return icecreams;
    }

    /**
     * Sets the value of the icecreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Icecreams }
     *     
     */
    public void setIcecreams(Icecreams value) {
        this.icecreams = value;
    }

}
