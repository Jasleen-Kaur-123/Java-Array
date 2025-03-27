import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
    System.out.println(printNthRow(3));
    }
    public static List<Integer> printNthRow(int index){
    ArrayList<Integer> list = new ArrayList<>();
    int ans = 1;
    list.add(1);
    for(int i=1;i<=index;i++){
        ans = (ans * (index-i+1) / i);
        list.add(ans);
    }
    return list;
    }
}