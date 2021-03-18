<%-- 
    Document   : student
    Created on : Mar 6, 2021, 12:24:38 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        
    <center><h1> NIIT JADAVPUR</h1></center>
    <div>
    <p>
    <h3> Hello  ${valid.student_name}</h3>
    </p>
    </div>
    <div>
        <details>
            <summary> STUDENT DETAILS</summary>
            <table border="2" >
                <tr>
                    <td> STUDENT NAME</td>
                    <td>${valid.student_name}</td>
                </tr>
                <tr>
                    <td> STUDENT AGE</td>
                    <td>${valid.student_age}</td>
                </tr>
                <tr>
                    <td> EMAIL</td>
                    <td>${valid.email}</td>
                </tr>
            </table>
        </details>
    </div>
    </body>
</html>
