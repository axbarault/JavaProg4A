package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.Compte;
import myPackage.DossierBancaire;

public class TestCompteCourant {

	@Test  
	public void testGetSolde() 
	{
		Compte compte = new Compte();
		assertEquals(0, compte.get_solde(), 0);
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
	}

	@Test
	public void testDeposer()
	{
		Compte compte = new Compte();
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
		compte.deposer(150);
		assertEquals(250, compte.get_solde(), 0);
	}

	@Test
	public void testRetirer()
	{
		Compte compte = new Compte();
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
		assertThrows(Exception.class, () -> compte.retirer(150));
		try {
			compte.retirer(50);
			assertEquals(50, compte.get_solde(), 0);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
}
