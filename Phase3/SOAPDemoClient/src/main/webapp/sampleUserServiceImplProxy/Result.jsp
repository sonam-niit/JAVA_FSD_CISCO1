<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUserServiceImplProxyid" scope="session" class="com.cisco.soap.service.UserServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUserServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleUserServiceImplProxyid.getEndpoint();
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
        sampleUserServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.cisco.soap.service.UserServiceImpl getUserServiceImpl10mtemp = sampleUserServiceImplProxyid.getUserServiceImpl();
if(getUserServiceImpl10mtemp == null){
%>
<%=getUserServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String userEmail_1id=  request.getParameter("userEmail28");
            java.lang.String userEmail_1idTemp = null;
        if(!userEmail_1id.equals("")){
         userEmail_1idTemp  = userEmail_1id;
        }
        com.cisco.soap.model.User getUser15mtemp = sampleUserServiceImplProxyid.getUser(userEmail_1idTemp);
if(getUser15mtemp == null){
%>
<%=getUser15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getUser15mtemp != null){
java.lang.String typephone18 = getUser15mtemp.getPhone();
        String tempResultphone18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone18));
        %>
        <%= tempResultphone18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(getUser15mtemp != null){
java.lang.String typepassword20 = getUser15mtemp.getPassword();
        String tempResultpassword20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword20));
        %>
        <%= tempResultpassword20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getUser15mtemp != null){
java.lang.String typename22 = getUser15mtemp.getName();
        String tempResultname22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename22));
        %>
        <%= tempResultname22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getUser15mtemp != null){
java.lang.String typeemail24 = getUser15mtemp.getEmail();
        String tempResultemail24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail24));
        %>
        <%= tempResultemail24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getUser15mtemp != null){
%>
<%=getUser15mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 30:
        gotMethod = true;
        com.cisco.soap.model.User[] getUsers30mtemp = sampleUserServiceImplProxyid.getUsers();
if(getUsers30mtemp == null){
%>
<%=getUsers30mtemp %>
<%
}else{
        String tempreturnp31 = null;
        if(getUsers30mtemp != null){
        java.util.List listreturnp31= java.util.Arrays.asList(getUsers30mtemp);
        tempreturnp31 = listreturnp31.toString();
        }
        %>
        <%=tempreturnp31%>
        <%
}
break;
case 33:
        gotMethod = true;
        String phone_3id=  request.getParameter("phone38");
            java.lang.String phone_3idTemp = null;
        if(!phone_3id.equals("")){
         phone_3idTemp  = phone_3id;
        }
        String password_4id=  request.getParameter("password40");
            java.lang.String password_4idTemp = null;
        if(!password_4id.equals("")){
         password_4idTemp  = password_4id;
        }
        String name_5id=  request.getParameter("name42");
            java.lang.String name_5idTemp = null;
        if(!name_5id.equals("")){
         name_5idTemp  = name_5id;
        }
        String email_6id=  request.getParameter("email44");
            java.lang.String email_6idTemp = null;
        if(!email_6id.equals("")){
         email_6idTemp  = email_6id;
        }
        String id_7id=  request.getParameter("id46");
        long id_7idTemp  = Long.parseLong(id_7id);
        %>
        <jsp:useBean id="com1cisco1soap1model1User_2id" scope="session" class="com.cisco.soap.model.User" />
        <%
        com1cisco1soap1model1User_2id.setPhone(phone_3idTemp);
        com1cisco1soap1model1User_2id.setPassword(password_4idTemp);
        com1cisco1soap1model1User_2id.setName(name_5idTemp);
        com1cisco1soap1model1User_2id.setEmail(email_6idTemp);
        com1cisco1soap1model1User_2id.setId(id_7idTemp);
        boolean updateUser33mtemp = sampleUserServiceImplProxyid.updateUser(com1cisco1soap1model1User_2id);
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateUser33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
break;
case 48:
        gotMethod = true;
        String phone_9id=  request.getParameter("phone53");
            java.lang.String phone_9idTemp = null;
        if(!phone_9id.equals("")){
         phone_9idTemp  = phone_9id;
        }
        String password_10id=  request.getParameter("password55");
            java.lang.String password_10idTemp = null;
        if(!password_10id.equals("")){
         password_10idTemp  = password_10id;
        }
        String name_11id=  request.getParameter("name57");
            java.lang.String name_11idTemp = null;
        if(!name_11id.equals("")){
         name_11idTemp  = name_11id;
        }
        String email_12id=  request.getParameter("email59");
            java.lang.String email_12idTemp = null;
        if(!email_12id.equals("")){
         email_12idTemp  = email_12id;
        }
        String id_13id=  request.getParameter("id61");
        long id_13idTemp  = Long.parseLong(id_13id);
        %>
        <jsp:useBean id="com1cisco1soap1model1User_8id" scope="session" class="com.cisco.soap.model.User" />
        <%
        com1cisco1soap1model1User_8id.setPhone(phone_9idTemp);
        com1cisco1soap1model1User_8id.setPassword(password_10idTemp);
        com1cisco1soap1model1User_8id.setName(name_11idTemp);
        com1cisco1soap1model1User_8id.setEmail(email_12idTemp);
        com1cisco1soap1model1User_8id.setId(id_13idTemp);
        boolean registerUser48mtemp = sampleUserServiceImplProxyid.registerUser(com1cisco1soap1model1User_8id);
        String tempResultreturnp49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registerUser48mtemp));
        %>
        <%= tempResultreturnp49 %>
        <%
break;
case 63:
        gotMethod = true;
        String phone_15id=  request.getParameter("phone68");
            java.lang.String phone_15idTemp = null;
        if(!phone_15id.equals("")){
         phone_15idTemp  = phone_15id;
        }
        String password_16id=  request.getParameter("password70");
            java.lang.String password_16idTemp = null;
        if(!password_16id.equals("")){
         password_16idTemp  = password_16id;
        }
        String name_17id=  request.getParameter("name72");
            java.lang.String name_17idTemp = null;
        if(!name_17id.equals("")){
         name_17idTemp  = name_17id;
        }
        String email_18id=  request.getParameter("email74");
            java.lang.String email_18idTemp = null;
        if(!email_18id.equals("")){
         email_18idTemp  = email_18id;
        }
        String id_19id=  request.getParameter("id76");
        long id_19idTemp  = Long.parseLong(id_19id);
        %>
        <jsp:useBean id="com1cisco1soap1model1User_14id" scope="session" class="com.cisco.soap.model.User" />
        <%
        com1cisco1soap1model1User_14id.setPhone(phone_15idTemp);
        com1cisco1soap1model1User_14id.setPassword(password_16idTemp);
        com1cisco1soap1model1User_14id.setName(name_17idTemp);
        com1cisco1soap1model1User_14id.setEmail(email_18idTemp);
        com1cisco1soap1model1User_14id.setId(id_19idTemp);
        boolean loginUser63mtemp = sampleUserServiceImplProxyid.loginUser(com1cisco1soap1model1User_14id);
        String tempResultreturnp64 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(loginUser63mtemp));
        %>
        <%= tempResultreturnp64 %>
        <%
break;
case 78:
        gotMethod = true;
        String userEmail_20id=  request.getParameter("userEmail81");
            java.lang.String userEmail_20idTemp = null;
        if(!userEmail_20id.equals("")){
         userEmail_20idTemp  = userEmail_20id;
        }
        boolean deleteUser78mtemp = sampleUserServiceImplProxyid.deleteUser(userEmail_20idTemp);
        String tempResultreturnp79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteUser78mtemp));
        %>
        <%= tempResultreturnp79 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
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