public class DivisibleByThreeAndFive {

    public static void main(String[] args) {
        
        int counter = 0;
        int sum = 0;

        for (int i= 1; i < 100; i++){
            if ((i % 3 ==0) && (i % 5 == 0)){
                System.out.println(i + "is divisible by 3 and 5");
                counter += 1;
                sum += i;
                if (counter ==5){

                break;
                }
            }
        }
        System.out.println(sum);
    }
    
}
