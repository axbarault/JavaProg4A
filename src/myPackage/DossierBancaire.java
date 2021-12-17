package myPackage;

public class DossierBancaire {
	
	//Constructeur
    public DossierBancaire()
    {
    	_soldeCC = new CompteCourant();
    }

    public void deposer(double value) {_soldeCC.deposer(value);}
    public double get_solde() {return _soldeCC.get_solde();}
    public void remunerer() {}
	
    private CompteCourant _soldeCC;
}
