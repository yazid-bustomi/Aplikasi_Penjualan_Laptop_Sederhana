package com.example.juallaptop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataLaptop {
    private static String[] namaLaptop = {
            "ASUS VivoBook 14 A412FA",
            "ACER Aspire 3 A314-32",
            "ASUS TUF Gaming FX505DY",
            "MacBook Pro 13inc 2020",
            "HP Pavilion x360",
            "ACER Nitro 5",
            "Hp Envy x350",
            "ASUS ROG Zephyrus G14 GA401"
    };

    private static String [] detailLaptop = {
            "Windows 10, Ram 4Gb, SSD 512GB, Processor Intel Core i5, Layar 14inc ",
            "Windows 10, Ram 4Gb, SSD 256GB, Processor Intel Core 2 Duo, Layar 14inc ",
            "Windows 10, Ram 8Gb, HDD 1TB, Processor AMD Ryzen 5, Layar 15,6inc ",
            "macOS , Ram 8Gb, SSD 256GB, Processor Intel Core i5 3.8GHz, Layar 13.3inc ",
            "Windows 10 , Ram 4Gb, SSD 512GB, Processor Intel Pentium , Layar 11inc ",
            "Windows 10 , Ram 8Gb, SSD 512GB, Processor Intel Core i5 , Layar 15.6inc ",
            "Windows 11 , Ram 8Gb, SSD 512GB, Processor AMD Ryzen 5 , Layar 15.6inc ",
            "Windows 10 , Ram 8Gb, SSD 512GB, Processor Intel Core i5 , Layar 14inc ",
            "Windows 10 , Ram 8Gb, SSD 512GB, Processor Intel Core i7 , Layar 15.6inc ",

    };
    private static int[] fotoLaptop = {
            R.drawable.asus_vivo_book,
            R.drawable.acer_aspire,
            R.drawable.asus_tuff_gaming,
            R.drawable.macbook_pro13,
            R.drawable.hp_pavilion,
            R.drawable.acer_nitro,
            R.drawable.hp_envy,
            R.drawable.asus_rog_zephyrus,
            R.drawable.samsung_galaxy_book,
    };

    static ArrayList<laptop> getListData(){
        ArrayList<laptop> list = new ArrayList<>();
        for (int position = 0; position < namaLaptop.length; position++){
            laptop laptop = new laptop();
            laptop.setNamaLaptop(namaLaptop[position]);
            laptop.setDetailLaptop(detailLaptop[position]);
            laptop.setFotoLaptop(fotoLaptop[position]);
            list.add(laptop);
        }
        return list;
    }
}
