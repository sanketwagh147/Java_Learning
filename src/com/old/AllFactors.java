public class AllFactors {

    public static void main(String[] args) {
        printFactors(32);


    }
    
    public static void printFactors(int number){
        if (number < 1) System.out.println("Invalid Value");
        else{
        String factors = "";
        for (int i=1 ; i<= (number / 2) ; i++){
            if (number % i == 0){
                // System.out.println(i + "is a factor of " + number);
                factors += " " + i;

            }
        }
        System.out.println(factors + " " + number);
        }

    }
}
