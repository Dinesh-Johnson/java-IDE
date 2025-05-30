public class MenuItem {

    String name;
    int description;
    public static int SPICY=1;
    public static int VEG=2;
    public static int GLUTEN_FREE=4;

    public MenuItem(String name,int description){
        this.description=description;
        this.name=name;
    }
    public void getItemdescription(){
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
