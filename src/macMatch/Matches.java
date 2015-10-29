package macMatch;



	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

	public class Matches {
	    //variables	
		private JFrame matchesFrame;
		private JPanel matchesPanel, top, north, mid, btm, northLeft, northRight, midLeft, midRight, btmLeft, btmRight;
		private JLabel bannerImg, profileImg, newsImg, matchesImg, chatImg, aboutImg, eventImg;
		private JButton profileBtn, newsBtn, matchesBtn, chatBtn, aboutBtn, eventBtn;
		
		//constructor
		public Matches(){
			//create top panel
			top = new JPanel();
			top.setBackground(Color.WHITE);
			top.setLayout(new BorderLayout());
			ImageIcon banner = new ImageIcon("images/bannerMATCHES.png");
			bannerImg = new JLabel(banner);
			bannerImg.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					new Home();
					getMatchesFrame().setVisible(false);
				}
			});
			top.add(bannerImg, BorderLayout.NORTH);
			
			//create north panels
			//north left
			northLeft = new JPanel();
			northLeft.setBackground(Color.WHITE);
			northLeft.setLayout(new BorderLayout());
			ImageIcon profile = new ImageIcon("images/user.png");
			profileImg = new JLabel(profile);
			profileBtn = new JButton("Zoey Clarke");
			profileBtn.setBackground(Color.WHITE);
			profileBtn.setForeground(Color.BLACK);
			profileBtn.setFont(new Font("Courier", Font.BOLD, 22));
			profileBtn.setBorder(null);
			//add to panel
			northLeft.add(profileImg, BorderLayout.NORTH);
			northLeft.add(profileBtn, BorderLayout.SOUTH);
			//north right
			northRight = new JPanel();
			northRight.setBackground(Color.WHITE);
			northRight.setLayout(new BorderLayout());
			ImageIcon news = new ImageIcon("images/user.png");
			newsImg = new JLabel(news);
			newsBtn = new JButton("Jack Grey");
			newsBtn.setBackground(Color.WHITE);
			newsBtn.setForeground(Color.BLACK);
			newsBtn.setFont(new Font("Courier", Font.BOLD, 22));
			newsBtn.setBorder(null);
			//add to panel
			northRight.add(newsImg, BorderLayout.NORTH);
			northRight.add(newsBtn, BorderLayout.SOUTH);
			//north
			north = new JPanel();
			north.setLayout(new GridLayout(1,2));
			north.setBackground(Color.WHITE);
			//add panels to north
			north.add(northLeft);
			north.add(northRight);
			
			//create middle panels
			//mid left
			midLeft = new JPanel();
			midLeft.setBackground(Color.WHITE);
			midLeft.setLayout(new BorderLayout());
			ImageIcon matches = new ImageIcon("images/user.png");
			matchesImg = new JLabel(matches);
			matchesBtn = new JButton("Lucy Alex");
			matchesBtn.setBackground(Color.WHITE);
			matchesBtn.setForeground(Color.BLACK);
			matchesBtn.setFont(new Font("Courier", Font.BOLD, 22));
			matchesBtn.setBorder(null);
			//add to panel
			midLeft.add(matchesImg, BorderLayout.NORTH);
			midLeft.add(matchesBtn, BorderLayout.SOUTH);
			//north right
			midRight = new JPanel();
			midRight.setBackground(Color.WHITE);
			midRight.setLayout(new BorderLayout());
			ImageIcon chat = new ImageIcon("images/user.png");
			chatImg = new JLabel(chat);
			chatBtn = new JButton("Rachael McGeehan");
			chatBtn.setBackground(Color.WHITE);
			chatBtn.setForeground(Color.BLACK);
			chatBtn.setFont(new Font("Courier", Font.BOLD, 22));
			chatBtn.setBorder(null);
			//add to panel
			midRight.add(chatImg, BorderLayout.NORTH);
			midRight.add(chatBtn, BorderLayout.SOUTH);
			//mid
			mid = new JPanel();
			mid.setLayout(new GridLayout(1,2));
			mid.setBackground(Color.WHITE);
			//add panels to mid
			mid.add(midLeft);
			mid.add(midRight);
			
			//create btm panels
			//btm left
			btmLeft = new JPanel();
			btmLeft.setBackground(Color.WHITE);
			btmLeft.setLayout(new BorderLayout());
			ImageIcon about = new ImageIcon("images/user.png");
			aboutImg = new JLabel(about);
			aboutBtn = new JButton("Harry Down");
			aboutBtn.setBackground(Color.WHITE);
			aboutBtn.setForeground(Color.BLACK);
			aboutBtn.setFont(new Font("Courier", Font.BOLD, 22));
			aboutBtn.setBorder(null);
			//add to panel
			btmLeft.add(aboutImg, BorderLayout.NORTH);
			btmLeft.add(aboutBtn, BorderLayout.SOUTH);
			//north right
			btmRight = new JPanel();
			btmRight.setBackground(Color.WHITE);
			btmRight.setLayout(new BorderLayout());
			ImageIcon event = new ImageIcon("images/user.png");
			eventImg = new JLabel(event);
			eventImg.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					new MemberProfile();
				}
			});
			eventBtn = new JButton("Ryan Smyth");
			eventBtn.setBackground(Color.WHITE);
			eventBtn.setForeground(Color.BLACK);
			eventBtn.setFont(new Font("Courier", Font.BOLD, 22));
			eventBtn.setBorder(null);
			//add to panel
			btmRight.add(eventImg, BorderLayout.NORTH);
			btmRight.add(eventBtn, BorderLayout.SOUTH);
			//btm
			btm = new JPanel();
			btm.setLayout(new GridLayout(1,2));
			btm.setBackground(Color.WHITE);
			//add panels to btm
			btm.add(btmLeft);
			btm.add(btmRight);
			
			//create home panel
			matchesPanel = new JPanel();
			matchesPanel.setLayout(new GridLayout(4,1));
			matchesPanel.setBackground(Color.WHITE);
			//add panels to index panel
			matchesPanel.add(top);
			matchesPanel.add(north);
			matchesPanel.add(mid);
			matchesPanel.add(btm);
			
			//create Frame
			matchesFrame = new JFrame();
			matchesFrame.setTitle("Index");
			matchesFrame.setSize(500, 650);
			matchesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			matchesFrame.setVisible(true);
			//add panels to frame
			matchesFrame.add(matchesPanel);
			
		}
		//getters
		public JFrame getMatchesFrame() {
			return matchesFrame;
		}
		//setters
		public void setMatchesFrame(JFrame matchesFrame) {
			this.matchesFrame = matchesFrame;
		}
}
