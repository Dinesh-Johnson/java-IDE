public class TIcketRunner {
    public static void main(String[] args) {

        int accessALL= Ticket.BACKSTAGE|Ticket.FOOD|Ticket.VIP_SEAT;
        int sportsAccess=Ticket.FOOD|Ticket.VIP_SEAT;

        ConcertTicket ct=new ConcertTicket(accessALL);
        SportsTicket st=new SportsTicket(sportsAccess);

        ct.getPrivileges();
        System.out.println();
        st.getPrivileges();
    }
}
