import java.util.Scanner;

public class oj_4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);    
       
        int celsius=scn.nextInt();
        int fahrenheit=(celsius*9/5)+32;
        System.out.print(fahrenheit);
        scn.close();


    }
}
