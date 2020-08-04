import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ranking  {
	
	public static void ranking() {
	List <String> lista = new ArrayList<String>();
	{	
	String line;
	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader("src/main/resources/ranking.txt"));
		
		while((line = br.readLine()) != null) { 
			
		line.split(",");	
		lista.add(line);
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	String s = "";

	int i = 0;

	for(String str: lista) {
	
	s += str + "\n";

	i++;
	if (i == 10) {

	break;

	}
	
	System.out.println(s);

	}
	
	ImageIcon iconRanking = new ImageIcon ("src/main/resources/podium.jpg");
	int textRanking = JOptionPane.showOptionDialog(null ,"Top 10: " + "\n" + s, "Top 10", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, iconRanking, null, null);
	

	}
	}
	

	
}  
	
			


	

