package abstractClass1;

public class Main {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.eat();
        dog.speak();
        dog.lives();
        dog.loves();
        System.out.println();
        cat cat = new cat();
        cat.eat();
        cat.speak();
        cat.lives();
        cat.loves();
    }
}
