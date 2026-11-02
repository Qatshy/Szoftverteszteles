package hu.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserTest {

    // 1. Feladatrész: User mockolása, értékek beállítása és verify() használata
    @Test
    void testUserMockPropertiesAndVerify() {
        // Mockolt objektum készítése a User osztályból
        User userMock = mock(User.class);

        // Visszatérési értékek beállítása (stubbing)
        when(userMock.getUserName()).thenReturn("TesztElek");
        when(userMock.getPassword()).thenReturn("TOPSECRET");
        when(userMock.isLoggedIn()).thenReturn(true);
        when(userMock.getId()).thenReturn(123);

        // Függvények meghívása (és az értékek ellenőrzése)
        assertEquals("TesztElek", userMock.getUserName());
        assertEquals("TOPSECRET", userMock.getPassword());
        assertTrue(userMock.isLoggedIn());
        assertEquals(123, userMock.getId());

        // A verify() használatával ellenőrizzük, hogy a metódusok valóban meg lettek-e hívva
        verify(userMock).getUserName();
        verify(userMock).getPassword();
        verify(userMock).isLoggedIn();
        verify(userMock).getId();
    }

    // 2. Feladatrész: Az updatePwd tesztelése és a UserDatabase hívásának ellenőrzése
    @Test
    void testUpdatePwdCallsDatabase() {
        // Létrehozunk egy mockolt adatbázist, hogy elkerüljük az UnsupportedOperationException-t
        UserDatabase dbMock = mock(UserDatabase.class);
        
        // Példányosítunk egy VALÓDI usert, aminek átadjuk a MOCKOLT adatbázist
        User realUser = new User(123, "TesztElek", "REGI_JELSZO", true, dbMock);

        // Meghívjuk a tesztelendő metódust
        realUser.updatePwd("UJ_JELSZO_123");

        // Verify()-al ellenőrizzük, hogy a User osztály valóban meghívta-e az adatbázis setPassword metódusát a megfelelő adatokkal
        verify(dbMock).setPassword(123, "UJ_JELSZO_123");
    }

    // +1 Bónusz teszt: Ellenőrizzük, hogy az EREDETI UserDatabase valóban dobja-e a kivételt
    @Test
    void testRealDatabaseThrowsException() {
        UserDatabase realDb = new UserDatabase();
        
        assertThrows(UnsupportedOperationException.class, () -> {
            realDb.setPassword(123, "BÁRMI");
        });
    }
}