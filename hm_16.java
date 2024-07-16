public class hm_16 {
    public static void main(String[] args) {
        int[][][] array3D = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }};
        int sum = 0;
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                for (int k = 0; k < 2; k++) { 
                    sum += array3D[i][j][k];
                }
            }
        }
        System.out.println("三維陣列所有元素的總和為: " + sum);
    }
}