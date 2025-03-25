import java.util.*;
public class Main{
    public static void main(String[] args){
    ArrayList<Integer> List = new ArrayList<>(Arrays.asList(4 ,2 ,6 ,3 ,1 ,1));
    System.out.println("Repeating and Missing values is :"+repeatingMissing(List));

    }
    public static ArrayList<Integer> repeatingMissing(List<Integer> nums){
        int n = nums.size();
        int hash[] = new int[n+1]; 
        for(int i=0;i<n;i++){
            hash[nums.get(i)]++;
        }
        int repeating = -1, missing = -1;
        for(int i=0;i<=n;i++){
            if(hash[i]==2) repeating = i;
            else if(hash[i]==0) missing = i;
            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
        return new ArrayList<>(Arrays.asList(repeating,missing));
    }
}