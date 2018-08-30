package stepDef;

import java.util.ListIterator;
import org.testng.Assert;
import Utility.DataReader;
import Utility.JsonDataReader;
import Utility.UserInput;
import Qapractice.CucumberAdvance.Calculator;
import Qapractice.CucumberAdvance.calTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
public class StepDefinitions {
	Calculator cal;
	DataReader reader;
	private int total;
	int multiplication[];
	List <Integer> multi;
	
	@Given("^I have a calculator$")
	public void initailizeCalculator () {
		cal=new Calculator();try{
			//given common to both scenario
			DataReader.setExcelFile();
		}
		catch(Exception e) {}
	
	}
	@When("^I add (-?\\d+) and (-?\\d+)$")
	public void addNumber(int num1, int num2) throws Throwable {
		    /* here /d represent number + means one or more*/
		total=cal.add(num1, num2);
	  }
	@Then("^the result should be (-?\\d+)$")
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
			multiplication[i]=cal.multiplication(num1,num2);
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
		@When("^I multiply num1 and num2 using json$")
		public void getJsonNumbers()throws Throwable{
			JsonDataReader jsonReader=new JsonDataReader();
			UserInput input;
			ListIterator <UserInput> dataIterator=jsonReader.data.listIterator();
			multi=new ArrayList<Integer>();
			while(dataIterator.hasNext()){
				input=dataIterator.next();
				multi.add(cal.multiplication(input.num1,input.num2));
				
				}	
		}
		@Then("^the result should be multiplication given in json$")
		public void printJsonMultiplication() throws Throwable {
			JsonDataReader jsonReader=new JsonDataReader();
			UserInput input;
			int i=-1;
			ListIterator <UserInput> dataIterator=jsonReader.data.listIterator();
			ListIterator <Integer> multiIterator=multi.listIterator();
			while(dataIterator.hasNext()){
				input=dataIterator.next();
				i=multiIterator.next();
				Assert.assertEquals(i, input.multiplication);
				System.out.println(input.multiplication);
				}
		  }
}
