// Product.java

/**
* A product that you can find when you go to a store.
* @author Yarden Shoham & Avi Mishayev
*/
public abstract class Product implements Serializable
{
	private String name; 
	private String brand;
	private String note; // additional information about the product
	private String units;

	/**
	* A constructor to initialize every property of the product.
	* @param name the name of the product
	* @param brand the brand of the product
	* @param note additional information about the product
	* @param units the units of the product - how the product is measured
	*/
	public Product(String name, String brand, String note, String units)
	{
		this.name = name;
		this.brand = brand;
		this.note = note;
		this.units = units;
	}

	/**
	* A constructor to initialize only the name and units of the product.
	* @param name the name of the product
	* @param units the units of the product - how the product is measured
	*/
	public Product(String name, String units)
	{
		this(name, null, null, units);
	}

	/**
	* Updates the name of the product
	* @param name the name of the product
	*/
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	* Updates the brand of the product
	* @param brand the brand of the product
	*/
	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	/**
	* Updates the note of the product - additional information about the product
	* @param note the additional product information
	*/
	public void setNote(String note)
	{
		this.note = note;
	}

	/**
	* Updates the units of the product - how the product is measured
	* @param units the units of the product
	*/
	public void setUnits(String units)
	{
		this.units = units;
	}

	/**
	* returnes the name of the product
	* @return the name of the product
	*/
	public String getName()
	{
		return name;
	}

	/**
	* returnes the brand of the product
	* @return the brand of the product
	*/
	public String getBrand()
	{
		return brand;
	}

	/**
	* returnes the note of the product - additional information about the product
	* @return additional information about the product
	*/
	public String getNote()
	{
		return note;
	}

	/**
	* returnes the units of the product - how the product is measured
	* @return the units of the product
	*/
	public String getUnits()
	{
		return units;
	}

}