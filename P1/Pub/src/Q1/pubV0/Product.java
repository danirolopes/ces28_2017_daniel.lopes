package Q1.pubV0;

public class Product extends ChartItem{
	private int _price;
	
	public Product(String name, int price, int maxAmount)
	{
		_name = name;
		_price = price;
		_maxAmount = maxAmount;
	}
	
	public Product(String name, int price)
	{
		_name = name;
		_price = price;
		_maxAmount = -1;
	}
	
	public int getPrice()
	{
		return _price;
	}
}
