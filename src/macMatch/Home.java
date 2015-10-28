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

public class Home {
    //variables	
	private JFrame home;
	private JPanel homePanel, top, north, mid, btm, northLeft, northRight, midLeft, midRight, btmLeft, btmRight;
	private JLabel bannerImg, profileImg, newsImg, matchesImg, chatImg, aboutImg, eventImg;
	private JButton profileBtn, newsBtn, matchesBtn, chatBtn, aboutBtn, eventBtn;
	
	//constructor
	public Home(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerIndex.png");
		bannerImg = new JLabel(banner);
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create north panels
		//north left
		northLeft = new JPanel();
		northLeft.setBackground(Color.WHITE);
		northLeft.setLayout(new BorderLayout());
		ImageIcon profile = new ImageIcon("images/profile.png");
		profileImg = new JLabel(profile);
		profileBtn = new JButton("Profile");
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
		ImageIcon news = new ImageIcon("images/news.png");
		newsImg = new JLabel(news);
		newsBtn = new JButton("Newsfeed");
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
		ImageIcon matches = new ImageIcon("images/matches.png");
		matchesImg = new JLabel(matches);
		matchesBtn = new JButton("Matches");
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
		ImageIcon chat = new ImageIcon("images/chat.png");
		chatImg = new JLabel(chat);
		chatImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new ChatHome();
				getHome().setVisible(false);
			}
		});
		chatBtn = new JButton("Chat");
		chatBtn.setBackground(Color.WHITE);
		chatBtn.setForeground(Color.BLACK);
		chatBtn.setFont(new Font("Courier", Font.BOLD, 22));
		chatBtn.setBorder(null);
		chatBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new ChatHome();
				getHome().setVisible(false);
			}
		});
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
		ImageIcon about = new ImageIcon("images/about.png");
		aboutImg = new JLabel(about);
		aboutBtn = new JButton("About Us");
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
		ImageIcon event = new ImageIcon("images/event.png");
		eventImg = new JLabel(event);
		eventBtn = new JButton("Events");
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
		homePanel = new JPanel();
		homePanel.setLayout(new GridLayout(4,1));
		homePanel.setBackground(Color.WHITE);
		//add panels to index panel
		homePanel.add(top);
		homePanel.add(north);
		homePanel.add(mid);
		homePanel.add(btm);
		
		//create Frame
		home = new JFrame();
		home.setTitle("Index");
		home.setSize(500, 650);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setVisible(true);
		//add panels to frame
		home.add(homePanel);
		
	}
	//getters
	public JFrame getHome() {
		return home;
	}
	//setters
	public void setHome(JFrame home) {
		this.home = home;
	}
	
	

}
