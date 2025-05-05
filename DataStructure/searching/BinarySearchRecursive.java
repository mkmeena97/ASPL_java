package DataStructure.searching;

public class BinarySearchRecursive {
    public static int search(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid; // Element found

            if (arr[mid] < target)
                return search(arr, mid + 1, right, target); // Search right half
            else
                return search(arr, left, mid - 1, target); // Search left half
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = search(arr, 0, arr.length - 1, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
