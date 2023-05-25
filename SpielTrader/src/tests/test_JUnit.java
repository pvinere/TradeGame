package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_JUnit {

	//gibLebensPunkte
	
	@Test
	public void test_gibLebensPunkte() {
		
		System.out.println("gibLebensPunkte");
        UnitTesting obj = new UnitTesting();
        int output = obj.gibLebensPunkte();
        int result = 100;
        assertEquals(result,output);
	}
	
	//gibGoldStuck
	
	@Test
	public void test_gibGoldStuck() {
		
		System.out.println("gibGoldStuck");
        UnitTesting obj = new UnitTesting();
        int output = obj.gibGoldStuck();
        int result = 100;
        assertEquals(result,output);	
	}
	
	//gibMaximalGewicht
	
	@Test
	public void test_gibMaximalGewicht() {
		
		System.out.println("gibMaximalGewicht");
        UnitTesting obj = new UnitTesting();
        int output = obj.gibMaximalGewicht();
        int result = 100;
        assertEquals(result,output);	
	}
	
	//schalteAlleOperationFrei
	@Test
	public void test_schalteAlleOperationFrei()
	{
		System.out.println("schalteAlleOperationFrei");
		UnitTesting obj = new UnitTesting();
		boolean output = obj.schalteAlleOperationFrei();
		//boolean result = true;
		
		assertTrue(output);	
	}
	
	//wareKaufen

	@Test
	public void test_wareKaufen()
	{
		String name = "Weizen";
		int preis = 10;
		int gewicht = 10;
		char typ_ort = 'd';
		int menge = 15;
		
		int geldInInventar = 100;
		int gewichtTotal = 0;
		
		
		System.out.println("wareKaufen");
		Ware obj = new Ware(name,preis,gewicht,typ_ort,menge);
		
		int output_preis = geldInInventar - obj.getPreis();
		int result_preis = 90;
		
		int output_gewicht = gewichtTotal + obj.getGewicht();
		int result_gewicht = 10;
		
		int output_menge = obj.getMenge() + 1;
		int result_menge = 16;
		
		char output_typ = obj.getWare_Typ();
		char result_typ = 'd';
		
		assertEquals(result_preis,output_preis);
		assertEquals(result_gewicht,output_gewicht);
		assertEquals(result_menge,output_menge);
		assertEquals(result_typ,output_typ);
	}
	
	//wareVerkaufen
	
	@Test
	public void test_wareVerkaufen()
	{
		String name = "Tomaten";
		int preis = 30;
		int gewicht = 5;
		char typ = 'd';
		int menge = 10;
		
		int geldInInventar = 40;
		int gewichtTotal = 15;
		
		
		System.out.println("wareVerkaufen");
		Ware obj = new Ware(name,preis,gewicht,typ,menge);
		
		int output_preis = geldInInventar + obj.getPreis();
		int result_preis = 70;
		
		int output_gewicht = gewichtTotal - obj.getGewicht();
		int result_gewicht = 10;
		
		int output_menge = obj.getMenge() + 1;
		int result_menge = 11;
		
		char output_typ = obj.getWare_Typ();
		char result_typ = 'd';
		
		
		assertEquals(result_preis,output_preis);
		assertEquals(result_gewicht,output_gewicht);
		assertEquals(result_menge,output_menge);
		assertEquals(result_typ,output_typ);
	}
	
	//arbeiten
	
	@Test
	public void test_arbeiten()
	{
		String name = "schneiden";
		int lohn = 25;
		char typ_ort = 's';
		//das arbeit dauert 1 Tag
		
		
		int geldInInventar = 10;
		int TagZaeler = 2;
		
		System.out.println("arbeiten");
		Arbeiten obj = new Arbeiten(name,lohn,typ_ort);
		
		int output_lohn = geldInInventar + obj.getLohn();
		int result_lohn = 35;
		
		int output_dauer = TagZaeler + obj.getDauer();
		int result_dauer = 3;
		
		char output_typ = obj.getTyp_Ort();
		char result_typ = 's';
		

		assertEquals(result_lohn,output_lohn);
		assertEquals(result_dauer,output_dauer);
		assertEquals(result_typ,output_typ);
		
	}
	
	//essen
	
	@Test
	public void test_essen()
	{
		//leben wird +20
		//die preis fuer essen is 1;
		
		int spielerLeben = 60;
		int geldInInventar = 100;
		
		int menge = 25;
		
		System.out.println("essen");	
		Essen obj = new Essen(menge);
		
		int output_Leben = spielerLeben + obj.getLeben();
		int result_Leben = 80;
		
		int output_Geld = geldInInventar - obj.getPreis();
		int result_Geld = 99;
		
		int output_Menge = obj.getMenge() - 1;
		int result_Menge = 24;

		assertEquals(result_Leben,output_Leben);
		assertEquals(result_Geld,output_Geld);
		assertEquals(result_Menge,output_Menge);
	}
	
	//gibEntgernung
	
	@Test
	public void test_gibEntfernung()

	{
		String stdOrt = "Berlin";
		String ziel = "Schmalkalden";
		int entfern = 25;

		int spieler_pos = 10;
		
		System.out.println("gibEntfernung");
		Ort obj = new Ort(stdOrt,ziel,entfern);
		
		int output_ent = obj.getEntfern() - spieler_pos;
		int result_ent = 15;
		
		assertEquals(result_ent,output_ent);
		
	}
	
	//gibStandOrt
	
	@Test
	public void test_gibStandOrt()
	{
		String stdOrt = "Berlin";
		String ziel = "Schmalkalden";
		int entfern = 25;
		
		System.out.println("gibStandOrt");
		Ort obj = new Ort(stdOrt,ziel,entfern);
		
		String output = obj.getStandOrt();
		String result = "Berlin";
		
		assertEquals(result,output);
	}
	
}
