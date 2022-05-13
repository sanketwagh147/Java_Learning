public class TeenNumberChecker {
    
    public static void main(String[] args) {
        System.out.println(hasTeen(11, 13, 33));
        
    }

    public static boolean hasTeen(int ageOne, int ageTwo , int ageThree){
        if (hasTeen(ageOne) || hasTeen(ageTwo) || hasTeen(ageThree)) return true;

        return false;
        
       
    }

    public static boolean hasTeen(int age){
        // 13 - 19 range
        if (age >= 13 && age <= 19) return true;

        return false;
        
    }
    
}
