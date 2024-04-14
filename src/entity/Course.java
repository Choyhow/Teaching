package entity;

/**
 *
 * @author Low Sin Mun
 */
public class Course implements Comparable<Course> {

    private String facultyName;
    private String programmeName;
    private String courseName;
    //private int courseCreditHour;

    public Course(String facultyName, String programmeName, String courseName) {
        this.facultyName = facultyName;
        this.programmeName = programmeName;
        this.courseName = courseName;
        //this.courseCreditHour = courseCreditHour;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

//    public int getCourseCreditHour() {
//        return courseCreditHour;
//    }
//    public void setCourseCreditHour(int courseCreditHour) {
//        this.courseCreditHour = courseCreditHour;
//    }

    @Override
    public int compareTo(Course o) {
        return this.courseName.compareTo(courseName);
    }
    
}
