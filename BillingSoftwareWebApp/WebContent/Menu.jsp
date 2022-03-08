<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="billingsoftwareproject.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Details</title>
</head>
<body>
<form action="ProcessorServlet" method="post">
<table align="center" bgcolor="#AAAAAA" border="1" width="70%">
    <tr>
        <td colspan="4" align="center">Menu Details </td>
    </tr>
    
    <tr> 
		<th>Items</th>
		<th>Item Type</th>
		<th>Item Price</th>
		<th>Item Quantity</th>
	</tr>
	
	<%
        BillingSoftwareProject port = BillingSoftwareProject_BillingSoftwareProjectPort_Client.BillingSoftwareProjectClient();
		Input menuParameters = new Input();
        Long value = 1l;
        menuParameters.setNumber1(value);	
        Output menu = port.menu(menuParameters);
    %>
	
	<!-- Code to display different types of Burgher by calling BillingSoftwareProject Proxy-->
    <tr style="height: 34px; width: 451px">
    <td style="height: 34px; width: 121px"> Burgher </td>
    <% 
       	BurgherType []bt = menu.getResult().getBurgher().getBurgherType().values();
       	Burgher bu = menu.getResult().getBurgher();
    %>
        
        <td style="height: 34px; width: 110px">
        <% int bCount=0; for(BurgherType b : bt) { %>
        <div align= "middle"><%=b.value() %></div>
        <% bCount++;}%>
        </td>
        
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<bCount;i++) { %>
        <div align= "middle"><%=bu.getBurgherPrice() %></div>
        <%}%>
        </td>
                
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<bCount;i++) { %>
        <input type="text" name="burgher1" maxlength="10" style="height: 47px; ">
        <%}%>
        </td>
    </tr>
    
    <!-- Code to display different types of Fries by calling BillingSoftwareProject Proxy-->
    <tr>
    <td> Fries </td>
        <%
        FriesType []friesType = menu.getResult().getFries().getFriesType().values();
        Fries fries = menu.getResult().getFries();%>        
        <td style="height: 34px; width: 110px">
        <% int fCount=0; for(FriesType b : friesType) { %>
        <div align= "middle"><%=b.value() %></div>
        <% fCount++;}%>
        </td>
        
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<fCount;i++) { %>
        <div align= "middle"><%=fries.getFriesPrice() %></div>
        <%}%>
        </td>
                
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<fCount;i++) { %>
        <input type="text" name="fries1" maxlength="10" style="height: 47px; ">
        <%}%>
        </td>
    </tr>
    
    <!-- Code to display different types of Cold Drinks by calling BillingSoftwareProject Proxy-->
    <tr>
    <td> Cold Drinks </td>
        <%
        ColddrinksType []cdType = menu.getResult().getColddrinks().getColddrinksType().values();
        Colddrinks coldDrinks = menu.getResult().getColddrinks();%>        
        <td style="height: 34px; width: 110px">
        <% int cdCount=0; for(ColddrinksType b : cdType) { %>
        <div align= "middle"><%=b.value() %></div>
        <% cdCount++;}%>
        </td>
        
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<cdCount;i++) { %>
        <div align= "middle"><%=coldDrinks.getColddrinksPrice() %></div>
        <%}%>
        </td>
                
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<cdCount;i++) { %>
        <input type="text" name="coldDrinks1" maxlength="10" style="height: 47px; ">
        <%}%>
        </td>
    </tr>
    
    <!-- Code to display different types of Toys by calling BillingSoftwareProject Proxy-->
    <tr>
    <td> Toys </td>
        <%
        ToysType []tType = menu.getResult().getToys().getToysType().values();
        Toys toys = menu.getResult().getToys();%>        
        <td style="height: 34px; width: 110px">
        <% int tCount=0; for(ToysType b : tType) { %>
        <div align= "middle"><%=b.value() %></div>
        <% tCount++;}%>
        </td>
        
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<tCount;i++) { %>
        <div align= "middle"><%=toys.getToysPrice() %></div>
        <%}%>
        </td>
                
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<tCount;i++) { %>
        <input type="text" name="toys1" maxlength="10" style="height: 47px; ">
        <%}%>
        </td>
    </tr>
    
    <!-- Code to display different types of Ice Creams by calling BillingSoftwareProject Proxy-->
    <tr>
    <td> Ice Creams </td>
        <%
        IcecreamsType []icType = menu.getResult().getIcecreams().getIcecreamsType().values();
        Icecreams iceCreams = menu.getResult().getIcecreams();%>        
        <td style="height: 34px; width: 110px">
        <% int icCount = 0; for(IcecreamsType b : icType) { %>
        <div align= "middle"><%=b.value() %></div>
        <% icCount++; }%>
        </td>
        
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<icCount;i++) { %>
        <div align= "middle"><%=iceCreams.getIcecreamsPrice() %></div>
        <%}%>
        </td>
                
        <td style="height: 34px; width: 110px">
        <% for(int i=0;i<icCount;i++) { %>
        <input type="text" name="icecream1" maxlength="10" style="height: 47px; ">
        <%}%>
        </td>
    </tr>
    
    <tr>
        <td colspan="4" align="center"><input type="submit" value="Place Order"></td>
    </tr>
</table>
</form>
</body>
</html>