package Composite;

import java.util.ArrayList;

public class Drawing implements Shape{
	private ArrayList<Shape> shapeList;
	
	public Drawing()
	{
		shapeList = new ArrayList<Shape>();
	}
	
	public void draw(String color)
	{	
		for (Shape shape : shapeList)
		{
			shape.draw(color);
		}
	}
	
	public void clear()
	{
		shapeList.clear();
		System.out.println("Clearing all the shapes from drawing");
	}
	
	public void add(Shape shape)
	{
		shapeList.add(shape);
	}
}
