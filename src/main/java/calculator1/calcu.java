
package calculator1;

public class calcu {
	public boolean isPositive(int number) {
	    if (number > 0) {
	        return true;
	    } else if(number < 0){
	        return false;
	    }
	    else if(number > 0){
	        return true;
	    }
	    else {
	    	return false;
	    }
	    
	}

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        calcu c = new calcu();

        System.out.println("Addition: " + c.add(10, 5));

        System.out.println("Subtraction: " + c.subtract(10, 5));
    }
}

