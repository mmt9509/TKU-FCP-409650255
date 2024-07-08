import java.util.Scanner;
public class hm_11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
      
        System.out.print("請輸入第一件商品的價格: ");
        double num1=scn.nextDouble();
        System.out.print("請輸入第二件商品的價格: ");
        double num2=scn.nextDouble();
        System.out.print("請輸入第三件商品的價格: ");
        double num3=scn.nextDouble();
        double total=num1+num2+num3;
        System.out.print("三件商品的總價: "+total);
        scn.close();

    }
}
