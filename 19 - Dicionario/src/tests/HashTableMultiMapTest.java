package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTableMultiMapTest {

	@Test
	void test() {
		HashTableMultiMap<Integer, String> D = 
				new HashTableMultiMap<Integer, String>();
		assertEquals("5=A", D.put(5, "A").toString());
		assertEquals("[5=A]", D.entrySet().toString());
		assertEquals("7=B", D.put(7, "B").toString());
		assertEquals("[5=A, 7=B]", D.entrySet().toString());
		assertEquals("2=C", D.put(2, "C").toString());
		assertEquals("[2=C, 5=A, 7=B]", D.entrySet().toString());
		assertEquals("8=D", D.put(8, "D").toString());
		assertEquals("[2=C, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertEquals("2=E", D.put(2, "E").toString());
		assertEquals("[2=C, 2=E, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertEquals("7=B", D.get(7).toString());
		assertEquals("[2=C, 2=E, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertNull(D.get(4));
		assertEquals("[2=C, 2=E, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertEquals("2=C", D.get(2).toString());
		assertEquals("[2=C, 2=E, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertEquals("[2=C, 2=E]", D.getAll(2).toString());
		assertEquals("[2=C, 2=E, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertEquals(5, D.size());
		assertEquals("[2=C, 2=E, 5=A, 7=B, 8=D]", D.entrySet().toString());
		assertEquals("5=A", D.remove(D.get(5)).toString());
		assertEquals("[2=C, 2=E, 7=B, 8=D]", D.entrySet().toString());
		assertEquals("2=C", D.remove(D.get(2)).toString());
		assertEquals("[2=E, 7=B, 8=D]", D.entrySet().toString());

	}

}
