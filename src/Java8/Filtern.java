package Java8;

import java.util.List;

import klassen.Fahrzeug;
import klassen.Motorrad;

public class Filtern
{
//	public static void filterHersteller(List<Fahrzeug> fahrzeug)
//	{
//		for(int i = 0; i < fahrzeug.size();)
//		{
//			if(!fahrzeug.get(i).getHersteller().equals("BMW"))
//			{
//				fahrzeug.remove(i);
//				continue;
//			}
//			//else
//			i++;
//		}
//	}
//	
//	public static void filterMotorrad(List<Fahrzeug> fahrzeug)
//	{
//		for(int i = 0; i < fahrzeug.size();)
//		{
//			if(!(fahrzeug.get(i) instanceof Motorrad))
//			{
//				fahrzeug.remove(i);
//			}
//			else
//				i++;
//		}
//	}
	
	public static void filterInterface(List<Fahrzeug> fahrzeug, FilterFunktion filter)
	{
		for(int i = 0; i < fahrzeug.size();)
		{
			if(!filter.erfuelltFilterKriterium(fahrzeug.get(i)))
			{
				fahrzeug.remove(i);
				continue;
			}
			i++;
		}
	}
	
	public static boolean istVonDeutschemHersteller(Fahrzeug f)
	{
		return f.getHersteller() == "BMW" || f.getHersteller() == "Audi" || f.getHersteller() == "Mercedes";
	}
}
