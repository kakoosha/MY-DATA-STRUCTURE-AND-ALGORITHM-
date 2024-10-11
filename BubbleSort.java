public class BubbleSort {

    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Loop through each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if the element found is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Sample array
        bubbleSort(array); // Sort the array

        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
 class BubbleSort {

    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Loop  each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                     // enter change the element found is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Sample array
        bubbleSort(array); // Sort the array

        // output the  sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
