package tests;

public class Arbeiten {
	
	String name;
	int lohn;
	int dauer;
	char typ_ort;
	
	
	Arbeiten(String n,int l,char t)
	{
		this.name = n;
		this.lohn = l;
		this.dauer = 1;
		this.typ_ort = t;
	
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getLohn()
	{
		return lohn;
	}
	
	public int getDauer()
	{
		return dauer;
	}
	
	public char getTyp_Ort()
	{
		return typ_ort;
	}
	
	
	
	
	
	
}
