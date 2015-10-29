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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class Events {

	private JFrame event, createEventFrame;
	private JPanel eventPanel, top, top2, mid, btm, createEventPanel, ce1, ce2, ce3, ce4, ce5, ce6,
	ce7,ce8, ce9, ce10;
	private JLabel bannerImg, createEvent, joinEvent, calendar, socialMedia, eventCreated, 
	eName, eName2, eVenue, eVenue2, eDate, eDate2, eTime, eTime2;
	private JButton create, join, share;
	
	
	//constructor
	public Events(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerEVENTS.png");
		bannerImg = new JLabel(banner);
		bannerImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new Home();
				getEvent().setVisible(false);
			}
		});
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create middle panels
		mid = new JPanel();
		mid.setLayout(new GridLayout(1,2));
		mid.setBackground(Color.WHITE);
		JPanel midLeft = new JPanel();
		midLeft.setBackground(Color.WHITE);
	
		mid.setPreferredSize(new Dimension(50,50));
		
		create = new JButton("Create Event");
		create.setPreferredSize(new Dimension(200,50));
		create.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				createEvent();
				getEvent().setVisible(false);
			}
		});
		midLeft.add(create);
		
		join = new JButton("Join Event");
		join.setPreferredSize(new Dimension(200,50));
		join.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new JoinEvent();
				getEvent().setVisible(false);
			}
		});
		midLeft.add(join);
		
		
		ImageIcon calendarIMG = new ImageIcon("images/calendar.png"); 
		calendar = new JLabel(calendarIMG);
		JPanel midRight = new JPanel();
		midRight = new JPanel();
		midRight.add(calendar);
		
		mid.add(midLeft);
		mid.add(midRight);
		
		//bottom panel 
		btm = new JPanel();
		btm.setLayout(new BorderLayout());
		ImageIcon socialMediaIMG = new ImageIcon("images/socialMedia.png");
		socialMedia = new JLabel(socialMediaIMG);
		btm.add(socialMedia);
		btm.setBackground(Color.WHITE);
		
		
		//creating the JOption Panes
		
		
		
		//create index panel
		eventPanel = new JPanel();
		eventPanel.setLayout(new GridLayout(3,1));
		eventPanel.setBackground(Color.WHITE);
		//add panels to index panel
		eventPanel.add(top);
		eventPanel.add(mid);
		eventPanel.add(btm);
		
		//create Frame
		event = new JFrame();
		event.setTitle("Events");
		event.setSize(500, 500);
		event.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		event.setVisible(true);
		//add panels to frame
		event.add(eventPanel);
	
	}
	//getters
	public JFrame getEvent() {
		return event;
	}
	public JFrame getCreateEventFrame() {
		return createEventFrame;
	}
	//setter
	public void setEvent(JFrame event) {
		this.event = event;
	}
	
	//method to create event
	public void createEvent(){
		String eventName = JOptionPane.showInputDialog(event, "Please enter the name "
				+ "of your event:");
		String eventVenue = JOptionPane.showInputDialog(event, "Please enter the venue "
				+ "of your event:");
		String eventDate = JOptionPane.showInputDialog(event, "Please enter the date "
				+ "of your event(dd/mm/yyyy)");
		String eventTime = JOptionPane.showInputDialog(event, "Please enter the time "
				+ "of your event: (hh:mm)");
		
		//joptionpane output
		JOptionPane.showMessageDialog(eventPanel, "Your event has been created successfully!");
		
		//create panels
		//create top2 panel
		top2 = new JPanel();
		top2.setBackground(Color.WHITE);
		top2.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerEVENTS.png");
		bannerImg = new JLabel(banner);
		bannerImg.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				new Home();
				getCreateEventFrame().setVisible(false);
			}
		});
		top2.add(bannerImg, BorderLayout.NORTH);
		ce2 = new JPanel();
		ce2.setBackground(Color.WHITE);
		ce2.setLayout(new GridLayout(0,1));
		eName = new JLabel("Event Name: ");
		eName.setFont(new Font("Courier", Font.BOLD, 16));
		eVenue = new JLabel("Event Venue: ");
		eVenue.setFont(new Font("Courier", Font.BOLD, 16));
		eDate = new JLabel("Event Date: ");
		eDate.setFont(new Font("Courier", Font.BOLD, 16));
		eTime = new JLabel("Event Time: ");
		eTime.setFont(new Font("Courier", Font.BOLD, 16));
		ce2.add(eName);
		ce2.add(eVenue);
		ce2.add(eDate);
		ce2.add(eTime);
		//ce3
		ce3 = new JPanel();
		ce3.setBackground(Color.WHITE);
		ce3.setLayout(new GridLayout(0,1));
		eName2 = new JLabel(eventName);
		eName2.setFont(new Font("Courier", Font.BOLD, 16));
		eVenue2 = new JLabel(eventVenue);
		eVenue2.setFont(new Font("Courier", Font.BOLD, 16));
		eDate2 = new JLabel(eventDate);
		eDate2.setFont(new Font("Courier", Font.BOLD, 16));
		eTime2 = new JLabel(eventTime);
		eTime2.setFont(new Font("Courier", Font.BOLD, 16));
		ce3.add(eName2);
		ce3.add(eVenue2);
		ce3.add(eDate2);
		ce3.add(eTime2);
		//ce4
		ce4 = new JPanel();
		ce4.setBackground(Color.WHITE);
		ce4.setLayout(new GridLayout(1,2));
		//add to ce4
		ce4.add(ce2);
		ce4.add(ce3);
		//ce6
		ce6 = new JPanel();
		ce6.setBackground(Color.WHITE);
		//ce5
		ce5 = new JPanel();
		ce5.setBackground(Color.WHITE);
		//ce7
		ce7 = new JPanel();
		ce7.setBackground(Color.WHITE);
		ce7.setLayout(new BorderLayout());
		share = new JButton("Share");
		share.setBackground(Color.BLUE);
		share.setForeground(Color.WHITE);
		share.setFont(new Font("Courier", Font.BOLD, 20));
		share.setSize(new Dimension(20,10));
		ce7.add(share, BorderLayout.CENTER);
		//ce1
		ce1 = new JPanel();
		ce1.setBackground(Color.WHITE);
		//ce10
		ce10 = new JPanel();
		ce10.setBackground(Color.WHITE);
		ce10.setLayout(new GridLayout(3,1));
		//add to ce10
		ce10.add(ce1);
		ce10.add(ce7);
		ce10.add(ce5);
		//ce8
		ce8 = new JPanel();
		ce8.setBackground(Color.WHITE);
		//ce9
		ce9 = new JPanel();
		ce9.setBackground(Color.WHITE);
		ce9.setLayout(new GridLayout(1,3));
		//add to ce9
		ce9.add(ce6);
		ce9.add(ce10);
		ce9.add(ce8);
		//createEventPanel
		createEventPanel = new JPanel();
		createEventPanel.setBackground(Color.WHITE);
		createEventPanel.setLayout(new GridLayout(3,1));
		//add to createEventPanel
		createEventPanel.add(top2);
		createEventPanel.add(ce4);
		createEventPanel.add(ce9);
		
		//create createEvent frame
		//create Frame
		createEventFrame = new JFrame();
		createEventFrame.setTitle("Event Created");
		createEventFrame.setSize(500, 500);
		createEventFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createEventFrame.setVisible(true);
		//add panels to frame
		createEventFrame.add(createEventPanel);
		
	}
	
}
