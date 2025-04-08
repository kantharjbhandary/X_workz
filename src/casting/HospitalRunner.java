package casting;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.departments();
        hospital.staff();
        hospital.facilities();
        hospital.emergency();
        hospital.location();
        System.out.println("----------------------");

        Hospital hospitalPoly = new HospitalDetails();
        hospitalPoly.departments();
        hospitalPoly.staff();
        hospitalPoly.facilities();
        hospitalPoly.emergency();
        hospitalPoly.location();
        System.out.println("----------------------");

        HospitalDetails hospitalDetails = new HospitalDetails();
        hospitalDetails.departments();
        hospitalDetails.staff();
        hospitalDetails.facilities();
        hospitalDetails.emergency();
        hospitalDetails.location();
        hospitalDetails.extraMethod();
        System.out.println("----------------------");

        HospitalCast hospitalCast = new HospitalCast();
        hospitalCast.cast(hospitalPoly);
    }
}
