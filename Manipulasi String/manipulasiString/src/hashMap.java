import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        String test = " this time ";
        HashMap<Character, Integer> map = new HashMap<>();

        for ( char c : test.toCharArray()) {
            if ( c == ' ') continue;
            map.put (c, map.getOrDefault (c, 0) + 1);
        }

        for ( char key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
