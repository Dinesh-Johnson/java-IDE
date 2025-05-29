public class SearchRunner {
    public static void main(String[] args) {

        Firefox s1= new Firefox();
        Firefox s2= new Firefox("car",1,true);
        Firefox s3= new Firefox("bikes",false);
        s1.safe=true;

        Google g1= new Google();
        Google g2= new Google("Nature",1,true);
        Google g3= new Google("Movies",false);
        g1.safe=true;


    }
}
