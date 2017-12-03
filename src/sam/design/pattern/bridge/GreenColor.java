package sam.design.pattern.bridge;

/**
 * @author sumit
 *
 */
public class GreenColor implements Color {

	@Override
	public void applyColor() {
		System.out.println("green.");
	}

}
