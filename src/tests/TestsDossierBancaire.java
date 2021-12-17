package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	@Test  
	public void testGetSolde() 
	{
		DossierBancaire dossier = new DossierBancaire();
		assertEquals(0, dossier.get_solde(), 0);
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 0);
	}

	@Test
	public void testDeposer()
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 0);
		dossier.deposer(150);
		assertEquals(250, dossier.get_solde(), 0);
		dossier.deposer(-250);
		assertEquals(250, dossier.get_solde(), 0);
	}
	
	@Test  
	public void testRemunerer() 
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(100);
		dossier.remunerer();
		assertEquals(100*0.4+100*0.6*1.032, dossier.get_solde(), 0);
	}

	@Test  
	public void testRetirer() 
	{
		DossierBancaire dossier = new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 0);
		assertThrows(Exception.class, () -> dossier.retirer(150));
		assertEquals(100, dossier.get_solde(), 0);
		try {
			dossier.retirer(20); // On enlève 20 des 40 € du compte courant
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals(80, dossier.get_solde(), 0);
	}
	
}
