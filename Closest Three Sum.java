class Solution {
    static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        int n = array.length;
        int j = n- 1;
        
        int ans=0 , sum=0 , d=Integer.MAX_VALUE;

        for(int i=0;i<=n-2;i++){
            int l= i +1;
            int h = array.length -1;
            while(l<h){
                sum =array[i]+ array[l]+ array[h];
                int dif = Math.abs(sum-target);
                if(dif <d){
                    d=dif;
                    ans= sum;
                    
                }else if(d==dif) ans= Math.max(ans, sum);
                if(sum<target)l++;
                else if(sum== target) return sum;
                else h--;
                
            }
            
        }return ans;
    }
}
