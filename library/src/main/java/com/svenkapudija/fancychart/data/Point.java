package com.svenkapudija.fancychart.data;

public class Point {
	
	public String title = "";
	public String subtitle = "";
	
	public boolean isSelected;
	public int x;
	public int y;
	
	public int canvasX;
	public int canvasY;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + ", " + y;
	}
	
}