package sam.design.pattern.adapter;

/**
 * @author sumit
 *
 */
public interface SocketAdapter {

	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}
