package exercise;

import java.util.Random;

/**
 * Created by Administrator on 2015/10/25.
 */
public class E34 {

    public static void main(String[] args) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            int r = random.nextInt(21);
           // System.out.println(r);
        }
        System.out.println("time: " + (System.currentTimeMillis() - start));
    }






    }
