public class cekVokal {
    public static void main(String[] args) {
        String test = "time";
        int count = 0;

        for ( char c : test.toLowerCase().toCharArray() ) {
            if ( "aiueo".indexOf(c) != -1) count++;
        }

        System.out.println(" Jumalah huruf vokalnya : " + count);

    }
}
