package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.CompteEpargne;
import myPackage.DossierBancaire;

public class TestCompteEpargne {

	@Test  
	public void testGetSolde() 
	{
		CompteEpargne compte = new CompteEpargne();
		assertEquals(0, compte.get_solde(), 0);
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
	}

	@Test
	public void testDeposer()
	{
		CompteEpargne compte = new CompteEpargne();
		compte.deposer(100);
		assertEquals(100, compte.get_solde(), 0);
		compte.deposer(150);
		assertEquals(250, compte.get_solde(), 0);
	}
	
	@Test  
	public void testRemunerer() 
	{
		CompteEpargne compte = new CompteEpargne();
		compte.deposer(100);
		compte.remunerer();
		assertEquals(100*1.032, compte.get_solde(), 0);
	}

}
