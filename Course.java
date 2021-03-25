
package Model;


public class Course 
{
    
    private String courseID;
    private String courseName;
    private String courseDuration;
    private String courseFees;

    /**
     * @return the courseID
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * @param courseID the courseID to set
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * @return the courseNAme
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseNAme the courseNAme to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseDuration
     */
    public String getCourseDuration() {
        return courseDuration;
    }

    /**
     * @param courseDuration the courseDuration to set
     */
    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    /**
     * @return the courceFees
     */
    public String getCourseFees() {
        return courseFees;
    }

    /**
     * @param courceFees the courceFees to set
     */
    public void setCourseFees(String courseFees) {
        this.courseFees = courseFees;
    }
}
