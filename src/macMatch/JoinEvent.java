package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JoinEvent {

	
	private JFrame joinEvent;
	private JPanel joinEventPanel, top, mid, btm;
	private JLabel bannerImg, dateImage, description;
	private JButton create, join;
	
	
	//constructor
	public JoinEvent(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerEVENTS.png");
		bannerImg = new JLabel(banner);
		bannerImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new Home();
				getJoinEvent().setVisible(false);
			}
		});
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create middle panels
		mid = new JPanel();
		
		ImageIcon dateImg = new ImageIcon("images/dates.png");
		dateImage = new JLabel(dateImg);
		mid.add(dateImage);
		
		//create index panel
		joinEventPanel = new JPanel();
		joinEventPanel.setLayout(new BorderLayout());
		
		//indexPanel.setLayout(new GridLayout(2,1));
		joinEventPanel.setBackground(Color.WHITE);
		//add panels to index panel
		joinEventPanel.add(top, BorderLayout.NORTH);
		joinEventPanel.add(mid, BorderLayout.CENTER);

		
		//create Frame
		joinEvent = new JFrame();
		joinEvent.setTitle("Index");
		joinEvent.setSize(500, 500);
		joinEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		joinEvent.setVisible(true);
		//add panels to frame
		joinEvent.add(joinEventPanel);
	
	}
	//getter
	public JFrame getJoinEvent() {
		return joinEvent;
	}
	//setter
	public void setJoinEvent(JFrame joinEvent) {
		this.joinEvent = joinEvent;
	}
	
}

	
	
	
	
	
	

