import sun.java2d.pipe.SpanShapeRenderer;

public class Google extends SearchEngine{

    String googleSearch;
    boolean safe;
    int page;

    public Google(String googleSearch,int page,boolean safe){
        super();
        this.googleSearch=googleSearch;
        this.page=page;
        this.safe=safe;
        System.out.println(super.search+"_"+super.page);
        System.out.println("Results for :"+googleSearch+"-"+page);
        if (safe == true) {
            System.out.println("Safesearch is ON");

        }
        else {
            System.out.println("Safesearch is OFF");

        }
        System.out.println();
    }
    public Google(String googleSearch,boolean safe){
        this();
        this.googleSearch=googleSearch;
        this.safe=safe;
        System.out.println("Results for :"+googleSearch);
        if (safe == true) {
            System.out.println("Safesearch is ON");

        }
        else {
            System.out.println("Safesearch is OFF");

        }

    }
    public Google(){
        System.out.println("###END OF THE REULTS ###");
        System.out.println();

    }
}
