package primeNumbers

import org.junit.Assert
import org.junit.Test

class PrimeNumberTest {

    PrimeNumberDivider divider = new PrimeNumberDivider();

    @Test
    void divide02() {
	Assert.assertTrue([2].equals(divider.divide(2)));
    }

    @Test
    void divide03() {
	Assert.assertTrue([3].equals(divider.divide(3)));
    }

    @Test
    void divide04() {
	Assert.assertTrue([2, 2].equals(divider.divide(2 * 2)));
    }
    
    @Test
    void divide05() {
	Assert.assertTrue([5].equals(divider.divide(5)));
    }
    
    @Test
    void divide06() {	
	Assert.assertTrue([2, 3].equals(divider.divide(2 * 3)));
    }
    
    @Test
    void divide07() {
	Assert.assertTrue([7].equals(divider.divide(7)));
    }
    
    @Test
    void divide08() {
	Assert.assertTrue([2, 2, 2].equals(divider.divide(2 * 2 * 2)));
    }
    
    @Test
    void divide09() {
	Assert.assertTrue([3, 3].equals(divider.divide(3 * 3)));
    }
    
    @Test
    void divide10() {
	Assert.assertTrue([2, 5].equals(divider.divide(2 * 5)));
    }
    
    @Test
    void divide11() {
	Assert.assertTrue([11].equals(divider.divide(11)));
    }
    
    @Test
    void divide12() {
	Assert.assertTrue([2, 2, 3].equals(divider.divide(2 * 2 * 3)));
    }
    
    @Test
    void divide245() {
	Assert.assertTrue([5, 7, 7].equals(divider.divide(5 * 7 * 7)));
    }
    
    @Test
    void divide175() {
	Assert.assertTrue([5, 5, 7].equals(divider.divide(5 * 5 * 7)));
    }
    
    @Test
    void divideNegativNumber() {
	Assert.assertTrue([-1, 5, 7, 7].equals(divider.divide(-1 * 5 * 7 * 7)));
    }
    
    @Test
    void divide0() {
	Assert.assertTrue([].equals(divider.divide(0)));
    }
}
