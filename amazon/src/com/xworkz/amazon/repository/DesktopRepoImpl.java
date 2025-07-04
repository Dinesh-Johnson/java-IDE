package com.xworkz.amazon.repository;

import com.xworkz.amazon.things.DesktopDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DesktopRepoImpl implements DesktopRepository{
    @Override
    public Collection<DesktopDTO> findAll() {

        Collection<DesktopDTO> collection = new ArrayList<>();
        DesktopDTO product1 = new DesktopDTO(1,"GIGABYTE GeForce RTX 5090 ","Graphics Card","2025-05-18","Nvidia",360000.00,41,1,2);
        DesktopDTO product2 = new DesktopDTO(2," AMD 7000 Series Ryzen 9 7900X  ","CPU","2025-06-01","AMD",38139.00,50,1,5);
        DesktopDTO product3 = new DesktopDTO(3," MSI X670E Gaming Plus WiFi Motherboard","Mother Board","2025-05-30","Gigabyte",29429.00,0.48,1,3);
        DesktopDTO product4 = new DesktopDTO(4,"CORSAIR Vengeance 16GB RAM","RAM","2025-05-28","Corsair",4389.00,50,6,2);
        DesktopDTO product5 = new DesktopDTO(5,"Western Digital WD Black SN770 NVMe 2TB","NVMe","2025-05-30","Nvidia",360000.00,0.41,1,2);
        DesktopDTO product6 = new DesktopDTO(6,"NZXT Kraken Elite 360 RGB","CPU Cooler","2025-05-30","NZXT",31510.00,38,1,1);
        DesktopDTO product7 = new DesktopDTO(7, "Intel NUC 12 Pro", "Mini PC", "2024-05-01", "Intel", 52990.0, 10.0, 3, 3);
        DesktopDTO product8 = new DesktopDTO(8, "Zebronics ZEB-AIO", "All-in-One PC", "2023-09-10", "Zebronics", 23999.0, 15.0, 1, 1);
        DesktopDTO product9 = new DesktopDTO(10, "iBall AIO PC", "All-in-One PC", "2024-01-25", "iBall", 28990.0, 12.0, 2, 2);
        DesktopDTO product10 = new DesktopDTO(11, "Logitech MX Keys", "Keyboard", "2024-02-20", "Logitech", 10499.0, 10.0, 2, 1);
        DesktopDTO product11 = new DesktopDTO(12, "Logitech MX Master 3S", "Mouse", "2024-03-10", "Logitech", 9999.0, 10.0, 1, 1);
        DesktopDTO product12 = new DesktopDTO(13, "Dell 24 Monitor SE2422H", "Monitor", "2024-01-05", "Dell", 11999.0, 5.0, 3, 3);
        DesktopDTO product13 = new DesktopDTO(14, "BenQ GW2480", "Monitor", "2024-04-20", "BenQ", 10999.0, 6.0, 2, 6);
        DesktopDTO product14 = new DesktopDTO(15, "WD Blue 1TB HDD", "Storage", "2023-12-30", "Western Digital", 3690.0, 7.0, 1, 2);
        DesktopDTO product15 = new DesktopDTO(16, "Samsung 980 1TB NVMe SSD", "Storage", "2024-03-05", "Samsung", 6890.0, 5.0, 1, 5);
        DesktopDTO product16 = new DesktopDTO(17, "Crucial 16GB DDR4 RAM", "RAM", "2024-02-18", "Crucial", 3599.0, 5.0, 2, 5);
        DesktopDTO product17 = new DesktopDTO(18, "Corsair Vengeance 16GB", "RAM", "2023-11-28", "Corsair", 3899.0, 8.0, 2, 5);
        DesktopDTO product18 = new DesktopDTO(19, "Zebronics Power Supply 450W", "Power Supply", "2024-03-10", "Zebronics", 1599.0, 5.0, 3, 2);
        DesktopDTO product19 = new DesktopDTO(20, "Cooler Master MWE 550", "Power Supply", "2024-05-10", "Cooler Master", 3390.0, 10.0, 2, 3);
        DesktopDTO product20 = new DesktopDTO(21, "Logitech C920 Pro", "Webcam", "2023-10-15", "Logitech", 7499.0, 12.0, 1, 2);
        DesktopDTO product21 = new DesktopDTO(22, "Redragon K617 Fizz", "Keyboard", "2024-02-28", "Redragon", 3499.0, 8.0, 1, 1);
        DesktopDTO product22 = new DesktopDTO(23, "Razer DeathAdder V2", "Mouse", "2024-01-18", "Razer", 4999.0, 10.0, 2, 2);
        DesktopDTO product23 = new DesktopDTO(24, "TP-Link Archer C6", "Router", "2024-04-01", "TP-Link", 2799.0, 10.0, 1, 3);
        DesktopDTO product24 = new DesktopDTO(25, "APC 600VA UPS", "UPS", "2023-12-10", "APC", 3790.0, 10.0, 2, 2);
        DesktopDTO product25 = new DesktopDTO(26, "HP M1005 LaserJet Printer", "Printer", "2024-03-20", "HP", 20990.0, 8.0, 1, 1);
        DesktopDTO product26 = new DesktopDTO(27, "Canon PIXMA G2020", "Printer", "2023-11-01", "Canon", 12990.0, 6.0, 3, 1);
        DesktopDTO product27 = new DesktopDTO(28, "Logitech Z623 Speaker", "Speaker", "2024-02-10", "Logitech", 8990.0, 10.0, 2, 2);
        DesktopDTO product28 = new DesktopDTO(29, "Creative Pebble V3", "Speaker", "2024-05-15", "Creative", 3990.0, 12.0, 3, 1);
        DesktopDTO product29 = new DesktopDTO(30, "Ant Esports ICE-120AG", "Cabinet", "2024-04-10", "Ant Esports", 2990.0, 10.0, 1, 3);
        DesktopDTO product30 = new DesktopDTO(31, "Dell OptiPlex 7010", "Desktop", "2023-12-10", "Dell", 47999.0, 10.0, 2, 3);
        DesktopDTO product31 = new DesktopDTO(32, "Intel Core i5-12400", "Processor", "2024-02-05", "Intel", 17999.0, 5.0, 1, 3);
        DesktopDTO product32 = new DesktopDTO(33, "AMD Ryzen 5 5600", "Processor", "2023-12-18", "AMD", 15499.0, 7.0, 2, 3);
        DesktopDTO product33 = new DesktopDTO(34, "ASUS Prime A520M-K", "Motherboard", "2024-03-15", "ASUS", 5799.0, 6.0, 3, 3);
        DesktopDTO product34 = new DesktopDTO(35, "Samsung T7 1TB SSD", "External Storage", "2024-01-22", "Samsung", 10999.0, 9.0, 1, 3);
        DesktopDTO product35 = new DesktopDTO(36, "Zotac GeForce GTX 1650", "Graphics Card", "2023-11-11", "Zotac", 14990.0, 10.0, 2, 2);
        DesktopDTO product36 = new DesktopDTO(37, "Gigabyte RTX 3060 OC", "Graphics Card", "2024-02-28", "Gigabyte", 31990.0, 6.0, 1, 3);
        DesktopDTO product37 = new DesktopDTO(38, "Logitech MK270", "Wireless Combo", "2024-01-17", "Logitech", 2499.0, 5.0, 2, 1);
        DesktopDTO product38 = new DesktopDTO(39, "Lenovo FHD Webcam", "Webcam", "2023-10-30", "Lenovo", 1999.0, 8.0, 5, 2);
        DesktopDTO product39 = new DesktopDTO(40, "HP 22f Monitor", "Monitor", "2024-03-01", "HP", 9990.0, 5.0, 4, 3);
        DesktopDTO product40 = new DesktopDTO(41, "Zebronics Zeb-Transformer", "Gaming Keyboard", "2024-01-29", "Zebronics", 1799.0, 6.0, 2, 2);
        DesktopDTO product41 = new DesktopDTO(42, "Cosmic Byte GS410", "Gaming Headset", "2024-04-05", "Cosmic Byte", 2399.0, 7.0, 1, 1);
        DesktopDTO product42 = new DesktopDTO(43, "TP-Link TL-WN725N", "USB WiFi Adapter", "2023-12-22", "TP-Link", 699.0, 5.0, 3, 2);
        DesktopDTO product43 = new DesktopDTO(44, "Thermaltake Versa H18", "Cabinet", "2024-02-12", "Thermaltake", 2990.0, 10.0, 2, 3);
        DesktopDTO product44 = new DesktopDTO(45, "Artis VIP 500R UPS", "UPS", "2023-11-08", "Artis", 2690.0, 5.0, 1, 4);

        collection.add(product1);
        collection.add(product2);
        collection.add(product3);
        collection.add(product4);
        collection.add(product5);
        collection.add(product6);
        collection.add(product7);
        collection.add(product8);
        collection.add(product9);
        collection.add(product10);
        collection.add(product11);
        collection.add(product12);
        collection.add(product13);
        collection.add(product14);
        collection.add(product15);
        collection.add(product16);
        collection.add(product17);
        collection.add(product18);
        collection.add(product19);
        collection.add(product20);
        collection.add(product21);
        collection.add(product22);
        collection.add(product23);
        collection.add(product24);
        collection.add(product25);
        collection.add(product26);
        collection.add(product27);
        collection.add(product28);
        collection.add(product29);
        collection.add(product30);
        collection.add(product31);
        collection.add(product32);
        collection.add(product33);
        collection.add(product34);
        collection.add(product35);
        collection.add(product36);
        collection.add(product37);
        collection.add(product38);
        collection.add(product39);
        collection.add(product40);
        collection.add(product41);
        collection.add(product42);
        collection.add(product43);
        collection.add(product44);

        return collection;
    }
}
