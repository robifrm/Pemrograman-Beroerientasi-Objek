class User {
    private int idUser;
    private String name;
    private String email;
    private String katasandi;
    private boolean isAuthor; // Menandai apakah user juga seorang author

    void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setKataSandi(String katasandi) {
        this.katasandi = katasandi;
    }

    void setIsAuthor(boolean isAuthor) {
        this.isAuthor = isAuthor;
    }

    int getIdUser() {
        return this.idUser;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    String getKataSandi() {
        return this.katasandi;
    }

    boolean getIsAuthor() {
        return this.isAuthor;
    }

    void perpustakaan() {
        System.out.println(name + " melihat riwayat bacaan.");
    }

    void bayarBerlangganan() {
        System.out.println(name + " membayar berlangganan.");
    }

    void publishNovel(Novel novel) {
        if (this.isAuthor) {
            System.out.println(name + " telah menerbitkan novel denan title: " + novel.getTitle());
        } else {
            System.out.println(name + " bukan seorang penulis, tidak bisa menerbitkan novel.");
        }
    }
}

class Novel {
    private int idNovel;
    private String title;
    private String genre;
    private int tahunterbit;
    private String author;

    void setIdNovel(int idNovel) {
        this.idNovel = idNovel;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    void setTahunTerbit(int tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getIdNovel() {
        return this.idNovel;
    }

    String getTitle() {
        return this.title;
    }

    String getGenre() {
        return this.genre;
    }

    int getTahunTerbit() {
        return this.tahunterbit;
    }

    String getAuthor() {
        return this.author;
    }
}

public class NovelApp {
    public static void main(String[] args) {

        // User sebagai pembaca
        User reader = new User();
        reader.setIdUser(1);
        reader.setName("Hamid");
        reader.setEmail("Hamidtea@novel.com");
        reader.setIsAuthor(false); // Tidak bisa menerbitkan novel

        // User sebagai penulis
        User author = new User();
        author.setIdUser(2);
        author.setName("Rweinda");
        author.setEmail("rweinda@novel.com");
        author.setIsAuthor(true); // Menerbitkan novel

        // Novel yang diterbitkan oleh author
        Novel Antares = new Novel();
        Antares.setIdNovel(201);
        Antares.setTitle("Antares");
        Antares.setGenre("Fiksi Remaja");
        Antares.setTahunTerbit(2021);
        Antares.setAuthor(author.getName()); // Author dari novel ini adalah Rweinda

        // Menampilkan informasi pembaca
        System.out.println("Nama Pembaca: " + reader.getName());
        System.out.println("Email: " + reader.getEmail());
        reader.perpustakaan();

        // Menampilkan informasi novel
        System.out.println("\nDetail Novel");
        System.out.println("Title: " + Antares.getTitle());
        System.out.println("Genre: " + Antares.getGenre());
        System.out.println("Tahun Terbit: " + Antares.getTahunTerbit());
        System.out.println("Author: " + Antares.getAuthor());

        // Author menerbitkan novel
        author.publishNovel(Antares);
    }
}
