public class ArraUtilities {
    public static int[] delArray(int[] arr, int pos) {
//        Validation: If the array is null
        if (arr == null) {
            throw new IllegalArgumentException("The given array is null");
        }
//        Validation: If the position is longer than the array
        if (pos < 0 || pos >= arr.length) {
            throw new IndexOutOfBoundsException("The given array is out of bounds");
        }
//        Create a new Array with the length of the original array
        int[] newArr = new int[arr.length - 1];
//        Create a tracker to insert the new array
        int tracker = 0;
//        for each element in your original array up to pos
        for (int i = 0; i < pos; i++) {
            newArr[tracker] = arr[i];
            tracker++;
        }
        for (int i = pos +1 ; i < arr.length; i++) {
            newArr[tracker] = arr[i];
            tracker++;
        }
    return newArr;
    }
}

