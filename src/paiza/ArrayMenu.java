package paiza;

import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {

    	//STEP: 1 要素数の出力
    	System.out.println("要素数の数");
        int array1[] = new int[10];
        System.out.println(array1.length + "個");


    	//STEP: 2 全要素の出力
        System.out.println("全要素の出力");
        int array2[] = {5, 1, 3, 4, 5, 12, 6, 8, 1, 3};
        for (int arrays2: array2) {
            System.out.println(arrays2);
        }


        //STEP: 3 i 番目の出力
        System.out.println("以下の数列の 4 番目の要素を出力");
        System.out.println("5 1 3 4 5 12 6 8 1 3");
        int array3[] = {5, 1, 3, 4, 5, 12, 6, 8, 1, 3};
        System.out.println(array3[3]);


        //STEP: 4 配列の入力
        System.out.println("以下の数列の全要素を改行区切りで出力");
        System.out.println("8 1 3 3 8 1 1 3 8 8");
        int array4[] = {8, 1, 3, 3, 8, 1, 1, 3, 8, 8};
        for (int arrays4: array4) {
        	System.out.println(arrays4);
        }


        //STEP: 5 配列の入力 2
        Scanner sc5 = new Scanner(System.in);
        String line5 = sc5.nextLine();
        String arrays5[] = line5.split(" ");
        for (String array5: arrays5) {
        	System.out.println(array5);
        }
//        sc5.close();


        //STEP: 6 配列の入力 3
        Scanner sc6 = new Scanner(System.in);
        int num6 = sc6.nextInt();
        for (int i = 0; i < num6; i++) {
        	int answer6 = sc6.nextInt();
        	System.out.println(answer6);
        }
    }
}
