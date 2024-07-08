import java.util.Scanner;
public class hm_07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
      
        System.out.print("請輸入圓的半徑: ");
        double redius=scn.nextDouble();
        double area=Math.PI*redius*redius;
        System.out.print("計算圓的面積: "+area);
        scn.close();

    }
}
