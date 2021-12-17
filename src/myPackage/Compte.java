package myPackage;

public class Compte {
	
	public Compte() {// Constructeur
    	_solde = 0;
    }
	
	public void deposer(double value) {
		if(value > 0) {
			_solde += value;
		}
	}
	
    public double get_solde() {
    	return _solde;
    }
	
    public void retirer(double value) throws Exception {
    	if (value > _solde) {
    		throw new Exception("Solde insuffisant");
    	} else {
    		_solde -= value;
    	}
    }
    
	private double _solde;
}
