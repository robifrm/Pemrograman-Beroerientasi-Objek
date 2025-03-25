// Kelas User (Super Class)
class User {
    private int idUser;
    private String name;
    private String email;
    private boolean isAuthor;

    // Constructor Overloading
    User() {} // Constructor tanpa parameter

    User(int idUser, String name) { // Constructor dengan 2 parameter
        this.idUser = idUser;
        this.name = name;
    }

    User(int idUser, String name, String email) { // Constructor dengan 3 parameter
        this.idUser = idUser;
        this.name = name;
        this.email = email;
    }

    User(int idUser, String name, String email, boolean isAuthor) { // Constructor lengkap
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.isAuthor = isAuthor;
    }

    // Getter
    int getIdUser() { return this.idUser; }
    String getName() { return this.name; }
    String getEmail() { return this.email; }
    boolean getIsAuthor() { return this.isAuthor; }

    // Method Perpustakaan
    void perpustakaan() {
        System.out.println(name + " melihat riwayat bacaan.");
    }

    // Method Bayar Berlangganan
    void bayarBerlangganan() {
        System.out.println(name + " membayar berlangganan.");
    }

    // Overloading: Method publishNovel() dengan dua versi
    void publishNovel() { // Tanpa parameter
        System.out.println(name + " ingin menerbitkan sebuah novel.");
    }

    void publishNovel(Novel novel) { // Dengan parameter
        System.out.println(name + " bukan seorang penulis, tidak bisa menerbitkan novel.");
    }
}

// Kelas Author (Subclass dari User)
class Author extends User {
    // Constructor khusus untuk Author
    Author(int idUser, String name, String email) {
        super(idUser, name, email, true);
    }

    // Overriding method publishNovel
    @Override
    void publishNovel(Novel novel) {
        System.out.println(getName() + " telah menerbitkan novel dengan judul: " + novel.getTitle());
    }
}

// Kelas Novel
class Novel {
    private int idNovel;
    private String title;
    private String genre;
    private int tahunTerbit;
    private String author;

    // Constructor Overloading
    Novel() {} // Constructor tanpa parameter

    Novel(int idNovel, String title) { // Constructor dengan 2 parameter
        this.idNovel = idNovel;
        this.title = title;
    }

    Novel(int idNovel, String title, String genre) { // Constructor dengan 3 parameter
        this.idNovel = idNovel;
        this.title = title;
        this.genre = genre;
    }

    Novel(int idNovel, String title, String genre, int tahunTerbit, String author) { // Constructor lengkap
        this.idNovel = idNovel;
        this.title = title;
        this.genre = genre;
        this.tahunTerbit = tahunTerbit;
        this.author = author;
    }

    // Getter
    int getIdNovel() { return this.idNovel; }
    String getTitle() { return this.title; }
    String getGenre() { return this.genre; }
    int getTahunTerbit() { return this.tahunTerbit; }
    String getAuthor() { return this.author; }

    // Overloading: Method getDescription() untuk menampilkan informasi novel
    void getDescription() {
        System.out.println("Judul: " + title);
    }

    void getDescription(boolean showFull) {
        if (showFull) {
            System.out.println("Judul: " + title + ", Genre: " + genre + ", Tahun Terbit: " + tahunTerbit + ", Author: " + author);
        } else {
            getDescription(); // Memanggil method yang tanpa parameter
        }
    }
}

// Kelas utama untuk menjalankan program
public class NovelApp {
    public static void main(String[] args) {
        // Membuat objek User sebagai pembaca
        User reader = new User(1, "Hamid", "Hamidtea@novel.com", false);

        // Membuat objek Author sebagai penulis
        Author author = new Author(2, "Rweinda", "rweinda@novel.com");

        // Membuat objek Novel
        Novel antares = new Novel(201, "Antares", "Fiksi Remaja", 2021, author.getName());

        // Menampilkan informasi pembaca
        System.out.println("Nama Pembaca: " + reader.getName());
        System.out.println("Email: " + reader.getEmail());
        reader.perpustakaan();

        // Menampilkan informasi novel
        System.out.println("\nDetail Novel");
        antares.getDescription(true); // Menampilkan informasi lengkap novel

        // Author menerbitkan novel
        author.publishNovel(antares);

        // User biasa mencoba menerbitkan novel (akan gagal)
        reader.publishNovel();
        reader.publishNovel(antares);
    }
}
