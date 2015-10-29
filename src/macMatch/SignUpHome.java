package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SignUpHome {
	
    //variables	
	private JFrame suhome;
	private JPanel suhomePanel, top, north, mid, btm, midLeft, midRight, btmLeft, btmRight;
	private JLabel bannerImg, patientImg, lovedOneImg, medicalImg, fundImg;
	private JButton patientBtn, lovedOneBtn, medicalBtn, fundBtn;
	
	//constructor
	public SignUpHome(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerSIGNUP.png");
		bannerImg = new JLabel(banner);
		bannerImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new Home();
				getSignUpHome().setVisible(false);
			}
		});
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create middle panels
		//mid left
		midLeft = new JPanel();
		midLeft.setBackground(Color.WHITE);
		midLeft.setLayout(new BorderLayout());
		ImageIcon patient = new ImageIcon("images/patient.png");
		patientImg = new JLabel(patient);
		patientImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new SignUp();
				getSignUpHome().setVisible(false);
			}
		});
		patientBtn = new JButton("Patient");
		patientBtn.setBackground(Color.WHITE);
		patientBtn.setForeground(Color.BLACK);
		patientBtn.setFont(new Font("Courier", Font.BOLD, 22));
		patientBtn.setBorder(null);
		patientBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new SignUp();
				getSignUpHome().setVisible(false);
			}
		});
		//add to panel
		midLeft.add(patientImg, BorderLayout.NORTH);
		midLeft.add(patientBtn, BorderLayout.SOUTH);
		//north right
		midRight = new JPanel();
		midRight.setBackground(Color.WHITE);
		midRight.setLayout(new BorderLayout());
		ImageIcon lovedOne = new ImageIcon("images/lovedOne.png");
		lovedOneImg = new JLabel(lovedOne);
		lovedOneImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new SignUpLovedOne();
				getSignUpHome().setVisible(false);
			}
		});
		lovedOneBtn = new JButton("Loved One");
		lovedOneBtn.setBackground(Color.WHITE);
		lovedOneBtn.setForeground(Color.BLACK);
		lovedOneBtn.setFont(new Font("Courier", Font.BOLD, 22));
		lovedOneBtn.setBorder(null);
		lovedOneBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new SignUpLovedOne();
				getSignUpHome().setVisible(false);
			}
		});
		//add to panel
		midRight.add(lovedOneImg, BorderLayout.NORTH);
		midRight.add(lovedOneBtn, BorderLayout.SOUTH);
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
		ImageIcon fundraiser = new ImageIcon("images/fundraiser.png");
		fundImg = new JLabel(fundraiser);
		fundImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new SignUpFundraiser();
				getSignUpHome().setVisible(false);
			}
		});
		fundBtn = new JButton("Fundraiser");
		fundBtn.setBackground(Color.WHITE);
		fundBtn.setForeground(Color.BLACK);
		fundBtn.setFont(new Font("Courier", Font.BOLD, 22));
		fundBtn.setBorder(null);
		fundBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new About();
				getSignUpHome().setVisible(false);
			}
		});
		//add to panel
		btmLeft.add(fundImg, BorderLayout.NORTH);
		btmLeft.add(fundBtn, BorderLayout.SOUTH);
		//north right
		btmRight = new JPanel();
		btmRight.setBackground(Color.WHITE);
		btmRight.setLayout(new BorderLayout());
		ImageIcon event = new ImageIcon("images/medical.png");
		medicalImg = new JLabel(event);
		medicalImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new SignUpMedical();
				getSignUpHome().setVisible(false);
			}
		});
		medicalBtn = new JButton("Medical Professional");
		medicalBtn.setBackground(Color.WHITE);
		medicalBtn.setForeground(Color.BLACK);
		medicalBtn.setFont(new Font("Courier", Font.BOLD, 22));
		medicalBtn.setBorder(null);
		medicalBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new SignUpMedical();
				getSignUpHome().setVisible(false);
			}
		});
		//add to panel
		btmRight.add(medicalImg, BorderLayout.NORTH);
		btmRight.add(medicalBtn, BorderLayout.SOUTH);
		//btm
		btm = new JPanel();
		btm.setLayout(new GridLayout(1,2));
		btm.setBackground(Color.WHITE);
		//add panels to btm
		btm.add(btmLeft);
		btm.add(btmRight);
		
		//create home panel
		suhomePanel = new JPanel();
		suhomePanel.setLayout(new GridLayout(4,1));
		suhomePanel.setBackground(Color.WHITE);
		//add panels to index panel
		suhomePanel.add(top);
		suhomePanel.add(mid);
		suhomePanel.add(btm);
		
		//create Frame
		suhome = new JFrame();
		suhome.setTitle("Home");
		suhome.setSize(500, 650);
		suhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		suhome.setVisible(true);
		//add panels to frame
		suhome.add(suhomePanel);
	}
	//getters
	public JFrame getSignUpHome() {
		return suhome;
	}
	//setters
	public void setSignUpHome(JFrame suhome) {
		this.suhome = suhome;
	}

}
