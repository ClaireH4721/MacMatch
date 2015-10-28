package macMatch;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Login {
    //variables	
	private JFrame index;
	private JPanel indexPanel, top, mid, btm;
	private JLabel bannerImg, username, password;
	private JButton logon;
	private JTextArea username1, password1;
	
	//constructor
	public Login(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerLOGIN.png");
		bannerImg = new JLabel(banner);
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create middle panels
		//midleft
		mid = new JPanel();
		mid.setBackground(Color.WHITE);
		mid.setLayout(new GridLayout(2,2));
		JPanel topLeft = new JPanel();
		JPanel topRight = new JPanel();
		JPanel btmLeft = new JPanel();
		JPanel btmRight = new JPanel();
		
		username = new JLabel();
		username.setText("E-Mail Address");
		username.setFont(new Font("Courier", Font.BOLD, 16));
		topLeft.setLayout(new BorderLayout());
		topLeft.setBackground(Color.WHITE);
		topLeft.add(username, BorderLayout.CENTER);
		
		password = new JLabel();
		password.setText("Password");
		password.setFont(new Font("Courier", Font.BOLD, 16));
		btmLeft.setLayout(new BorderLayout());
		btmLeft.setBackground(Color.WHITE);
		btmLeft.add(password, BorderLayout.CENTER);
		
		
		
		JPanel panelA = new JPanel();
		panelA.setBackground(Color.WHITE);
		JPanel panelB = new JPanel();
		panelB.setBackground(Color.WHITE);
		JPanel panelC = new JPanel();
		panelC.setBackground(Color.WHITE);
		
		panelB.setLayout(new BorderLayout());
		username1 = new JTextArea();
		username1.setSize(new Dimension(5, 15));
		
		panelB.add(username1, BorderLayout.CENTER);
		topRight.setLayout(new GridLayout (3,1));
		topRight.add(panelA);
		topRight.add(panelB);
		topRight.add(panelC);
		
		
		JPanel panelD = new JPanel();
		panelD.setBackground(Color.WHITE);
		JPanel panelE = new JPanel();
		panelE.setBackground(Color.WHITE);
		JPanel panelF = new JPanel();
		panelF.setBackground(Color.WHITE);
		panelE.setLayout(new BorderLayout());
		password1 = new JTextArea();
		panelE.add(password1, BorderLayout.CENTER);
		btmRight.setLayout(new GridLayout(3,1));
		btmRight.add(panelD);
		btmRight.add(panelE);
		btmRight.add(panelF);
		
		mid.add(topLeft);
		mid.add(topRight);
		mid.add(btmLeft);
		mid.add(btmRight);
		
		//bottom panel 
		//this is where the log on button will go
		btm = new JPanel();
		btm.setBackground(Color.WHITE);
		logon = new JButton();
		logon.setText("Log in");
		logon.setFont(new Font("Courier", Font.BOLD, 16));
		logon.setPreferredSize(new Dimension(100,50));
		btm.add(logon);
		
		
		
		
		
		
		
		
		
		
		//create index panel
		indexPanel = new JPanel();
		indexPanel.setLayout(new GridLayout(3,1));
		indexPanel.setBackground(Color.WHITE);
		//add panels to index panel
		indexPanel.add(top);
		indexPanel.add(mid);
		indexPanel.add(btm);
		
		//create Frame
		index = new JFrame();
		index.setTitle("Index");
		index.setSize(500, 500);
		index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		index.setVisible(true);
		//add panels to frame
		index.add(indexPanel);
		
	}

}

	
	

