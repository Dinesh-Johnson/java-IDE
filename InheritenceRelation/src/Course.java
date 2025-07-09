public class Course {
    //2.Online Course Access Control
    //Scenario:
    //Users enroll in online courses. Some users get certificates, some get quiz access, etc.
    //
    //Concepts tested:
    //
    //Base class Course includes accessLevel as a bitmask (e.g., 1 = quiz, 2 = certificate, 4 = offline access).
    //
    //ProgrammingCourse, DesignCourse inherit from Course.
    //
    //Subclasses override a method like getAccessInfo() to display what access user has.
    //
    //Use constructor chaining to initialize course details and access rights.

    String courseName;
    int accessLevel;
    public static int QUIZ= 1<<0;
    public static int CERTIFICATE =1<<1;
    public static int OFFLINE_COURSES=1<<2;

    public Course(String courseName,int accessLevel){
        this.accessLevel=accessLevel;
        this.courseName=courseName;
    }

    public void getAccessInfo(){
        System.out.println(courseName+" Course");
        if ((accessLevel & QUIZ) !=0){
            System.out.println("QUIZ ACCESS");
        }
        if ((accessLevel & CERTIFICATE) !=0){
            System.out.println("CERTIFICATE ACCESS");
        }
        if ((accessLevel & OFFLINE_COURSES) !=0){
            System.out.println("OFFLINE COURSES ACCESS");
        }
    }
}
