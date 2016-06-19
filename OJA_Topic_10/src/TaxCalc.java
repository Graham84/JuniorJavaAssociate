
public class TaxCalc {
	
	//Instance Variable
	public float taxDue;
	
	//Method
	public float calcTax(int salary, float rate){
		taxDue=(salary * rate);
		return taxDue;
	}

}
