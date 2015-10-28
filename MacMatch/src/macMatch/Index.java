package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Index {
    //variables	
	private JFrame index;
	private JPanel indexPanel, top, mid, btm, midLeft, midMid, midRight, btmLeft, btmMid, btmRight;
	private JLabel bannerImg;
	private JButton login, signup;
	
	//constructor
	public Index(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerIndex.png");
		bannerImg = new JLabel(banner);
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create middle panels
		//midleft
		midLeft = new JPanel();
		midLeft.setBackground(Color.WHITE);
		//midMid
		midMid = new JPanel();
		midMid.setBackground(Color.WHITE);
		midMid.setLayout(new BorderLayout());
		signup = new JButton("Sign Up");
		signup.setBackground(Color.WHITE);
		signup.setForeground(Color.BLACK);
		signup.setFont(new Font("Courier", Font.BOLD, 22));
		signup.setBorder(null);
		//add btn to panel
		midMid.add(signup, BorderLayout.CENTER);
		//midRight
		midRight = new JPanel();
		midRight.setBackground(Color.WHITE);
		//mid
		mid = new JPanel();
		mid.setLayout(new GridLayout(1,3));
		mid.setBackground(Color.WHITE);
		//add panels to mid
		mid.add(midLeft);
		mid.add(midMid);
		mid.add(midRight);
		
		//create btm panels
		//btmLeft
		btmLeft = new JPanel();
		btmLeft.setBackground(Color.WHITE);
		//btmMid
		btmMid = new JPanel();
		btmMid.setBackground(Color.WHITE);
		btmMid.setLayout(new BorderLayout());
		login = new JButton("Log In");
		login.setBackground(Color.WHITE);
		login.setForeground(Color.BLACK);
		login.setFont(new Font("Courier", Font.BOLD, 22));
		login.setBorder(null);
		//add btn to panel
		btmMid.add(login, BorderLayout.CENTER);
		//btmRight
		btmRight = new JPanel();
		btmRight.setBackground(Color.WHITE);
		//btm
		btm = new JPanel();
		btm.setLayout(new GridLayout(1,3));
		btm.setBackground(Color.WHITE);
		//add panels to btm
		btm.add(btmLeft);
		btm.add(btmMid);
		btm.add(btmRight);
		
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
