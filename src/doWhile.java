public class doWhile {

    public static void main(String[] args) {
        testDoWhile(1);
        
    }

    public static void testDoWhile(int number){

        while (number < 5){
            number++;
            if (number == 3) {
                continue;
            }else{
                System.out.println(number);
               
            }
        }




    }
    
}
