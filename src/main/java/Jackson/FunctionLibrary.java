package Jackson;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class FunctionLibrary {

	public static String parseJSONArrayKeyValue(String jsonString,String ArrayName,String key) throws Exception {

		if (jsonString.contains(ArrayName) && jsonString.contains(key)) {

			JsonFactory factory=new JsonFactory();
			// configure to allow comments
			factory.enable(JsonParser.Feature.ALLOW_COMMENTS);
			JsonParser jParser=factory.createParser(jsonString);
			while (jParser.nextToken() != JsonToken.VALUE_NULL) 
			{
				String fieldname = jParser.getCurrentName();
				//System.out.println("In while1:"+fieldname);
				if (ArrayName.equals(fieldname)) {

					// current token is "fieldname",
					// move to next, which is "fieldname"'s value
					jParser.nextToken();

					while (jParser.nextToken() != JsonToken.END_ARRAY) {

						//jParser.nextToken();

						String fieldnamearr = jParser.getCurrentName();
						//System.out.println("Before while2:"+fieldnamearr);
						if (key.equals(fieldnamearr)) {

							// current token is "fieldname",
							// move to next, which is "fieldname"'s value
							jParser.nextToken();
							System.out.println("Returning "+jParser.getText());
							return jParser.getText();

						} 

					}

				}
			}

			jParser.close();

			return null;
		}
		else 
		{
			return null;
		}

	}
}
