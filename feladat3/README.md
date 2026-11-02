User Projekt és JUnit Tesztek



Ez a projekt egy egyszerű User és UserDatabase Java osztályt tartalmaz, valamint a hozzá tartozó egységteszteket JUnit 5 és Mockito keretrendszer segítségével.



Előfeltételek



A projekt futtatásához a következő szoftverekre van szükség:



Java Development Kit (JDK): Minimum 8-as verzió (javasolt 17-es vagy újabb).

Fejlesztői környezet (IDE): IntelliJ IDEA, Eclipse, vagy Visual Studio Code (a megfelelő Java kiterjesztésekkel).



Fájlok struktúrája



User.java: A felhasználói adatokat tároló és a jelszófrissítési logikát tartalmazó főosztály.

UserDatabase.java: Egy adatbázist szimuláló osztály, amely alapértelmezetten kivételt dob.

UserTest.java: A User osztályt mockolt objektumokkal ellenőrző JUnit 5 tesztek gyűjteménye.



Futtatás és Tesztelés IDE segítségével



A legáltalánosabb és legegyszerűbb módja a tesztek futtatásának egy modern fejlesztői környezet használata.



Visual Studio Code



1\. Telepítsd az Extension Pack for Java kiterjesztést.

2\. Nyisd meg a mappát, ami tartalmazza a fenti fájlokat.

3\. A VS Code felismeri a JUnit teszteket. A UserTest.java fájlban a teszt metódusok felett meg fog jelenni egy Run Test és a fájl elején egy Run All gomb.



Tesztesetek áttekintése



A UserTest.java a következő eseteket vizsgálja:



1\. Mockolt tulajdonságok ellenőrzése: A mockolt User objektum adatainak beállítása (stubbing), az értékek lekérdezése, valamint a metódushívások ellenőrzése a verify() függvény segítségével.

2\. Jelszófrissítés adatbázis hívása: A jelszó (updatePwd) frissítésekor az osztály meghívja a mockolt UserDatabase setPassword metódusát a helyes ID-val és az új jelszóval.

3\. Valós adatbázis hiba (Kivétel tesztelése): A valódi UserDatabase példány setPassword metódusának meghívása UnsupportedOperationException-t kell dobjon.

