import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlockbusterTests {

	@Test
	void testDVD() {
		DVD dvd = new DVD("Zoolander", 126, null);
		assertNotNull(dvd);
		assertEquals("Zoolander", dvd.getTitle());
		assertEquals(126, dvd.getRunTime());
		
	}

	@Test
	void testVHS( ) {
		VHS vhs = new VHS("Princess Bride", 130, null);
		assertEquals("Princess Bride", vhs.getTitle());
		assertEquals(130, vhs.getRunTime());
		assertEquals(0, vhs.currentTime);
	}
	
}
