package myPackage;

public class DossierBancaire {
	
	//Constructeur
    public DossierBancaire()
    {
    	_soldeCC = new CompteCourant();
    	_soldeCE = new CompteEpargne();
    }

    
    //Méthodes publiques (= Fonctions)
    public void deposer(double value) //Dépot sur les deux comptes
    {
    	_soldeCC.deposer(value*0.4);
    	_soldeCE.deposer(value*0.6);
    }
    
    public double get_solde() // retourne la somme des soldes des deux comptes 
    {
    	return _soldeCC.get_solde() + _soldeCE.get_solde();
    }
    
    public void remunerer() // Applique la rémunération du compte Épargne 
    {
    	_soldeCE.remunerer();
    }
	
    // Propriétés (= Variables)
    private CompteCourant _soldeCC;
    private CompteEpargne _soldeCE;
}
