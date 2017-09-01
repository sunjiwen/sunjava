

package sunjava;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java say hello!you all so strong");
		Puppy p1 = new Puppy("tommy");
		int x = 21;
		do {
		p1.setAge(x);
		p1.getAge();
		x++;
		} while (x<20);
	}

}