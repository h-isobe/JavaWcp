package sukkiri_java;

public class Chapter4_problem {
	public static void main(String[] args) {

		//コード 4-9 for文を使って配列を扱う
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}


		//コード 4-10 点数管理プログラム (for文の利用)
		int[] scores2 = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int i = 0; i < scores2.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);


		//コード 4-11 50点以上の科目の数を調べる
		int[] scores3 = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores3.length; i++) {
			if (scores3[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は" + count);


		//コード 4-12 DNAの記号をランダムに表示する
		int[] seq = new int[10];  //10個の要素を持つ配列を用意
		for (int i = 0; i < seq.length; i++) {
			//ランダムに生成した0~4の数値を10回分配列に格納
			seq[i] = new java.util.Random().nextInt(4);

		    //塩基記号を配列baseに用意
		    char[] base = {'A', 'T', 'G', 'C'};

		    //ランダム生成された0~3のseq[i]を配列baseの添字にして表示
		    System.out.print(base[seq[i]] + " ");
		}


		//コード 4-14 拡張for文
		System.out.println(" ");  //コード 4-12 のprint出力の続きとなるため改行
		int[] scores4 = {20, 30, 40, 50, 80};
		for (int value: scores4) {
			System.out.println(value);
		}


		//コード 4-15 実行結果は？ (参照型)
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);


		//コード 4-17  nullの利用 (エラー)
		//int[] array1 = {1, 2, 3};
		//array1 = null;
		//array1[0] = 10;
		//System.out.println(array1[0]);


        //コード 4-18 2次元配列の利用
		int[][] scores5 = new int[2][3];  //2行3列の配列(あくまでイメージ)
		scores5[0][0] = 40;
		scores5[0][1] = 50;
		scores5[0][2] = 60;
		scores5[1][0] = 80;
		scores5[1][1] = 60;
		scores5[1][2] = 70;
		System.out.println(scores5[1][1]);


		//コード 4-19 親配列と子配列の要素数を表示
		int[][] scores6 = {{40, 50, 60}, {80, 60, 70}};
		System.out.println(scores6.length);     //2が出力
		System.out.println(scores6[0].length);  //3が出力


	}

}
