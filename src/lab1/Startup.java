
package lab1;

/**
 *
 * @author cgonz
 */
public class Startup {
    public static void main(String[] args) {
        Course advJava = new 
            AdvancedJavaCourse("Advanced Java Progamming","CRN0000");
        
        System.out.println(advJava.getCourseName());
        
        Course introToProgramming = new 
            IntroToProgrammingCourse("Intro To Programming","CRN1111");
        Course[] courseList = new Course[]{advJava, introToProgramming};
        
        //Would not be able to get prerequisites for intro to programming
        for(Course c : courseList){
            System.out.println(c.getCourseName() + ": " + c.getCourseNumber());
        }
        
       /**Why Declaring by abstract type can be handy:
        * If I needed all of the Course names along with their Course Numbers,
        * then using the Course identifier is good since along Courses have a 
        * getCourseName method and getCourseNumber method defined. 
        * 
        * When we start needing much more concrete details that perhaps only one
        * or some classes share in common, then perhaps declaring by a much more
        * defined type can be useful. Some courses do not have prerequisites, so 
        * it might be a good idea to separate the Course classes that require a
        * setPrerequisites method and getPrerequisites method by having them
        * implement an interface with those abstract methods.
       */
    }
}
