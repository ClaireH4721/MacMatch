package macMatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class SignUpLovedOne {
    //variables	
	private JFrame SULoved;
	private JPanel SULovedPanel, top, mid, btm, midLeft, midMid, midRight, btmLeft, btmMid, btmRight;
	private JLabel bannerImg;
	private JButton login, signup;
	
	//constructor
	public SignUpLovedOne(){
		//create top panel
		top = new JPanel();
		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		ImageIcon banner = new ImageIcon("images/bannerSIGNUP.png");
		bannerImg = new JLabel(banner);
		top.add(bannerImg, BorderLayout.NORTH);
		
		//create middle panels
		//midleft
		mid = new JPanel();
		mid.setLayout(new GridLayout(4,4));
		JPanel a = new JPanel();
		a.setLayout(new GridLayout(1,2));
		JPanel b = new JPanel();
		b.setLayout(new GridLayout(1,2));
		JPanel c = new JPanel();
		c.setLayout(new GridLayout(1,2));
		JPanel d = new JPanel();
		d.setLayout(new GridLayout(1,2));
		JPanel e = new JPanel();
		e.setLayout(new GridLayout(1,2));
		JPanel f = new JPanel();
		f.setLayout(new GridLayout(1,2));
		JPanel g = new JPanel();
		g.setLayout(new GridLayout(1,2));
		JPanel h = new JPanel();
		h.setLayout(new GridLayout(1,2));
		
		
		JLabel userID = new JLabel("UserID");
		JTextArea userID1 = new JTextArea();
		JLabel title = new JLabel("Title");
		JTextArea title1 = new JTextArea();
		JLabel forename = new JLabel("Forename");
		JTextArea forename1 = new JTextArea();
		JLabel surname = new JLabel("Surname");
		JTextArea surname1 = new JTextArea();
		JLabel email = new JLabel("Email");
		JTextArea email1 = new JTextArea();
		JLabel password = new JLabel("Password");
		JTextArea password1 = new JTextArea();
		JLabel DOB = new JLabel("Date of Birth");
		JTextArea DOB1 = new JTextArea();
		JLabel gender = new JLabel("Gender");
		JTextArea gender1 = new JTextArea();
		
		a.add(userID);
		a.add(userID1);
		b.add(title);
		b.add(title1);
		c.add(forename);
		c.add(forename1);
		d.add(surname);
		d.add(surname1);
		e.add(email);
		e.add(email1);
		f.add(password);
		f.add(password1);
		g.add(DOB);
		g.add(DOB1);
		h.add(gender);
		h.add(gender1);
		
		mid.add(a);
		mid.add(b);
		mid.add(c);
		mid.add(d);
		mid.add(e);
		mid.add(f);
		mid.add(g);
		mid.add(h);
		
		//create bottom panel 
		btm = new JPanel();
		btm.setLayout(new GridLayout(6,6));
		JPanel aa = new JPanel();
		aa.setLayout(new GridLayout(1,2));
		JPanel bb = new JPanel();
		bb.setLayout(new GridLayout(1,2));
		JPanel cc = new JPanel();
		cc.setLayout(new GridLayout(1,2));
		JPanel dd = new JPanel();
		dd.setLayout(new GridLayout(1,2));
		JPanel ee = new JPanel();
		ee.setLayout(new GridLayout(1,2));
		JPanel ff = new JPanel();
		ff.setLayout(new GridLayout(1,2));
		JPanel gg = new JPanel();
		gg.setLayout(new GridLayout(1,2));
		JPanel hh = new JPanel();
		hh.setLayout(new GridLayout(1,2));
		JPanel ii = new JPanel();
		ii.setLayout(new GridLayout(1,2));
		JPanel jj = new JPanel();
		jj.setLayout(new GridLayout(1,2));
		JPanel saveButton = new JPanel();
		saveButton.setLayout(new GridLayout(1,2));
		JPanel clearButton = new JPanel();
		clearButton.setLayout(new GridLayout(1,2));
		
		
		
		
		JLabel TOC = new JLabel("Type of Cancer");
		JTextArea TOC1 = new JTextArea();
		JLabel remission = new JLabel("In Remission?");
		JTextArea remission1 = new JTextArea();
		JLabel stage = new JLabel("Stage");
		JTextArea stage1 = new JTextArea();
		JLabel MT = new JLabel("Main Treatment");
		JTextArea MT1 = new JTextArea();
		JLabel sport = new JLabel("Sports Interest");
		JTextArea sport1 = new JTextArea();
		JLabel movie = new JLabel("Movie Interest");
		JTextArea movie1 = new JTextArea();
		JLabel music = new JLabel("Music Interest");
		JTextArea music1 = new JTextArea();
		JLabel other = new JLabel("Other Interest");
		JTextArea other1 = new JTextArea();
		JLabel twitter = new JLabel("Twitter Username");
		JTextArea twitter1 = new JTextArea();
		JLabel facebook = new JLabel("Facebook E-Mail");
		JTextArea facebook1 = new JTextArea();
		
		JLabel blank = new JLabel();
		JButton save = new JButton("Save");
		JLabel blank2 = new JLabel();
		JButton clear = new JButton("Clear");
		
		
		aa.add(TOC);
		aa.add(TOC1);
		bb.add(remission);
		bb.add(remission1);
		cc.add(stage);
		cc.add(stage1);
		dd.add(MT);
		dd.add(MT1);
		ee.add(sport);
		ee.add(sport1);
		ff.add(movie);
		ff.add(movie1);
		gg.add(music);
		gg.add(music1);
		hh.add(other);
		hh.add(other1);
		ii.add(twitter);
		ii.add(twitter1);
		jj.add(facebook);
		jj.add(facebook1);
		clearButton.add(clear);
		saveButton.add(save);
		
		
		btm.add(aa);
		btm.add(ee);
		btm.add(bb);
		btm.add(ff);
		btm.add(cc);
		btm.add(gg);
		btm.add(dd);
		btm.add(hh);
		btm.add(ii);
		btm.add(jj);
		btm.add(saveButton);
		btm.add(clearButton);
		
		
		//create index panel
		SULovedPanel = new JPanel();
		SULovedPanel.setLayout(new GridLayout(3,1));
		SULovedPanel.setBackground(Color.WHITE);
		//add panels to index panel
		SULovedPanel.add(top);
		SULovedPanel.add(mid);
		SULovedPanel.add(btm);
		
		//create Frame
		SULoved = new JFrame();
		SULoved.setTitle("Index");
		SULoved.setSize(500, 500);
		SULoved.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SULoved.setVisible(true);
		//add panels to frame
		SULoved.add(SULovedPanel);
		
	}
	//getters
	public JFrame getSULoved() {
		return SULoved;
	}
	//setters
	public void setSULoved(JFrame sULoved) {
		SULoved = sULoved;
	}

}





