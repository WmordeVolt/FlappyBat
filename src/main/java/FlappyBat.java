
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBat {

private JFrame window;
private Timer timer;

private FlappyBat(){
	
	// Jframe okno
    window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(GamePanel.WIDTH,GamePanel.HIGHT);
    window.setTitle("Flappy Bat");
    window.setLocationRelativeTo(null);
    window.setResizable(true);
   
}
	private void rendering() {
		MenuPanel mp =  new MenuPanel();
		final GamePanel gp = new GamePanel();
		
		timer = new Timer(18, new ActionListener() {  // odswiezanie co 18 milisekund
			
			
			public void actionPerformed(ActionEvent e) {
				gp.repaint();
				gp.Move();
			}
		});
				
		window.add(mp);
		window.setVisible(true);
		
		
		// w¹tek opóznienia startu  5 miliksekund 
		while(mp.StartingPoint == false) {
			try {
				Thread.sleep(5);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		window.remove(mp);
		window.add(gp);
		gp.setVisible(true);
		window.revalidate();
		
		timer.start();
	}

    public static void main(String[] args) {

    FlappyBat fb = new FlappyBat();
    fb.rendering();
    

    }
}
