package practice_exercise;

public class Practice1 {
	public static void main(String[] args) {
		//1-1
		System.out.println("Hello World");
		
		//1-2
		int x = 11;
		System.out.println("x=" + x);
		
		//1-3
		int a = 13;
		int b = 17;
		System.out.println("x=" + a + "," + "y=" + b);
		
		//1-4
		int c = 13 + 17;
		System.out.println(c);
		
		//1-5
		System.out.println(13 * 17);
		
		//1-6
		int d = 7;
		d *= 2;
		System.out.println(d);
		d /= 2;
		System.out.println(d);
		
		//1-7 eとfの入れ替え
		int e = 2;
		int f = 3;
		int g = e;
		e = f;
		f = g;
		System.out.println("e=" + e + "," + "f=" + f);
		
		//1-8
		int h = 19;
		int i = 23;
		int j = h * i;
		System.out.println(j);
		
		//1-9
		int k = 3;
		for (int l = 2; l <= 4; l++ ) {
			System.out.println(k * l);
		}
		
		//1-10 累乗の計算
		double n = 2;
		double m = 3;
		double result = Math.pow(n, m);
		System.out.println((int)result);
		
		//1-11
		int o = 13;
		System.out.println("商=" + o / 5 + "," + "余り" + o % 5);
		
		//1-12
		int p = 3;
		p++;
		System.out.println(p);
		p--;
		p--;
		System.out.println(p);
		
	}
	
}


