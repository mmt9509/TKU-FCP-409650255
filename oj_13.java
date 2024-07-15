import java.util.Scanner;
public class oj_13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float PI=3.14159f;
        float r=scn.nextFloat();
        float circumference=2*PI*r;
        System.out.printf("%.2f\n", circumference);
        scn.close();
    }
}
