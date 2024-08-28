package org.groupsoft.training.spring_training.core.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Math {

	@Value("#{1+1}")
	private int x;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int y;
	@Value("#{T(java.lang.Math).PI}")
	private double Z;
	@Value("#{8>10}")
	private boolean isActive;

	public Math() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Math(int x, int y, double z,boolean isActive) {
		super();
		this.x = x;
		this.y = y;
		this.Z = z;
		this.isActive = isActive;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return Z;
	}

	public void setZ(double z) {
		Z = z;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Math [x=" + x + ", y=" + y + ", Z=" + Z + ", isActive=" + isActive + "]";
	}

}
