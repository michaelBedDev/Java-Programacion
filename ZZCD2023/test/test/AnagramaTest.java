package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio2.Anagrama;

class AnagramaTest {
	Anagrama anagrama = new Anagrama();
	
	@Test
	public void testValidaAnagrama() {
		
		assertTrue(anagrama.comprobarAnagrama("roma", "amor"));
		
		assertFalse(anagrama.comprobarAnagrama("roma", "amorr"));
		
		assertTrue(anagrama.comprobarAnagrama("copia", "opiac"));

		assertFalse(anagrama.comprobarAnagrama("roma", "romA"));

		assertTrue(anagrama.comprobarAnagrama("arroz", "zorra"));

		assertTrue(anagrama.comprobarAnagrama("snake", "ekans"));

        assertTrue(anagrama.comprobarAnagrama("pato", "topa"));
        
        assertTrue(anagrama.comprobarAnagrama("casa", "saca"));
        
        assertTrue(anagrama.comprobarAnagrama("caso", "saco"));
        
		assertFalse(anagrama.comprobarAnagrama("albóndiga", "almóndiga"));

		assertFalse(anagrama.comprobarAnagrama("Python", "pythoN"));
	}
}
