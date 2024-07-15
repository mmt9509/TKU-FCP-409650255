public class oj_14 {
    public static void main(String[] args) {
        int num1=5,num2=2;
        char oper='+';

        switch (oper) {
            case '+':
                System.out.println(num1+num2);               
                break;
            case '-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            default:
                System.out.println("Error");
        }
    }
}
