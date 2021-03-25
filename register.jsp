<%-- 
    Document   : register
    Created on : Mar 16, 2021, 7:06:42 PM
    Author     : NIIT
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
        <h3 style="color:red">${error}</h3>
        <spring:nestedPath path="student" >
            <form action="" method="post">
            <table>
                <tr>
                    <td>
                        Student ID
                    </td>
                    <td>
                        <spring:bind path="id">
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <td>
                        Password
                    </td>
                    <td>
                        <spring:bind path="pass">
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <td>
                        Student Name
                    </td>
                    <td>
                        <spring:bind path="studentName">
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <td>
                        Roll Number
                    </td>
                    <td>
                        <spring:bind path="rollNumber">
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <td>
                        Course
                    </td>
                    <td>
                        <spring:bind path="course">
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                    <td>
                        Marks
                    </td>
                    <td>
                        <spring:bind path="marks">
                            <input type="text" name="${status.expression}" value="${status.value}" />
                        </spring:bind>
                    </td>
                </tr>
                 <tr>
                     <td colspan="2">
                        <input type="submit" value="REGISTER" />
                    </td>       
                </tr>
            </table>
        </spring:nestedPath>
        
            
        </form>
    </body>
</html>
