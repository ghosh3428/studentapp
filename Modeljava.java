

package Model;

//POJO class - pure old java object

public class Modeljava 
{
    private String id;
    private String pass;
    private String studentName;
    private String course;
    private String marks;
    private String grade;
    private String rollNumber;

    
    public String getId() 
    {
        
        return id;
    }
    
    public void setId(String id) 
    {
        this.id = id;
    }
    
    public String getPass() 
    {
        return pass;
    }
    
    public void setPass(String pass) 
    {
        this.pass = pass;
    }
    
    public String getStudentName()
    {
        return studentName;
    }
   
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the rollNumber
     */
    public String getRollNumber() {
        return rollNumber;
    }

    /**
     * @param rollNumber the rollNumber to set
     */
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
