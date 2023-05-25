package tests;

public class Ort {
	
	int entfern;
	String Ziel;
	String standOrt;
	
	Ort(String s,String z,int e)
	{
		this.standOrt = s;
		this.Ziel = z;
		this.entfern = e;
	}
	
	public String getStandOrt()
	{
		return standOrt;
	}
	
	public String getZiel()
	{
		return Ziel;
	}
	
	public int getEntfern()
	{
		
		return entfern;
	}

}
