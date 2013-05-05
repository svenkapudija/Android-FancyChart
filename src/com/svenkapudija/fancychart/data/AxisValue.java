package com.svenkapudija.fancychart.data;

public class AxisValue implements Comparable<AxisValue> {
	
	public double value;
	public String title;
	
	public AxisValue(double value, String title) {
		this.value = value;
		this.title = title;
	}
	
	@Override
	public int compareTo(AxisValue another) {
		return Double.compare(value, another.value);
	}
	
}