package sam.design.pattern.bridge;

/**
 * @author sumit
 *
 */
public class RedColor implements Color {

	@Override
	public void applyColor() {
		System.out.println("red.");
	}

}
