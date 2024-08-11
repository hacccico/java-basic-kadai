package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scanner.next();
			
			//正しいじゃんけんの手であるか
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				//Scannerのクラスのオブジェクトをクローズする
				scanner.close();
				return input;
			} else {
				System.out.println("r(グー)かs(チョキ)かp(パー)を入力してください");
			}
		}
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		//配列にじゃんけんの手をセットする
		String[] opponent = {"r", "s", "p"};
		
		//対戦相手のじゃんけんの手を選ぶ
		int opponentJyanken = (int)Math.floor(Math.random()* opponent.length);
		return opponent[opponentJyanken];
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String me, String you) {
		//HashMapで自分と対戦相手のじゃんけんの手を出力
		HashMap<String, String> choice = new HashMap<String, String>();
		
		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");
		
		System.out.println("自分の手は" + choice.get(me) + ",対戦相手は" + choice.get(you));
		
		//あいこ
		if(me.equals(you)) {
			System.out.println("あいこです");
		} else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))) { //自分が勝った場合
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
	

}
