package day01;

public class SecondLargest {

    public int getSecondLargest(int[] arr) {
        // Code Here
        int firstMax = arr[0];
        int SecondMax = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                SecondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] < firstMax && arr[i] > SecondMax) {
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }
}
