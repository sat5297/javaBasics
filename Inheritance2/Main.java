package Inheritance2;

public class Main {
    
    public static void main(String args[]){
        animal animal = new animal();
        dog dog = new dog();
        cat cat = new cat();
        animal.speak();
        animal.drink();
        animal.eat();
        dog.speak();
        dog.drink();
        dog.eat();
        cat.drink();
        cat.eat();
        cat.speak();
    }

}
