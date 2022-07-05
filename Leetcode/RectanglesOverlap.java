package leetcode;

/*Find if two rectangles overlap
Difficulty Level : Easy

Given two rectangles, find if the given two rectangles overlap or not.
Note that a rectangle can be represented by two coordinates, top left and bottom right.
So mainly we are given following four coordinates. 
l1: Top Left coordinate of first rectangle. 
r1: Bottom Right coordinate of first rectangle. 
l2: Top Left coordinate of second rectangle. 
r2: Bottom Right coordinate of second rectangle.

We need to write a function bool doOverlap(l1, r1, l2, r2) that returns true 
if the two given rectangles overlap. 
*/

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
public class RectanglesOverlap {
	public static boolean doOverlap(Point l1,Point r1,Point l2,Point r2) {
        if (l1.x == r1.x || l1.y == r1.y || r2.x == l2.x || l2.y == r2.y)
            return false;
           // If one rectangle is on left side of other
        if (l1.x > r2.x || l2.x > r1.x) {
            return false;
        }
        // If one rectangle is above other
        if (r1.y > l2.y || r2.y > l1.y) {
            return false;
        }
        return true;
	}
	public static void main(String[] args) {
        Point l1 = new Point(0,10);
        Point r1 = new Point(10,0);
        Point l2 = new Point(5,15);
        Point r2 = new Point(15,0);
        System.out.println(doOverlap(l1, r1, l2, r2));
	}

}
