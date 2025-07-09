package com.xworkz.amazon.repository;

import com.xworkz.amazon.constatnt.Type;
import com.xworkz.amazon.constatnt.Version;
import com.xworkz.amazon.things.ApplicationDTO;
import com.xworkz.amazon.things.OwnerDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApplicationRepositoryImpl implements ApplicationRepository{

    @Override
    public List<ApplicationDTO> findAll() {
        List<ApplicationDTO> apps = new ArrayList<>();

        ApplicationDTO app1 = new ApplicationDTO("Instagram",Version.V1,LocalDate.of(2010,10,6),250.5,Type.SOCIAL,true,0.0,
                Arrays.asList(new OwnerDTO("Kevin","kevin@insta.com",987654321l)));
        ApplicationDTO app2 = new ApplicationDTO("Spotify", Version.V4, LocalDate.of(2021, 6, 18), 150.88, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Daniel Ek", "daniel@appmail.com", 9897456202l)));
        ApplicationDTO app3 = new ApplicationDTO("Notion", Version.V1, LocalDate.of(2023, 3, 22), 198.65, Type.PRODUCTIVITY, true, 0.0, 
                Arrays.asList(new OwnerDTO("Ivan Zhao", "ivan@appmail.com", 9897456203l)));
        ApplicationDTO app4 = new ApplicationDTO("Zoom", Version.V3, LocalDate.of(2022, 11, 2), 420.25, Type.UTILITY, false, 299.49, 
                Arrays.asList(new OwnerDTO("Eric Yuan", "eric@appmail.com", 9897456204l)));
        ApplicationDTO app5 = new ApplicationDTO("Khan Academy", Version.V5, LocalDate.of(2020, 12, 15), 275.90, Type.EDUCATION, true, 0.0, 
                Arrays.asList(new OwnerDTO("Salman Khan", "salman@appmail.com", 9897456205l)));
        ApplicationDTO app6 = new ApplicationDTO("ChatGPT", Version.V1, LocalDate.of(2024, 2, 5), 380.0, Type.UTILITY, false, 399.00, 
                Arrays.asList(new OwnerDTO("Sam Altman", "sam@appmail.com", 9897456206l)));
        ApplicationDTO app7 = new ApplicationDTO("YouTube", Version.V3, LocalDate.of(2021, 9, 27), 445.23, Type.ENTERTAINMENT, true, 0.0, 
                Arrays.asList(new OwnerDTO("Steve Chen", "steve@appmail.com", 9897456207l)));
        ApplicationDTO app8 = new ApplicationDTO("WhatsApp", Version.V2, LocalDate.of(2023, 1, 17), 289.67, Type.SOCIAL, false, 250.75,
                Arrays.asList(new OwnerDTO("Brian Acton", "brian@appmail.com", 9897456208l)));
        ApplicationDTO app9 = new ApplicationDTO("Telegram", Version.V4, LocalDate.of(2020, 8, 9), 310.11, Type.SOCIAL, true, 0.0,
                Arrays.asList(new OwnerDTO("Pavel Durov", "pavel@appmail.com", 9897456209l)));
        ApplicationDTO app10 = new ApplicationDTO("Snapchat", Version.V5, LocalDate.of(2022, 4, 28), 265.34, Type.ENTERTAINMENT, false, 99.00, 
                Arrays.asList(new OwnerDTO("Evan Spiegel", "evan@appmail.com", 9897456210l)));
        ApplicationDTO app11 = new ApplicationDTO("AppX11", Version.V3, LocalDate.of(2022, 3, 15), 278.45, Type.PRODUCTIVITY, true, 0.0, 
                Arrays.asList(new OwnerDTO("User11", "user11@appmail.com", 9897456211l)));
        ApplicationDTO app12 = new ApplicationDTO("AppX12", Version.V1, LocalDate.of(2024, 6, 4), 389.20, Type.SOCIAL, false, 125.00, 
                Arrays.asList(new OwnerDTO("User12", "user12@appmail.com", 9897456212l)));
        ApplicationDTO app13 = new ApplicationDTO("AppX13", Version.V5, LocalDate.of(2021, 9, 28), 146.90, Type.ENTERTAINMENT, true, 0.0, 
                Arrays.asList(new OwnerDTO("User13", "user13@appmail.com", 9897456213l)));
        ApplicationDTO app14 = new ApplicationDTO("AppX14", Version.V4, LocalDate.of(2020, 11, 11), 222.35, Type.UTILITY, false, 320.75, 
                Arrays.asList(new OwnerDTO("User14", "user14@appmail.com", 9897456214l)));
        ApplicationDTO app15 = new ApplicationDTO("AppX15", Version.V2, LocalDate.of(2023, 2, 5), 305.60, Type.EDUCATION, true, 0.0, 
                Arrays.asList(new OwnerDTO("User15", "user15@appmail.com", 9897456215l)));
        ApplicationDTO app16 = new ApplicationDTO("Hulu", Version.V2, LocalDate.of(2022, 6, 10), 340.25, Type.ENTERTAINMENT, false, 199.99,
                Arrays.asList(new OwnerDTO("Jason Kilar", "jason@appmail.com", 9345612786l)));
        ApplicationDTO app17 = new ApplicationDTO("Twitch", Version.V1, LocalDate.of(2023, 1, 19), 415.78, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Emmett Shear", "emmett@appmail.com", 9867542311l)));
        ApplicationDTO app18 = new ApplicationDTO("Zee5", Version.V3, LocalDate.of(2021, 9, 25), 285.00, Type.ENTERTAINMENT, false, 149.50,
                Arrays.asList(new OwnerDTO("Subhash Chandra", "subhash@appmail.com", 9978654322l)));
        ApplicationDTO app19 = new ApplicationDTO("Voot", Version.V4, LocalDate.of(2023, 3, 8), 320.67, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Sudhanshu Vats", "sudhanshu@appmail.com", 9432187654l)));
        ApplicationDTO app20 = new ApplicationDTO("Discovery+", Version.V5, LocalDate.of(2020, 11, 1), 400.45, Type.ENTERTAINMENT, false, 129.00,
                Arrays.asList(new OwnerDTO("David Zaslav", "david@appmail.com", 9753124687l)));
        ApplicationDTO app21 = new ApplicationDTO("Hotstar", Version.V1, LocalDate.of(2022, 5, 10), 312.50, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Ajit Mohan", "ajit@appmail.com", 9123456781l)));
        ApplicationDTO app22 = new ApplicationDTO("Netflix", Version.V3, LocalDate.of(2023, 3, 12), 480.00, Type.ENTERTAINMENT, false, 399.99,
                Arrays.asList(new OwnerDTO("Reed Hastings", "reed@appmail.com", 9876543212l)));
        ApplicationDTO app23 = new ApplicationDTO("Prime Video", Version.V5, LocalDate.of(2021, 10, 4), 365.45, Type.ENTERTAINMENT, false, 299.00,
                Arrays.asList(new OwnerDTO("Jeff Bezos", "jeff@appmail.com", 9988776653l)));
        ApplicationDTO app24 = new ApplicationDTO("MX Player", Version.V2, LocalDate.of(2020, 12, 25), 145.30, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Karan Bedi", "karan@appmail.com", 9345678234l)));
        ApplicationDTO app25 = new ApplicationDTO("SonyLIV", Version.V4, LocalDate.of(2022, 8, 18), 398.70, Type.ENTERTAINMENT, false, 249.99,
                Arrays.asList(new OwnerDTO("NP Singh", "npsingh@appmail.com", 9765432189l)));
        ApplicationDTO app26 = new ApplicationDTO("YouTube TV", Version.V1, LocalDate.of(2021, 4, 15), 440.12, Type.ENTERTAINMENT, false, 299.00,
                Arrays.asList(new OwnerDTO("Susan Wojcicki", "susan@appmail.com", 9345123891l)));
        ApplicationDTO app27 = new ApplicationDTO("JioCinema", Version.V2, LocalDate.of(2023, 2, 20), 250.00, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Akash Ambani", "akash@appmail.com", 9456123789l)));
        ApplicationDTO app28 = new ApplicationDTO("Pluto TV", Version.V3, LocalDate.of(2020, 11, 5), 360.45, Type.ENTERTAINMENT, false, 149.00,
                Arrays.asList(new OwnerDTO("Tom Ryan", "tom@appmail.com", 9645321894l)));
        ApplicationDTO app29 = new ApplicationDTO("Tubi", Version.V4, LocalDate.of(2022, 9, 17), 189.30, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Farhad Massoudi", "farhad@appmail.com", 9543219874l)));
        ApplicationDTO app30 = new ApplicationDTO("Crunchyroll", Version.V5, LocalDate.of(2021, 6, 3), 330.10, Type.ENTERTAINMENT, false, 129.00,
                Arrays.asList(new OwnerDTO("Kun Gao", "kun@appmail.com", 9765431290l)));
        ApplicationDTO app31 = new ApplicationDTO("Sling TV", Version.V2, LocalDate.of(2023, 5, 12), 290.67, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Roger Lynch", "roger@appmail.com", 9345124781l)));
        ApplicationDTO app32 = new ApplicationDTO("Peacock", Version.V1, LocalDate.of(2020, 8, 23), 385.75, Type.ENTERTAINMENT, false, 179.99,
                Arrays.asList(new OwnerDTO("Matt Strauss", "matt@appmail.com", 9432124578l)));
        ApplicationDTO app33 = new ApplicationDTO("Paramount+", Version.V3, LocalDate.of(2022, 7, 9), 401.55, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Shari Redstone", "shari@appmail.com", 9321456783l)));
        ApplicationDTO app34 = new ApplicationDTO("AltBalaji", Version.V4, LocalDate.of(2021, 3, 19), 222.20, Type.ENTERTAINMENT, false, 99.00,
                Arrays.asList(new OwnerDTO("Shobha Kapoor", "shobha@appmail.com", 9871234561l)));
        ApplicationDTO app35 = new ApplicationDTO("Eros Now", Version.V5, LocalDate.of(2020, 10, 1), 310.90, Type.ENTERTAINMENT, true, 0.0,
                Arrays.asList(new OwnerDTO("Kishore Lulla", "kishore@appmail.com", 9745123674l)));
        ApplicationDTO app36 = new ApplicationDTO("CamScanner", Version.V3, LocalDate.of(2020, 12, 22), 160.44, Type.UTILITY, false, 149.00,
                Arrays.asList(new OwnerDTO("John Smith", "johnsmith@appmail.com", 9678912345l)));
        ApplicationDTO app37 = new ApplicationDTO("Speedtest", Version.V1, LocalDate.of(2023, 4, 10), 180.99, Type.UTILITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Doug Suttles", "doug@appmail.com", 9789123456l)));
        ApplicationDTO app38 = new ApplicationDTO("Weather App", Version.V5, LocalDate.of(2021, 2, 14), 205.00, Type.UTILITY, true, 0.0,
                Arrays.asList(new OwnerDTO("John Doe", "john@appmail.com", 9891234567l)));
        ApplicationDTO app39 = new ApplicationDTO("Calculator+", Version.V2, LocalDate.of(2022, 7, 28), 120.55, Type.UTILITY, false, 99.00,
                Arrays.asList(new OwnerDTO("James Allen", "james@appmail.com", 9941234568l)));
        ApplicationDTO app40 = new ApplicationDTO("Adobe Scan", Version.V4, LocalDate.of(2023, 6, 5), 260.12, Type.UTILITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Shantanu Narayen", "shantanu@appmail.com", 9981234569l)));
        ApplicationDTO app41 = new ApplicationDTO("BYJU'S", Version.V3, LocalDate.of(2020, 5, 10), 315.00, Type.EDUCATION, true, 0.0,
                Arrays.asList(new OwnerDTO("Byju Raveendran", "byju@appmail.com", 9123123123l)));
        ApplicationDTO app42 = new ApplicationDTO("Unacademy", Version.V2, LocalDate.of(2021, 8, 18), 280.80, Type.EDUCATION, true, 0.0,
                Arrays.asList(new OwnerDTO("Gaurav Munjal", "gaurav@appmail.com", 9234234234l)));
        ApplicationDTO app43 = new ApplicationDTO("Khan Academy", Version.V5, LocalDate.of(2022, 3, 15), 240.40, Type.EDUCATION, true, 0.0,
                Arrays.asList(new OwnerDTO("Salman Khan", "salman@appmail.com", 9345345345l)));
        ApplicationDTO app44 = new ApplicationDTO("Vedantu", Version.V1, LocalDate.of(2023, 1, 25), 225.90, Type.EDUCATION, false, 199.00,
                Arrays.asList(new OwnerDTO("Vamsi Krishna", "vamsi@appmail.com", 9456456456l)));
        ApplicationDTO app45 = new ApplicationDTO("Duolingo", Version.V4, LocalDate.of(2020, 11, 11), 200.00, Type.EDUCATION, true, 0.0,
                Arrays.asList(new OwnerDTO("Luis von Ahn", "luis@appmail.com", 9567567567l)));
        ApplicationDTO app46 = new ApplicationDTO("Evernote", Version.V2, LocalDate.of(2021, 5, 15), 255.60, Type.PRODUCTIVITY, false, 149.99,
                Arrays.asList(new OwnerDTO("Stepan Pachikov", "stepan@appmail.com", 9678678678l)));
        ApplicationDTO app47 = new ApplicationDTO("Notion", Version.V1, LocalDate.of(2022, 4, 10), 270.90, Type.PRODUCTIVITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Ivan Zhao", "ivan@appmail.com", 9789789789l)));
        ApplicationDTO app48 = new ApplicationDTO("Todoist", Version.V4, LocalDate.of(2023, 1, 25), 210.40, Type.PRODUCTIVITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Amir Salihefendić", "amir@appmail.com", 9890890890l)));
        ApplicationDTO app49 = new ApplicationDTO("Trello", Version.V3, LocalDate.of(2020, 12, 1), 230.60, Type.PRODUCTIVITY, true, 0.0,
                Arrays.asList(new OwnerDTO("Joel Spolsky", "joel@appmail.com", 9940090090l)));
        ApplicationDTO app50 = new ApplicationDTO("Asana", Version.V5, LocalDate.of(2023, 3, 8), 175.80, Type.PRODUCTIVITY, false, 199.00,
                Arrays.asList(new OwnerDTO
                        ("Dustin Moskovitz", "dustin@appmail.com", 9990001122l)));
        apps.add(app1);
        apps.add(app2);
        apps.add(app3);
        apps.add(app4);
        apps.add(app5);
        apps.add(app6);
        apps.add(app7);
        apps.add(app8);
        apps.add(app9);
        apps.add(app10);
        apps.add(app11);
        apps.add(app12);
        apps.add(app13);
        apps.add(app14);
        apps.add(app15);
        apps.add(app16);
        apps.add(app17);
        apps.add(app18);
        apps.add(app19);
        apps.add(app20);
        apps.add(app21);
        apps.add(app22);
        apps.add(app23);
        apps.add(app24);
        apps.add(app25);
        apps.add(app26);
        apps.add(app27);
        apps.add(app28);
        apps.add(app29);
        apps.add(app30);
        apps.add(app31);
        apps.add(app32);
        apps.add(app33);
        apps.add(app34);
        apps.add(app35);
        apps.add(app36);
        apps.add(app37);
        apps.add(app38);
        apps.add(app39);
        apps.add(app40);
        apps.add(app41);
        apps.add(app42);
        apps.add(app43);
        apps.add(app44);
        apps.add(app45);
        apps.add(app46);
        apps.add(app47);
        apps.add(app48);
        apps.add(app49);
        apps.add(app50);

        return apps;
    }
}
