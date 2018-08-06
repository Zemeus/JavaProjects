public class Hello {
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(calcFeetAndInchesToCentimeters(157));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet < 0 || (inches < 0 || inches > 12)){
            return -1;
        }


        return (inches + (feet * 12)) * 2.54;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        inches -= feet * 12;

        return calcFeetAndInchesToCentimeters(feet, inches);


    }

}
