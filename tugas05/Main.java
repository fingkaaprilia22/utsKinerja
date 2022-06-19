package com.company;

//Nama Praktikan : Fingka Aprilia Efendy
//Kelas Praktikan : Teknologi Informasi - E

public class Main {

    public static void main(String[] args) {

        CarRider nevan = new CarRider("Nevan Arnault",18, "08782216");
        CarRider athan = new CarRider("Athan Ballen", 16, "08138082");
        CarRider agatha = new CarRider("Agatha Ballen", 18, "0813636");
        CarRider aegypt = new CarRider("Aegypt Ballen", 24, "08789456");

        CarData data = new CarData();
        data.addCar("SPORT", "C 7693", "Porsche 718 Boxster");
        data.addCar("SUV", "C 2031", "Hyundai Kona Electric");
        data.addCar("WAGON", "C 4729", "Mercedes-Benz E-Class");
        data.addCar("SPORT", "C 9627", "Ford Mustang Shelby GT500");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(nevan, data.carList.get(0), 12);
        arsip.Rent(athan,data.carList.get(2),8);
        arsip.Rent(agatha, data.carList.get(2), 10);
        arsip.Rent(aegypt, data.carList.get(3), 9);

        System.out.println();
        arsip.info();

    }

}

