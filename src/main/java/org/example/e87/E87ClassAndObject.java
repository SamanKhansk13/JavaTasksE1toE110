package org.example.e87;


class Main{
    String carColor;
    int carYear;
    String carMake;
}
public class E87ClassAndObject {
    public static void main(String[] args) {
        Main car1=new Main();
        Main car2=new Main();

        car1.carColor="Black";
        car1.carYear=2019;
        car1.carMake="BMW";

        car2.carColor="White";
        car2.carYear=2018;
        car2.carMake="Toyota";

        System.out.println("Car color is "+car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);
        System.out.println("Car color is "+car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);





    }
}
