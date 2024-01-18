package Test20240118_nakano;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args){
		
		//パスワードルールの表示
		System.out.println("①パスワードのルール☆");
		System.out.println("・8文字以上 \n・文字と数値のみで構成 \n・少なくとも3桁の数字が含まれていること \n");
		
		// パスワードの入力
		Scanner scanner = new Scanner(System.in);

    	System.out.println("②パスワードを入力してください　↓");
        String password = scanner.nextLine();

        // パスワードの表示（デバッグ用）
        System.out.println("\n入力されたパスワード: " + password);
		
        // パスワードのチェック
        if (CheckPW(password)) {
        	System.out.println("\n【確認結果】");
            System.out.println("パスワードは有効です。");
        } else {
        	System.out.println("\n【確認結果】");
            System.out.println("パスワードは無効です。");
        }
        
        scanner.close();
	}

	//パスワードのルールチェックの関数
	public static boolean CheckPW(String password) {
		//ルールに対する正規表現
		String passwordRegex = "^(?=.*[a-zA-Z])(?=.*\\d.*\\d.*\\d)[a-zA-Z\\d]{8,}$";
		
		//正規表現によるチェック
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		
		//チェック結果を返す
		return matcher.matches();
	}

}
