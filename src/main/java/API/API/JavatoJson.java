package API.API;

import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.journaldev.json.model.Employee;

/**
 * Hello world!
 *
 */
public class JavatoJson 
{
    public static void main( String[] args )
    {
    	Employee employee = new Employee();
    	employee.setId(1);
    	employee.setFirstName("Arindam");
    	employee.setLastName("Ghosh");
    	employee.setRoles(Arrays.asList("FINANCE", "MANAGER"));

    	//Gson gson = new Gson();
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	System.out.println(gson.toJson(employee));
    	//Git demo
    	//On develop branch
    }
}
