import sun.applet.Main;

public class MenuItemRunner {
    public static void main(String[] args) {

        int allInclude= MainCourse.SPICY|MainCourse.VEG;
        int beverage=MainCourse.GLUTEN_FREE;

        MainCourse mc=new MainCourse(allInclude);
        Beverage bev=new Beverage(beverage);

        mc.getItemdescription();
        System.out.println();
        bev.getItemdescription();

    }
}
