
package lab2;

/**
 *
 * @author cgonz
 */
public class Startup {
    public static void main(String[] args) {
        Course advancedJavaCourse = 
                new AdvancedJavaCourse("Advanced Java Programming","CRN0999");
        Course introJavaCourse = 
                new IntroJavaCourse("Intro to Java Programming","CRN0998");
        Course introToProgrammingCourse = 
                new IntroToProgrammingCourse("Intro to Programming","CRN0997");
        
        
        Course[] courseList1 = new Course[]{advancedJavaCourse , introJavaCourse,
           introToProgrammingCourse };
        //Liskov substitution works here
        for(Course c : courseList1){
            System.out.println(c.getCourseName()+": "+c.getCourseNumber());
            /*Now that I have prerequisites property in IntroToProgrammingCourse,
            *I can do this.
            */
            System.out.println(c.getPrerequisites());
        }
        
        
        /* This type of architecture works best since the sub classes are not 
        inheriting possibly bad code/unnecessary properties, only abstractions*/
           
        
        
    }
}
