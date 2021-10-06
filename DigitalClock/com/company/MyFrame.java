package com.company;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
	
	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	String time;

	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("MY Digital Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350,150);
		this.setResizable(false);
		
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timeLabel = new JLabel();
		
		timeLabel.setFont(new Font("Verdera", Font.PLAIN,50));
		
		
		
		//font settings
		timeLabel.setForeground(new Color(0x00ff00));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		//...............
		
		time = timeFormat.format(java.util.Calendar.getInstance().getTime());
		
		timeLabel.setText(time);
		this.add(timeLabel);
		this.setVisible(true);
		
		setTime();
		
		}
		
		
		// to update time after every 1 second.
		public void setTime() {
			while(true) {
				this.time =timeFormat.format(Calendar.getInstance().getTime());
				this.timeLabel.setText(this.time);
				
				try {
					Thread.sleep(1000);  //1sec
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				
				
			}
		}
		
		
		
	
}
