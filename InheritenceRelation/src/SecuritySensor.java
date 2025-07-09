public class SecuritySensor {
    //5.Home Security System
    //Scenario:
    //You are designing a home security system that uses various types of sensors ? motion detectors, door alarms, and window sensors.
    //Concepts Tested:
    //A base class SecuritySensor has a statusFlags integer:
    //1 = Triggered,
    //2 = Low Battery,
    //4 = Tampered
    //MotionSensor and DoorSensor inherit from SecuritySensor.
    //Override checkStatus() in each subclass to return specific messages depending on active bits.
    //Use constructor chaining to initialize the location and sensor ID.

    String location;
    String name;
    int statusFlags;
    public static int TRIGGERD=1;
    public static int LOW_BATTERY=2;
    public static int TAMPERED=4;

    public SecuritySensor(String location,String name,int statusFlags){
        this.location=location;
        this.name=name;
        this.statusFlags=statusFlags;
    }

    public void checkStauts(){
        System.out.println("Security Sensor Accessing");
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
