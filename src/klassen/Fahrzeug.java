package klassen;

import exception.HerstellerNullException;
import exceptions.PreisUnterNullException;

public class Fahrzeug
{
	private String hersteller;
	private int leistung;
	private int preis;
	private String farbe;
	
	public Fahrzeug(String hersteller, int leistung, int preis) throws HerstellerNullException, PreisUnterNullException
	{
		setHersteller(hersteller);
		setLeistung(leistung);
		setPreis(preis);
	}

	public String getHersteller()
	{
		return hersteller;
	}
	
	public void setHersteller(String hersteller) throws HerstellerNullException
	{
		if(hersteller == null)
			throw new HerstellerNullException("Hersteller darf nicht leer sein!");
		this.hersteller = hersteller;
	}
	
	public int getLeistung()
	{
		return leistung;
	}
	
	public void setLeistung(int leistung)
	{
		this.leistung = leistung;
	}

	public int getPreis()
	{
		return preis;
	}

	public void setPreis(int preis) throws PreisUnterNullException
	{
		if(preis < 0)
			throw new PreisUnterNullException("Der Preis darf nicht negativ sein!");
		this.preis = preis;
	}
	
	public boolean istVonDeutschemHersteller(Fahrzeug f)
	{
		return f.getHersteller() == "BMW" || f.getHersteller() == "Audi" || f.getHersteller() == "Mercedes";
	}
	
	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}
	
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + ": Hersteller " + this.hersteller + ", Leistung " + this.leistung + ", Preis " + this.preis;
	}
}
