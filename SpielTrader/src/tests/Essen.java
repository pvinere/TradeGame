package tests;

public class Essen {

	int leben;
	int preis;
	int menge;
	
	Essen(int m)
	{
		this.leben = 20;
		this.preis = 1;
		this.menge = m;
	}
	
	public int getPreis()
	{
		return preis;
	}
	
	public int getLeben()
	{
		return leben;
	}
	
	public int getMenge()
	{
		return menge;
	}
	
	
}
