import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] nums = {0,1,2,3,5,6};
        System.out.println("Missing number of "+Arrays.toString(nums)+" is : "+findMissing(nums));
    }
    public static int findMissing(int[] nums){
        int n = nums.length;
        int[] hash = new int[n+1];
        int missing = -1;
        for(int i=0;i<n;i++){
            hash[nums[i]]=1;
        }
        for(int i=0;i<=n;i++){
            if(hash[i]==0){
                missing= i;
            }
        }
        return missing;
    }
}