import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @Test
    public void testSoNguyenTo1() {
        int n = 2;
        boolean expectedPrime = true;

        boolean actualPrime = VongLapVaReNhanh.isPrime(n);

        assertEquals(expectedPrime, actualPrime);
    }

    @Test
    public void testSoNguyenToKhong1() {
        int n = 15;
        boolean expectedPrime = false;

        boolean actualPrime = VongLapVaReNhanh.isPrime(n);

        assertEquals(expectedPrime, actualPrime);
    }

    @Test
    public void testInSoNguyenToTu1DenN() {
        int n = 10;
        String expectedOutput = "2 3 5 7 ";

        String actualOutput = VongLapVaReNhanh.printPrimeNumbersFrom1ToN(n);

        assertEquals(expectedOutput, actualOutput);
    }
}
