package helpers;

public class SelectHelper {

	public String generarSelect(String name, String[] valores) {
		String select="<select name=\""+name+"\">";
		for (int i = 0; i < valores.length; i++) {
			select+="<option value=\""+valores[i]+"\">"+valores[i]+"</option> ";
			
		}
		select+="</select>";
		return select;
	}
	
	
}
