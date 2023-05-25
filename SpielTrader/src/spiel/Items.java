package spiel;

public class Items {
	
	String name;
	int preis;
	int gew;
	char typ;
	
	Items(String n, int p,int g,char t)
	{
		this.name = n;
		this.preis = p;
		this.gew = g;
		this.typ = t;	
	}
	
	//GET
	
	public String getItemName()
	{
		return name;
	}
	
	public int getItemPreis()
	{
		return preis;
	}
	
	public int getItemGew()
	{
		return gew;
	}
	
	public char getItemTyp()
	{
		return typ;
	}
	
	//SET
	
	public void setItemName(String newName)
	{
		this.name= newName;
	}
	
	public void setItemPreis(int newPreis)
	{
		this.preis = newPreis;
	}
	
	public void setItemGew(int newGew)
	{
		this.gew= newGew;
	}
	
	public void setItemTyp(char newTyp)
	{
		this.typ= newTyp;
	}
	
	public static Items Items_list(int i)
	{
		Items[] item = new Items[9];
		
		//NAME | PREIS | GEW | TYPE
		//dorf
		item[0] = new Items("Weizen",4,2,'d');
		item[1] = new Items("Mais",5,4,'d');
		item[2] = new Items("Kartoffeln",6,2,'d');
		item[3] = new Items("Rueben",10,6,'d');
		//stadt
		item[4] = new Items("Topfe",5,10,'s');
		item[5] = new Items("Geschirr",10,4,'s');
		item[6] = new Items("Hacke",7,5,'s');
		item[7] = new Items("Hammer",7,5,'s');
		item[8] = new Items("Essen",1,1,'s');
		
		return item[i];
	}
	
	
	
	
}
