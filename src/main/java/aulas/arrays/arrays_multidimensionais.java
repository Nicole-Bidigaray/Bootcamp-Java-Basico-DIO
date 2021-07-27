package aulas.arrays;

public class arrays_multidimensionais {
    public static void main(String[] args) {
        int[][] meuArrayMulti = { {1,2,3,4}, {53,63,73} };
        for (int[] ints : meuArrayMulti) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}

//public class arrays_multidimensionais {
//    public static void main(String[] args) {
//        int[][] meuArrayMulti = { {1,2,3,4}, {5,6,7} };
//        for (int i = 0; i<meuArrayMulti.length; i++) {
//            for (int j = 0; j<meuArrayMulti[i].length; ++j) {
//                System.out.println(meuArrayMulti[i][j]);
//            }
//        }
//    }
//}
