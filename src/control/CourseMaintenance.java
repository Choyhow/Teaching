package control;

/**
 *
 * @author Low Sin Mun
 */
import adt.*;
import boundary.courseMaintenanceUI;
import entity.*;
import utility.MessageUI;

public class CourseMaintenance {

    private ListInterface<Course> courseList = new ArrayList<>();
    //private Course course= new Course();
    private courseMaintenanceUI courseUI = new courseMaintenanceUI();

    public CourseMaintenance() {
        //cList = course.retrieveFromFile();
    }

    public void runCourseMaintenance() {
        int choice = 0;
        do {
            choice = courseUI.getMenuChoice();
            switch (choice) {
                case 0:
                    MessageUI.displayExitMessage();
                    break;
                case 1:
                    addNewCourse();
                    courseUI.listAllCourses(getAllCourses());
                    break;
                case 2:
                    courseUI.listAllCourses(getAllCourses());
                    break;
                default:
                    MessageUI.displayInvalidChoiceMessage();
            }
        } while (choice != 0);
    }

    public void addNewCourse() {
        Course newCourse = courseUI.inputCourseDetails();
        courseList.add(newCourse);
        //Course.saveToFile(cList);
    }

    public String getAllCourses() {
        String outputStr = "";
        for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
            outputStr += courseList.getEntry(i) + "\n";
        }
        return outputStr;
    }

    public boolean isCourseNameExists(String courseName) {
        for (int i = 1; i <= courseList.getNumberOfEntries(); i++) {
            Course course = courseList.getEntry(i);
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return true; // Course name exists in the list
            }
        }
        return false; // Course name doesn't exist in the list
    }

    public void displayCourses() {
        courseUI.listAllCourses(getAllCourses());
    }

    public static void main(String[] args) {
        CourseMaintenance CourseMaintenance = new CourseMaintenance();
        CourseMaintenance.runCourseMaintenance();
    }
}
