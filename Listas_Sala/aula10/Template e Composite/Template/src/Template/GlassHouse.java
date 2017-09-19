package Template;

public class GlassHouse extends HouseTemplate {
	
	
	@Override
	protected void buildPillars() {
	  System.out.println("Building Pillars with Glass coating");
	}
	
	@Override
	protected void buildWalls() {
	  System.out.println("Building Glass Walls");
	}
	
}
