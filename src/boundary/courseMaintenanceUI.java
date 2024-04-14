package boundary;

/**
 *
 * @author Low Sin Mun
 */
import java.util.Scanner;
import entity.Course;



public class courseMaintenanceUI {

    Scanner scanner = new Scanner(System.in);

    public int getMenuChoice() {
        System.out.println("\nMAIN MENU");
        System.out.println("1. Add new course");
        System.out.println("2. List all course");
        System.out.println("0. Quit");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return choice;
    }

    public void listAllCourses(String outputStr) {
        System.out.println("\nList of Courses:\n" + outputStr);
    }

    public void printCourseDetails(Course course) {
        System.out.println("Course Details");
        System.out.println("Faculty Name:" + course.getFacultyName());
        System.out.println("Programme Name: " + course.getProgrammeName());
        System.out.println("Course Name: " + course.getCourseName());
        //System.out.println("Credit Hour: " + course.getCourseCreditHour());
    }

    public String inputFacultyName() {
        System.out.print("Enter faculty name: ");
        String name = scanner.nextLine();
        return name;
    }

    public String inputProgrammeName() {
        System.out.print("Enter programme name: ");
        String name = scanner.nextLine();
        return name;
    }

    public String inputCourseName() {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        return name;
    }

//    public int inputCourseCreditHour() {
//        System.out.print("Enter course credit hour: ");
//        int creditHour = scanner.nextInt();
//        return creditHour;
//    }

    public Course inputCourseDetails() {
        String facultyName = inputFacultyName();
        String programmeName = inputProgrammeName();
        String courseName = inputCourseName();
        //int courseCreditHour = inputCourseCreditHour();
        System.out.println();
        return new Course(facultyName, programmeName, courseName);
    }
}
