package sukkiri_java;

public class Chapter2_problem {
    public static void main(String[] args) {

    	//コード2-14 ランダムな数を生成する命令
    	int r = new java.util.Random().nextInt(90);
    	System.out.println(r);


    	//コード2-15 キーボードから入力を受ける命令(標準入力)
    	System.out.println("あなたの名前を入力してください。");
    	String name = new java.util.Scanner(System.in).nextLine();
    	System.out.println("あなたの年齢を入力してください。");
    	int age = new java.util.Scanner(System.in).nextInt();
      	System.out.println("あなたの名前は" + name + "さんで、年齢は" + age + "歳です。");


      	//練習問題 2-1
      	int x = 5;
      	int y = 10;
      	String ans = "x+yは" + (x + y); //オペランド内に文字列があると他も文字列になるため()がいる。
      	System.out.println(ans);


      	//練習問題 2-3
      	System.out.println("ようこそ占いの館へ");
      	System.out.println("あなたの名前を入力してください");
      	String name1 = new java.util.Scanner(System.in).nextLine();
      	System.out.println("あなたの年齢を入力してください");
      	String ageString = new java.util.Scanner(System.in).nextLine();
      	int age1 = Integer.parseInt(ageString);
      	int fortune = new java.util.Random().nextInt(4);
      	//ランダム数値が0~3のためインクリメントで1をプラスして1~4の乱数に
      	fortune++;
      	System.out.println("占いの結果が出ました！");
      	System.out.println(age1 + "歳の" + name1 + "さん、あなたの運気番号は" + fortune + "です");
      	System.out.println("1:大吉 2:中吉 3:吉 4:凶");
    }
}
