package Jackson;


public class TestAPI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
//		  String res=
//			  {
//						"status": "success",
//						"data": {
//							"name": "RahulSun Apr 12 11:33:27 IST 2020",
//							"salary": "salarySun Apr 12 11:33:27 IST 2020",
//							"age": "ageSun Apr 12 11:33:27 IST 2020",
//							"id": 60
//						},
//						"data2": {
//							"String": {
//								"name": "RahulSun Apr 12 11:33:27 IST 2020"
//							},
//							"Integer": {
//								"salary": "salarySun Apr 12 11:33:27 IST 2020"
//							}
//
//						}
//					}
//		 
		
		String Response= "{\r\n" + 
				"	\"status\": \"success\",\r\n" + 
				"	\"data\": {\r\n" + 
				"		\"name\": \"RahulSun Apr 12 11:33:27 IST 2020\",\r\n" + 
				"		\"salary\": \"salarySun Apr 12 11:33:27 IST 2020\",\r\n" + 
				"		\"age\": \"ageSun Apr 12 11:33:27 IST 2020\",\r\n" + 
				"		\"id\": 60\r\n" + 
				"	},\r\n" + 
				"	\"data2\": {\r\n" + 
				"	\"String\": {\r\n" + 
				"		\"name\": \"RahulS salary\"\r\n" + 
				"	},\r\n" + 
				"	\"Integer\": {\r\n" + 
				"		\"salary\": \"10000\"\r\n" + 
				"	}\r\n" + 
				"	}\r\n" + 
				"}";
		String name = FunctionLibrary.parseJSONArrayKeyValue(Response,"data2", "name");
		System.out.println("name from parseJsonArrayKeyValue------------------>" +name );
		
		
	}}

