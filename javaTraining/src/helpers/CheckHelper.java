package helpers;

public class CheckHelper {

	public String generarCheck(String name, String[] valores) {
		String check="";
		for (int i = 0; i < valores.length; i++) {
			check+="<label for=\""+valores[i]+"\">"+valores[i]+"</label>";
			check+="<input type=\"checkbox\" id=\""+valores[i]+"\" name=\""+name+"[]\" value=\""+valores[i]+"\">";
			
		}
		
		return check;
	}
	
	
}
