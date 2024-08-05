package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 各子クラスのインスタンスを作成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//setGivenNameメソッドを実行
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//exexIntroduceメソッドを実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();

	}

}
