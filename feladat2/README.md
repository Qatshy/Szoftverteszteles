QUnit Projekt és QUnit Tesztek


Ez a projekt egy egyszerű JavaScript alkalmazást tartalmaz, valamint a hozzá tartozó egységteszteket QUnit keretrendszer segítségével.


Előfeltételek

A projekt futtatásához a következő szoftverekre van szükség:

Fejlesztői környezet (IDE): Visual Studio Code.

Kiterjesztés: Live Server (a VS Code-hoz telepítve).


Fájlok struktúrája

index.html: A teszteket futtató és az eredményeket megjelenítő weblap.

qunit.js és qunit.css: A QUnit tesztelési keretrendszer működéséhez és formázásához szükséges alapfájlok.

gyak3app.js: Az alkalmazás logikáját és a tesztelendő JavaScript függvényeket tartalmazó fájl.

gyak3test.js: A függvényeket ellenőrző QUnit tesztesetek gyűjteménye.


Futtatás és Tesztelés Live Server segítségével

A legáltalánosabb és legegyszerűbb módja a tesztek futtatásának a VS Code beépített kiterjesztésének használata.


Visual Studio Code

1. Nyisd meg a projekt mappáját, ami tartalmazza a fenti fájlokat a VS Code-ban.

2. A bal oldali fájlkezelőben kattints jobb gombbal az index.html fájlra.

3. Válaszd az "Open with Live Server" menüpontot.

4. Ekkor megnyílik az alapértelmezett böngésződ, és a tesztek automatikusan lefutnak.


Teszteredmények áttekintése

A böngészőben megjelenő QUnit felület a következőképpen értékeli az eseteket:

1. Zöld jelzés (Sikeres teszt): A teszt sikeresen lefutott, a vizsgált függvény pontosan a specifikáció szerint működik.

2. Piros jelzés (Sikertelen teszt): A teszt elbukott. A hibás teszt lenyíló fülén pontosan látható a kapott eredmény (Result) és az elvárt érték (Expected) közötti eltérés.