package Pack.test;


public class Calculator   {
	
	
	public float add(float numeroUno, float numeroDue) {
		return numeroUno + numeroDue;
	}
	
	public float substract(float numeroUno, float numeroDue) {
		return numeroUno - numeroDue;
	}
	
	public float divide(float numeroUno, float numeroDue) throws Exception {
		if(numeroDue <= 0 && numeroUno <=0) {
			throw new Exception("Non si può dividere");
		}
		
		return numeroUno / numeroDue;
	}
	
	public float multiply(float numeroUno, float numeroDue) throws Exception {
		if(numeroDue <= 0 && numeroUno <=0) {
			throw new Exception("Non si può moltiplicare");
		}
		
		return numeroUno * numeroDue;
	}
}

