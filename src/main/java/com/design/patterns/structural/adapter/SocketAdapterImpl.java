package com.design.patterns.structural.adapter;

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	public Volt get120Volt() {
		return super.getVolt();
	}

	public Volt get12Volt() {
		return convertVolt(this.get120Volt(), 10);
	}

	public Volt get3Volt() {
		return convertVolt(this.get120Volt(), 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
