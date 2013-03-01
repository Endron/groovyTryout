package firstTry.println

import org.junit.Test;

class PersonTest {
    
    @Test
    void testCreate() {
	def Person test = new Person(id:1L, vorname:"Bob");
    }
}
