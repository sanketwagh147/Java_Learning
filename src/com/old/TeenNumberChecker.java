public class TeenNumberChecker {
    
    public static void main(String[] args) {
        
        
    }

    public static boolean hasTeen(int ageOne, int ageTwo , int ageThree){
        if (isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree)) return true;

        return false;
        
       
    }

    public static boolean isTeen(int age){
        // 13 - 19 range
        if (age >= 13 && age <= 19) return true;

        return false;
        
    }
    
}
