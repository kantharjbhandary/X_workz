package casting;

public class BarberRunner {
    public static void main(String[] args) {

        Barber barber = new Barber();
        barber.haircut();
        barber.shaving();
        barber.styling();
        barber.products();
        barber.tools();
        System.out.println("----------------------");

        Barber barberPoly = new BarberDetails();
        barberPoly.haircut();
        barberPoly.shaving();
        barberPoly.styling();
        barberPoly.products();
        barberPoly.tools();
        System.out.println("----------------------");

        BarberDetails barberDetails = new BarberDetails();
        barberDetails.haircut();
        barberDetails.shaving();
        barberDetails.styling();
        barberDetails.products();
        barberDetails.tools();
        barberDetails.extraMethod();
        System.out.println("----------------------");

        BarberCast barberCast = new BarberCast();
        barberCast.cast(barberPoly);
    }
}
