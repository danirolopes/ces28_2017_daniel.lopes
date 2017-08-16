package pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyBagTest {

	private Currency BRL;
	private Currency EUR;
	private Currency CHF;
	private Currency USD;
	
	private Money BRL0;
	private Money BRL10;
	private Money BRL20;
	private Money EUR30;
	private Money CHF50;
	private Money USD10;
	
	private MoneyBag Bag1;
	
	@Before
	public void setup() {
		BRL = new Currency("BRL", 1);
		EUR = new Currency("EUR", 3);
		CHF = new Currency("CHF", 2);
		USD = new Currency("USD", 3);
		
		BRL0 = new Money(0, BRL);
		BRL10 = new Money(10, BRL);
		BRL20 = new Money(20, BRL);
		EUR30 = new Money(30, EUR);
		CHF50 = new Money(50, CHF);
		USD10 = new Money(10, USD);
		
		Bag1 = new MoneyBag();
		
		Bag1.add(BRL0);
		Bag1.add(EUR30);
		Bag1.add(CHF50);
		Bag1.add(BRL20);
		Bag1.add(BRL10);
		
	}
	
	@Test
	public void testContains() {
		assertTrue(Bag1.contains(BRL) > -1);
		assertTrue(Bag1.contains(EUR) > -1);
		assertTrue(Bag1.contains(USD) == -1);
	}
	
	@Test
	public void testGetAmountFromCurrency()
	{
		assertEquals(Bag1.getAmountFromCurrency(BRL), 30);
		assertEquals(Bag1.getAmountFromCurrency(EUR), 30);
		assertEquals(Bag1.getAmountFromCurrency(CHF), 50);
		assertEquals(Bag1.getAmountFromCurrency(USD), -1);
	}
	
	@Test
	public void testSize()
	{
		assertEquals(Bag1.size(), 3);
		Bag1.add(USD10);
		assertEquals(Bag1.size(), 4);
	}
	
	/*Testes após a implementação da interface*/
	
	@Test
	public void testConvertBRL()
	{
		assertEquals(Bag1.convert().getAmount(), 220);
		Bag1.add(USD10);
		assertEquals(Bag1.convert().getAmount(), 250);
	}

}
