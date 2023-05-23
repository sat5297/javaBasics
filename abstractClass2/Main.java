package abstractClass2;

public class Main {
    public static void main(String[] args) {
        audi audi = new audi();
        audi.accelerate();
        audi.brake();
        System.out.println();
        bmw bmw = new bmw();
        bmw.accelerate();
        bmw.brake();
    }
}
