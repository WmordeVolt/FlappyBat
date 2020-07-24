import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ranking {
	
	public static void ranking() {
	List <String> lista = new ArrayList<String>();
	{	
	String line;
	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader("src/main/resources/ranking.txt"));
		
		while((line = br.readLine()) != null) {  
				
		lista.add(line);
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	

	Collections.sort(lista);
	
	Collections.reverse(lista);
	
	String s = "";
	for(String str: lista) {
		
		
	s += str + "\n";
		
	}
	
	ImageIcon iconRanking = new ImageIcon ("src/main/resources/podium.jpg");
	int textRanking = JOptionPane.showOptionDialog(null ,"Ranking: " + "\n" + s, "Ranking", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, iconRanking, null, null);
}
	
			
}

	
}
