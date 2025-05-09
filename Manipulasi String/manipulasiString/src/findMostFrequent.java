import java.util.HashMap;

public class findMostFrequent {
    public static void main(String[] args) {
        String test = "programmer".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : test.toCharArray()) {
            if ( c == ' ') continue;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char maxchar = ' ';
        int maxCount = 0 ;

        for ( char c : map.keySet()) {
            if (map.get(c) > maxCount ) {
                maxCount = map.get(c);
                maxchar = c;
            }
        }

        System.out.println( " Karakter paling sering : " + maxchar + " (muncul " + maxCount + " kali )");
    }
}
