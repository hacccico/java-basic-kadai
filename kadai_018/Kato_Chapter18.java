package kadai_018;

abstract public class Kato_Chapter18 {
	//フィールド（内部データ）
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区◯✗";
	
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");	
	}
	
	//個別の紹介を出力するメソッド（抽象クラス）
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();//各家族紹介の間に改行をいれる
		
		
	}
	
	

}
