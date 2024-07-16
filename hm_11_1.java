import java.util.Random;

public class hm_11_1  {
    public static void main(String[] args) {
            
            int[] array = new int[10];
            Random random = new Random();
    
            System.out.print("陣列內容： ");
            
            for (int i = 0; i < 10; i++) {
                array[i] = random.nextInt(100); 
                System.out.print(array[i] + " ");
            }
            System.out.println(); 

            int max = array[0]; 
            for (int i = 1; i < 10; i++) {
                if (array[i] > max) {
                    max = array[i]; 
                }
            }

            System.out.println("陣列中的最大值為: " + max);
        }
    }
    