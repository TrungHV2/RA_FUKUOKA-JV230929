import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramString {
    public static void main(String[] args) {
        String str = "     Hoàng Văn Trung      ";
        System.out.println("length(): " + str.length());
        System.out.println("charAt(): " + str.charAt(1));
        System.out.println("concat(): " + str.concat(" xin chào"));
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("trim(): " + str.trim());

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        StringBuilder builder = new StringBuilder();
        builder.append("Abc");
        builder.append("Xyz");
        builder.append("Abc");

        System.out.println(builder.toString());



        final String regex = "(\\d{10})";
        final String string = "bhhjej ew nbdf bsd bfsdf 0962229893 sdb sd bfsd fdsf 0384253545 sdf sdf sdf sd";
        final String subst = "(SĐT: $1)";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        // The substituted value will be contained in the result variable
        final String result = matcher.replaceAll(subst);

        System.out.println("Substitution result: " + result);
    }
}
