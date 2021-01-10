
public class Human01 {
    public String name;  //メンバー変数
    public int age;  //メンバー変数
    
    //引数なしのコンストラクタ
    //コンストラクタとはインスタンス生成時に実行されるメソッド
    public Human01() {
    	name = "山田";
    	age = 20;
    }
    
    //引数2つのコンストラクタ
    public Human01(String name, int age) {
    	//引数で渡した情報でメンバー変数を初期化するのは、生成したインスタンスのメンバー変数(自分自身)なのでthisを用いる。
    	this.name = name;
    	this.age = age;
    }
}
