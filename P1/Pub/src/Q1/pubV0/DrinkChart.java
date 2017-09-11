package Q1.pubV0;

import java.util.ArrayList;

public class DrinkChart {
	
	private ArrayList<ChartItem> _pubDrinks;
	
	public DrinkChart(ArrayList<ChartItem> pubDrinks)
	{
		_pubDrinks = pubDrinks;
	}
	
	public ChartItem getDrink(String drink)
	{
		int index = -1;
		
		for(int i = 0; i < _pubDrinks.size(); i++)
		{
			if(_pubDrinks.get(i).toString().equals(drink))
			{
				index = i;
				break;
			}
		}
		
		if(index == -1)
		{
			throw new RuntimeException("No such drink exists");
		}
		else
		{
			return _pubDrinks.get(index);
		}
	}
	
	public void addItem(ChartItem drink)
	{
		_pubDrinks.add(drink);
	}
	
	public void removeItem(ChartItem drink)
	{
		int index = _pubDrinks.indexOf(drink);
		
		if(index == -1)
		{
			throw new RuntimeException("No such drink exists");
		}
		else
		{
			_pubDrinks.remove(index);
		}
	}
}
