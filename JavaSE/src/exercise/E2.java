package exercise;

/**
 * Created by Administrator on 2015/10/18.
 */

//�ж�101-200֮���ж��ٸ����������������������������ֻ�ܱ�1����������������������1����������

public class E2 {
    public static void main(String[] args) {
        for (int i = 101; i <200 ; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.print(i+"\t");
            }
        }
    }
}
