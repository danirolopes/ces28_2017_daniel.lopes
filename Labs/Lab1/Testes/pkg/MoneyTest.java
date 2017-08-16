package pkg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	
	private Currency BRL;
	private Currency EUR;
	
	private Money BRL0;
	private Money BRL10;
	private Money BRL20;
	private Money EUR30;
	
	private MoneyBag bag;
	
	@Before
	public void setup() {
		BRL = new Currency("BRL", 1);
		EUR = new Currency("EUR", 3);
		
		BRL0 = new Money(0, BRL);
		BRL10 = new Money(10, BRL);
		BRL20 = new Money(20, BRL);
		EUR30 = new Money(30, EUR);
		
		bag = new MoneyBag();
	}
	
	
	/*
	Processo 2
	*/
	
	@Test
	public void whenAdd10and0Return10() {
		MoneyInterface money = BRL0.add(BRL10);
		assertTrue(((Money)money).getAmount() == 10);
	}

	/*
	Processo 3
	*/
	
	@Test
	public void whenAdd10and20Return30() {
		MoneyInterface BRL30 = (Money) BRL10.add(BRL20);
		assertEquals(((Money)BRL30).getAmount(), 30);
	}
	
	/*
	Processo 4
	*/
	
	@Test
	public void testSameCurrency()
	{
		assertTrue(BRL10.sameCurrency(BRL20));
		assertFalse(BRL20.sameCurrency(EUR30));
	}
	
	
	/*Testes após a implementação da interface */
	
	@Test
	public void testNewAdd()
	{
		bag.add(BRL10);
		bag.add(EUR30);
		
		MoneyBag result =(MoneyBag) BRL10.add(EUR30);
		
		assertTrue(result.equals(bag));
	}
}