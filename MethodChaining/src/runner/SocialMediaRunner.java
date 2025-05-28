package runner;

import com.xworz.method.SocialMedia;

public class SocialMediaRunner {
    public static void main(String[] args) {

        SocialMedia s1=new SocialMedia();
        System.out.println();
        s1.post("Angry");
        System.out.println();
        s1.post();
        System.out.println();
        SocialMedia.friends();
        System.out.println();
        SocialMedia.friends("Footaball",12300000);
        System.out.println();

    }
}
