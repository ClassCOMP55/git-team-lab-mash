import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
//hello 1
//????????
//hello 2
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		final String filename = "robot.png";
		final GImage robot  = new GImage(filename, 200, 100);
		add(robot);
		GLabel label = new GLabel("How Pham Quoc Anh feel when uswiubdquidqdqwdq", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}