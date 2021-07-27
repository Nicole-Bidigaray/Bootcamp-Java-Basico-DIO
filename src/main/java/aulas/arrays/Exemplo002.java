package aulas.arrays;

import java.util.Arrays;

public class Exemplo002 {
    public static void main(String[] args) {
        int[] meuArray = new int[7];

        int[] meuArray2 = {12,32,54,6,8,89,64};

        System.out.println(Arrays.toString(meuArray));
        System.out.println(Arrays.toString(meuArray2));

//        alterando o valor de um elemento
        meuArray2[2] = 10;

        System.out.println(meuArray2[2]);

//        comprimento do array
        System.out.println(meuArray.length);
    }
}
