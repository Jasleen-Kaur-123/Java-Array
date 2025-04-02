public class Main{
    public static void main(String[] args){
        double x = 2.00000;
        int n = 10;
        System.out.println(PowerXN(x,n));
    }
    public static double PowerXN(double x,int n){
        double ans = 1.0;
        long dub = n;
        if(dub<0) dub = -1 * dub; //value of interger -1..678 to 1...679
        while(dub>0){
            if(dub%2==1){
                ans = ans * x;
                dub = dub - 1;
                
            }
            else{
                x = x * x ;
                dub = dub / 2;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;
    }
}