BankAccount Projekt és JUnit Tesztek

Ez a projekt egy egyszerű BankAccount Java osztályt tartalmaz, valamint a hozzá tartozó egységteszteket JUnit 5 keretrendszer segítségével.

Előfeltételek

A projekt futtatásához a következő szoftverekre van szükség:

Java Development Kit (JDK): Minimum 8-as verzió.
Fejlesztői környezet (IDE): IntelliJ IDEA, Eclipse, vagy Visual Studio Code (a megfelelő Java kiterjesztésekkel).

Fájlok struktúrája

BankAccount.java: A bankszámla logikáját tartalmazó főosztály.
BankAccountTest.java: A BankAccount osztályt ellenőrző JUnit 5 tesztek gyűjteménye.

Futtatás és Tesztelés IDE segítségével

A legáltalánosabb és legegyszerűbb módja a tesztek futtatásának egy modern fejlesztői környezet használata.

Visual Studio Code

1. Telepítsd az Extension Pack for Java kiterjesztést.
2. Nyisd meg a mappát, ami tartalmazza a fenti fájlokat.
3. A VS Code felismeri a JUnit teszteket. A BankAccountTest.java fájlban a teszt metódusok felett meg fog jelenni egy Run Test és a fájl elején egy Run All gomb.

Tesztesetek áttekintése

A BankAccountTest.java a következő eseteket vizsgálja:

1. Új számla: Az egyenlegnek kezdetben 0-nak kell lennie.
2. Befizetés: Helyes összeg hozzáadása az egyenleghez.
3. Többszöri befizetés: Az összegek megfelelően adódnak össze.
4. Kifizetés: Pénzfelvétel sikeres, ha van elég fedezet.
5. Teljes kifizetés: Az összes pénz felvétele 0-s egyenleget eredményez.
6. Túlköltés (Kivétel tesztelése): Nagyobb összeg felvétele, mint a fedezet, IllegalArgumentException-t kell dobjon.
7. Negatív befizetés: IllegalArgumentException-t kell dobjon.
8. Nulla befizetés: IllegalArgumentException-t kell dobjon.
9. Negatív kifizetés: IllegalArgumentException-t kell dobjon.
10. Nulla kifizetés: IllegalArgumentException-t kell dobjon.

