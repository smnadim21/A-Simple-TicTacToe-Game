import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{
	private JFrame mainFrame;
   	private JLabel headerLabel;
   	private JLabel statusLabel;
   	private JPanel controlPanel;
   	private JLabel msglabel;
   	private JButton play,exit;


    public Main(){
      prepareGUI();
   }

    public static void main(String[] args){
     	Main swingContainerDemo = new  Main();  
    	swingContainerDemo.showJFrameDemo();
   }

  	private void prepareGUI(){
      mainFrame = new JFrame("Tic Tac Toe Game");
      mainFrame.setSize(400,400);
     	// mainFrame.setBounds(0,0, 400, 400);
    	//mainFrame.setLayout(null);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });

      	headerLabel = new JLabel("", JLabel.CENTER);        
      	statusLabel = new JLabel("",JLabel.CENTER);    
      	statusLabel.setSize(350,100);
      	msglabel = new JLabel("Welcome to TutorialsPoint SWING Tutorial.", JLabel.CENTER);

      	controlPanel = new JPanel();
      	
      	//controlPanel.setLayout(new FlowLayout());
      	//controlPanel.setSize(400,400);
     	
     	 play = new JButton("Play Game");
     	 play.setSize(100,50);
     	 play.setBounds(150,50,100,50);
     	 mainFrame.add(play);

     	 exit = new JButton("Exit Game");
     	 exit.setSize(100,50);
     	 exit.setBounds(150,125,100,50);
     	 mainFrame.add(exit);


     	mainFrame.add(headerLabel);
      	mainFrame.add(controlPanel);
      	mainFrame.add(statusLabel);
      	mainFrame.setVisible(true);

   }


      private void showJFrameDemo(){
      //headerLabel.setText("Container in action: JFrame");   
      //final JFrame frame = new JFrame();
      TicTacToe frame = new TicTacToe();	
      frame.setSize(400, 400);
      //frame.setLayout(new FlowLayout());
      frame.setResizable(false);       
      //frame.add(msglabel);
      frame.setBounds(100,100,354,388);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
            mainFrame.setVisible(true);
         }        
      });    
      	// JButton okButton = new JButton();
      	// okButton.setSize(200,100);
      	// okButton.setBounds(0,0,100,100);
      	// controlPanel.add(okButton);
      	play.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //statusLabel.setText("A Frame shown to the user.");
            //mainFrame.setVisible(false);
            mainFrame.dispose();
            frame.setVisible(true);

         }
      });

      	exit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //statusLabel.setText("A Frame shown to the user.");
            //mainFrame.setVisible(false);
            System.exit(0);
           

         }
      });

      
      mainFrame.setVisible(true);  
   }
}
