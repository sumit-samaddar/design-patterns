/**
 * 
 */
package sam.design.pattern.templatemethodpattern;

/**
 * @author sumit
 *
 */
public class WoodenHouse extends HouseTemplate {

	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

}
