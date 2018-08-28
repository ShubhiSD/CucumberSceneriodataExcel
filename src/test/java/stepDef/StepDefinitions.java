package stepDef;
import org.testng.Assert;
import Utility.DataReader;
import Qapractice.CucumberAdvance.Calculator;
import Qapractice.CucumberAdvance.calTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	Calculator cal;
	DataReader reader;
	private int total;
	int multiplication[];
	/*public StepDefinitions() 
	{try{
		System.out.println("sad");
		DataReader.setExcelFile();
	}
	catch(Exception e) {}}*/
	@Given("^I have a calculator$")
	public void initailizeCalculator () {
		cal=new Calculator();try{
			//given common to both scenario
			DataReader.setExcelFile();
		}
		catch(Exception e) {}
	
	}
	@When("^I add (\\d+) and (\\d+)$")
	public void addNumber(int num1, int num2) throws Throwable {
		    /* here /d represent number + means one or more*/
		total=cal.add(num1, num2);
	  }
	@Then("^the result should be (\\d+)$")
	public void printTotal(int tot)throws Throwable {
		    Assert.assertEquals(total,tot);
	  }
	
	
		@When("^I multiply num1 and num2$")
		public void multiplyNumber()  {
			try {
			int[][] data=(int[][])DataReader.getNumberData();
			int num1,num2;
			multiplication=new int[data.length];
			for (int i=0; i<data.length;i++)
			{
			num1=data[i][0]; num2=data[i][1];
			multiplication[i]=cal.multiplication(num1,num2);;
			System.out.println(multiplication[i]);
			}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());}
		  }
		@Then("^the result should be multiplication$")
		public void printMultiplication()throws Throwable {
			int[] data=DataReader.getMultiplicationData();
			for (int i=0; i<data.length;i++)
				{DataReader.setCellData((multiplication[i]==data[i]?"Pass":"Fail"),i);
				System.out.println(data[i]);
				}
		  }

}
