package pratice6_Linear_Serch;

public class maxwelthleetcode2Darray {
    public static void main(String[] args) {


}
public int maximum(int[][] accounts){
    int ans = Integer.MIN_VALUE;
    for (int person = 0; person < accounts.length; person++) {
        int sum = 0;
        for (int account = 0; account < accounts[person].length; account++) {
            sum += accounts[person][account];
        }
        if(sum > ans){
            ans = sum;
        }
    }
     return ans;

}

}