package example.runner;


import example.dto.laptop.Brand;
import example.dto.laptop.Computer;

import java.util.HashMap;
import java.util.Map;

public class LaptopRunner {

    public static void main(String[] args) {

        Map<Brand, Computer>map = new HashMap<>();

        map.put(new Brand("Alienware M18", "alienware@support.com", "Gaming", "2 Years"), new Computer("Windows 11", "64GB", "Intel i9-13900HX", "2TB SSD"));
        map.put(new Brand("Asus ROG Strix Scar 17", "rog@asus.com", "Gaming", "2 Years"), new Computer("Windows 11", "32GB", "Ryzen 9 7945HX", "1TB SSD"));
        map.put(new Brand("Lenovo Legion 7i", "legion@lenovo.com", "Gaming", "3 Years"), new Computer("Windows 11", "32GB", "Intel i9-13900HX", "2TB SSD"));
        map.put(new Brand("MSI Raider GE78HX", "raider@msi.com", "Gaming", "2 Years"), new Computer("Windows 11", "64GB", "Intel i9-13980HX", "2TB SSD"));
        map.put(new Brand("HP Omen 17", "omen@hp.com", "Gaming", "1 Year"), new Computer("Windows 11", "32GB", "Intel i7-13700HX", "1TB SSD"));
        map.put(new Brand("Razer Blade 16", "blade@razer.com", "Creator", "2 Years"), new Computer("Windows 11", "32GB", "Intel i9-13950HX", "2TB SSD"));
        map.put(new Brand("Asus TUF Gaming A15", "tuf@asus.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Ryzen 7 7840HS", "1TB SSD"));
        map.put(new Brand("Lenovo Legion Slim 5", "slim@lenovo.com", "Gaming", "2 Years"), new Computer("Windows 11", "16GB", "Ryzen 7 7840HS", "512GB SSD"));
        map.put(new Brand("MSI Cyborg 15", "cyborg@msi.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Intel i7-12650H", "512GB SSD"));
        map.put(new Brand("HP Victus 16", "victus@hp.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Ryzen 5 7535HS", "512GB SSD"));
        map.put(new Brand("Dell G16", "gseries@dell.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Intel i7-13650HX", "1TB SSD"));
        map.put(new Brand("Acer Predator Helios 16", "predator@acer.com", "Gaming", "2 Years"), new Computer("Windows 11", "32GB", "Intel i9-13900HX", "2TB SSD"));
        map.put(new Brand("Gigabyte Aorus 15", "aorus@gigabyte.com", "Gaming", "1 Year"), new Computer("Windows 11", "32GB", "Intel i7-13700H", "1TB SSD"));
        map.put(new Brand("Xiaomi Notebook Ultra", "ultra@mi.com", "General", "1 Year"), new Computer("Windows 11", "16GB", "Intel i5-11300H", "512GB SSD"));
        map.put(new Brand("Asus ROG Flow Z13", "flow@asus.com", "Creator", "2 Years"), new Computer("Windows 11", "16GB", "Intel i9-13900H", "1TB SSD"));
        map.put(new Brand("Alienware x14 R2", "x14@alienware.com", "Gaming", "2 Years"), new Computer("Windows 11", "32GB", "Intel i7-13620H", "1TB SSD"));
        map.put(new Brand("Razer Blade 14", "blade14@razer.com", "Gaming", "2 Years"), new Computer("Windows 11", "32GB", "Ryzen 9 7940HS", "1TB SSD"));
        map.put(new Brand("HP Envy x360", "envy@hp.com", "Creator", "1 Year"), new Computer("Windows 11", "16GB", "Ryzen 7 7730U", "1TB SSD"));
        map.put(new Brand("Acer Nitro 5", "nitro@acer.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Intel i5-12450H", "512GB SSD"));
        map.put(new Brand("MSI Alpha 17", "alpha@msi.com", "Gaming", "2 Years"), new Computer("Windows 11", "32GB", "Ryzen 9 7945HX", "1TB SSD"));
        map.put(new Brand("Asus Zephyrus G14", "zephyrus@asus.com", "Gaming", "2 Years"), new Computer("Windows 11", "32GB", "Ryzen 9 7940HS", "1TB SSD"));
        map.put(new Brand("Dell XPS 15", "xps@dell.com", "Creator", "1 Year"), new Computer("Windows 11", "32GB", "Intel i9-13900H", "1TB SSD"));
        map.put(new Brand("Gigabyte G5 KF", "g5@gigabyte.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Intel i5-12500H", "512GB SSD"));
        map.put(new Brand("Acer Aspire 7", "aspire@acer.com", "General", "1 Year"), new Computer("Windows 11", "16GB", "Ryzen 5 5500U", "512GB SSD"));
        map.put(new Brand("HP Pavilion Gaming", "pavilion@hp.com", "Gaming", "1 Year"), new Computer("Windows 11", "16GB", "Ryzen 5 5600H", "512GB SSD"));

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
    }
}
