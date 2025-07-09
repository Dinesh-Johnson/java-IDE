public class MotionSensor extends SecuritySensor{

    public MotionSensor(int statusFlags){
        super("Garden","Motion Sensor",statusFlags);
    }
    public void checkStauts(){
        System.out.println(location+":"+name+" "+ "Accessing");
        if ((statusFlags & TRIGGERD)!=0){
            System.out.println("! ! TRIGGERED ! !");
        }
        if ((statusFlags & LOW_BATTERY)!=0){
            System.out.println("! ! LOW BATTERY ! !");
        }
        if ((statusFlags & TAMPERED)!=0){
            System.out.println("! ! TAMPERED ! !");
        }
    }

}
