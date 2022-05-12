import java.math.BigDecimal;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }
    

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {

    // DecimalFormat df = new DecimalFormat("#.000");
// 
    // String numOneStr =df.format(numOne);
    BigDecimal aa = new BigDecimal(numOne);
    BigDecimal bb = new BigDecimal(numTwo);
    aa = aa.setScale(3, BigDecimal.ROUND_DOWN);
    // String numTwoStr =df.format(numTwo);
    if () {
        return true;
    }
    return false;

    }

}
