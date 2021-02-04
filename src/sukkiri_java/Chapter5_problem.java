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

}
