package pkg;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MoneyBag implements MoneyInterface{
	private List<Money> _content;
	private Currency _mainCurrency;
	
	public MoneyBag() {
		_content = new ArrayList<Money>();
		_mainCurrency = new Currency("BRL", 1);
	}
	
	public MoneyBag(Currency c) {
		_content = new ArrayList<Money>();
		_mainCurrency = c;
	}
	
	public MoneyBag(List<Money> list)
	{
		_content = new ArrayList<Money>();
		Collections.sort(list);
		this.setList(list);
		_mainCurrency = new Currency("BRL", 1);
	}
	
	public MoneyBag(List<Money> list, Currency c)
	{
		_content = new ArrayList<Money>();
		Collections.sort(list);
		this.setList(list);
		_mainCurrency = c;
	}

	public int size() {
		return _content.size();
	}
	
	@Override
	public MoneyInterface add(Money money) 
	{
		int index = this.contains(money.getCurrency());
		if(index == -1)
		{
			_content.add(money);
			Collections.sort(_content);
		}
		else
		{
			_content.set(index, (Money)_content.get(index).add(money));
		}
		return this;
	}
	
	//Function returns -1 if MoneyBag doesnt contain currency. Returns the index of the Money with that currency if present.
	public int contains(Currency c) 
	{
		for (int i = 0; i < _content.size(); i++)
		{
			if(_content.get(i).getCurrency().equals(c))
			{
				return i;
			}
		}
		return -1;
	}
	
	//Function returns -1 if the currency is not present in the MoneyBag. Returns the amount of the currency if not
	public int getAmountFromCurrency(Currency c)
	{
		int index = this.contains(c);
		if(index == -1)
			return -1;
		else
		{
			return _content.get(index).getAmount();
		}
	}
	
	public Money convert()
	{
		Money result = new Money(0, _mainCurrency);
		for(int i = 0; i < this.size(); i++)
		{
			Money element = _content.get(i);
			if(element.getCurrency().equals(_mainCurrency))
			{
				result = (Money) result.add(element);
			}
			else
			{
				Money aux = new Money(element.getAmount()*element.getCurrency().getRelativeValue(), _mainCurrency);
				result = (Money) result.add(aux);
			}
		}
		return result;
	}

	List<Money> getList() 
	{ 
		return _content; 
	}
	
	public void setList(List<Money> list)
	{
		this._content = list;
	}
	
	public void toPrint()
	{
		System.out.println("A MoneyBag contém:");
		for(int i = 0; i < this.size(); i++)
		{
			System.out.println(_content.get(i).getCurrency().toString()+" "+_content.get(i).getAmount());
		}
	}
	
	@Override
	public boolean equals(Object anObject)
	{
		if (!(anObject instanceof MoneyBag))
			return false;
		MoneyBag otherlist = (MoneyBag) anObject;
		
		return _content.equals(otherlist.getList());
	}
}
