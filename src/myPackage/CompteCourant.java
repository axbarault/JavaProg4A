package myPackage;

public class CompteCourant {
	
	public CompteCourant()
    {
    	_solde = 0;
    }
	
	public void deposer(double value) {_solde += value;}
    public double get_solde() {return _solde;}
	
	private double _solde;
}
