package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class About {
	
	  //variables	
		private JFrame about;
		private JPanel aboutPanel, top, btm, btmLeft, btmRight;
		private JLabel bannerImg, mapImg;
		private JTextArea aboutLbl;
		
		//constructor
		public About(){
			//create top panel
			top = new JPanel();
			top.setBackground(Color.WHITE);
			top.setLayout(new BorderLayout());
			ImageIcon banner = new ImageIcon("images/bannerABOUTUS.png");
			bannerImg = new JLabel(banner);
			bannerImg.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					new Home();
					getAbout().setVisible(false);
				}
			});
			top.add(bannerImg, BorderLayout.NORTH);
			
			//create btm panel
			//btm left
			btmLeft = new JPanel();
			btmLeft.setBackground(Color.WHITE);
			aboutLbl = new JTextArea("At Macmillan, we know how \na cancer diagnosis can "
					+ "\naffect everything. So we’re \nhere to support you and help you \ntake "
					+ "back some control in your life. \nFrom help with money worries and "
					+ "\nadvice about work, to someone who’ll \nlisten if you just want to talk, "
					+ "\nwe’re here. Need to talk? \nCall us free 0808 808 00 00 "
					+ "\nMonday to Friday, 9am-8pm");
			aboutLbl.setSize(50,300);
			btmLeft.add(aboutLbl);
			//btm right
			btmRight = new JPanel();
			btmRight.setBackground(Color.WHITE);
			ImageIcon map = new ImageIcon("images/Map.png");
			mapImg = new JLabel(map);
			btmRight.add(mapImg);
			//btm
			btm = new JPanel();
			btm.setBackground(Color.WHITE);
			btm.setLayout(new GridLayout(1,2));
			//add to btm
			btm.add(btmLeft);
			btm.add(btmRight);
			//add to about panel
			aboutPanel = new JPanel();
			aboutPanel.setBackground(Color.WHITE);
			aboutPanel.setLayout(new GridLayout(2,1));
			aboutPanel.add(top);
			aboutPanel.add(btm);
			
			//create Frame
			about = new JFrame();
			about.setTitle("About Us");
			about.setSize(500, 500);
			about.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			about.setVisible(true);
			//add panels to frame
			about.add(aboutPanel);
		}
		//getter
		public JFrame getAbout() {
			return about;
		}
		//setter
		public void setAbout(JFrame about) {
			this.about = about;
		}

}
