public class CourseRunner {
    public static void main(String[] args) {

        int accessAll=Course.OFFLINE_COURSES|Course.QUIZ|Course.CERTIFICATE;
        int basic= Course.CERTIFICATE;

        ProgeammingCourse pc= new ProgeammingCourse(accessAll);
        DesignCourse dc= new DesignCourse(basic);

        pc.getAccessInfo();
        System.out.println();
        dc.getAccessInfo();
    }
}
