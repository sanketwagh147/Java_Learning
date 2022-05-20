public class IsOdd {

    public static void main(String[] args) {
        // System.out.println(sumOdd(1,5));
        // System.out.println(sumEven(1,5));
        doWhile(6);
    }

    public static boolean isOdd(int number) {
        if (!(number > 0)){
            return false;
        } else {
            if (number % 2 == 1){
                return true;
            }else{
                return false;
            }
        }
    }

    public static int sumOdd(int start, int end){

        if ((start > end) || (start < 0) || (end < 0)){
            return -1;
        }else{
            int sum = 0;
            for (int i=start ; i <= end ; i++) {
                if (isOdd(i)){
                    sum += i;
                }

            }
            return sum;
        }
    }
    
    public static boolean isEven(int number) {
        if (!(number > 0)){
            return false;
        } else {
            if (number % 2 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
    public static int sumEven(int start, int end){

        if ((start > end) || (start < 0) || (end < 0)){
            return -1;
        }else{
            int sum = 0;
            while (start <= end){
                if (isEven(start)){
                    sum += start;
                }
                start++;
            }
            return sum;
        }
    }

    public static void doWhile(int number){
        do{
            System.out.println(number);
            number++;
        }while(number <= 5);
    }
}

