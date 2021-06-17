package API.API;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteArrayJSONExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// First Employee
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstName", "Lokesh");
		employeeDetails.put("lastName", "Gupta");
		employeeDetails.put("website", "howtodoinjava.com");

//Array
		Map m1 = new LinkedHashMap<String, String>();
		m1.put("type", "home");
		m1.put("number", "212 555-1234");

		Map m2 = new LinkedHashMap<String, String>();
		m2.put("type", "fax");
		m2.put("number", "646 555-4567");

		JSONArray ja = new JSONArray();
		ja.add(m1);
		ja.add(m2);

		employeeDetails.put("phoneNumbers", ja);

		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeDetails);
		
		  
		
		
		//--------Second Employee-----//
		
		JSONObject employeeDetails2 = new JSONObject();
		  employeeDetails2.put("firstName", "Brian"); 
		  employeeDetails2.put("lastName", "Schultz"); 
		  employeeDetails2.put("website", "example.com");
		  
		  JSONObject employeeObject2 = new JSONObject();
		  employeeObject2.put("employee", employeeDetails2);
		 

		// Add employees to list
		JSONArray employeeList = new JSONArray();
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);

		// Write JSON file
		try (FileWriter file = new FileWriter("E:\\Rahul\\Interview Prep\\API JSON\\Simpleemployees.json")) {

			file.write(employeeList.toJSONString());
			System.out.println("employeeList.toJSONString()--->" + employeeList.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}