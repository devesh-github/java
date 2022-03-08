package mywebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(name = "MyWebService", targetNamespace = "http://mywebservice/", serviceName = "MyWebServiceWS", portName = "MyWebServicePort", wsdlLocation = "/WEB-INF/wsdl/MyWebServiceWS.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class MyWebServiceImpl {
    public MyWebServiceImpl() {
    }

    @javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://mywebservice/", output = "http://mywebservice/MyWebService/additionResponse")
    @WebMethod(action = "http://mywebservice/")
    @WebResult(name = "Response", targetNamespace = "http://mywebservice/", partName = "parameters")
    public Output addition(@WebParam(name = "Request", partName = "parameters", targetNamespace = "http://mywebservice/")
        Input parameters) {
    	Output out = new Output();
    	out.setResult((parameters.getNumber1()+parameters.getNumber2()));
        return out;
    }
}
