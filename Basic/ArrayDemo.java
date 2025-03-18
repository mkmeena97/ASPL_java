package Basic;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Static Array Initialization
        int[] arr = {12, 45, 2, 89, 7};

        // 2. Traversing & Printing the Array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // 3. Finding Maximum and Minimum element
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // 4. Sorting the Array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 5. Searching for an Element (Linear Search)
        int key = 45;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found!");
        }

        // 6. Binary Search (Only works on sorted arrays)
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found using Binary Search at index: " + index);
        } else {
            System.out.println("Element " + key + " not found using Binary Search.");
        }

        // 7. Copying an Array
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // 8. Reversing an Array
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 9. Merging Two Static Arrays
        int[] arr2 = {100, 5, 30};
        int[] mergedArray = new int[arr.length + arr2.length];

        System.arraycopy(arr, 0, mergedArray, 0, arr.length);
        System.arraycopy(arr2, 0, mergedArray, arr.length, arr2.length);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}

