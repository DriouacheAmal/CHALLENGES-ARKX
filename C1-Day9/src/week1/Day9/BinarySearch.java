package week1.Day9;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
// it has to take in 2 parameters; 1/ the actual array of "int"
//  2/value thats searching for
// Then we have to use 2 pointers/ 1/ is the 1st element in our array
//  and one at the very last element in our array
        int low = 0;
        int high = array.length - 1;
// we re going to find the middle value between those 2 pointers

// While loop will keep looping until our two pointers will keep
// cutting off half of the array until they cross each others
//
        while (low <= high) {
// we divide in half by moving our pointers until we zero in
// then we can return the index
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int target = 13 ;

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

}
