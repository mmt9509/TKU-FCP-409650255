import java.util.Scanner;
public class hm_09 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
      
        System.out.print("請輸入長方形的長: ");
        double length=scn.nextDouble();
        System.out.print("請輸入長方形的寬: ");
        double width=scn.nextDouble();
        double area=length*width;
        System.out.print("計算長方形面積: "+area);
        scn.close();

    }
}
