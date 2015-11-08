/**
 * Created by Administrator on 2015/10/24.
 */
public class Chinese extends Human {
    String skinColor;

    public Chinese(String skinColor) {
        this.skinColor = skinColor;
    }

    String StudyKongfu() {
       return "learning KongFu.......";
    }

    String sing() {
        System.out.println("hello world!");
        super.sing();
        return "ad";
    }
    public static void main(String[] args) {
        Chinese chinese = new Chinese("yellow");
        System.out.println(chinese.work(1,"abd"));
        System.out.println(chinese.skinColor);
        System.out.println(chinese.StudyKongfu());
        String z = chinese.sing();
        System.out.println(z);
        //String f = super.sing();

    }

}
