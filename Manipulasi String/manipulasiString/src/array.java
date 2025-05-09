public class array {
    public static void main(String[] args) {
        String[] students = {
            "Mohamed Ahmed",
            "Mohamed Ali",
            "Mohamed Salah",
            "Mohamed Hassan",
            "Mohamed Ibrahim",
            "Mohamed Noor",
            "Mohamed Farah",
            "Mohamed Yusuf",
            "Mohamed Ismail",
            "Mohamed Kamal"
        };

        for (String student : students) {
            String[] parts = student.split( " " );
            if (parts.length == 2) {
                String lastName = parts[1];
                String newFirstName = "Muhammad"; // ganti Mohamed jadi Muhammad
                System.out.println(lastName + " , " + newFirstName);
            }
        }
    }
}
