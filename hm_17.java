public class hm_17 {
    public static void main(String[] args) {
        int[][][] array3D = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
        };
        System.out.println("修改前的三維陣列：");
        print3DArray(array3D);
        int newValue = 10;
        int x = 1; 
        int y = 0; 
        int z = 1;
        array3D[x][y][z] = newValue;
        System.out.println("\n修改後的三維陣列:");
        print3DArray(array3D);
    }
    public static void print3DArray(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}