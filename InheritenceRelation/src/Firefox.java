public class Firefox extends SearchEngine{

    String firefoxSearch;
    boolean safe;
    int page;

    public Firefox(String firefoxSearch,int page,boolean safe){
        super("Firefox",2);
        this.firefoxSearch=firefoxSearch;
        this.page=page;
        this.safe=safe;
        System.out.println(super.search+"_"+super.page);
        System.out.println("Results for :"+firefoxSearch+"-"+page);
        if (safe == true) {
            System.out.println("Safesearch is ON");

        }
        else {
            System.out.println("Safesearch is OFF");

        }
        System.out.println();
    }
    public Firefox(String googleSearch,boolean safe){
        this();
        this.firefoxSearch=firefoxSearch;
        this.safe=safe;
        System.out.println("Results for :"+firefoxSearch);
        if (safe == true) {
            System.out.println("Safesearch is ON");

        }
        else {
            System.out.println("Safesearch is OFF");

        }
        System.out.println();

    }
    public Firefox(){
        System.out.println("###END OF THE REULTS ###");
        System.out.println();

    }

}
