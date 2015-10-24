/**
 * Created by Administrator on 2015/10/18.
 */
//打印出所有的’水仙花数’，所谓’水仙花数’是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个’水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方
public class E3 {
    public static void main(String[] args) {
        int i,j,k;
        for (int n= 100; n <1000 ; n++) {
            i=n/100;
            j=(n-i*100)/10;
            k=n%10;
            if (i*i*i+j*j*j+k*k*k==n) {
                System.out.println(n);
            }
        }
    }
}
