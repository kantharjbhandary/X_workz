package Statics;

public class BarberRunner {
    public static void main(String[] args) {
        Barbershop barbershop = new Barbershop();
        System.out.println(barbershop.name);
        Barbershop b=new Barbershop();
        b.name="Kantharaj";
        Barbershop b1=new Barbershop();
        b1.name="Varun";
        System.out.println(b.name);
        System.out.println(b1.name);
    }
}
