import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputNormalizer {

    //入力文字列を正規化(全角スペース→半角スペース、全角英数字→半角英数字)
public static String nomalize(String input){
   if (input == null) return null;//別の入力経路を入れた際にクラッシュしないようにするため

   //全角スペースを半角に
    String result = input.replaceAll("　", " ");

    //全角英数字を半角に
    Pattern pattern = Pattern.compile("[０-９Ａ-Ｚａ-ｚ]");
    Matcher matcher = pattern.matcher(result);
    result = matcher.replaceAll((MatchResult s) ->
            String.valueOf((char)(s.group().charAt(0)-0xfee0))
            );
    return result;
  }
}
