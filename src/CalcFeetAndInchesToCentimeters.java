public class CalcFeetAndInchesToCentimeters {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(10 , 12));
        System.out.println(calcFeetAndInchesToCentimeters( -10));
    }

    public static double calcFeetAndInchesToCentimeters(double feet , double inches) {
         if (!(feet >= 0) || !(inches >= 0) || !(inches <= 12)){
            return -1;
        } else {
            return (feet * 12 * 2.54) + (inches * 2.54);
            
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
         if (!(inches >= 0) || !(inches <= 12) ){
            return -1;
        } else {
            return inches * 2.54;
            
        }

    }
    
}
