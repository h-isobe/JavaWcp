package sukkiri_java;

public class Chapter5_problem {
    public static void main(String[] args) {

    	System.out.println("メソッドを呼び出します");
    	//渡す値のことを"実引数"と言う

    	//コード5-2 メソッドの呼び出し
    	hello();

    	//コード5-3 メソッドの呼び出し
    	methodA();

    	//コード5-4 メソッドの呼び出し
    	hello2("湊");
    	hello2("朝香");
    	hello2("菅原");

        //コード5-5 メソッドの呼び出し
    	add(100, 20);
    	add(200, 50);

    	//コード5-7 メソッドの呼び出し
    	int ans = add2(100, 10);
    	System.out.println("100 + 10 = " + ans);

    	//コード5-8 メソッドの呼び出し
    	System.out.println(add3(add3(10, 20), add3(30, 40)));

    	//コード5-10 メソッドの呼び出し
    	System.out.println(add4(10, 20));
    	System.out.println(add4(3.5, 2.7));
    	System.out.println(add4("Hello", "World"));

    	//コード5-11 メソッドの呼び出し
    	System.out.println("10 + 20 = " + add5(10, 20));
    	System.out.println("10 + 20 + 30 = " + add5(10, 20, 30));

    	//コード5-12 メソッドの呼び出し
    	/*引数として配列(アドレス)を渡すことを参照渡し
    	 *この場合、呼び出し先でarray[0]を100に更新すると、
    	 *呼び出し元のint[] arrayの要素1も100に変わる。
    	 */
    	int[] array = {1, 2, 3};
    	printArray(array);

    	//コード5-13 メソッドの呼び出し
    	int[] array2 = {1, 2, 3};
    	incArray(array2);
    	for (int i : array2) {
    		//incArrayメソッドはreturnされていないが、
    		//参照渡しで呼び出し元のarray2も更新されている。
    		System.out.println(i);
    	}

    	//コード5-14 メソッドの呼び出し
    	int[] array3 = makeArray(3);
    	for (int i : array3) {
    		System.out.println(i);
    	}

    	System.out.println("メソッドの呼び出しが終わりました");
    }


    //コード5-2 helloメソッドの定義
    public static void hello() {
    	System.out.println("湊さん、こんにちは");
    }


    //コード5-3 mainメソッド以外からメソッドを呼び出す
    public static void methodA() {
    	System.out.println("methodA");
    	methodB();
    }

    public static void methodB() {
    	System.out.println("methodB");
    }


    //コード5-4 引数の例(渡す値が1つの場合)
    public static void hello2(String name) {
    	System.out.println(name + "さん、こんにちは");
    }


    //コード5-5 引数の例(渡す値が複数の場合)
    public static void add(int x, int y) {
    	int ans = x + y;
    	System.out.println(x + "+" + y + "=" + ans );
    }


    //コード5-7 戻り値の例
    public static int add2(int x, int y) {
    	int ans = x + y;
    	return ans;
    }


    //コード5-8 戻り値をそのまま使う
    public static int add3(int x, int y) {
    	int ans = x + y;
    	return ans;
    }


    //コード5-10 オーバーロード(引数の型が異なる場合)
    //1つ目のadd4メソッド
    public static int add4(int x, int y) {
        return x + y;
    }
    //2つ目のadd4メソッド
    public static double add4(double x, double y) {
    	return x + y;
    }
    //3つ目のadd4メソッド
    public static String add4(String x, String y) {
    	return x + y;
    }


    //コード5-11 オーバーロード(引数の数が異なる場合)
    //1つ目のadd5メソッド
    public static int add5(int x, int y) {
    	return x + y;
    }

    //2つ目のadd5メソッド
    public static int add5(int x, int y, int z) {
    	return x + y + z;
    }


    //コード5-12 引数に配列を受け取るメソッドの利用
    public static void printArray(int[] array) {
    	for (int element: array) {
    		System.out.println(element);
    	}
    }


    //コード5-13 同じ配列を参照していることを確認する
    //int型配列を受け取り、
    //配列内の要素全てに1を加えるメソッド
    //void型で結果をreturnしていないが呼び出し元は、、、
    public static void incArray(int[] array2) {
    	for (int i = 0; i < array2.length; i++) {
    		array2[i]++;
    	}
    }


    //5-14 戻り値が配列の場合
    public static int[] makeArray(int size) {
    	int[] newArray = new int[size];
    	for (int i = 0; i < newArray.length; i++) {
    		newArray[i] = i;
    	}
    	return newArray;
    }


}
