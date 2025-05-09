public class cekTwoStringAnagram {
    public static void main(String[] args) {
        String t1 = "listen".toLowerCase();
        String t2 = "silent".toLowerCase();

        if (t1.length() != t2.length()) {
            System.out.println("Bukan Anagram");
            return;
        }

        int[] count = new int[26]; // hanya huruf a-z

        for (int i = 0; i < t1.length(); i++) {
            count[t1.charAt(i) - 'a']++;
            count[t2.charAt(i) - 'a']--;
        }

        for (int n : count) {
            if (n != 0) {
                System.out.println("Bukan Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
