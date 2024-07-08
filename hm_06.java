import java.util.Scanner;
public class hm_06 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
      
        System.out.print("請輸入第一個整數: ");
        int num1=scn.nextInt();
        System.out.print("請輸入第二個整數: ");
        int num2=scn.nextInt();
        int sum=num1+num2;
        System.out.print("計算兩數之和: "+sum);
        scn.close();

    }
}
