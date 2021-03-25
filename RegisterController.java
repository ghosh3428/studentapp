
package Controller;

import Model.Modeljava;
import Service.RegisterService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/register.htm")
public class RegisterController
{
    
    private RegisterService rs;
    
    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getHandler()
    {
        ModelAndView mv = new ModelAndView("register");
        mv.addObject("student", new Modeljava());
        return mv;
    }
    
    
    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView postHandler(@ModelAttribute("student") Modeljava s) throws ClassNotFoundException, SQLException
    {
        if(Integer.parseInt(s.getMarks()) > 90)
        {
            s.setGrade("A");
        }
        else if(Integer.parseInt(s.getMarks()) > 70)
        {
            s.setGrade("B");
        }
        else if(Integer.parseInt(s.getMarks()) > 50)
        {
            s.setGrade("C");
        }
        else if(Integer.parseInt(s.getMarks()) > 40)
        {
            s.setGrade("D");
        }
        else
        {
            s.setGrade("FAIL");
        }
         
        
        boolean result = rs.insertData(s);
        if(result)
        {
            ModelAndView mv = new ModelAndView("Loginpage");
            mv.addObject("success" , "You have successfully registered.");
            return mv;
        }
        else
        {
            ModelAndView mv = new ModelAndView("register");
            mv.addObject("error" , "Error registering student.");
            return mv;
        }
    }

   
    public void setRs(RegisterService rs) 
    {
        this.rs = rs;
    }
}
