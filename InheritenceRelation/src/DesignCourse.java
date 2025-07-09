public class DesignCourse extends Course{

    public DesignCourse(int accessLevel){
        super("Design Course",accessLevel);
    }
@Override
    public void getAccessInfo(){
        System.out.println("Programming Course Access:");
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
