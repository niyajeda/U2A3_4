/**
 * 
 */
package Aufgabe3;

/**
 * @author bruce
 *
 */
public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MeterMaid poli = new MeterMaid();

		TransportAuthority.registerCar("B22", "Obama", "Washington");

		poli.checkCar("B22");

		poli.fine();
		poli.fine();
		poli.fine();
		poli.printTicket();

		TransportAuthority.registerCar("B23", "Putin", "Moskau");

		poli.checkCar("B23");

		poli.fine();
		poli.fine();
		poli.fine();
		poli.printTicket();

		poli.checkCar("Fehleingabe");
		poli.printTicket();

		poli.checkCar("B22");
		poli.printTicket();

	}

}