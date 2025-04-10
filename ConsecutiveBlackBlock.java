public class Main{
    public static void main(String[] args){
        String word = "WBBWWBBWBW";
        int k = 7;
        System.out.println(ConsecutiveBlocks(word,k));
    }
    public static int ConsecutiveBlocks(String word,int k){
        int len = word.length(); 
        int count = 0;
        int value = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){ 
            if(word.charAt(i) == 'W'){
                count++; 
            }
        }
        value=count; 
        //sliding window Algorithm
        for(int i=k;i<len;i++){ 
            if(word.charAt(i-k) == 'W'){ 
                count--; 
            }
            if(word.charAt(i) == 'W'){ 
                count++;
            }
            value = Math.min(value,count);
        } 
        return value;
    }
}