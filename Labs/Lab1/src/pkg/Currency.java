package pkg;

public class Currency {
	private String _currency;
	private int _relativeValue;

	public Currency(String currency, int value) {
		setCurrency(currency);
		setRelativeValue(value);
	}
	
	public void setCurrency(String currency) {
		this._currency = currency;
	}
	
	public void setRelativeValue(int value)
	{
		this._relativeValue = value;
	}
	
	public int getRelativeValue()
	{
		 return _relativeValue;
	}
	
	public String toString () {
		return _currency;
	}
	
	public boolean equals(Object anObject)
	{
		if (anObject instanceof Currency) {
			Currency aCurrency= (Currency) anObject;
			return	(aCurrency.toString() == _currency)&&(aCurrency.getRelativeValue() == this.getRelativeValue());
		}
		return false;
	}
}
