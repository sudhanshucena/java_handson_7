package handson_7;
import handson_7.Sam;
import static org.junit.Assert.*;

import org.junit.Test;

public class handson7UnitTest {
	Sam object= new Sam(10);
	Sam fobject = new Sam(10.2);
	@Test
	public void test() {
		assertTrue(object.ivalue instanceof Integer);
		assertTrue(fobject.fvalue instanceof Double);
	}
}
