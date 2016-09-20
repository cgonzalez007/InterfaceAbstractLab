package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    //Mock Validation
    private boolean isValidPrerequisites(String prerequisites) {
        boolean isValid = true;
        if (prerequisites == null || prerequisites.length() == 0) {
            isValid = false;
        }
        return isValid;
    }

    public final void setPrerequisites(String prerequisites) {
        if (isValidPrerequisites(prerequisites)) {
            this.prerequisites = prerequisites;
        }
    }

    //Mock Validation
    private boolean isValidAmountOfCredits(double credits) {
        boolean isValid = true;
        if (credits < 0.5 || credits > 4.0) {
            isValid = false;
        }
        return isValid;
    }

    @Override
    public final void setCredits(double credits) {
        if (isValidAmountOfCredits(credits)) {
            this.credits = credits;
        }
    }

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final String getCourseName() {
        return courseName;
    }

    //Mock Validation
    private boolean isValidCourseName(String courseName) {
        boolean isValid = true;
        if (courseName == null || courseName.length() == 0) {
            isValid = false;
        }
        return isValid;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (isValidCourseName(courseName)) {
            this.courseName = courseName;
        }
    }

    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (isValidCourseNumber(courseNumber)) {
            this.courseNumber = courseNumber;
        }
    }

    //Mock Validation
    public final boolean isValidCourseNumber(String courseNumber) {
        boolean isValid = true;
        if (courseNumber == null || courseNumber.length() == 0) {
            isValid = false;
        }
        return isValid;
    }

}
