/**
 * Created by Administrator on 2015/10/18.
 */
//��ӡ�����еġ�ˮ�ɻ���������ν��ˮ�ɻ�������ָһ����λ�������λ���������͵��ڸ����������磺153��һ����ˮ�ɻ���������Ϊ153=1�����η���5�����η���3�����η�
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
