<%-- 
    Document   : student
    Created on : Mar 16, 2021, 7:47:50 PM
    Author     : NIIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${success}</h1>
        <details>
            <summary> STUDENT DETAILS </summary>
            <table border="2">
                <tr>
                    <th>
                        STUDENT ID
                    </th>
                    <td>
                        ${student.id}
                    </td>
                </tr>
                <tr>
                    <th>
                        STUDENT NAME
                    </th>
                    <td>
                        ${student.studentName}
                    </td>
                </tr>
                 <tr>
                    <th>
                        ROLL NUMBER
                    </th>
                    <td>
                        ${student.rollNumber}
                    </td>
                </tr>
                <tr>
                    <th>
                        COURSE
                    </th>
                    <td>
                        ${student.course}
                    </td>
                </tr>
                <tr>
                    <th>
                        TOTAL MARKS
                    </th>
                    <td>
                        ${student.marks}
                    </td>
                </tr>
                <tr>
                    <th>
                        GRADE
                    </th>
                    <td>
                        ${student.grade}
                    </td>
                </tr>
            </table>
        </details>
        <details>
            <summary> COURSE DETAILS </summary>
            <table border="2">
                <tr>
                    <th>
                        COURSE ID
                    </th>
                    <td>
                        ${course.courseID}
                    </td>
                </tr>
                <tr>
                    <th>
                        COURSE NAME
                    </th>
                    <td>
                        ${course.courseName}
                    </td>
                </tr>
                 <tr>
                    <th>
                        COURSE DURATION
                    </th>
                    <td>
                        ${course.courseDuration}
                    </td>
                </tr>
                <tr>
                    <th>
                        COURSE FEES
                    </th>
                    <td>
                        ${course.courseFees}
                    </td>
                </tr>
            </table>
        </details>
                    
                    
        <details>
            <summary> COURSE LIST DETAILS </summary>
            <table border="2">
                 <tr>
                    <th>
                        COURSE ID
                    </th>
                    <th>
                        COURSE NAME
                    </th>
                    <th>
                        COURSE FEES
                    </th>
                    <th>
                        COURSE DURATION
                    </th>
                </tr>
                <c:forEach items="courselist" var="cs">
                     <tr>
                    <th>
                        ${cs.courseID}
                    </th>
                    <th>
                       ${cs.courseName}
                    </th>
                    <th>
                        ${cs.courseFees}
                    </th>
                    <th>
                        ${cs.courseDuration}
                    </th>
                </tr>
                </c:forEach>
            </table>
        </details>
    </body>
</html>
