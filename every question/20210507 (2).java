import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
        String patternString = sc.next();
        String str = sc.next();
        System.out.println(isMatch(patternString, str));
    }
    sc.close();
}

public static boolean isMatch(String patternString, String str) {
    String oneReplaceString = patternString.replace("*", ".*");
    String twoReplaceString = oneReplaceString.replace("?", ".{1}");
    //System.out.println(twoReplaceString);
    Pattern pattern = Pattern.compile(twoReplaceString);
    Matcher matcher = pattern.matcher(str);
    return matcher.matches();
    }
}