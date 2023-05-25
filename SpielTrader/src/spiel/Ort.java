package spiel;

public class Ort {
	
	String name;
	int distanz;
	char typ;
	int id;
	
	Ort(String n,int d, char t,int i)
	{
		this.name = n;
		this.distanz = d;
		this.typ = t;
		this.id = i;
	}
	
	public String getOrtName()
	{
		return name;
	}
	
	public int getOrtDistanz()
	{
		return distanz;
	}
	
	public char getOrtTyp()
	{
		return typ;
	}
	
	public int getOrtId()
	{
		return id;
	}
	
	public void setOrtName(String newName)
	{
		this.name= newName;
	}
	
	public void setOrtDistanz(int newDist)
	{
		this.distanz = newDist;
	}
	
	public void setOrtTyp(char newTyp)
	{
		this.typ = newTyp;
	}
	
	public void setOrtId(int newId)
	{
		this.distanz = newId;
	}
	
	
	
	
}
	

