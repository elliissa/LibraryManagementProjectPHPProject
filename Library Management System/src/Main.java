/*******************************************************************************
*/

//import the packages for using the classes in them into the program

import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.JDialog;



public class Main implements Runnable {
    
    
	final Frame frame;

	public Main(Frame frame) {
		this.frame = frame;
	}

	public void run() {
		frame.show();
	}

	public static void main(String[] args) {
            LoginFormDemo Demo= new LoginFormDemo();
            CreateLoginForm form = new CreateLoginForm();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true); 
         //  Login a = new Login();
       // a.setVisible(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		// Throw a nice little title page up on the screen first
		new Splash().showSplash(3000);
		EventQueue.invokeLater(new Main(new JLibrary()));
	}
}