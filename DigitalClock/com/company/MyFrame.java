package com.company;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("MY Digital Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		
		//Calendar Calendar;
		SimpleDateFormat timeFormat;
		JLabel timeLabel;
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timeLabel = new JLabel();
		
		String time = timeFormat.format(java.util.Calendar.getInstance().getTime());
		
		timeLabel.setText(time);
		this.add(timeLabel);
		this.setVisible(true);
		
		
		
	}
}
