package sam.design.pattern.builder;

/**
 * @author sumit
 *
 */
public class Computer {

	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private Boolean isGraphicsCardEnabled;
	private Boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public Boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public Boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private Boolean isGraphicsCardEnabled;
		private Boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(Boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((HDD == null) ? 0 : HDD.hashCode());
		result = prime * result + ((RAM == null) ? 0 : RAM.hashCode());
		result = prime * result + ((isBluetoothEnabled == null) ? 0 : isBluetoothEnabled.hashCode());
		result = prime * result + ((isGraphicsCardEnabled == null) ? 0 : isGraphicsCardEnabled.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (HDD == null) {
			if (other.HDD != null)
				return false;
		} else if (!HDD.equals(other.HDD))
			return false;
		if (RAM == null) {
			if (other.RAM != null)
				return false;
		} else if (!RAM.equals(other.RAM))
			return false;
		if (isBluetoothEnabled == null) {
			if (other.isBluetoothEnabled != null)
				return false;
		} else if (!isBluetoothEnabled.equals(other.isBluetoothEnabled))
			return false;
		if (isGraphicsCardEnabled == null) {
			if (other.isGraphicsCardEnabled != null)
				return false;
		} else if (!isGraphicsCardEnabled.equals(other.isGraphicsCardEnabled))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

}