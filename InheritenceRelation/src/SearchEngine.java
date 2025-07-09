public class SearchEngine {

    String search;
    int page;
    String searchEngine;
    boolean safeSearch;



    public SearchEngine(){
        this("Bike",1);
        System.out.println("Welcome to The Search Engine");
        System.out.println();

    }

    public SearchEngine(String search,int page){
        this("Cars",2,"Google",true);
        this.search=search;
        this.page=page;
        System.out.println(search+"-"+page);
        System.out.println();


    }
    public SearchEngine(String search,int page,String searchEngine,boolean safeSearch){
        this("Cars","Yahoo",false);
        this.search=search;
        this.page=page;
        this.searchEngine=searchEngine;
        this.safeSearch=safeSearch;
        System.out.println(search+"-"+page);
        System.out.println("Your Search Engine :"+searchEngine);
        if (safeSearch == true) {
            System.out.println("Safesearch is ON");

        }
        else {
            System.out.println("Safesearch is OFF");

        }
        System.out.println();

    }
    public SearchEngine(String search,String mailID,boolean safeSearch){
        this.search=search;
        this.searchEngine=searchEngine;
        this.safeSearch=safeSearch;
        System.out.println(search+"-"+page);
        System.out.println("Your Mail ID :");
        if (safeSearch == true) {
            System.out.println("Safesearch is ON");

        }
        else {
            System.out.println("Safesearch is OFF");

        }
        System.out.println();
    }
}
