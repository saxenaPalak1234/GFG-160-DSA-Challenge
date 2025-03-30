public class RotateArrayByDSteps{

    static void  reverseArray(int start , int end , int arr[]){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        
       reverseArray( 0 ,  d-1 , arr);
       reverseArray( d , n-1 , arr);
       reverseArray( 0 , n-1 , arr);
        
    }
    
}
