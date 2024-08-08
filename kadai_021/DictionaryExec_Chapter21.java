package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// Dictionary_Chapter21のインスタンスを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//配列に調べる単語をセットする
		String [] searchWords = {"apple", "banana", "grape", "orange"};
		
		//searchメソッドを出力
		dictionary.search(searchWords);

	}

}
