public class removeDuplicate {
    public static void main(String[] args) {
        String test = "Programmer" .toLowerCase();
        StringBuilder result = new StringBuilder();

        for ( char c : test.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1 ) {
                result.append(c);
            }
        }

        System.out.println( " Setelah duplikat dihapus : " + result);
    }
}
