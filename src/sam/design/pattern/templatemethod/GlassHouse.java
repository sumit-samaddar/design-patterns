package sam.design.pattern.templatemethod;

/**
 * @author sumit
 *
 */
public class GlassHouse extends HouseTemplate {

	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}
}
