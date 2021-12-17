package myPackage;

public class CompteEpargne {
	
	public CompteEpargne()
	{
		_solde = 0;
	}
	public void deposer(double value) {_solde += value;}
	public double get_solde() {return _solde;}
	public void remunerer() {_solde *= 1.032;}
	
	private double _solde;
}
