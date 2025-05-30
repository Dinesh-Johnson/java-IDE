public class SecuritySensorRunner {
    public static void main(String[] args) {

        int accessMotionSensor= SecuritySensor.LOW_BATTERY|SecuritySensor.TRIGGERD;
        int doorSensor=SecuritySensor.TRIGGERD|SecuritySensor.TAMPERED;

        MotionSensor ms=new MotionSensor(accessMotionSensor);
        DoorSensor ds=new DoorSensor(doorSensor);

        ms.checkStauts();
        System.out.println();
        ds.checkStauts();
    }
}
