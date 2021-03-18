
package Controller;

import Model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/login.htm")
public class LoginController 
{
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getHandler()
    {
        ModelAndView mv = new ModelAndView("login");
        
        mv.addObject("student", new Student());
        
        return mv;
        
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView postHandler(@ModelAttribute("student") Student s) throws ClassNotFoundException
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pgpjava?user=root&password=yourpassword&useUnicode=true&useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false");

            String query = "Select Email, password , student_name , student_age from student";
            Statement pst = con.createStatement();

           ResultSet rs =  pst.executeQuery(query);
           
           while(rs.next())
           {
               String id , pass;
               
               id = rs.getString(1);
               pass= rs.getString(2);
               
               if(id.equals(s.getEmail()))
               {
                   if(pass.equals(s.getPassword()))
                   {
                        s.setStudent_age(rs.getInt(4));
                        s.setStudent_name(rs.getString(3));
                        
                        ModelAndView mv = new ModelAndView("student");
                        mv.addObject("valid" , s);
                        con.close();
                        return mv;
                   }
               }
           }
           
           ModelAndView mv = new ModelAndView("login");
           mv.addObject("error","Incorrect ID/Password");
           con.close();
           return mv;
      
        }
        catch(SQLException e)
                {
                    e.printStackTrace();
                    ModelAndView mv = new ModelAndView("login");
                    mv.addObject("error","Incorrect ID/Password");
                    return mv;
                }
        
    }
}
