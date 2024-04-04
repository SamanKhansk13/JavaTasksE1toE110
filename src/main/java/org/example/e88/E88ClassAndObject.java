package org.example.e88;

class Main{
    String breed;
    String name;
    String color;


    void bark(String name){
        System.out.println(name+" can bark");
    }
    void run(String name){
        System.out.println(name+" can run");
    }
    void play(String name){
        System.out.println(name+" can play");
    }

}


public class E88ClassAndObject {

    public static void main(String[] args) {
            Main husky=new Main();
            Main bullDog=new Main();
            Main labrador=new Main();

            husky.name="Husky";
            bullDog.name="Bulldog";
            labrador.name="Labrador";

            husky.bark(husky.name);
            husky.run(husky.name);
            husky.play(husky.name);

            bullDog.bark(bullDog.name);
            bullDog.run(bullDog.name);
            bullDog.play(bullDog.name);

            labrador.bark(labrador.name);
            labrador.run(labrador.name);
            labrador.play(labrador.name);







    }
}
