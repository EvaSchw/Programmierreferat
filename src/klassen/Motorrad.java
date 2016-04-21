package klassen;

import exceptions.HerstellerNullException;
import exceptions.PreisUnterNullException;

public class Motorrad extends Fahrzeug
{

	public Motorrad(String hersteller, int leistung, int preis) throws HerstellerNullException, PreisUnterNullException
	{
		super(hersteller, leistung, preis);
	}

}
