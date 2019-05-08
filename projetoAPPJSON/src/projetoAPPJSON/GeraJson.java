package projetoAPPJSON;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;



public class GeraJson {
	public static void main(String[] args) {
		Cerveja skol = new Cerveja();
		skol.setAno(2019);
		skol.setMalte("Puro Malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice NBlue Red");
		
		Gson g= new Gson();
		String json = g.toJson(skol);
		
		System.out.println(json);
		
		try {
			FileWriter fw = new FileWriter("D://cerveja.json");
			
			fw.write(json);
			fw.close();
						
		}catch (Exception e){
						
		}

	}
}