package practice_exercise;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
    	//4-1
    	for (int i = 1; i <= 10; i++) {
    		System.out.println("SPAM");
    	}


    	//4-2
    	for (int i = 1; i <= 9; i++) {
    		System.out.println(i * 3);
    	}


    	//4-3
    	double a = 2;
    	double b = 8;
    	double result = Math.pow(a, b);
    	System.out.println((int)result);


    	//4-4 7の階乗
    	int x = 1;
    	for(int i = 2 ; i <= 7 ; i++ )
    	    x *= i;
    	    System.out.println(x);


    	//4-5 平均値
    	System.out.println("平均値を求めます。");
    	int sum = 0;
    	for (int i = 1; i <= 10; i++) {
    		Scanner sc = new Scanner(System.in);
    		int num = sc.nextInt();
    		sum += num;
    	}
    	System.out.println("平均値は" + sum / 10);


    	//4-6
    	System.out.println("勝ち負けの回数。");
    	System.out.println("1:勝ち, 0:負けで入力。");
    	int win = 0;
    	for (int i = 1; i <= 10; i++) {
    		Scanner sc = new Scanner(System.in);
    		int win_or_loss = sc.nextInt(); //0か1を入力
    		if (win_or_loss == 1) {
    			win += win_or_loss;
    		}
    	}
    	System.out.println("勝利" + win + "回" + "," + "敗北" + (10 - win) + "回");


    	//4-7 巨人 対 阪神
    	int giants_score = 0;
    	int tigers_score = 0;
    	for (int game = 1; game <= 9; game++) {
    		Scanner sc = new Scanner(System.in);

    		System.out.println(game + "回表、巨人の得点は？");
    		int kyojin = sc.nextInt();
    		giants_score += kyojin;

    		System.out.println(game + "回裏、阪神の得点は？");
    		int hanshin = sc.nextInt();
    		tigers_score += hanshin;
    	}
    	System.out.println("巨人:" +giants_score + "点" + "," + "阪神:" + tigers_score + "点");
    	if (giants_score > tigers_score) {
    		System.out.println("巨人の勝利");
    	} else if (giants_score < tigers_score) {
    		System.out.println("阪神の勝利");
    	} else {
    		System.out.println("引き分け");
    	}


    	//4-8 最大値
    	System.out.println("自然数を10回入力して最大値を求める。");
    	int max_num = 0;
    	for (int i = 1; i <= 10; i++) {
    		Scanner sc = new Scanner(System.in);
    		int num = sc.nextInt();
    		if (num > max_num) {
    			max_num = num;
    		}
    		System.out.println(max_num);
    	}


    	//4-9
    	System.out.println("個数を数値入力して、個数分だけ‘*’を出力。");
    	Scanner sc = new Scanner(System.in);
    	int count = sc.nextInt();
    	for (int i = 0; i < count; i++) {
    		System.out.println("‘*’");
    	}


    	//4-10
    	System.out.println("個数を数値入力して、個数文だけ0~9を表示。9の次は0に戻る。");
        Scanner sc2 = new Scanner(System.in);
        int count2 = sc2.nextInt();
        for (int i = 1; i < count2; i++) {
        	System.out.println( i % 10 );
        }


        //4-11
        System.out.println("数値を繰り返し入力して、100を超えたら合計を表示する。");
        int sum2 = 0;
        while (sum2 <= 100) {
        	Scanner sc3 = new Scanner(System.in);
        	sum2 += sc3.nextInt();
        }
        System.out.println("合計は" + sum2);


        //4-12
        System.out.println("ストライクカウントを数える。");
        int strike = 0;
        int ball = 0;
        while (strike < 3 && ball < 4) {
        	System.out.println("ストライク=1 or ボール=2 ？");
        	Scanner sc4 = new Scanner(System.in);
        	int judge = sc4.nextInt();
        	if (judge == 1) {
        		strike++;
        	} else if (judge == 2) {
        		ball++;
        	}
        }
        System.out.println("ストライク" + strike + "個" + "ボール" + ball + "個");


        //4-13
        System.out.println("---------------------------------------");
        System.out.println("ストライクカウントを数える 問題2。");
        System.out.println("2ストライク以降のストライクやファウルはカウントしない。");
        int strike2 = 0;
        int ball2 = 0;
        while (strike2 < 3 && ball2 < 4) {
        	System.out.println("ストライク=1 or ボール=2 or ファウル=3");
        	Scanner sc5 = new Scanner(System.in);
        	int judge2 = sc5.nextInt();
        	if (judge2 == 1) {
        		strike2++;
        	} else if (judge2 == 2) {
        		ball2++;
        	} else if (judge2 == 3 && strike2 < 2) {
        		strike2++;
        	}
        	System.out.println(strike2 + "ストライク" + "," + ball2 + "ボール");
        }


        //4-14
        System.out.println("------------");
        System.out.println("素数の判定");
        Scanner sc6 = new Scanner(System.in);
        int num = sc6.nextInt();

        if (num < 2) {
        	System.out.println("素数ではありません");
        	return;
        }

        for (int i = 2; i < num; i++) {
        	if (num % i == 0) {
        		System.out.println("素数ではありません");
        		return;
        	}
        }
        System.out.println("素数です");
    }
}
