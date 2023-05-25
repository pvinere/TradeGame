package tests;

public class Ware {
	
	String name;
	int preis;
	int gewicht;
	char ware_typ;
	int menge;
	
	Ware(String n,int p ,int g, char w,int m)
	{
		this.name = n;
		this.preis = p;
		this.gewicht = g;
		this.ware_typ = w;
		this.menge = m;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPreis()
	{
		return preis;
	}
	public int getGewicht()
	{
		return gewicht;
	}
	public char getWare_Typ()
	{
		return ware_typ;
	}
	
	public int getMenge()
	{
		return menge;
	}
	
	


}
