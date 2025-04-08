package casting;

public class IndiaRunner {
    public static void main(String[] args) {

        India india = new India();
        india.states();
        india.diversity();
        india.economy();
        india.history();
        india.festivals();
        System.out.println("----------------------");

        India indiaPoly = new IndiaDetails();
        indiaPoly.states();
        indiaPoly.diversity();
        indiaPoly.economy();
        indiaPoly.history();
        indiaPoly.festivals();
        System.out.println("----------------------");

        IndiaDetails indiaDetails = new IndiaDetails();
        indiaDetails.states();
        indiaDetails.diversity();
        indiaDetails.economy();
        indiaDetails.history();
        indiaDetails.festivals();
        indiaDetails.extraMethod();
        System.out.println("----------------------");

        IndiaCast indiaCast = new IndiaCast();
        indiaCast.cast(indiaPoly);
    }
}
