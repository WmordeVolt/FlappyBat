import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	public static final int WIDTH = 400;
	public static final int HIGHT = 600;
	public static boolean GameOver = false;
	
	private int baseCoords = 0;
	private BufferedImage img;
	
	Bat bi = new Bat();
	
	Pipes pd = new Pipes(GamePanel.WIDTH);
	Pipes pd2 = new Pipes(GamePanel.WIDTH+(GamePanel.WIDTH/2));
	
	
	
	public GamePanel() { 
		LoadImage();
		this.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			bi.Upmove();
		}
		});
		
	}

	private void LoadImage() { // za³adowanie t³a menu
		try {
			img = ImageIO.read(new File("src\\main\\resources\\tlo_gra.png"));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, baseCoords, 0, null);
		
		bi.drawBat(g);
		pd.drawPipes(g);
		pd2.drawPipes(g);
	}
	public void Move() {
		bi.batMove();
		pd.pipesMove();
		pd2.pipesMove();
		
		if(GameOver) {
			pd.X =GamePanel.WIDTH;
			pd2.X = GamePanel.WIDTH + (GamePanel.WIDTH/2);
			GameOver = false;
		}
	}
}
