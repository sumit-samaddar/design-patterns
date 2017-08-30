package sam.design.pattern.adapterpattern;

/**
 * @author sumit
 *
 */
public class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}
}
