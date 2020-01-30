package helpers;

public class RadioHelper {

	public String generarRadio(String name, String[] valores) {
		String radio="";
		for (int i = 0; i < valores.length; i++) {
			radio+="<label for=\""+valores[i]+"\">"+valores[i]+"</label>";
			radio+="<input type=\"radio\" id=\""+valores[i]+"\" name=\""+name+"\" value=\""+valores[i]+"\">";
			
		}
		
		return radio;
	}
	
	
}
