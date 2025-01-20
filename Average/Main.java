public class Main {
    public static void main(String[] args) {
        // Create an instance of Average
        Average avg = new Average();
        
        // Test case 1: Average of positive integers
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Average of nums1: " + avg.getAvg(nums1));  // Expected output: 3.0

        // Test case 2: Average of negative integers
        int[] nums2 = {-1, -2, -3, -4, -5};
        System.out.println("Average of nums2: " + avg.getAvg(nums2));  // Expected output: -3.0
        
        // Test case 3: Average of mixed integers
        int[] nums3 = {1, -2, 3, -4, 5};
        System.out.println("Average of nums3: " + avg.getAvg(nums3));  // Expected output: 0.6
        
        // Test case 4: Single number
        int[] nums4 = {7};
        System.out.println("Average of nums4: " + avg.getAvg(nums4));  // Expected output: 7.0
    }
}