public class MainCourse extends MenuItem{

    public MainCourse(int description){
        super("Veg Briyani",description);
    }

    @Override
    public void getItemdescription() {
        System.out.println(name+" Description");
        if((description & SPICY) !=0){
            System.out.println("SPICY");
        }
        if((description & VEG) !=0){
            System.out.println("VEG");
        }
        if((description & GLUTEN_FREE) !=0){
            System.out.println("GLUTEN FREE");
        }
    }
}
