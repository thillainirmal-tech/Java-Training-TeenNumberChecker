public class TeenNumberChecker {
 
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
 
    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;  // Corrected the condition to include 13 and 19
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasTeen(9, 99, 19));     // Output: true (19 is a teen)
        System.out.println(hasTeen(23, 15, 42));    // Output: true (15 is a teen)
        System.out.println(hasTeen(22, 23, 34));    // Output: false (No teens)
        System.out.println(hasTeen(13, 20, 12));    // Output: true (13 is a teen)
        System.out.println(hasTeen(10, 11, 12));    // Output: false (No teens)
        
        // Testing isTeen separately
        System.out.println(isTeen(15));             // Output: true (15 is a teen)
        System.out.println(isTeen(20));             // Output: false (20 is not a teen)
        System.out.println(isTeen(13));             // Output: true (13 is a teen)
    }
}
