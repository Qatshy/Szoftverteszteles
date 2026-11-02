package hu.example;

public class User {
    private int id;
    private String userName;
    private String password;
    private boolean isLoggedIn;
    private UserDatabase userDatabase;

    // Konstruktor, amelyen keresztül megkapja az adatbázis példányt (repository-t)
    public User(int id, String userName, String password, boolean isLoggedIn, UserDatabase userDatabase) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
        this.userDatabase = userDatabase;
    }

    // Getterek a teszteléshez
    public int getId() { return id; }
    public String getUserName() { return userName; }
    public String getPassword() { return password; }
    public boolean isLoggedIn() { return isLoggedIn; }

    // A feladat által kért metódus
    public void updatePwd(String newPwd) {
        // Hívjuk az adatbázis (repository) függvényét a saját ID-nkkal és az új jelszóval
        userDatabase.setPassword(this.id, newPwd);
        this.password = newPwd; // Frissítjük az objektum állapotát is
    }
}