package practice_exercise;

public class practice3 {
    public static void main(String[] args) {
    	//3-1
    	int a = 3;
    	int b = 4;
    	if (a > b) {
    		System.out.println("aはbより大きい");
    	} else {
    		System.out.println("aはbより小さい");
    	}
    	
    	//3-2
    	int c = 3;
    	int d = 3;
    	if (c > d) {
    		System.out.println("cはdより大きい");
    	} else if (c < d) {
    		System.out.println("cはdより小さい");
    	} else {
    		System.out.println("cとdは等しい");
    	}
    	
    	//3-3
    	int e = 7;
    	if (e % 2 == 0) {
    		System.out.println("偶数です");
    	} else {
    		System.out.println("奇数です");
    	}
    	
    	//3-4 “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
    	int f = -5;
    	if (f % 2 == 0) {
    		if (f >= 0) {
    			System.out.println("正の偶数");
    		} else {
    			System.out.println("負の偶数");
    		}
    	} else {
    		if (f >= 0) {
    			System.out.println("正の奇数");
    		} else {
    			System.out.println("負の奇数");
    		}
    	}
    	
    	//3-5 テストの採点
    	//ケース1
    	int score1 = 72;
    	if (score1 >= 60) {
    		System.out.println("合格");
    	} else {
    		System.out.println("不合格");
    	}
    	
    	//ケース2
    	int score2 = 79;
    	if (score2 >= 80) {
    		System.out.println("大変よくできました");
    	} else if (score2 >= 60) {
    		System.out.println("よくできました");
    	} else {
    		System.out.println("頑張りましょう");
    	}
    	
    	//ケース3
    	int score3 = 70;
    	if (score3 >= 80) {
    		System.out.println("優");
    	} else if (score3 >= 70) {
    		System.out.println("良");
    	} else if (score3 >= 60) {
    		System.out.println("可");
    	} else {
    		System.out.println("不可");
    	}
    	
    	//3-6 2つのテストの点数
    	int test1 = 10;
    	int test2 = 90;
    	if (test1 >= 60 && test2 >= 60) {
    		System.out.println("合格");
    	} else if (test1 + test2 >= 130) {
    		System.out.println("合格");
    	} else if ((test1 + test2 >= 100) && (test1 >= 90 || test2 >= 90)) {
    		System.out.println("合格");
    	} else {
    		System.out.println("不合格");
    	}
    	
    	//3-7 病院の営業日
    	//day  = {"0=日曜", "1=月曜", "2=火曜", "3=水曜", "4=木曜", "5=金曜", "6=土曜};
    	//zone = {"0=午前", "1=午後", "2=夜間"};
    	
    	int day = 6;
    	int zone = 2;
    	boolean bool = true;
    	
    	if (day == 0) {
    		bool = false;
    	} else if (zone == 0 && (day == 2 || day == 5)) {
    		bool = false;
    	} else if (zone == 1 && (day == 6)) {
    		bool = false;
    	} else if (zone == 2 && (day == 3 || day == 6)) {
    		bool = false;
    	} 
    	if (bool) {
    		System.out.println("診療しています");
    	} else {
    		System.out.println("休診日です");
    	}
    	
    	//3-8
    	int x = 101;
    	int y = 100;
    	if ((x < y) && (x % 2 == 0 && y % 2 == 0)) {
    		System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
    	} else if ((x == y) && (x <= 0 && y <= 0)) {
    		System.out.println("xとyは等しく、かつ、負の数である。");
    	} else if ((x < y) || (x % 2 == 0)) {
    		System.out.println("xはyより小さい、または、xは偶数である。");
    	} else if ((x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
    		System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
    	} else {
    		System.out.println("xもyも負の数である、ではない。");
    	}
    }
}
