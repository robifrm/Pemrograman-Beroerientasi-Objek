public class cekPalindrome {
    public static void main(String[] args) {
        String test = "katak";
        String reversed = new StringBuilder(test).reverse().toString();

        if ( test.equals(reversed)) {
            System.out.println(test + " is a palindrome string");
        } else {
            System.out.println(test + " is not a palindrome");
        }
    }
}
