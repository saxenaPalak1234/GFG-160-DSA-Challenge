public class MaxProduct{
      public int maxProduct(int[] arr) {
        int maxP = arr[0];
        int minP = arr[0];
        int result = arr[0];
        
        for(int i = 1; i< arr.length; i++){
            
             int current = arr[i];
             
             if(current < 0){
                 
                 int temp = maxP;
                   maxP = minP;
                  minP = temp;
             }
             
             maxP = Math.max(current , maxP * current);
             minP = Math.min(current , minP * current);
             
             result = Math.max(result , maxP);
        }
         return result;
        
        
    }
}
