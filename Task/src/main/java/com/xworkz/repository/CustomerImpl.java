package com.xworkz.repository;

import dto.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class CustomerImpl implements CustomerRepository{

    @Override
    public Collection<Customer> findAll() {

        Collection<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Dinesh",28,"Male",
                new Passport("P101", LocalDate.of(2015, 1, 1), LocalDate.of(2025, 1, 1),
                        new Country("India", "IN", 1400000000,
                                new President("Narendra Modi", 10, 73,
                                        new Driver("Ramu", "DL001", 10,new Vehicle("Car", "i20", "DL01G1234",
                                                new Company("Tata Group", "Conglomerate", "Mumbai",
                                                        new CEO("Natarajan Chandrasekaran", 60, 90000000,
                                                                new House("Velachery", 2, true,
                                                                        new Security("SEC001", "Gated", 3,
                                                                                new Job("Developer", 50000, "Chennai",
                                                                                        new Detail("D001", "Spring Dev", "Mid",
                                                                                                new Education("B.E", "Anna University", 2015, 8.2))))))))))))));
        customers.add(new Customer("Ohm", 34, "Male",
                new Passport("P103", LocalDate.of(2016, 10, 10), LocalDate.of(2026, 10, 10),
                        new Country("France", "FR", 67000000,
                                new President("Emmanuel Macron", 7, 46,
                                        new Driver("Pierre", "DL003", 12,
                                                new Vehicle("Sedan", "Peugeot 308", "FR45678",
                                                        new Company("L'Oréal", "Cosmetics", "Paris",
                                                                new CEO("Nicolas Hieronimus", 58, 85000000,
                                                                        new House("Paris 7e", 4, true,
                                                                                new Security("SEC003", "High-Tech", 5,
                                                                                        new Job("Beauty Analyst", 85000, "Paris",
                                                                                                new Detail("D003", "Marketing", "Lead",
                                                                                                        new Education("M.B.A", "HEC Paris", 2013, 9.0))))))))))))));
        customers.add(new Customer("Aarav", 30, "Male",
                new Passport("P104", LocalDate.of(2014, 5, 20), LocalDate.of(2024, 5, 20),
                        new Country("Japan", "JP", 125000000,
                                new President("Shigeru Ishiba", 1, 68,
                                        new Driver("Takeshi", "DL004", 8,
                                                new Vehicle("Coupe", "Nissan GTR", "JP2020",
                                                        new Company("Sony", "Electronics", "Tokyo",
                                                                new CEO("Kenichiro Yoshida", 62, 100000000,
                                                                        new House("Shinjuku", 5, true,
                                                                                new Security("SEC004", "Robot Guard", 4,
                                                                                        new Job("Software Architect", 95000, "Tokyo",
                                                                                                new Detail("D004", "AI Dev", "Senior",
                                                                                                        new Education("M.Tech", "Tokyo Univ", 2012, 8.8))))))))))))));

        customers.add(new Customer("Sarah", 27, "Female",
                new Passport("P105", LocalDate.of(2017, 8, 15), LocalDate.of(2027, 8, 15),
                        new Country("Canada", "CA", 38000000,
                                new President("Mark Carney", 1, 60,
                                        new Driver("Emily", "DL005", 6,
                                                new Vehicle("SUV", "Ford Escape", "CA1111",
                                                        new Company("Shopify", "E-Commerce", "Ottawa",
                                                                new CEO("Tobias Lütke", 44, 75000000,
                                                                        new House("Kanata", 3, true,
                                                                                new Security("SEC005", "Digital", 3,
                                                                                        new Job("Frontend Dev", 68000, "Toronto",
                                                                                                new Detail("D005", "React", "Junior",
                                                                                                        new Education("B.Sc", "Toronto Univ", 2018, 8.4))))))))))))));

        customers.add(new Customer("Suresh", 35, "Male",
                new Passport("P110", LocalDate.of(2018, 9, 10), LocalDate.of(2028, 9, 10),
                        new Country("France", "FR", 67_000_000,
                                new President("Emmanuel Macron", 2, 46,
                                        new Driver("Luc", "DL010", 8, new Vehicle("Hatchback", "Peugeot 308", "FR4321",
                                                new Company("L'Oréal", "Cosmetics", "Clichy",
                                                        new CEO("Nicolas Hieronimus", 56, 150_000_000,
                                                                new House("Neuilly-sur-Seine", 4, true,
                                                                        new Security("SEC010", "Gated", 3,
                                                                                new Job("R&D Chemist", 90000, "Paris",
                                                                                        new Detail("D010", "Haircare", "Senior",
                                                                                                new Education("PhD", "Sorbonne Univ", 2010, 9.0))))))))))))));

        customers.add(new Customer("Anitha", 29, "Female",
                new Passport("P111", LocalDate.of(2019, 4, 25), LocalDate.of(2029, 4, 25),
                        new Country("Australia", "AU", 26_000_000,
                                new President("Anthony Albanese", 1, 59,
                                        new Driver("Jack", "DL011", 7, new Vehicle("SUV", "Toyota RAV4", "AU5678",
                                                new Company("Atlassian", "Software", "Sydney",
                                                        new CEO("Mike Cannon-Brookes", 45, 30_000_000,
                                                                new House("Parramatta", 3, true,
                                                                        new Security("SEC011", "Digital", 2,
                                                                                new Job("DevOps Engineer", 110000, "Sydney",
                                                                                        new Detail("D011", "Cloud Infra", "Mid",
                                                                                                new Education("B.Tech", "UNSW", 2014, 8.5))))))))))))));

        customers.add(new Customer("Rajesh", 31, "Male",
                new Passport("P112", LocalDate.of(2014, 3, 2), LocalDate.of(2024, 3, 2),
                        new Country("UAE", "AE", 10_000_000,
                                new President("Sheikh Mohamed bin Zayed Al Nahyan", 3, 63,
                                        new Driver("Ahmed", "DL012", 9, new Vehicle("SUV", "Nissan Patrol", "AE7890",
                                                new Company("Etihad", "Airline", "Abu Dhabi",
                                                        new CEO("Antonoaldo Neves", 56, 80_000_000,
                                                                new House("Al Raha", 4, true,
                                                                        new Security("SEC012", "AI Surveillance", 5,
                                                                                new Job("Pilot", 130000, "Abu Dhabi",
                                                                                        new Detail("D012", "Long-haul", "Lead",
                                                                                                new Education("M.Sc", "Emirates Univ", 2008, 8.9))))))))))))));

        customers.add(new Customer("Keerthi", 27, "Female",
                new Passport("P113", LocalDate.of(2020, 12, 5), LocalDate.of(2030, 12, 5),
                        new Country("China", "CN", 1_400_000_000,
                                new President("Xi Jinping", 3, 70,
                                        new Driver("Li", "DL013", 6, new Vehicle("Sedan", "BYD Han", "CN3456",
                                                new Company("Huawei", "Telecom", "Shenzhen",
                                                        new CEO("Xu Zhijun", 55, 50_000_000,
                                                                new House("Nanshan", 3, true,
                                                                        new Security("SEC013", "Biometric", 4,
                                                                                new Job("5G Engineer", 95000, "Shenzhen",
                                                                                        new Detail("D013", "Radio Tech", "Mid",
                                                                                                new Education("B.Eng", "Tsinghua", 2015, 9.1))))))))))))));

        customers.add(new Customer("Arvind", 33, "Male",
                new Passport("P114", LocalDate.of(2016, 1, 20), LocalDate.of(2026, 1, 20),
                        new Country("UK", "GB", 67_000_000,
                                new President("King Charles III", 1, 76,
                                        new Driver("Oliver", "DL014", 10, new Vehicle("Luxury", "Rolls-Royce Phantom", "GB9012",
                                                new Company("Rolls‑Royce", "Luxury Automobiles", "Goodwood",
                                                        new CEO("Tobias Moers", 58, 25_000_000,
                                                                new House("Richmond", 5, true,
                                                                        new Security("SEC014", "Gated", 4,
                                                                                new Job("Design Engineer", 105000, "Goodwood",
                                                                                        new Detail("D014", "Coachbuilding", "Expert",
                                                                                                new Education("M.Sc", "Imperial Coll", 2009, 8.7))))))))))))));

        customers.add(new Customer("Nagaraj", 34, "Male",
                new Passport("P115", LocalDate.of(2013, 6, 30), LocalDate.of(2023, 6, 30),
                        new Country("Brazil", "BR", 213_000_000,
                                new President("Luiz Inácio Lula da Silva", 1, 78,
                                        new Driver("Carlos", "DL015", 11, new Vehicle("Hatchback", "VW Polo", "BR1234",
                                                new Company("Petrobras", "Oil & Gas", "Rio de Janeiro",
                                                        new CEO("Jean Paul Prates", 53, 35_000_000,
                                                                new House("Barra", 4, true,
                                                                        new Security("SEC015", "Digital", 3,
                                                                                new Job("Petroleum Engineer", 95000, "Rio de Janeiro",
                                                                                        new Detail("D015", "Upstream", "Senior",
                                                                                                new Education("B.Sc", "UFRJ", 2007, 8.3))))))))))))));

        customers.add(new Customer("Vishal", 28, "Male",
                new Passport("P116", LocalDate.of(2019, 11, 11), LocalDate.of(2029, 11, 11),
                        new Country("Canada", "CA", 38_000_000,
                                new President("Mark Carney", 1, 60,
                                        new Driver("Ethan", "DL016", 7, new Vehicle("SUV", "Honda Civic", "CA2345",
                                                new Company("Shopify", "E-Commerce", "Ottawa",
                                                        new CEO("Tobias Lütke", 44, 75_000_000,
                                                                new House("Kanata", 3, true,
                                                                        new Security("SEC016", "Digital", 3,
                                                                                new Job("Backend Dev", 80000, "Toronto",
                                                                                        new Detail("D016", "Rails", "Mid",
                                                                                                new Education("B.Sc", "Toronto Univ", 2017, 8.6))))))))))))));
        customers.add(new Customer("Gokul", 26, "Male",
                new Passport("P117", LocalDate.of(2020, 5, 5), LocalDate.of(2030, 5, 5),
                        new Country("India", "IN", 1400000000,
                                new President("Narendra Modi", 10, 73,
                                        new Driver("Mani", "DL017", 9, new Vehicle("SUV", "Mahindra Thar", "DL02H7654",
                                                new Company("Zomato", "Food Delivery", "Gurgaon",
                                                        new CEO("Deepinder Goyal", 41, 60000000,
                                                                new House("Adyar", 2, true,
                                                                        new Security("SEC017", "Smart", 3,
                                                                                new Job("Android Dev", 70000, "Bangalore",
                                                                                        new Detail("D017", "Mobile App", "Junior",
                                                                                                new Education("B.E", "VIT", 2016, 8.1))))))))))))));

        customers.add(new Customer("Karthik", 32, "Male",
                new Passport("P118", LocalDate.of(2021, 3, 3), LocalDate.of(2031, 3, 3),
                        new Country("France", "FR", 67000000,
                                new President("Emmanuel Macron", 7, 46,
                                        new Driver("Julien", "DL018", 6, new Vehicle("SUV", "Renault Duster", "FR6677",
                                                new Company("Airbus", "Aerospace", "Toulouse",
                                                        new CEO("Guillaume Faury", 55, 110000000,
                                                                new House("Toulouse Center", 3, true,
                                                                        new Security("SEC018", "Laser", 4,
                                                                                new Job("Aero Engineer", 120000, "Toulouse",
                                                                                        new Detail("D018", "Jet Systems", "Senior",
                                                                                                new Education("M.E", "ISAE-SUPAERO", 2014, 9.2))))))))))))));

        customers.add(new Customer("Divya", 25, "Female",
                new Passport("P119", LocalDate.of(2022, 7, 1), LocalDate.of(2032, 7, 1),
                        new Country("Japan", "JP", 125000000,
                                new President("Shigeru Ishiba", 1, 68,
                                        new Driver("Aiko", "DL019", 5, new Vehicle("Compact", "Toyota Aqua", "JP1122",
                                                new Company("Rakuten", "E-Commerce", "Tokyo",
                                                        new CEO("Hiroshi Mikitani", 58, 85000000,
                                                                new House("Harajuku", 3, true,
                                                                        new Security("SEC019", "AI Drone", 5,
                                                                                new Job("UX Designer", 90000, "Tokyo",
                                                                                        new Detail("D019", "Product Design", "Mid",
                                                                                                new Education("B.Des", "Keio University", 2017, 8.5))))))))))))));

        customers.add(new Customer("Lakshmi", 30, "Female",
                new Passport("P120", LocalDate.of(2015, 12, 12), LocalDate.of(2025, 12, 12),
                        new Country("Canada", "CA", 38000000,
                                new President("Mark Carney", 1, 60,
                                        new Driver("Sophia", "DL020", 7, new Vehicle("Sedan", "Toyota Camry", "CA7890",
                                                new Company("Lightspeed", "Retail Tech", "Montreal",
                                                        new CEO("JP Chauvet", 48, 60000000,
                                                                new House("Côte-des-Neiges", 3, true,
                                                                        new Security("SEC020", "Video AI", 3,
                                                                                new Job("QA Engineer", 68000, "Montreal",
                                                                                        new Detail("D020", "TestOps", "Junior",
                                                                                                new Education("B.Tech", "McGill", 2015, 8.3))))))))))))));

        customers.add(new Customer("Pradeep", 29, "Male",
                new Passport("P121", LocalDate.of(2023, 2, 14), LocalDate.of(2033, 2, 14),
                        new Country("Australia", "AU", 26000000,
                                new President("Anthony Albanese", 1, 59,
                                        new Driver("Tom", "DL021", 8, new Vehicle("Ute", "Ford Ranger", "AU3344",
                                                new Company("Canva", "Design Software", "Sydney",
                                                        new CEO("Melanie Perkins", 37, 40000000,
                                                                new House("Bondi", 2, true,
                                                                        new Security("SEC021", "IoT System", 4,
                                                                                new Job("UI Designer", 85000, "Melbourne",
                                                                                        new Detail("D021", "Canva Web", "Mid",
                                                                                                new Education("BFA", "RMIT", 2016, 8.6))))))))))))));

        customers.add(new Customer("Sindhu", 28, "Female",
                new Passport("P122", LocalDate.of(2022, 4, 9), LocalDate.of(2032, 4, 9),
                        new Country("Brazil", "BR", 213000000,
                                new President("Luiz Inácio Lula da Silva", 1, 78,
                                        new Driver("Raul", "DL022", 6, new Vehicle("Sedan", "Fiat Cronos", "BR6565",
                                                new Company("Nubank", "Fintech", "São Paulo",
                                                        new CEO("David Vélez", 43, 78000000,
                                                                new House("Moema", 3, true,
                                                                        new Security("SEC022", "Neural Sensor", 4,
                                                                                new Job("Security Analyst", 75000, "São Paulo",
                                                                                        new Detail("D022", "Cybersec", "Mid",
                                                                                                new Education("M.Sc", "USP", 2013, 8.8))))))))))))));

        customers.add(new Customer("Madhan", 33, "Male",
                new Passport("P123", LocalDate.of(2020, 6, 1), LocalDate.of(2030, 6, 1),
                        new Country("UK", "GB", 67000000,
                                new President("King Charles III", 1, 76,
                                        new Driver("Harry", "DL023", 10, new Vehicle("Luxury", "Jaguar XE", "GB3456",
                                                new Company("Unilever", "FMCG", "London",
                                                        new CEO("Alan Jope", 61, 91000000,
                                                                new House("Wembley", 4, true,
                                                                        new Security("SEC023", "Guarded", 4,
                                                                                new Job("Logistics Officer", 70000, "London",
                                                                                        new Detail("D023", "Supply Chain", "Mid",
                                                                                                new Education("BBA", "LSE", 2012, 8.0))))))))))))));

        customers.add(new Customer("Swetha", 27, "Female",
                new Passport("P124", LocalDate.of(2021, 5, 2), LocalDate.of(2031, 5, 2),
                        new Country("China", "CN", 1400000000,
                                new President("Xi Jinping", 3, 70,
                                        new Driver("Chen", "DL024", 7, new Vehicle("Electric", "Xpeng P7", "CN9090",
                                                new Company("Tencent", "Tech", "Shenzhen",
                                                        new CEO("Pony Ma", 52, 93000000,
                                                                new House("Futian", 3, true,
                                                                        new Security("SEC024", "Drone Guard", 4,
                                                                                new Job("ML Engineer", 98000, "Beijing",
                                                                                        new Detail("D024", "Model Training", "Senior",
                                                                                                new Education("M.Tech", "Peking University", 2015, 9.0))))))))))))));

        customers.add(new Customer("Tharun", 26, "Male",
                new Passport("P125", LocalDate.of(2016, 8, 8), LocalDate.of(2026, 8, 8),
                        new Country("UAE", "AE", 10000000,
                                new President("Sheikh Mohamed bin Zayed Al Nahyan", 3, 63,
                                        new Driver("Hassan", "DL025", 9, new Vehicle("SUV", "Hyundai Tucson", "AE3456",
                                                new Company("Careem", "Ride Hailing", "Dubai",
                                                        new CEO("Mudassir Sheikha", 45, 62000000,
                                                                new House("Bur Dubai", 4, true,
                                                                        new Security("SEC025", "Biometric", 5,
                                                                                new Job("Full Stack Dev", 105000, "Dubai",
                                                                                        new Detail("D025", "Web System", "Mid",
                                                                                                new Education("B.E", "BITS Dubai", 2016, 8.5))))))))))))));

        customers.add(new Customer("Jeeva", 29, "Male",
                new Passport("P126", LocalDate.of(2018, 3, 3), LocalDate.of(2028, 3, 3),
                        new Country("India", "IN", 1400000000,
                                new President("Narendra Modi", 10, 73,
                                        new Driver("Arun", "DL026", 6, new Vehicle("Sedan", "Honda City", "DL04B4455",
                                                new Company("Infosys", "IT Services", "Bangalore",
                                                        new CEO("Salil Parekh", 60, 85000000,
                                                                new House("BTM Layout", 2, true,
                                                                        new Security("SEC026", "CCTV", 3,
                                                                                new Job("Java Dev", 65000, "Bangalore",
                                                                                        new Detail("D026", "Backend", "Junior",
                                                                                                new Education("B.E", "PESIT", 2017, 8.0))))))))))))));

        customers.add(new Customer("Gayathri", 28, "Female",
                new Passport("P127", LocalDate.of(2019, 1, 1), LocalDate.of(2029, 1, 1),
                        new Country("France", "FR", 67000000,
                                new President("Emmanuel Macron", 7, 46,
                                        new Driver("Marie", "DL027", 8, new Vehicle("SUV", "Citroën C5", "FR8822",
                                                new Company("Capgemini", "Consulting", "Paris",
                                                        new CEO("Aiman Ezzat", 54, 77000000,
                                                                new House("Versailles", 3, true,
                                                                        new Security("SEC027", "Biometric", 3,
                                                                                new Job("Business Analyst", 72000, "Paris",
                                                                                        new Detail("D027", "Strategy", "Mid",
                                                                                                new Education("MBA", "INSEAD", 2014, 8.6))))))))))))));

        customers.add(new Customer("Rohini", 26, "Female",
                new Passport("P128", LocalDate.of(2021, 7, 7), LocalDate.of(2031, 7, 7),
                        new Country("Japan", "JP", 125000000,
                                new President("Shigeru Ishiba", 1, 68,
                                        new Driver("Naoko", "DL028", 7, new Vehicle("Electric", "Toyota Prius", "JP7890",
                                                new Company("Panasonic", "Electronics", "Osaka",
                                                        new CEO("Yuki Kusumi", 59, 94000000,
                                                                new House("Namba", 4, true,
                                                                        new Security("SEC028", "Smart AI", 5,
                                                                                new Job("IoT Engineer", 91000, "Osaka",
                                                                                        new Detail("D028", "Home Tech", "Senior",
                                                                                                new Education("M.Tech", "Kyoto Univ", 2013, 8.9))))))))))))));

        customers.add(new Customer("Kavya", 27, "Female",
                new Passport("P129", LocalDate.of(2020, 6, 6), LocalDate.of(2030, 6, 6),
                        new Country("UK", "GB", 67000000,
                                new President("King Charles III", 1, 76,
                                        new Driver("George", "DL029", 6, new Vehicle("Electric", "Mini Cooper EV", "GB2020",
                                                new Company("Revolut", "Fintech", "London",
                                                        new CEO("Nikolay Storonsky", 39, 72000000,
                                                                new House("Camden", 3, true,
                                                                        new Security("SEC029", "Laser Grid", 4,
                                                                                new Job("Fintech Analyst", 89000, "London",
                                                                                        new Detail("D029", "Banking Tech", "Mid",
                                                                                                new Education("B.Com", "UCL", 2015, 8.7))))))))))))));

        customers.add(new Customer("Surya", 28, "Male",
                new Passport("P130", LocalDate.of(2018, 5, 5), LocalDate.of(2028, 5, 5),
                        new Country("Australia", "AU", 26000000,
                                new President("Anthony Albanese", 1, 59,
                                        new Driver("Steve", "DL030", 9, new Vehicle("Truck", "Isuzu D-Max", "AU1122",
                                                new Company("Afterpay", "Fintech", "Melbourne",
                                                        new CEO("Anthony Eisen", 50, 67000000,
                                                                new House("Carlton", 2, true,
                                                                        new Security("SEC030", "App-Controlled", 3,
                                                                                new Job("Frontend Dev", 77000, "Melbourne",
                                                                                        new Detail("D030", "React.js", "Junior",
                                                                                                new Education("B.Sc", "Monash", 2016, 8.4))))))))))))));


        return customers;
    }
}
