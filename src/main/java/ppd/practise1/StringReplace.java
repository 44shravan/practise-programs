package ppd.practise1;

import java.util.HashMap;
import java.util.Map;

public class StringReplace {
	
	
public static void main(String[] args) {
	
	String s = "https://mccwrgpp87w5rb8kxmklqjskqszm.rest.marketingcloudapis.com/messaging/v1/messageDefinitionSends/key:{{triggeredSendDefinitionId}}/send" ;
	
	String s1= s.replace("{{triggeredSendDefinitionId}}", "card_msg");
	
	System.out.println(s1);
	
	Map<Integer, String> responseMap = new HashMap<Integer, String>();
	
	int code=200;
	String m="suc";
	
	responseMap.put(code, m);
	
	System.out.println(responseMap.containsKey(200));
	
	if (true) {
		
	}else {
		
	}
	
}
}
