/**
 * 
 */
package Aufgabe3;

/**
 * @author bruce
 *
 */
public class TransportAuthority
{
	final public static boolean TEST = false;

	final static int MAX = 999;
	final static int MAXDL = 499;

	public static void registerCar(String licensePlate, String owner, String address)
	{
		if(id <= MAX)
		{
			licensePlateList[id] = licensePlate;
			ownerList[id] = owner;
			addressList[id++] = address;
			if(TEST)
				System.out.println("Eintrag erstellt.");
		} else
			System.out.println("Sie haben " + MAX + " Einträge überschritten.");
	}

	public static void registerDelict(String licensPlate, double fee, int points)
	{
		// getId gibt -1 zurück, wenn das Auto nicht gefunden wurde
		int count = getId(licensPlate);

		// idFee = Anzahl der Delikte an index des registrierten Autos
		if((count >= 0) && (idFee[count] < MAXDL))
		{
			feeList[count][idFee[count]] = Double.toString(fee);
			pointsList[count][idFee[count]++] = Integer.toString(points);
			if(TEST)
				System.out.println("Delikt eingetragen.");
		} else if(count < 0)
			System.out.println("Fahrzeughalter nicht gefunden.");
		else
			System.out.println("Deliktanzahl überschritten");
	}

	public static String getOwner(String licensePlate)
	{
		for(int i = 0; i < id; ++i)
			if(licensePlateList[i].equals(licensePlate))
				return ownerList[i];

		return "Fahrzeughalter nicht gefunden";
	}

	public static String getAddress(String licensePlate)
	{
		for(int i = 0; i < id; ++i)
			if(licensePlateList[i].equals(licensePlate))
				return addressList[i];

		return "Fahrzeughalter nicht gefunden";
	}

	/**
	 * 
	 * @param licensePlate
	 * @return wenn Auto nicht gefunden -1
	 */
	public static int getId(String licensePlate)
	{
		for(int i = 0; i < id; ++i)
			if(licensePlateList[i].equals(licensePlate))
				return i;
		return -1;
	}

	/**
	 * 
	 * @param licensePlate
	 * @return gibt Array mit den Delikten am Index des regi. Autos zurück, wenn
	 *         Auto nicht regi. dann null
	 */
	public static String[] getFees(String licensePlate)
	{
		if(getId(licensePlate) >= 0)
			return feeList[getId(licensePlate)];
		else
			return null;
	}

	/**
	 * 
	 * @param licensePlate
	 * @return gibt Array mit den Punkten am Index des regi. Autos zurück, wenn
	 *         Auto nicht regi. dann null
	 */
	public static String[] getPoints(String licensePlate)
	{
		if(getId(licensePlate) >= 0)
			return pointsList[getId(licensePlate)];
		else
			return null;
	}

	private static int id = 0;
	private static int[] idFee = new int[MAX];
	private static String[] licensePlateList = new String[MAX];
	private static String[] ownerList = new String[MAX];
	private static String[] addressList = new String[MAX];
	private static String[][] feeList = new String[MAX][MAXDL];
	private static String[][] pointsList = new String[MAX][MAXDL];
}