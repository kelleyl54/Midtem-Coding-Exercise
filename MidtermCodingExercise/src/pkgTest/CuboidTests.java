package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 
import java.lang.*; 
import java.io.*;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

class CuboidTests {

	@Test
	public void constructionTest() {
		//tests that the cuboid object constructs properly and prints out it's dimensions
		Cuboid c = new Cuboid(1,2,3);
		System.out.println("Now testing cuboid construction");
		System.out.println("This created cuboid's width is " + c.getiWidth());
		System.out.println("This created cuboid's length is "+ c.getiLength());
		System.out.println("This created cuboid's depth is "+ c.getiDepth());
	}
	
	@Test
	public void getAndSetTest() {
		//will start the cuboid with one set of values and change it to another set of values
		//also tests getting methods when using assertion statements
		Cuboid c = new Cuboid(1,1,1);
		c.setiLength(4);
		c.setiWidth(5);
		c.setiDepth(6);
		assertTrue(4==c.getiLength());
		assertTrue(5==c.getiWidth());
		assertTrue(6==c.getiDepth());
	}
	
	@Test 
	public void areaTest() {
		//will test that the area method is producing the correct results
		Cuboid c = new Cuboid(1,1,1);
		assertTrue(6==c.area());
	}
	
	@Test
	public void volumeTest() {
		//will test that the volume method is producing the correct results
		Cuboid c = new Cuboid(2,2,2);
		assertTrue(8==c.volume());
	}
	
	@Test
	public void perimeterTest() throws UnsupportedOperationException {
		//will test that when the perimeter method is called for a cuboid
		//the correct exception is thrown
		boolean thrown = false;
		Cuboid c = new Cuboid(1,1,1);
		
		try {
			c.perimeter();
		}
		catch (UnsupportedOperationException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void sortByVolumeTest() {
		//will test the volume sorting method and print out each volume in increasing order
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(3,3,3));
		ar.add(new Cuboid(2,2,2));
		Collections.sort(ar, Cuboid.SortByVolume);
		System.out.println("Now showing cuboid volume in ascending order");
		for (Cuboid c : ar) {
			System.out.println(c.volume());
		}
	}
	
	@Test
	public void sortByAreaTest() {
		//will test the area sorting method and print out each area in increasing order
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(3,3,3));
		ar.add(new Cuboid(2,2,2));
		Collections.sort(ar, Cuboid.SortByArea);
		System.out.println("Now showing cuboid area in ascending order");
		for (Cuboid c : ar) {
			System.out.println(c.area());
		}
	}
}
