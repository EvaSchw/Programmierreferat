package klassen;

import exceptions.HerstellerNullException;
import exceptions.PreisUnterNullException;

public class PKW extends Fahrzeug
{
	private int anzTueren;

	public PKW(String hersteller, int leistung, int preis, int anzTueren) throws HerstellerNullException, PreisUnterNullException
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
