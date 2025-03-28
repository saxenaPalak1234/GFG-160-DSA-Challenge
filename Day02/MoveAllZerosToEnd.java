public class MoveAllZerosToEnd {

    public int pushZerosToEnd(int[] arr) {
        // Code Here
       int nonZeroIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
               int temp = arr[i];
               arr[i] = arr[nonZeroIndex];
               arr[nonZeroIndex] = temp;
               nonZeroIndex++;
            }
        }
}
}
