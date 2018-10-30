package pkgShape;

import java.util.Comparator;
import java.util.*; 
import java.lang.*; 
import java.io.*;

public class Cuboid extends Rectangle implements Comparable{

	private int iDepth;

	public Cuboid(int w, int l, int d) {
		super(w, l);
		this.iDepth = d;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return (double) (this.getiWidth() * this.getiLength() * this.getiDepth());
	}

	public double area() {
		return (double) (2 * this.getiDepth() * this.getiWidth()) + (double) (2 * this.getiDepth() * this.getiLength())
				+ 2 * super.area();
	}

	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Invalid operation for cuboid object");
	}
	
	public static Comparator<Cuboid> SortByVolume = new Comparator<Cuboid>() {
		
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return (int)(c1.volume() - c2.volume());
		}
		
	};
	
	public static Comparator<Cuboid> SortByArea = new Comparator<Cuboid>() {
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return (int)(c1.area()-c2.area());
		}
	};

}

//class SortByArea implements Comparator<Cuboid> {
//
//	SortByArea() {
//
//	}
//
//	@Override
//	public int compare(Cuboid c1, Cuboid c2) {
//		return (int) (c1.area() - c2.area());
//	}
//
//}
//
//class SortByVolume implements Comparator<Cuboid> {
//
//	SortByVolume() {
//
//	}
//
//	@Override
//	public int compare(Cuboid c1, Cuboid c2) {
//		return (int) (c1.volume() - c2.volume());
//	}
//}
