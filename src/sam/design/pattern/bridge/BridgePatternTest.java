package sam.design.pattern.bridge;

/**
 * @author sumit
 *
 */
public class BridgePatternTest {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
