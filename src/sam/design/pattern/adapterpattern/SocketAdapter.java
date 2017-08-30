package sam.design.pattern.adapterpattern;

/**
 * @author sumit
 *
 */
public interface SocketAdapter {

	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}
