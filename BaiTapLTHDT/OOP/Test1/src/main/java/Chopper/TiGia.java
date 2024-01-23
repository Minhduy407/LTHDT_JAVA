/**
 * #@TiGia.class
 * #Date: Sep 26, 2023
 * Version: 1.0
 * Copyright 2023 Huynh Le Minh Duy
 */
package Chopper;

/**
 * 
 */
public enum TiGia {
	USD(24385.00),EURO(25852.25),VND(1.0);
	private double value;
	 
    private TiGia(double value) {
        this.setValue(value);
    }

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

}
