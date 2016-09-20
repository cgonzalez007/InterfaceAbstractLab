package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
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

}
