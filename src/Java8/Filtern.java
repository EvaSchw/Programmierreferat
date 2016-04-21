package Java8;

import java.util.List;

import klassen.Angebot;
import klassen.Fahrzeug;
import klassen.Motorrad;

public class Filtern
{
	public static void filterHersteller(List<Fahrzeug> fahrzeug)
	{
		for(int i = 0; i < fahrzeug.size();)
		{
			if(!fahrzeug.get(i).getHersteller().equals("BMW"))
			{
				fahrzeug.remove(i);
				continue;
			}
			i++;
		}
	}
	
	
	
	

	public static boolean istVonDeutschemHersteller(Fahrzeug f)
	{
		return f.getHersteller().equals("BMW") || f.getHersteller().equals("Porsche")
				|| f.getHersteller().equals("Audi") || f.getHersteller().equals("Mercedes");
	}
}
