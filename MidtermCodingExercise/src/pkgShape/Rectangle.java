package pkgShape;

public class Rectangle extends Shape implements Comparable {

	private int iWidth;
	private int iLength;
	
	public Rectangle(int w, int l) {
		super();
		this.iWidth = w;
		this.iLength = l;
	}
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return (double)(this.getiLength() * this.getiWidth());
	}

	@Override
	public double perimeter() {
		return (double)(2 * this.getiLength() + 2 * this.getiWidth());
	}

	public int compareTo(Object o) {
		Rectangle r = (Rectangle)o;
		return (int)this.area()-(int)r.area();
		
	}
}
