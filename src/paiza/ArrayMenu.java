package paiza;

public class ArrayMenu {
    public static void main(String[] args) {

    	//STEP: 1 要素数の出力
    	System.out.println("要素数の数");
        int array[] = new int[10];
        System.out.println(array.length + "個");


    	//STEP: 2 全要素の出力
        System.out.println("全要素の出力");
        int array2[] = {5, 1, 3, 4, 5, 12, 6, 8, 1, 3};
        for (int arrays: array2) {
            System.out.println(arrays);
        }


        //STEP: 3 i 番目の出力
        System.out.println("以下の数列の 4 番目の要素を出力");
        System.out.println("5 1 3 4 5 12 6 8 1 3");
        int array3[] = {5, 1, 3, 4, 5, 12, 6, 8, 1, 3};
        System.out.println(array3[3]);


        //STEP: 4
    }
}
