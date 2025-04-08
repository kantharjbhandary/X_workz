package casting;

public class BarberCast {
    public void cast(Barber barber) {
        System.out.println("Casting Barber");
        barber.haircut();
        barber.shaving();
        barber.styling();
        barber.products();
        barber.tools();
        if(barber instanceof BarberDetails) {
            BarberDetails ref = (BarberDetails)barber;
            ref.extraMethod();
        }
    }
}
