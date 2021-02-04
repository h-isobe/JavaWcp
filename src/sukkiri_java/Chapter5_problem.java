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


    //コード5ー4 引数の例(渡す値が1つの場合)
    public static void hello2(String name) {
    	System.out.println(name + "さん、こんにちは");
    }


    //コード5-5 引数の例(渡す値が複数の場合)
    public static void add(int x, int y) {
    	int ans = x + y;
    	System.out.println(x + "+" + y + "=" + ans );
    }



}
