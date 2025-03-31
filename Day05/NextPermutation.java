public class Solution {

        void swap(int[] arr , int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        
        void reverseArray(int[] arr , int start , int end){
            while(start < end){
                swap(arr , start , end);
                start++;
                end--;
            }
        }
        
        void nextPermutation(int[] arr){
            int pivot = -1;
            int len = arr.length;
            
            for(int i= len - 2; i >= 0; i--){
                if(arr[i] < arr[i+1]){
                    pivot = i;
                    
                    break;
                }
            }
            
            if(pivot == -1){
                reverseArray(arr , 0 , len - 1);
                return;
            }

            for(int i = len - 1; i > pivot; i--){
                if(arr[i] > arr[pivot]){
                    swap(arr , i , pivot);
                    break;
                }
            }
            reverseArray(arr , pivot  + 1 , len - 1);
        }
    
}
