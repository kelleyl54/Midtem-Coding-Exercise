package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

class RectangleTests {

	@Test
	public void constructionTest() {
		//tests construction and prints out each attribute of rectangle
		Rectangle r = new Rectangle(3, 3);
		System.out.println("Now testing rectangle construction");
		System.out.println("This created rectangle's width is " + r.getiWidth());
		System.out.println("This created rectangle's length is " + r.getiLength());
	}
	
	@Test
	public void getAndSetTest() {
		//will start the rectangle with one set of values and change it to another set of values
		//also tests getting method when using assertion statements
		Rectangle r = new Rectangle(1,1);
		r.setiLength(4);
		r.setiWidth(5);
		assertTrue(4==r.getiLength());
		assertTrue(5==r.getiWidth());
	}
	
	@Test
	public void areaAndPerimeterTest() {
		//this test makes sure that area and perimeter methods are working as intended
		Rectangle r = new Rectangle(1,2);
		assertTrue(2==r.area());
		assertTrue(6==r.perimeter());
	}
	
	@Test 
	public void comparingTest() {
		//this test creates three rectangles and orders then in order of increasing area then 
		//prints out each area to demonstrate sorting
		ArrayList<Rectangle> ar = new ArrayList<Rectangle>();
		ar.add(new Rectangle(1,4));
		ar.add(new Rectangle(1,1));
		ar.add(new Rectangle(1,3));
		Collections.sort(ar);
		System.out.println("Now showing rectangle area in ascending order");
		for (Rectangle r : ar) {
			System.out.println(r.area());
		}
	}
}
