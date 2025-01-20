public class Main {
    public static void main(String[] args) {
        // Create an instance of the Contains class
        Contains contains = new Contains();

        // Define some test arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40};
        int[] array3 = {};

        // Define target values to test
        int target1 = 3;
        int target2 = 25;
        int target3 = 10;

        // Test the arrayContains method
        System.out.println("Does array1 contain " + target1 + "? " + contains.arrayContains(array1, target1)); // true
        System.out.println("Does array2 contain " + target2 + "? " + contains.arrayContains(array2, target2)); // false
        System.out.println("Does array3 contain " + target3 + "? " + contains.arrayContains(array3, target3)); // false
    }
}