public class Ticket {

    //Users buy different types of event tickets ? some allow backstage access, some include food, etc.
    //
    //Concepts tested:
    //
    //Base class Ticket has a privilegeFlags field (bitmask).
    //
    //ConcertTicket and SportsTicket override a method getPrivileges() to display perks.
    //
    //Constructor chaining passes ticket name and flag values.
    //
    //Bitwise logic is used to check for specific privileges.

    String eventName;
    int privilegeFlags;
    public static int BACKSTAGE=1;
    public static int FOOD=2;
    public static int VIP_SEAT=4;

    public Ticket(String eventName, int privilegeFlags) {
        this.eventName = eventName;
        this.privilegeFlags = privilegeFlags;
    }

    public void getPrivileges() {
        System.out.println("General Ticket Privileges");
        if ((privilegeFlags & BACKSTAGE)!=0){
            System.out.println("BACKSTAGE ACCESS INCLUDED");
        }
        if ((privilegeFlags & FOOD)!=0){
            System.out.println("FOOD ACCESS INCLUDED");
        }
        if ((privilegeFlags & VIP_SEAT)!=0){
            System.out.println("VIP_SEAT ACCESS INCLUDED");
        }
    }
}
