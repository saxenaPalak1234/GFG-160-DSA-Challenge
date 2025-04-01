public class FindMajority {
    public List<Integer> findMajority(int[] nums){
        int num1 = Integer.MIN_VALUE , num2 = Integer.MIN_VALUE, c1 = 0, c2 = 0;
        int n = nums.length;
        
        for (int x : nums){
            if (x == num1){
                c1++;
            } else if(x == num2){
                c2++;
                
            } else if(c1 == 0){
                num1 = x;
                c1 = 1;
                
            } else if(c2 == 0){
                num2 = x;
                c2 = 1;
                
            } else{
                c1--;
                c2--;
            }
        }
        
        c1 = 0;
        c2 = 0;
        
        for(int x : nums){
            if(x == num1){
            c1++;
        }else if(x == num2){
            c2++;
        }
        }
        List<Integer> res = new ArrayList<>();
        if(c1 > n / 3) res.add(num1);
          if(c2 > n / 3) res.add(num2);
          
          Collections.sort(res);
          return res;
    }
}
