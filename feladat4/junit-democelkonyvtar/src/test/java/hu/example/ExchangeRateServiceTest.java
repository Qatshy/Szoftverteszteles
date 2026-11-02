package hu.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangeRateServiceTest {

    @Test
    void testExchangeRate() {
        // 1. Mock létrehozása
        ExchangeRateService rateService = mock(ExchangeRateService.class);

        // 2. Mock viselkedésének konfigurálása (stubbing)
        when(rateService.getRate("EUR", "HUF")).thenReturn(400.0);

        // 3. Futtatás és ellenőrzés
        double rate = rateService.getRate("EUR", "HUF");
        assertEquals(400.0, rate);
    }
}
