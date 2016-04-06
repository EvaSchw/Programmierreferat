package klassen;

public class PKW extends Fahrzeug
{
	private int anzTueren;

	public PKW(String hersteller, int leistung, int preis, int anzTueren)
	{
		super(hersteller, leistung, preis);
		setAnzTueren(anzTueren);
	}

	public int getAnzTueren()
	{
		return anzTueren;
	}

	public void setAnzTueren(int anzTueren)
	{
		this.anzTueren = anzTueren;
	}

}
