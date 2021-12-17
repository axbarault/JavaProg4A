package myPackage;

public class DossierBancaire {
	
	//Constructeur
    public DossierBancaire()
    {
    	_soldeCC = new Compte();
    	_soldeE = new CompteEpargne();
    }

    public void deposer(double value) 
    {
    	_soldeCC.deposer(value*0.4);
    	_soldeE.deposer(value*0.6);
    }
    
    public double get_solde() 
    {
    	return _soldeCC.get_solde() + _soldeE.get_solde();
    }
    
    public void remunerer() 
    {
    	_soldeE.remunerer();
    }
	
    private Compte _soldeCC;
    private CompteEpargne _soldeE;
}
