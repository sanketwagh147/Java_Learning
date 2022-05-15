public class NumberToWords {


    public static void main(String[] args) {
        numberToWords(4);
        // System.out.println(reverse(100));
        // System.out.println(getDigitCount(5200));
    }
    

    public static void numberToWords(int number){
        if (number < 0 ) {
            System.out.println("Invalid Value");
        }else if(number ==0){
            System.out.println("Zero");
        }else{

            number = reverse(number);


            String ret = "";
            while (number < 0){
                int lasNumber = number % 10;
                number /= 10;

                switch(lasNumber){
                    case 0: 
                    ret +=  " Zero";
                    break;
                    case 1: 
                    ret +=  " One";
                    break;
                    case 2: 
                    ret +=  " Two";
                    break;
                    case 3: 
                    ret +=  " Three";
                    break;
                    case 4: 
                    ret +=  " Four";
                    break;
                    case 5: 
                    ret +=  " Five";
                    break;
                    case 6: 
                    ret +=  " Six";
                    break;
                    case 7: 
                    ret +=  " Seven";
                    break;
                    case 8: 
                    ret +=  " Eight";
                    break;
                    case 9: 
                    ret +=  " Nine";
                    break;
                }
            }
            System.out.println(ret);
            
        }

    }

    public static int reverse(int number){
        // int temp = number;
        int reversedNum = 0;
        while (number != 0){
            
            int lastNumber  = number % 10;
            number /=10;
            reversedNum = lastNumber + (reversedNum * 10);
            // System.out.println("lastNumber: " + lastNumber);
            // System.out.println("number " + number);
            // System.out.println("reversedNumber " + reversedNum);
            // return 0;

        }
        return reversedNum;

    }

    public static int getDigitCount(int number){
        if (number < 0) {
            return -1;
        }else{
            int countDigits = 0;
            while (number > 0){
                number /= 10;
                countDigits++;

            }
            // System.out.println(countDigits);
            return countDigits;
        }
    }
}
