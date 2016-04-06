package klassen;

public class Fahrzeug
{
	private String hersteller;
	private int anzTueren;
	private int leistung;
	
	public Fahrzeug(String hersteller, int anzTueren, int leistung)
	{
		setHersteller(hersteller);
		setAnzTueren(anzTueren);
		setLeistung(leistung);
	}

	public String getHersteller()
	{
		return hersteller;
	}
	
	public void setHersteller(String hersteller)
	{
		this.hersteller = hersteller;
	}
	
	public int getAnzTueren()
	{
		return anzTueren;
	}
	
	public void setAnzTueren(int anzTueren)
	{
		this.anzTueren = anzTueren;
	}
	
	public int getLeistung()
	{
		return leistung;
	}
	
	public void setLeistung(int leistung)
	{
		this.leistung = leistung;
	}
}
