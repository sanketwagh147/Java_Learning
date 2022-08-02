import com.old.AreaCalculator;

public class CalcFeetAndInchesToCentimeters {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.calcFeetAndInchesToCentimeters(10 , 12));
        System.out.println(calcFeetAndInchesToCentimeters( -10));
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
         if (!(inches >= 0) || !(inches <= 12) ){
            return -1;
        } else {
            return inches * 2.54;
            
        }

    }
    
}
