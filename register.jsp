<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
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
        <h3 style="color:red">${message}</h3>
        
        <h1>Student Register!</h1>
        <spring:nestedPath path="student" >
        <form method="post">
            <table>
                <tr>
                    <th>
                        Student Name
                    </th>
                    <td>
                        <spring:bind path="student_name" >
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <th>
                        Password
                    </th>
                    <td>
                        <spring:bind path="password">
                        <input type="password" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                <tr>
                    <th>
                        Student Age
                    </th>
                    <td>
                        <spring:bind path="student_age" >
                        <input type="number" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <th>
                        Email
                    </th>
                    <td>
                        <spring:bind path="email" >
                        <input type="email" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="REGISTER"/>
                    </td>
                </tr>
            </table>
        </form>
        </spring:nestedPath>
    </body>
</html>