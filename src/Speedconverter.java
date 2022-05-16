public class Speedconverter {

    public static long  toMilesPerHour(double kilometersperhour){

        if (kilometersperhour <0) {
            return -1;}

       long Milesperhour= Math.round(kilometersperhour/1.609);
        return Milesperhour;
    }
    public static long printConversion(double kilometersperhour){
        if(kilometersperhour < 0){
        System.out.println("Invalid value");}
        else { long milesperhour = toMilesPerHour(kilometersperhour);
            System.out.println(kilometersperhour + "km/h = "  + milesperhour + "mi/h ");
            long Milesperhour = (toMilesPerHour(kilometersperhour));

        }
    return toMilesPerHour(17);}}
