package myPackage;

public class DossierBancaire {
	
	//Constructeur
    public DossierBancaire()
    {
    	_soldeCC = new Compte();
    	_soldeCE = new CompteEpargne();
    }

    
    //M�thodes publiques (= Fonctions)
    public void deposer(double value) //D�pot sur les deux comptes
    {
    	_soldeCC.deposer(value*0.4);
    	_soldeCE.deposer(value*0.6);
    }
    
    public double get_solde() // retourne la somme des soldes des deux comptes 
    {
    	return _soldeCC.get_solde() + _soldeCE.get_solde();
    }
    
    public void remunerer() // Applique la r�mun�ration du compte �pargne 
    {
    	_soldeCE.remunerer();
    }
    
    public void retirer(double value) throws Exception{
    	try {
    		_soldeCC.retirer(value);
    	}
    	catch(Exception e) {
    		throw new Exception(e.getMessage());
    	}
    }
	
    // Propri�t�s (= Variables)
    private Compte _soldeCC;
    private CompteEpargne _soldeCE;
}
