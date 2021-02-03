package sukkiri_java;

public class Chapter3_problem {
    public static void main(String[] args) {

    	//コード 3-9 for文のループを2重にして九九の表を出力
    	for (int i = 1; i < 10; i++) {
    		for (int j = 1; j < 10; j++) {
    			System.out.print(i * j);  //掛け算の結果を出力
    			System.out.print(" ");    //空白を出力
    		}
    		System.out.println("");       //改行を出力
    	}


    	//練習問題 3-3
    	int isHungry = 1;
    	String food = "カレーライス";
    	System.out.println("こんにちは");
    	if (isHungry == 0) {
    		System.out.println("お腹がいっぱいです");
    	} else {
    		System.out.println("はらぺこです");
    	}
    	if (isHungry == 1) {
    		System.out.println(food + "をいただきます");
    	}
    	System.out.println("ごちそうさまでした");


    	//練習問題 3-4
    	boolean tenki = false;
    	if (tenki == true) {
    		System.out.println("洗濯をします");
    		System.out.println("散歩にいきます");
    	} else {
    		System.out.println("DVDをみます");
    		System.out.println("寝ます");
    	}


    	//練習問題 3-5
    	System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    	int selected = new java.util.Scanner(System.in).nextInt();
    	switch (selected) {
    	case 1:
    		System.out.println("検索します");
    		break;
    	case 2:
    		System.out.println("登録します");
    		break;
    	case 3:
    		System.out.println("削除します");
    		break;
    	case 4:
    		System.out.println("変更します");
    		break;
    	}


    	//3-6
    	System.out.println("[数あてゲーム]");
    	int ans = new java.util.Random().nextInt(10);
    	for (int i = 0; i < 5; i++) {
    		System.out.println("0~9の数字を入力してください");
    		int num = new java.util.Scanner(System.in).nextInt();
    		if (num == ans) {
    			System.out.println("アタリ!");
    			break;
    		} else {
    			System.out.println("違います");
    		}
    	}
    	System.out.println("ゲームを終了します");
    }
}
