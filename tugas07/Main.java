package com.company;

public class Main {

    public static void main(String[] args) {

        PegawaiTetap pegawaitetap1 = new PegawaiTetap("Nevan Arnault","3175260003", 5_000_000);
        PegawaiTetap pegawaitetap2 = new PegawaiTetap("Agatha Balen","3175210003", 7_000_000);
        PegawaiTetap pegawaitetap3 = new PegawaiTetap("Regis Floyen","3175021985", 9_000_000);


        PegawaiHarian pegawaiharian1 = new PegawaiHarian("Gallahan Lombardy","3175091992", 50000, 15);
        PegawaiHarian pegawaiharian2 = new PegawaiHarian("Manggala Lakshana","3175140002", 30000, 10);
        PegawaiHarian pegawaiharian3 = new PegawaiHarian("Mabuchi Kou","3175230001", 10000, 8);

        Sales sales1 = new Sales("Uzui Tengen", "3175021989", 45, 50_000);
        Sales sales2 = new Sales("Hyakuya Mikaela", "3175170004", 30, 35_000);
        Sales sales3 = new Sales("Noelle biche", "3175270007", 12, 20_000);

        System.out.println(pegawaitetap1);
        System.out.println(pegawaitetap2);
        System.out.println(pegawaitetap3);

        System.out.println(pegawaiharian1);
        System.out.println(pegawaiharian2);
        System.out.println(pegawaiharian3);

        System.out.println(sales1);
        System.out.println(sales2);
        System.out.println(sales3);
    }
}
