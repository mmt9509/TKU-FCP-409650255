public class hm_18 {
    public static void main(String[] args) {
        int[][][] array3D = {
            { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
            { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
            { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
        };

        System.out.println("每一層(z軸)的平均值：");
        for (int z = 0; z < 3; z++) {
            double sum = 0;
            for (int i = 0; i < 3; i++) { 
                for (int j = 0; j < 3; j++) { 
                    sum += array3D[z][i][j];
                }
            }
            double average = sum / (3 * 3); 
            System.out.println("第 " + (z + 1) + " 層的平均值為: " + average);
        }
    }
}