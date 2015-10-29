package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NewsFeed {
	
	  //variables	
		private JFrame news;
		private JPanel newsPanel, top, btm;
		private JLabel bannerImg, feedImg;
		private JTextArea aboutLbl;
		
		//constructor
		public NewsFeed(){
			//create top panel
			top = new JPanel();
			top.setBackground(Color.WHITE);
			top.setLayout(new BorderLayout());
			ImageIcon banner = new ImageIcon("images/bannerNEWSFEED.png");
			bannerImg = new JLabel(banner);
			bannerImg.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					new Home();
					getNews().setVisible(false);
				}
			});
			top.add(bannerImg, BorderLayout.NORTH);
			
			//create btm panel
			btm = new JPanel();
			btm.setBackground(Color.WHITE);
			ImageIcon feed = new ImageIcon("images/Tweets.png");
			feedImg = new JLabel(feed);
			btm.add(feedImg);
			
			//add to news panel
			newsPanel = new JPanel();
			newsPanel.setBackground(Color.WHITE);
			newsPanel.setLayout(new GridLayout(2,1));
			newsPanel.add(top);
			newsPanel.add(btm);
			
			//create Frame
			news = new JFrame();
			news.setTitle("Home");
			news.setSize(500, 550);
			news.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			news.setVisible(true);
			//add panels to frame
			news.add(newsPanel);
		}
		//getter
		public JFrame getNews() {
			return news;
		}
		//setter
		public void setNews(JFrame news) {
			this.news = news;
		}

}
