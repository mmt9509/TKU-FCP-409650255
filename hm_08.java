import java.util.Scanner;
public class hm_08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("請輸入使用者姓名:");
        String name=scn.next();
        System.out.print("請輸入年齡:");
        int age=scn.nextInt();
        System.out.print("請輸入城市:");
        String city=scn.next();
        System.out.print(name+", "+age+"歲, "+city);
        scn.close();

    }
}
