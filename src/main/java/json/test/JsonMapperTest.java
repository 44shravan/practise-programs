package json.test;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class JsonMapperTest {
public static void main(String[] args) throws IOException {
	ObjectMapper om = new ObjectMapper();
	StudentPojo sp = new StudentPojo();
	sp.setName("msk");
	sp.setNumber(21);
	String jsnStr = om.writeValueAsString(sp);
	System.out.println(jsnStr);
	
	StudentPojo s = om.readValue(jsnStr,StudentPojo.class);
	/*String filePath = "src/test/resources/protocols/jackson_user.json";
	File file = new File(filePath);
	ObjectMapper mapper = new ObjectMapper();
	mapper.writeValue(file, sp);*/
	//JSONPObject js = new JSONPObject(jsnStr, jsnStr);
	JSONObject jo = new JSONObject(jsnStr);
	jo.getString(jsnStr);
}
}
