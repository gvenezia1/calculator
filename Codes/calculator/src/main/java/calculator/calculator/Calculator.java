package calculator.calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Calculator {
	
	
static final Logger LOG = LogManager.getLogger();


public Calculator() {
	
	LOG.error("[ho creato un nuovo calcolatore]");
}

public int prod(int x, int y) {

	LOG.error("...sto moltiplicando "+x+" e "+y);
	
	return x*y;
}
	public static void main(String[] args) {
		
		
		LOG.error("sto usando il calcolatore");
		
		Calculator c = new Calculator();
		
		int p=c.prod(30,5);
		
		System.out.println("il prodotto è "+p);
	}
}

