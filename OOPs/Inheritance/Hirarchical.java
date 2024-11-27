package Inheritance;

public class Hirarchical {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();

        Bird crow = new Bird();
        crow.eat();
        crow.fly();
    }
}

class Animal {
    String color;
   
    void eat() {
        System.out.println("eats");
    }

    void breathe () {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}
