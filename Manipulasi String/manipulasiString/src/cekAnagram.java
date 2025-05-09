import java.util.Arrays;

public class cekAnagram {
    public static void main(String[] args) {
        String test1 = "silent";
        String test2 = "listen";

        char[] a1 = test1.toCharArray();
        char[] a2 = test2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if ( Arrays.equals (a1, a2)) {
            System.out.println(" this is an anagram");
        } else {
            System.out.println(" this is not an anagram");
        }
    }
}
