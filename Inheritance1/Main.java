public class Main {
    public static void main(String args[]){
        parent p = new parent();
        p.talk();
        p.eat();
        System.out.println("");
        child c = new child();
        c.talk();
        c.run();
        c.eat();
    }
}
