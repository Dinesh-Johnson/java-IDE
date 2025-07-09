public class SportsTicket extends Ticket{

    public SportsTicket(int privilegeFlags){
        super("Sports",privilegeFlags);
    }
    @Override
    public void getPrivileges() {
        System.out.println(eventName+" Ticket Privileges");
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
