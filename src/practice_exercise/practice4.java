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


//    	//4-5 平均値
//    	int sum = 0;
//    	for (int i = 1; i <= 10; i++) {
//    		Scanner sc = new Scanner(System.in);
//    		int num = sc.nextInt();
//    		sum += num;
//    	}
//    	System.out.println("平均値は" + sum / 10);
//
//
//    	//4-6
//    	int win = 0;
//    	for (int i = 1; i <= 10; i++) {
//    		Scanner sc = new Scanner(System.in);
//    		int win_or_loss = sc.nextInt(); //0か1を入力
//    		if (win_or_loss == 1) {
//    			win += win_or_loss;
//    		}
//    	}
//    	System.out.println("勝利" + win + "回" + "," + "敗北" + (10 - win) + "回");
//
//
//    	//4-7 巨人 対 阪神
//    	int giants_score = 0;
//    	int tigers_score = 0;
//    	for (int game = 1; game <= 9; game++) {
//    		Scanner sc = new Scanner(System.in);
//
//    		System.out.println(game + "回表、巨人の得点は？");
//    		int kyojin = sc.nextInt();
//    		giants_score += kyojin;
//
//    		System.out.println(game + "回裏、阪神の得点は？");
//    		int hanshin = sc.nextInt();
//    		tigers_score += hanshin;
//    	}
//    	System.out.println("巨人:" +giants_score + "点" + "," + "阪神:" + tigers_score + "点");
//    	if (giants_score > tigers_score) {
//    		System.out.println("巨人の勝利");
//    	} else if (giants_score < tigers_score) {
//    		System.out.println("阪神の勝利");
//    	} else {
//    		System.out.println("引き分け");
//    	}
    	
    	
    	//4-8
    	int max_num = 0;
    	for (int i = 1; i <= 10; i++) {
    		Scanner sc = new Scanner(System.in);
    		int num = sc.nextInt();
    		if (num > max_num) {
    			max_num = num;
    		}
    		System.out.println(max_num);
    	}
    }
}
