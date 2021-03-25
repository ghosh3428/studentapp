<%-- 
    Document   : Loginpage
    Created on : Mar 11, 2021, 7:45:00 PM
    Author     : NIIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h3 style="color:green">${success}</h3>
        <h3 style="color:red">${error}</h3>
        <spring:nestedPath path="student">
            <form action="" method="post" >
                <spring:bind path="id">
                    <label>LogIn Id</label>
                    <input type="text" placeholder=" enter login id" name="${status.expression}"
                       value="${status.value}"/>
                </spring:bind>
                <spring:bind path="pass">
                    <label>Password</label>
                    <input type="password" name="${status.expression}"
                       value="${status.value}"/>
                </spring:bind>
                <input type="submit" value =" click to continue"/>
            
            </form>
        </spring:nestedPath>
    </body>
</html>
