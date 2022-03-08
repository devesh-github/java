package billingsoftwareproject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(name = "BillingSoftwareProject", targetNamespace = "http://BillingSoftwareProject/", serviceName = "BillingSoftwareProjectWS", portName = "BillingSoftwareProjectPort", wsdlLocation = "/WEB-INF/wsdl/BillingSoftwareProjectWS.wsdl")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class })
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class BillingSoftwareProjectImpl {
  public BillingSoftwareProjectImpl() {
  }

  @WebResult(name = "Response", partName = "parameters", targetNamespace = "http://BillingSoftwareProject/")
  @WebMethod(action = "http://BillingSoftwareProject/")
  public Output menu(@WebParam(name = "Request", partName = "parameters", targetNamespace = "http://BillingSoftwareProject/")
    Input parameters) {
    
	  Output output = new Output();
	  GetMenu getMenu = new GetMenu();
	  Burgher burgher = new Burgher();
	  Fries fries = new Fries();
	  Colddrinks coldDrinks = new Colddrinks();
	  Toys toys = new Toys();
	  Icecreams iceCreams = new Icecreams();
	  
	  Long value = parameters.getNumber1();
	  if(value==1) {
		  BurgherType bt = BurgherType.VEG_BURGHER;
		  burgher.setBurgherType(bt);
		  burgher.setBurgherPrice(40);
		  
		  FriesType ft = FriesType.VEGFRIES;
		  fries.setFriesType(ft);
		  fries.setFriesPrice(40);
		  
		  ColddrinksType cdType = ColddrinksType.COKE;
		  coldDrinks.setColddrinksType(cdType);
		  coldDrinks.setColddrinksPrice(40);
		  
		  ToysType tType = ToysType.TOY_1;
		  toys.setToysType(tType);
		  toys.setToysPrice(40);
		  
		  IcecreamsType icType = IcecreamsType.CHOCOLATE;
		  iceCreams.setIcecreamsType(icType);
		  iceCreams.setIcecreamsPrice(40);
	  } else if(value==2){
		  BurgherType bt = BurgherType.NON_VEG_BURGHER;
		  burgher.setBurgherType(bt);
		  burgher.setBurgherPrice(50);
		  
		  FriesType ft = FriesType.NON_VEGFRIES;
		  fries.setFriesType(ft);
		  fries.setFriesPrice(50);
		  
		  ColddrinksType cdType = ColddrinksType.PEPSI;
		  coldDrinks.setColddrinksType(cdType);
		  coldDrinks.setColddrinksPrice(50);
		  
		  ToysType tType = ToysType.TOY_2;
		  toys.setToysType(tType);
		  toys.setToysPrice(50);
		  
		  IcecreamsType icType = IcecreamsType.BUTTERSCOTCH;
		  iceCreams.setIcecreamsType(icType);
		  iceCreams.setIcecreamsPrice(50);
	  }
	  
	  getMenu.setBurgher(burgher);
	  getMenu.setFries(fries);
	  getMenu.setIcecreams(iceCreams);
	  getMenu.setColddrinks(coldDrinks);
	  getMenu.setToys(toys);
	  output.setResult(getMenu);
	  String s = output.getResult().getBurgher().getBurgherType().value();
	  System.out.println(s);
	 
	  return output;
  }
}
