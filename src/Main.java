public class Main {


    public static void main(String[] args) {

        long  mile =  Speedconverter.toMilesPerHour(10.5);
        System.out.println("Print" + mile );

        Speedconverter.printConversion(0.0);

       long totalmiles =    Speedconverter.printConversion(15.0);
        System.out.println("printing the value of " +  totalmiles );
    }
}
