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
    }
}
