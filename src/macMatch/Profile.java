package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Profile 
{
    
	//variables	
	private JFrame ProfileWindow;
	private JPanel TopPanel, MiddlePanel, MLPanel, MMPanel, MRPanel, BottomPanel, BLPanel, BRPanel, BackgroundPanel;
	private JLabel bannerImg, PicLabel, NameLabel, AgeLabel, DOBLabel, InterestsLabel, AddressLabel, FBLabel, TLabel, NameALabel, AgeALabel, DOBALabel, InterestsALabel, AddressALabel, FBALabel, TALabel;
	
	//constructor
	public Profile()
	{
		
		ProfileWindow = new JFrame();
		BackgroundPanel = new JPanel();
		BackgroundPanel.setBackground(Color.WHITE);
		BackgroundPanel.setLayout(new BoxLayout(BackgroundPanel, BoxLayout.Y_AXIS));
		BackgroundPanel.setMaximumSize(new Dimension(500,625));
		BackgroundPanel.setMinimumSize(new Dimension(500,625));
		BackgroundPanel.setPreferredSize(new Dimension(500,625));
		ProfileWindow.add(BackgroundPanel);
		
		TopPanel = new JPanel();
		TopPanel.setBackground(Color.WHITE);
		TopPanel.setLayout(new BoxLayout(TopPanel, BoxLayout.X_AXIS));
		ImageIcon banner = new ImageIcon("images/bannerProfile.png");
		bannerImg = new JLabel(banner);
		bannerImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new Home();
				getProfileWindow().setVisible(false);
			}
		});
		TopPanel.add(bannerImg, BorderLayout.NORTH);
		BackgroundPanel.add(TopPanel);
		
		MiddlePanel = new JPanel();
		MiddlePanel.setBackground(Color.WHITE);
		MiddlePanel.setLayout(new BoxLayout(MiddlePanel, BoxLayout.X_AXIS));
		MiddlePanel.setMaximumSize(new Dimension(500,200));
		MiddlePanel.setMinimumSize(new Dimension(500,200));
		MiddlePanel.setPreferredSize(new Dimension(500,200));
		BackgroundPanel.add(MiddlePanel);
		
		MLPanel = new JPanel();
		MLPanel.setBackground(Color.WHITE);
		MLPanel.setLayout(new BoxLayout(MLPanel, BoxLayout.Y_AXIS));
		MLPanel.setMaximumSize(new Dimension(150,200));
		MLPanel.setMinimumSize(new Dimension(150,200));
		MLPanel.setPreferredSize(new Dimension(150,200));
		MiddlePanel.add(MLPanel);
		
		MMPanel = new JPanel();
		MMPanel.setBackground(Color.WHITE);
		MMPanel.setLayout(new BoxLayout(MMPanel, BoxLayout.Y_AXIS));
		MMPanel.setMaximumSize(new Dimension(200,200));
		MMPanel.setMinimumSize(new Dimension(200,200));
		MMPanel.setPreferredSize(new Dimension(200,200));
		MiddlePanel.add(MMPanel);
		
		ImageIcon Profile = new ImageIcon("images/Profile Pic.png");
		PicLabel = new JLabel(Profile);
		MMPanel.add(PicLabel);
		
		MRPanel = new JPanel();
		MRPanel.setBackground(Color.WHITE);
		MRPanel.setLayout(new BoxLayout(MRPanel, BoxLayout.Y_AXIS));
		MRPanel.setMaximumSize(new Dimension(150,200));
		MRPanel.setMinimumSize(new Dimension(150,200));
		MRPanel.setPreferredSize(new Dimension(150,200));
		MiddlePanel.add(MRPanel);
		
		BottomPanel = new JPanel();
		BottomPanel.setBackground(Color.WHITE);
		BottomPanel.setLayout(new BoxLayout(BottomPanel, BoxLayout.X_AXIS));
		BottomPanel.setMaximumSize(new Dimension(500,250));
		BottomPanel.setMinimumSize(new Dimension(500,250));
		BottomPanel.setPreferredSize(new Dimension(500,250));
		BackgroundPanel.add(BottomPanel);
		
		BLPanel = new JPanel();
		BLPanel.setBackground(Color.WHITE);
		BLPanel.setLayout(new BoxLayout(BLPanel, BoxLayout.X_AXIS));
		BLPanel.setMaximumSize(new Dimension(250,250));
		BLPanel.setMinimumSize(new Dimension(250,250));
		BLPanel.setPreferredSize(new Dimension(250,250));
		BottomPanel.add(BLPanel);
		
		NameLabel = new JLabel("Name: ");
		NameLabel.setForeground(Color.BLACK);
		NameLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		NameLabel.setLayout(new BorderLayout());
		
		AgeLabel = new JLabel("Age: ");
		AgeLabel.setForeground(Color.BLACK);
		AgeLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		AgeLabel.setLayout(new BorderLayout());
		
		DOBLabel = new JLabel("Date of Birth: ");
		DOBLabel.setForeground(Color.BLACK);
		DOBLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		DOBLabel.setLayout(new BorderLayout());
		
		InterestsLabel = new JLabel("Interests: ");
		InterestsLabel.setForeground(Color.BLACK);
		InterestsLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		InterestsLabel.setLayout(new BorderLayout());
		
		AddressLabel = new JLabel("Address: ");
		AddressLabel.setForeground(Color.BLACK);
		AddressLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		AddressLabel.setLayout(new BorderLayout());
		
		FBLabel = new JLabel("Facebook Account: ");
		FBLabel.setForeground(Color.BLACK);
		FBLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		FBLabel.setLayout(new BorderLayout());
		
		TLabel = new JLabel("Twitter Account: ");
		TLabel.setForeground(Color.BLACK);
		TLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		TLabel.setLayout(new BorderLayout());
		
		BLPanel.setLayout(new GridLayout(0,1));
		BLPanel.add(NameLabel, BorderLayout.EAST);
		BLPanel.add(AgeLabel, BorderLayout.EAST);
		BLPanel.add(DOBLabel, BorderLayout.EAST);
		BLPanel.add(InterestsLabel, BorderLayout.EAST);
		BLPanel.add(AddressLabel, BorderLayout.EAST);
		BLPanel.add(FBLabel, BorderLayout.EAST);
		BLPanel.add(TLabel, BorderLayout.EAST);
		
		BRPanel = new JPanel();
		BRPanel.setBackground(Color.WHITE);
		BRPanel.setLayout(new BoxLayout(BRPanel, BoxLayout.Y_AXIS));
		BRPanel.setMaximumSize(new Dimension(250,250));
		BRPanel.setMinimumSize(new Dimension(250,250));
		BRPanel.setPreferredSize(new Dimension(250,250));
		BottomPanel.add(BRPanel);
		
		NameALabel = new JLabel("Susan");
		NameALabel.setForeground(Color.BLACK);
		NameALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		AgeALabel = new JLabel("28");
		AgeALabel.setForeground(Color.BLACK);
		AgeALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		DOBALabel = new JLabel("28/10/87");
		DOBALabel.setForeground(Color.BLACK);
		DOBALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		InterestsALabel = new JLabel("Cycling");
		InterestsALabel.setForeground(Color.BLACK);
		InterestsALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		AddressALabel = new JLabel("34 Main Street");
		AddressALabel.setForeground(Color.BLACK);
		AddressALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		FBALabel = new JLabel("Testing1234");
		FBALabel.setForeground(Color.BLACK);
		FBALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		TALabel = new JLabel("Testing1234");
		TALabel.setForeground(Color.BLACK);
		TALabel.setFont(new Font("Arial", Font.PLAIN, 22));
		
		BRPanel.setLayout(new GridLayout(0,1));
		BRPanel.add(NameALabel);
		BRPanel.add(AgeALabel);
		BRPanel.add(DOBALabel);
		BRPanel.add(InterestsALabel);
		BRPanel.add(AddressALabel);
		BRPanel.add(FBALabel);
		BRPanel.add(TALabel);
		
		ProfileWindow.setTitle("MacMate Profile");
		ProfileWindow.setSize(500,625);
		ProfileWindow.setResizable(false);
		ProfileWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ProfileWindow.setVisible(true);
		ProfileWindow.pack();
		
	}
	//getter
	public JFrame getProfileWindow() {
		return ProfileWindow;
	}
	//setter
	public void setProfileWindow(JFrame profileWindow) {
		ProfileWindow = profileWindow;
	}

}

