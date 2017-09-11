package Q1.pubV0;

public abstract class ChartItem {
	protected String _name;
	protected int _maxAmount;
		
	public String toString()
	{
		return _name;
	}
	
	public int getMaxAmount()
	{
		return _maxAmount;
	}
	
	public void setMaxAmount(int amount)
	{
		_maxAmount = amount;
	}
	
	public abstract int getPrice();
}
