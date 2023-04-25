package lab;

class CountryNotValidException extends Exception{
	public CountryNotValidException(String message){
		super(message);
		}
	}

class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String message){
		super(message);
		}
	}

class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String message){
		super(message);
		}
	}

//Tax Calculator Class

class TaxCalculator{
	public static double calculateTax(String empName, boolean isIndian, double empSal) 
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{
		double taxAmount = 0;
		
		if(!isIndian){
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			}
		if(empName == null || empName.isEmpty()){
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
			}
		if(empSal > 100000){
			taxAmount = empSal * 8 / 100;
			}
		else if(empSal > 50000 && empSal < 100000){
			taxAmount = empSal * 6 / 100;
            }
        else if(empSal > 30000 && empSal < 50000){
            taxAmount = empSal * 5 / 100;
            }
        else if(empSal >= 10000 && empSal < 30000){
            taxAmount = empSal * 4 / 100;
            }
        else{
        	throw new TaxNotEligibleException("The employee does not need to pay tax");
        	}
		return taxAmount;
		}
	}

//Main Class
public class CalculatorSimulator {
	public static void main(String[] args) {
	
		//Test Case 1 
		try{
			double taxAmount = TaxCalculator.calculateTax("Ron", false, 34000);
			System.out.println("Employee 1: Tax amount is " + taxAmount);
			}
		catch(CountryNotValidException ex){
			System.out.println("Employee 1: "+ex.getMessage());
			}
		catch(EmployeeNameInvalidException ex){
			System.out.println("Employee 1: "+ex.getMessage());
			}
		catch(TaxNotEligibleException ex){
			System.out.println("Employee 1: "+ex.getMessage());
			}
		System.out.println("*******************************************");
		
		//Test Case 2
		try{
			double taxAmount = TaxCalculator.calculateTax("Tim", true, 1000);
			System.out.println("Employee 2: Tax amount is " + taxAmount);
           }
		
		catch(CountryNotValidException ex){
            System.out.println("Employee 2: "+ex.getMessage());
           }
        catch(EmployeeNameInvalidException ex){
            System.out.println("Employee 2: "+ex.getMessage());
           }
        catch(TaxNotEligibleException ex){
            System.out.println("Employee 2: "+ex.getMessage());
           }
		System.out.println("*******************************************");
		
		//Test Case 3
        try{
        	double taxAmount = TaxCalculator.calculateTax("Jack", true, 55000);
        	System.out.println("Employee 3: Tax amount is " + taxAmount);
           }
        catch(CountryNotValidException ex){
            System.out.println("Employee 3: "+ex.getMessage());
           }
        catch(EmployeeNameInvalidException ex){
            System.out.println("Employee 3: "+ex.getMessage());
           }
        catch(TaxNotEligibleException ex){
            System.out.println("Employee 3: "+ex.getMessage());
           }
        System.out.println("*******************************************");
       
        //Test Case 4
        try{
            double taxAmount = TaxCalculator.calculateTax("", true, 30000);
            System.out.println("Employee 4: Tax amount is " + taxAmount);
           }
        catch(CountryNotValidException ex){
            System.out.println("Employee 4: "+ex.getMessage());
           }
        catch(EmployeeNameInvalidException ex){
            System.out.println("Employee 4: "+ex.getMessage());
           }
        catch(TaxNotEligibleException ex){
            System.out.println("Employee 4: "+ex.getMessage());
           }
        System.out.println("*******************************************");
        }
	}
