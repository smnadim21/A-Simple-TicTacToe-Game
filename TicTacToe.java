import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame
{
		Container c;
		JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
		int check = 0;
		int blue_score = 0 , red_score = 0;  
		int gameOverCheck[] = new int[10];
		public JFrame jframe = new JFrame();
		private JLabel gLabel = new JLabel();
		private JLabel blueScore = new JLabel();
		private JLabel redScore = new JLabel();
		private JButton playAgain = new JButton("Play Again"); 
		private JButton exit = new JButton("Exit");
		private JPanel controlPanel = new JPanel(); 



		TicTacToe()
		{
			c=this.getContentPane();
			c.setLayout(null);

			///buttons of first row.............................

			btn1= new JButton();
			btn1.setBounds(0,0,116,120);
			add(btn1);
			btn1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					    ++check;
					    if(check%2==0)
                        {
                            btn1.setBackground(Color.red);
                            gameOverCheck[1] = 2;
                        }
                        else
                        {
                            btn1.setBackground(Color.blue);
                            gameOverCheck[1] = 1;
                        }
                        if(gameOver()) disableAll(); 
                        btn1.setEnabled(false);

					}
				});

			btn2= new JButton();
			btn2.setBounds(116,0,116,120);
			add(btn2);
			btn2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					    ++check;
                        if(check%2==0)
                        {
                            btn2.setBackground(Color.red);
                            gameOverCheck[2] = 2;
                        }
                        else
                        {
                            btn2.setBackground(Color.blue);
                            gameOverCheck[2] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn2.setEnabled(false);
					}
				});

			btn3= new JButton();
			btn3.setBounds(232,0,116,120);
			add(btn3);
			btn3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
                        ++check;
					    if(check%2==0)
                        {
                            btn3.setBackground(Color.red);
                            gameOverCheck[3] = 2;
                        }
                        else
                        {
                            btn3.setBackground(Color.blue);
                            gameOverCheck[3] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn3.setEnabled(false);
					}
				});


			/// Buttons of 2nd row..............................

			btn4= new JButton();
			btn4.setBounds(0,120,116,120);
			add(btn4);
			btn4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
                        ++check;
					    if(check%2==0){
                            btn4.setBackground(Color.red);
                            gameOverCheck[4] = 2;
					    }
                        else
                        {
                            btn4.setBackground(Color.blue);
                            gameOverCheck[4] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn4.setEnabled(false);
					}
				});

			btn5= new JButton();
			btn5.setBounds(116,120,116,120);
			add(btn5);
			btn5.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
                        ++check;
					    if(check%2==0)
                        {
                            btn5.setBackground(Color.red);
                            gameOverCheck[5] = 2;
                        }
                        else
                        {
                            btn5.setBackground(Color.blue);
                            gameOverCheck[5] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn5.setEnabled(false);
					}
				});

			btn6= new JButton();
			btn6.setBounds(232,120,116,120);
			add(btn6);
			btn6.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{

                        ++check;
					    if(check%2==0)
                        {
                            btn6.setBackground(Color.red);
                            gameOverCheck[6] = 2;
                        }
                        else
                        {
                            btn6.setBackground(Color.blue);
                            gameOverCheck[6] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn6.setEnabled(false);
					}
				});


			///  Buttons of 3rd row..................................

			btn7= new JButton();
			btn7.setBounds(0,240,116,120);
			add(btn7);
			btn7.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
                        ++check;
					    if(check%2==0)
                        {
                            btn7.setBackground(Color.red);
                            gameOverCheck[7] = 2;
                        }
                        else
                        {
                            btn7.setBackground(Color.blue);
                            gameOverCheck[7] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn7.setEnabled(false);
					}
				});


			btn8= new JButton();
			btn8.setBounds(116,240,116,120);
			add(btn8);
            btn8.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{

                        ++check;
					   if(check%2==0)
                        {
                            btn8.setBackground(Color.red);
                            gameOverCheck[8] = 2;
                        }
                        else
                        {
                            btn8.setBackground(Color.blue);
                            gameOverCheck[8] = 1;
                        }
                        if(gameOver()) disableAll();
                        btn8.setEnabled(false);
					}
				});


			btn9= new JButton();
			btn9.setBounds(232,240,116,120);
			add(btn9);
			btn9.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
                        ++check;
					    if(check%2==0)
                        {
                            btn9.setBackground(Color.red);
                            gameOverCheck[9] = 2;
                        }
                        else
                        {
                            btn9.setBackground(Color.blue);
                            gameOverCheck[9] = 1;
                        }
                        if(gameOver()) disableAll(); 
                        btn9.setEnabled(false);
					}
				});

		}

		boolean gameOver(){
		if(check>3 && check<10)
            {


            if((gameOverCheck[1]==1&&gameOverCheck[2]==1&&gameOverCheck[3]==1)||
               (gameOverCheck[4]==1&&gameOverCheck[5]==1&&gameOverCheck[6]==1)||
               (gameOverCheck[7]==1&&gameOverCheck[8]==1&&gameOverCheck[9]==1)||
               (gameOverCheck[1]==1&&gameOverCheck[4]==1&&gameOverCheck[7]==1)||
               (gameOverCheck[1]==1&&gameOverCheck[5]==1&&gameOverCheck[9]==1)||
               (gameOverCheck[3]==1&&gameOverCheck[5]==1&&gameOverCheck[7]==1)||
               (gameOverCheck[3]==1&&gameOverCheck[6]==1&&gameOverCheck[9]==1)||
               (gameOverCheck[2]==1&&gameOverCheck[5]==1&&gameOverCheck[8]==1))
            {
            	++blue_score;
            	dispose();
                gameOverShowBlue();
                System.out.println(" blue wins!! score: " + blue_score);

                return true;
            }
            else if((gameOverCheck[1]==2&&gameOverCheck[2]==2&&gameOverCheck[3]==2)||
               (gameOverCheck[4]==2&&gameOverCheck[5]==2&&gameOverCheck[6]==2)||
               (gameOverCheck[7]==2&&gameOverCheck[8]==2&&gameOverCheck[9]==2)||
               (gameOverCheck[1]==2&&gameOverCheck[4]==2&&gameOverCheck[7]==2)||
               (gameOverCheck[1]==2&&gameOverCheck[5]==2&&gameOverCheck[9]==2)||
               (gameOverCheck[3]==2&&gameOverCheck[5]==2&&gameOverCheck[7]==2)||
               (gameOverCheck[3]==2&&gameOverCheck[6]==2&&gameOverCheck[9]==2)||
               (gameOverCheck[2]==2&&gameOverCheck[5]==2&&gameOverCheck[8]==2))
            {
            	++red_score;
            	dispose();
         		gameOverShowRed();
                System.out.println(" red wins!! score: " + red_score);
                return true;
            }
		}

		if(check == 9)
        {

            System.out.println("Game Over!!");
            System.out.println("check = " + check);
            gameDrawn();
            return true;
        }
    	return false;
		}


		void disableAll(){
	btn1.setEnabled(false);
	btn2.setEnabled(false);
	btn3.setEnabled(false);
	btn4.setEnabled(false);
	btn5.setEnabled(false);
	btn6.setEnabled(false);
	btn7.setEnabled(false);
	btn8.setEnabled(false);
	btn9.setEnabled(false);


		}

		void gameOverShowBlue(){
		gLabel.setText("BLUE Player Wins!!!");
		blueScore.setText("Blue: " + blue_score);
		redScore.setText("Red: " + red_score);		
		gameOverShow();

		}	

		void gameOverShowRed(){
		gLabel.setText("RED Player Wins!!!");
		blueScore.setText("Blue: " + blue_score);
		redScore.setText("Red: " + red_score);
		gameOverShow();


		}	

		void gameDrawn(){
	gLabel.setText("Game Drawn !!");
	gameOverShow();
		}

	void gameOverShow(){

		Container c;
		c = jframe.getContentPane();
		c.setLayout(null);
	   	jframe.setSize(400,400);
       	//jframe.setLayout(new FlowLayout());
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		jframe.setBounds(100,100,354,388);

		gLabel.setBounds(150,10,200,50);
		blueScore.setBounds(0,0,200,25);
		redScore.setBounds(300,0,200,25);
		jframe.add(gLabel);
		jframe.add(blueScore);
		jframe.add(redScore);
		jframe.add(controlPanel);

		playAgain.setSize(100,50);
     	playAgain.setBounds(150,50,100,25);
     	playAgain.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //statusLabel.setText("A Frame shown to the user.");
            //mainFrame.setVisible(false);

         	
            jframe.dispose();
            layoutReset();

         }
      });


     	//exit.setSize(100,50);
     	exit.setBounds(150,150,100,25);

     	exit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //statusLabel.setText("A Frame shown to the user.");
            //mainFrame.setVisible(false);
            System.exit(0);
           

         }
      });
     	jframe.add(playAgain);
     	jframe.add(exit);
        jframe.setVisible(true);
	}	

 
	void layoutReset(){

 	check = 0;
   	btn1.setEnabled(true);
	btn2.setEnabled(true);
	btn3.setEnabled(true);
	btn4.setEnabled(true);
	btn5.setEnabled(true);
	btn6.setEnabled(true);
	btn7.setEnabled(true);
	btn8.setEnabled(true);
	btn9.setEnabled(true);
	for(int i = 0  ; i <= 9 ; i++) gameOverCheck[i] = 0 ;

	btn1.setBackground(Color.white);
	btn2.setBackground(Color.white);
	btn3.setBackground(Color.white);
	btn4.setBackground(Color.white);
	btn5.setBackground(Color.white);
	btn6.setBackground(Color.white);
	btn7.setBackground(Color.white);
	btn8.setBackground(Color.white);
	btn9.setBackground(Color.white);
	setVisible(true);

 	}


}



// class TicTacToeDemo
// {
// 	public static void main(String args[])
// 	{
// 		TicTacToe tic = new TicTacToe();
// 		tic.setTitle("TicTacToe");

// 		ImageIcon icon = new ImageIcon("th.jpg");
// 		tic.setIconImage(icon.getImage());
// 		tic.setVisible(true);
// 		tic.setDefaultCloseOperation(tic.EXIT_ON_CLOSE);
// 		tic.setResizable(false);
// 		tic.setBounds(100,100,354,388);
// 	}
// }
