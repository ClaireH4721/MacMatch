package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChatHome 
{
	
	//variables	
		private JFrame chatHome;
		private JPanel chatHomePanel, top, mid, btm, midLeft, midMid, midRight, 
		btmLeft, btmMid, btmRight;
		private JLabel bannerImg;
		private JButton individChat, groupChat;
		
		//constructor
		public ChatHome(){
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
			individChat = new JButton("Individual Chat");
			individChat.setBackground(Color.WHITE);
			individChat.setForeground(Color.BLACK);
			individChat.setFont(new Font("Courier", Font.BOLD, 17));
			individChat.setBorder(null);
			individChat.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					new Chat();
					getChatHome().setVisible(false);
				}
			});
			//add btn to panel
			midMid.add(individChat, BorderLayout.CENTER);
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
			groupChat = new JButton("Group Chat");
			groupChat.setBackground(Color.WHITE);
			groupChat.setForeground(Color.BLACK);
			groupChat.setFont(new Font("Courier", Font.BOLD, 17));
			groupChat.setBorder(null);
			//add btn to panel
			btmMid.add(groupChat, BorderLayout.CENTER);
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
			chatHomePanel = new JPanel();
			chatHomePanel.setLayout(new GridLayout(3,1));
			chatHomePanel.setBackground(Color.WHITE);
			//add panels to index panel
			chatHomePanel.add(top);
			chatHomePanel.add(mid);
			chatHomePanel.add(btm);
			
			//create Frame
			chatHome = new JFrame();
			chatHome.setTitle("Index");
			chatHome.setSize(500, 500);
			chatHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			chatHome.setVisible(true);
			//add panels to frame
			chatHome.add(chatHomePanel);
			
		}
		//getter
		public JFrame getChatHome() {
			return chatHome;
		}
		//setter
		public void setChatHome(JFrame chatHome) {
			this.chatHome = chatHome;
		}
	
}
