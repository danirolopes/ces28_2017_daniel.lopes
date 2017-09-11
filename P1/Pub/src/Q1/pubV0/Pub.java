package Q1.pubV0;

import java.util.ArrayList;
import java.util.Arrays;

public class Pub {
	
	private DrinkChart _drinkChart;
	private double _studentDiscount;
	
	public Pub()
	{
		//Inicializando Ingredientes
	    Ingredient ingredient1 = new Ingredient("rum", 65);
	    Ingredient ingredient2 = new Ingredient("grenadine", 10);
	    Ingredient ingredient3 = new Ingredient("lime juice", 10);
	    Ingredient ingredient4 = new Ingredient("green stuff", 10);
	    Ingredient ingredient5 = new Ingredient("tonic water", 20);
	    Ingredient ingredient6 = new Ingredient("gin", 85);
	    
	    //Inicializando Produtos
	    Product product1 = new Product("hansa", 74);
	    Product product2 = new Product("grans", 103);
	    Product product3 = new Product("strongbow", 110);
	    
	    //Inicializando Drinks
	    ArrayList<Ingredient> list1 = new ArrayList<>(Arrays.asList(ingredient6, ingredient5, ingredient4));
	    Drink drink1 = new Drink("gt", list1, 2);
	    
	    ArrayList<Ingredient> list2 = new ArrayList<>(Arrays.asList(ingredient6, ingredient1, ingredient2, ingredient3));
	    Drink drink2 = new Drink("bacardi_special", list2, 2);
	    
	    
	    //Inicializando Chart
	    ArrayList<ChartItem> list3 = new ArrayList<>(Arrays.asList(product1, product2, product3, drink1, drink2));
	    _drinkChart = new DrinkChart(list3);
	    
	    //Setando Desconto
	    _studentDiscount = 0.9;
	    
	}

    public int computeCost(String drinkName, boolean student, int amount) {
    	
    	ChartItem drink = _drinkChart.getDrink(drinkName);
    	
    	if (drink.getMaxAmount() >= amount || drink.getMaxAmount() == -1)
    	{
    		if(Product.class.isInstance(drink))
    		{
    			return (int)Math.ceil(drink.getPrice()*amount*((student)?_studentDiscount : 1));
    		}
    		else
    		{
    			return (int)Math.ceil(drink.getPrice()*amount);
    		}
    	}
    	else
    	{
    		throw new RuntimeException("Too many drinks, max "+drink.getMaxAmount()+".");
    	}
        
    }
    
    public void setDiscount(double discount)
    {
    	_studentDiscount = discount;
    }
}
