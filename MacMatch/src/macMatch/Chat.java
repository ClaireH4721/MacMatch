package com.macmatch.chat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Chat 
{
	
	private JFrame ChatWindow;
	private JPanel TopPanel, BottomPanel, BLPanel, BRPanel, BackgroundPanel;
	private JTextArea ChatTA, TypeTA;
	private JButton SendButton;
	private String Message, Log;
	private int Time = 34;
	
	
	public Chat()
	{
		ChatWindow = new JFrame();
		BackgroundPanel = new JPanel();
		BackgroundPanel.setBackground(Color.RED);
		BackgroundPanel.setLayout(new BoxLayout(BackgroundPanel, BoxLayout.Y_AXIS));
		BackgroundPanel.setMaximumSize(new Dimension(500,500));
		BackgroundPanel.setMinimumSize(new Dimension(500,500));
		BackgroundPanel.setPreferredSize(new Dimension(500,500));
		ChatWindow.add(BackgroundPanel);
		
		TopPanel = new JPanel();
		TopPanel.setBackground(Color.LIGHT_GRAY);
		TopPanel.setLayout(new BoxLayout(TopPanel, BoxLayout.X_AXIS));
		TopPanel.setMaximumSize(new Dimension(500,400));
		TopPanel.setMinimumSize(new Dimension(500,400));
		TopPanel.setPreferredSize(new Dimension(500,400));
		BackgroundPanel.add(TopPanel);
		
		ChatTA = new JTextArea();
		ChatTA.setForeground(Color.BLACK);
		ChatTA.setEditable(false);
		ChatTA.setOpaque(false);
		ChatTA.setLineWrap(true);
		ChatTA.setWrapStyleWord(true);
		ChatTA.setFont(new Font("Arial", Font.PLAIN, 18));
		ChatTA.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		TopPanel.add(ChatTA);
		
		BottomPanel = new JPanel();
		BottomPanel.setBackground(Color.MAGENTA);
		BottomPanel.setLayout(new BoxLayout(BottomPanel, BoxLayout.X_AXIS));
		BottomPanel.setMaximumSize(new Dimension (500,100));
		BottomPanel.setMinimumSize(new Dimension (500,100));
		BottomPanel.setPreferredSize(new Dimension (500,100));
		BackgroundPanel.add(BottomPanel);
		
		BLPanel = new JPanel();
		BLPanel.setBackground(Color.GREEN);
		BLPanel.setLayout(new BoxLayout(BLPanel, BoxLayout.X_AXIS));
		BLPanel.setMaximumSize(new Dimension (400,100));
		BLPanel.setMinimumSize(new Dimension (400,100));
		BLPanel.setPreferredSize(new Dimension (400,100));
		BottomPanel.add(BLPanel);
		
		TypeTA = new JTextArea();
		TypeTA.setForeground(Color.BLACK);
		TypeTA.setEditable(true);
		TypeTA.setLineWrap(true);
		TypeTA.setWrapStyleWord(true);
		TypeTA.setFont(new Font("Arial", Font.PLAIN, 18));
		TypeTA.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		BLPanel.add(TypeTA);
		
		BRPanel = new JPanel();
		BRPanel.setBackground(Color.BLACK);
		BRPanel.setLayout(new BoxLayout(BRPanel, BoxLayout.Y_AXIS));
		BRPanel.setMaximumSize(new Dimension (100,100));
		BRPanel.setMinimumSize(new Dimension (100,100));
		BRPanel.setPreferredSize(new Dimension (100,100));
		BottomPanel.add(BRPanel);
		
		SendButton = new JButton("Send");
		SendButton.setFont(new Font("Arial", Font.PLAIN, 20));
		
		SendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Reply();
				
			}
			});
		
		BRPanel.setLayout(new GridLayout(0,1));
		BRPanel.add(SendButton);
		
		ChatWindow.setTitle("MacMate Chat");
		ChatWindow.setSize(500,500);
		ChatWindow.setResizable(false);
		ChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChatWindow.setVisible(true);
		ChatWindow.pack();
		
	}
	
	public void Reply() 
	{
		
		Message = TypeTA.getText();
		if (Message.equalsIgnoreCase("Hey"))
		{
			ChatTA.setText("\n20:" + Time + " - Zoey: Hi");
		}
		else if (Message.equalsIgnoreCase("Whats up"))
		{
			ChatTA.setText("\n20:" + Time + " - Zoey: Just relaxing at home");
		}
		else if (Message.matches("hi"))
		{
			ChatTA.setText("\n20:" + Time + " - Zoey: Hi. Whats up?");
		}
		else if (Message.matches("Just out and about"))
		{
			ChatTA.setText("\n20:" + Time + " - Zoey: Good to hear");
		}
		Log = ChatTA.getText();
		ChatTA.setText("\n20:" + Time + " - Jack: " + Message + "\n" + Log);
		Log = ChatTA.getText();
		TypeTA.setText("");
		
	}
}
