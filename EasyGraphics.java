import java.awt.*;
import javax.swing.JFrame;

public class EasyGraphics extends Canvas {
//set up for the canvas object
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new EasyGraphics();
        canvas.setSize(800, 600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    //circle in center of screen
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,800,600);
        g.setColor(Color.yellow);
        g.fillOval(350, 250, 100, 100);
        g.setColor(Color.WHITE);

        for (int i = 0; i < 600; i++){
            for (int j = 0; j <800; j++) {
                if (randomint(0,1)==1) {
                    drawpixel(j, i, g);
                }
            }
        }
    }
    public static int randomint(int a, int b){
        return (int)Math.floor(Math.random()*(b-a+1))+a;
    }
    public static void drawpixel(int x, int y, Graphics artist){
            artist.drawRect(x,y,0,0);
    }
}