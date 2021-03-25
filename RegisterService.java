
package Service;

import Model.Course;
import Model.Modeljava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;


public class RegisterService 
{
    private Connection con;
    private PreparedStatement pst;
    private String query;
    
    RegisterService() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit?user=root&password=yourpassword&useUnicode=true&useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false");
    }
    
    public boolean insertData(Modeljava student) throws SQLException
    {
        try
        {
            String query = "insert into Student values(?,?,?,?,?,?,?)";

            pst = con.prepareStatement(query);

            pst.setString(1,student.getId());
            pst.setString(2,student.getPass());
            pst.setString(3,student.getStudentName());
            pst.setString(4,student.getRollNumber());
            pst.setString(5,student.getCourse());
            pst.setString(6,student.getMarks());
            pst.setString(7,student.getGrade());

            pst.executeUpdate();

            con.close();

            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;     
        }
    }
    
    
    public String validateStudent(Modeljava student) throws SQLException
    {
        String query = "select * from student where id = ? and password = ?";
        pst = con.prepareStatement(query);

        pst.setString(1,student.getId());
        pst.setString(2,student.getPass());
        
        ResultSet rs = pst.executeQuery();
        String id="", pass="";
        while(rs.next())
        {
            id = rs.getString(1);
            pass = rs.getString(2);
        }
        
        if(student.getId().equals(id) )
        {
            if( student.getPass().equals(pass))
            {
                return "success";
            }
            else
            {
                return "incorrectpassword";
            }
        }
        else
        {
            return "register";  
        }
    }
    
    
    public Modeljava getstudent(String username) throws SQLException
    {
        String query = "select * from student where id = ?";
        pst = con.prepareStatement(query);

        pst.setString(1,username);
        
        ResultSet resultset = pst.executeQuery();
        
        Modeljava s = new Modeljava();
        while(resultset.next())
        {
            s.setId( resultset.getString(1));
            s.setCourse(resultset.getString(5));
            s.setGrade(resultset.getString(7));
            s.setMarks(resultset.getString(6));
            s.setRollNumber(resultset.getString(4));
            s.setStudentName(resultset.getString(3));
    
        }
        
        return s;
    }
    
    
    public ArrayList<Course> getCourse() throws SQLException
    {
        String query = "select * from course";
        pst = con.prepareStatement(query);
        
        ResultSet resultset = pst.executeQuery();
        
        ArrayList c = new ArrayList();
        
        while(resultset.next())
        {
            Course course = new Course();
            course.setCourseID(resultset.getString(1));
            course.setCourseName(resultset.getString(2));
            course.setCourseDuration(resultset.getString(3));
            course.setCourseFees(resultset.getString(4));
    
             c.add(course);
        }
        
        return c;
    }
        
}



