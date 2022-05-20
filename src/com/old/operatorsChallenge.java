class operatorsChallenge {
    public static void main(String[] args){
        double a = 20.0;
        double b = 80.0;

        double sum = (a + b) * 100.00;

        double rem = sum % 40.0;

        boolean isRemainder = (rem == 0) ? true: false;

        System.out.println(isRemainder);

        if (isRemainder){
            System.out.println("got a remainder");
        }
        String text = "hello";

        System.out.println(text);
        // text.replace
    }
    
}
