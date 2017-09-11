package Q1.pubV0;

import java.util.ArrayList;

public class Drink extends ChartItem{
	private ArrayList<Ingredient> _ingredients;
	
	public Drink(String name, ArrayList<Ingredient> ingredient, int maxAmount)
	{
		_name = name;
		_ingredients = ingredient;
		_maxAmount = maxAmount;
	}
	
	public Drink(String name, ArrayList<Ingredient> ingredient)
	{
		_name = name;
		_ingredients = ingredient;
		_maxAmount = -1;
	}
	
	public int getPrice()
	{
		int price = 0;
		for(int i = 0; i < _ingredients.size(); i++)
		{
			price += _ingredients.get(i).getPrice();
		}
		return price;
	}
	
	public void addIngredient(Ingredient ingredient)
	{
		_ingredients.add(ingredient);
	}
	
	public boolean removeIngredient(Ingredient ingredient)
	{
		return _ingredients.remove(ingredient);
	}
}
