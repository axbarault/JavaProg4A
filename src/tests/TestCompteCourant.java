package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteCourant;
import myPackage.DossierBancaire;

public class TestCompteCourant {

	@Test  
	public void testGetSolde() 
	{
		CompteCourant compte = new CompteCourant();
		assertEquals(0, compte.get_solde(), 0);
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
	}

	@Test
	public void testDeposer()
	{
		CompteCourant compte = new CompteCourant();
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
		compte.deposer(150);
		assertEquals(250, compte.get_solde(), 0);
	}

}
