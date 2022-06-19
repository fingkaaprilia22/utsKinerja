package com.company;

import java.util.Arrays;

public class Main {
    static Manusia manusia[];
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {

        manusia = new Manusia[3];
        System.out.println("---Class Manusia--- ");
        manusia[0] = new Manusia("Nevan Arnault", "123124124552", true, false);
        manusia[1] = new Manusia("Agatha Bellen", "31232132321", false, true);
        manusia[2] = new Manusia("Felix Chamberlain", "723712377123", true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());
        System.out.println("=".repeat(45));

        mahasiswa = new MahasiswaFilkom[3];
        System.out.println();
        System.out.println("---Class Mahasiswa---");
        mahasiswa[0] = new MahasiswaFilkom("205150507111037", 3.6, "Fingka Aprilia", "2002682923109", false, true);
        mahasiswa[1] = new MahasiswaFilkom("195150300111002", 3.2, "Choi Yeonjun", "2003829374606", true, false);
        mahasiswa[2] = new MahasiswaFilkom("215150400111002", 4.0, "Jeon Jungkook", "200325029106", true, true);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());
        System.out.println("=".repeat(45));

        pekerja = new Pekerja[3];
        System.out.println();
        System.out.println("---Class Pekerja---");
        pekerja[0] = new Pekerja(10, 29, "203127529647", "Izekiel", "2933242352524", true, true);
        pekerja[1] = new Pekerja(6, 28, "204325829957", "Asterope", "243245245224", true, true);
        pekerja[2] = new Pekerja(8, 30, "2022257291648", "Aria", "203245244642", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());
        System.out.println("=".repeat(45));

        manager = new Manager[3];
        System.out.println();
        System.out.println("---Class Manager---");
        manager[0] = new Manager(1200, 8, 20, "205225229106", "Regis Floyen", "2001647443", true, true);
        manager[1] = new Manager(1600, 6, 26, "201225729106", "Maximilian Ashied", "1987456362362", true, true);
        manager[2] = new Manager(1250, 5, 28, "203225129106", "Camellia Bale", "193475135113", false, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());
        System.out.println("=".repeat(45));

        System.out.println("---Total Keseluruhan yang Terdaftar---");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manager : " + manager.length);
    }
}
