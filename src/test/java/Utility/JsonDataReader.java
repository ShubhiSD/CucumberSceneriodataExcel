package Utility;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;
public class JsonDataReader {
	ConfigFileReader configReader=new ConfigFileReader();
	private final String customerFilePath = configReader.getTestDataResourcePath() + "DataSet.json";
	public List <UserInput> data;
	public JsonDataReader()
	{data=getNumberList();}
	public List <UserInput> getNumberList() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerFilePath));
			UserInput[] num=gson.fromJson(bufferReader,UserInput[].class);
			return  Arrays.asList(num);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}

}
