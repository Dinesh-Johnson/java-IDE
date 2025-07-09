package example.runner;




import example.dto.person.Address;
import example.dto.person.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {

        Map<Person, Address> map = new HashMap<>();

        map.put(new Person("Dinesh", "danealdinesh@gmail.com", "1254 2563 2541"), new Address("14D", "Teachers Colony", "Salem", 637001));
        map.put(new Person("Arjun", "arjun22@gmail.com", "7894 2312 5632"), new Address("22B", "Anna Nagar", "Chennai", 600040));
        map.put(new Person("Riya", "riya.mehta@yahoo.com", "1234 5678 9101"), new Address("9C", "Indiranagar 100 Feet Road", "Bangalore", 560038));
        map.put(new Person("Karthik", "karthik123@outlook.com", "4567 8910 2345"), new Address("35A", "Race Course", "Coimbatore", 641018));
        map.put(new Person("Anjali", "anjali.k@gmail.com", "6789 2345 7890"), new Address("18E", "Park Street", "Kolkata", 700017)); // Replaced next line
        map.put(new Person("Surya", "surya_97@gmail.com", "3214 6543 9876"), new Address("4F", "MG Road", "Bangalore", 560001));
        map.put(new Person("Divya", "divya.raj@hotmail.com", "9021 8765 4321"), new Address("7G", "Rajaji Nagar", "Bangalore", 560010));
        map.put(new Person("Manoj", "manoj_dev@gmail.com", "1478 3652 9513"), new Address("12H", "BTM Layout", "Bangalore", 560029));
        map.put(new Person("Nisha", "nisha.sharma@gmail.com", "7531 2468 9352"), new Address("6K", "Electronic City Phase 1", "Bangalore", 560100));
        map.put(new Person("Rahul", "rahulv1995@gmail.com", "8412 3945 7863"), new Address("3L", "Whitefield Main Road", "Bangalore", 560066));
        map.put(new Person("Sneha", "sneha_v@rediffmail.com", "1209 3478 9654"), new Address("28M", "Jayanagar 4th Block", "Bangalore", 560011));
        map.put(new Person("Vinod", "vinod.kv@gmail.com", "6781 1234 2222"), new Address("45N", "Bannerghatta Road", "Bangalore", 560076));
        map.put(new Person("Lavanya", "lavanya_arts@yahoo.com", "9021 7774 1234"), new Address("89O", "Malleshwaram 18th Cross", "Bangalore", 560003));
        map.put(new Person("Sathish", "sathish_js@gmail.com", "4901 3421 7864"), new Address("11P", "Yelahanka New Town", "Bangalore", 560064));
        map.put(new Person("Geetha", "geetha.music@gmail.com", "3289 1089 2343"), new Address("37Q", "Kengeri Satellite Town", "Bangalore", 560060));
        map.put(new Person("Abhinav", "abhi.code@outlook.com", "4571 8810 1994"), new Address("19R", "Hebbal Flyover", "Bangalore", 560024));
        map.put(new Person("Meera", "meera.official@gmail.com", "9911 4488 7765"), new Address("53S", "Marathahalli Ring Road", "Bangalore", 560037));
        map.put(new Person("Ravi", "ravi.03@yahoo.com", "6540 8891 3367"), new Address("2T", "Koramangala 5th Block", "Bangalore", 560095));
        map.put(new Person("Pooja", "pooja_kumari@gmail.com", "3425 6987 2200"), new Address("75U", "HSR Layout Sector 2", "Bangalore", 560102));
        map.put(new Person("Vikram", "vikram.tech@gmail.com", "7812 1234 5678"), new Address("8V", "JP Nagar 7th Phase", "Bangalore", 560078));
        map.put(new Person("Harini", "harini97@gmail.com", "1256 7843 9910"), new Address("61W", "Kamaraj Street", "Ariyalur", 621704));
        map.put(new Person("Ajay", "ajay.inbox@gmail.com", "2134 9977 8890"), new Address("30X", "Periyar Street", "Thanjavur", 613001));
        map.put(new Person("Sandhya", "sandhya_shine@gmail.com", "5689 3410 7865"), new Address("66Y", "Gandhi Salai", "Villupuram", 605602));
        map.put(new Person("Naveen", "naveen_js@gmail.com", "4712 3321 1001"), new Address("99Z", "Market Road", "Vellore", 632001));
        map.put(new Person("Bhuvana", "bhuvana.rk@gmail.com", "3104 8923 7810"), new Address("5AA", "New Bus Stand", "Cuddalore", 607001));

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);


    }

}