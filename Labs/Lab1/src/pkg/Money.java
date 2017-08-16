package pkg;

public class Money implements MoneyInterface, Comparable<Money>{

	private int _amount; 
	private Currency _currency;

	public Money(int amount, Currency currency) {
		setAmount(amount);
		setCurrency(currency);
	}
	
	@Override
	public MoneyInterface add(Money m) {
		if(this.sameCurrency(m))
		{
			Money money = new Money(0, this.getCurrency());
			money.setAmount(this.getAmount() + m.getAmount());
			return money;
		}
		else
		{
			MoneyBag bag = new MoneyBag();
			bag.add(m);
			bag.add(this);
			return bag;
		}
	}
		
	public boolean sameCurrency(Object anObject)
	{
		if (anObject instanceof Money) {
			Money aMoney= (Money) anObject;
		return	aMoney.getCurrency().equals(getCurrency());
		}
		return false;
	}
	
	public int getAmount() { 
		return _amount;
	}
	public void setAmount(int amount) { 
		this._amount = amount;
	}
	public Currency getCurrency() { 
		return _currency;
	}
	public void setCurrency(Currency currency) { 
		this._currency = currency;
	}
	
	@Override
	public boolean equals(Object anObject) {
		if (anObject instanceof Money) {
			Money aMoney= (Money) anObject;
		return	aMoney.getCurrency().equals(getCurrency())
				&& getAmount() == aMoney.getAmount();
		}
		return false;
	}
	
	@Override
	public void toPrint()
	{
		System.out.println(this.toString());
	}
	
	@Override
	public int compareTo(Money m)
	{
		if(this.sameCurrency(m))
		{
			if(this.getAmount() > m.getAmount())
				return 1;
			if (this.getAmount() == m.getAmount())
				return 0;
			return -1;
		}
		if(this.getCurrency().toString().compareTo(m.getCurrency().toString()) > 0)
			return 1;
		return -1;
	}
	
	public String toString()
	{
		return this.getCurrency()+" "+this.getAmount();
	}
	
}