package calculator.calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Calculator {
	
	
	static final Logger LOG = LogManager.getLogger();


	public Calculator() {
		LOG.error("[ho creato un nuovo calcolatore]");
	}

	public int add(int x, int y) {
		LOG.error("...sto sommando " + x + " e " + y);
		return x + y;
	}

	public int prod(int x, int y) {
		LOG.error("...sto moltiplicando " + x + " e " + y);
		return x*y;
	}
	
	public int diff(int x, int y) {
		LOG.error("...sto sottraendo " + x + " e " + y);
		return x-y;
	}


	public static void main(String[] args) {
		
		
		LOG.error("sto usando il calcolatore");
		
		Calculator c = new Calculator();
		
		int p = c.prod(30,5);
		int a = c.add(30,5);
		int s = c.diff(30,5);
		
		System.out.println("il prodotto è " + p);
		System.out.println("la somma è " + a);
		System.out.println("la sottrazione è " + s);
	}
}

