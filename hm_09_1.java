public class hm_09_1 {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=9;
        a[1]=6;
        a[2]=5;
        a[3]=7;
        a[4]=9;
        

        for(int i=0;i<a.length;i++)
           System.out.printf("a[%d]=%d, ", i,a[i]);
        System.out.printf("length=%d ", a.length);   
    }
}