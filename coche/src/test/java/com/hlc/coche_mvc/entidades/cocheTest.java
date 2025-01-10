package com.hlc.coche_mvc.entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cocheTest {
	
	private coche coche();

	@BeforeEach
	void setup() {
		coche = new coche();
	}
	
	@Test
	void testAndGerMarca() {
		Long id = 1L;
		
		coche.setId(1L);
		
		assertEquals(id, coche.getId());
	
	
	}

}
