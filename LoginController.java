
package Controller;

import Model.Course;
import Model.Modeljava;
import Service.RegisterService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/Loginpage.htm")
public class LoginController 
{
    
    private RegisterService rs;
    
    
    
    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getHandler()
    {
        ModelAndView mv = new ModelAndView("Loginpage");
        mv.addObject("student", new Modeljava());
        return mv;
    }
    
    
    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView postHandler(@ModelAttribute("student") Modeljava s) throws ClassNotFoundException, SQLException 
    {
       String result = rs.validateStudent(s);
       if(result.equals("success"))
       {
           ApplicationContext ac = new ClassPathXmlApplicationContext("Controller/Spring-XMLConfig.xml");
                   
           ModelAndView mv = new ModelAndView("student");
           mv.addObject("success","Welcome Student to NIIT JADAVPUR.");
           mv.addObject("student" , rs.getstudent(s.getId()));
           mv.addObject("course" , (Course)ac.getBean("courseBean"));
           mv.addObject("courselist" , rs.getCourse());
           return mv;
       }
       else if(result.equals("incorrectpassword"))
       {
           ModelAndView mv = new ModelAndView("Loginpage");
           mv.addObject("error","Incorrect Password");
           return mv;
       }
       else if(result.equals("register"))
       {
           ModelAndView mv = new ModelAndView("register");
           mv.addObject("error","Please register before LogIn");
           return mv;
       }
       else
       {
           ModelAndView mv = new ModelAndView("Loginpage");
           mv.addObject("error","error fetching data");
           return mv;
       }       
    }       
       
    
    
    public void setRs(RegisterService rs) {
        this.rs = rs;
    }
    
}
