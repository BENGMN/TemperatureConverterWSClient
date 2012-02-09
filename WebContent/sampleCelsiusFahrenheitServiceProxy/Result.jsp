<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCelsiusFahrenheitServiceProxyid" scope="session" class="domain.CelsiusFahrenheitServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCelsiusFahrenheitServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCelsiusFahrenheitServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCelsiusFahrenheitServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        domain.CelsiusFahrenheitService getCelsiusFahrenheitService10mtemp = sampleCelsiusFahrenheitServiceProxyid.getCelsiusFahrenheitService();
if(getCelsiusFahrenheitService10mtemp == null){
%>
<%=getCelsiusFahrenheitService10mtemp %>
<%
}else{
        if(getCelsiusFahrenheitService10mtemp!= null){
        String tempreturnp11 = getCelsiusFahrenheitService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String degrees_celsius_1id=  request.getParameter("degrees_celsius16");
            java.lang.String degrees_celsius_1idTemp = null;
        if(!degrees_celsius_1id.equals("")){
         degrees_celsius_1idTemp  = degrees_celsius_1id;
        }
        java.lang.String convertCtoF13mtemp = sampleCelsiusFahrenheitServiceProxyid.convertCtoF(degrees_celsius_1idTemp);
if(convertCtoF13mtemp == null){
%>
<%=convertCtoF13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(convertCtoF13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String degrees_fahrenheit_2id=  request.getParameter("degrees_fahrenheit21");
            java.lang.String degrees_fahrenheit_2idTemp = null;
        if(!degrees_fahrenheit_2id.equals("")){
         degrees_fahrenheit_2idTemp  = degrees_fahrenheit_2id;
        }
        java.lang.String convertFtoC18mtemp = sampleCelsiusFahrenheitServiceProxyid.convertFtoC(degrees_fahrenheit_2idTemp);
if(convertFtoC18mtemp == null){
%>
<%=convertFtoC18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(convertFtoC18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>