package Interface2;

public class Main {
    public static void main(String args[]){
        audi audi = new audi();
        bmw bmw = new bmw();

        audi.color();
        audi.accelerate();
        audi.brake();

        bmw.color();
        bmw.accelerate();
        bmw.brake();
    }
}
