<%-- 
    Document   : login
    Created on : Mar 6, 2021, 11:56:32 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- NAV BAR -->
        <%@include file="navbar.jsp" %>
        
        
        <!-- CONTENT -->
        <h3 style="color:green">${message}</h3>
        <h3 style="color:red">${error}</h3>
        <h1>Student Login!</h1>
        
        <spring:nestedPath path="student" >
        <form action="" method="post">
            <table>
                <tr>
                    <th>
                       Login Id
                    </th>
                    <td>
                        <spring:bind path="email">
                        <input type="text" name="${status.expression}" value="${status.value}"/>
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <th>
                        Password
                    </th>
                    <td>
                        <spring:bind path="password">
                        <input type="password"  name="${status.expression}" value="${status.value}"/>
                        </spring:bind>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Log In"/>
                    </td>
                </tr>
            </table>
        </form>
        </spring:nestedPath>
    </body>
</html>
