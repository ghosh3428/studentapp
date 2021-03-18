
package Controller;

import Model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/register.htm")
public class RegisterController 
{
    
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView handlerGet()
    {
       Student s = new Student();
       
       ModelAndView mv = new ModelAndView("register");
       mv.addObject("student", s);
       
       return (mv);
       
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView handlerPost(@ModelAttribute("student") Student s) throws ClassNotFoundException, SQLException
    {
        boolean result = true;
        try
        {
       Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pgpjava?user=root&password=yourpassword&useUnicode=true&useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false");

            String query = "Insert into student values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, s.getStudent_name());
            pst.setString(2, s.getPassword());
            pst.setInt(3, s.getStudent_age());
            pst.setString(4, s.getEmail());

            pst.executeUpdate();

            con.close();

            
        }
        catch(SQLException e)
                {
                    e.printStackTrace();
                    result = false;
                }
        
        if(result)
        {
            ModelAndView mv = new ModelAndView("login");
            
            mv.addObject("message","You have successfully registered");
            return mv;
        }
        else
        {
            ModelAndView mv = new ModelAndView("register");
            
            mv.addObject("message","Error registering student");
            return mv;  
        }
      
   
    }

   
  
}
