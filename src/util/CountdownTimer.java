package util;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class CountdownTimer implements ActionListener{
	
	JFrame window;
	public JLabel whiteCounterLabel;
	public JLabel blackCounterLabel;
	JButton btn;
	Font  font1 = new Font("Arial", Font.PLAIN, 70);
	Font  font2 = new Font("Arial", Font.PLAIN, 30);
	
	Timer whiteTimer;
	Timer blackTimer;
	int whiteSecond;
	int whiteMinute;
	int blackSecond;
	int blackMinute;
	String ddSecond;
	String ddMinute;
	int buttonCount = 0;
	boolean timesUp = false;
	boolean buttonPress = false;
	
	DecimalFormat dFormat = new DecimalFormat("00");
	

	/*
	public static void main(String[] args) {
		
		new CountdownTimer();
		

	}*/
	
	public CountdownTimer() {
		//window = new JFrame();
		//window.setSize(800,600);
		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setLayout(null);
		
		//creating white timer label
		whiteCounterLabel = new JLabel("");
		//whiteCounterLabel.setBounds(50, 230, 200, 100);
		//whiteCounterLabel.setHorizontalAlignment(JLabel.CENTER);
		whiteCounterLabel.setFont(font1);
		whiteCounterLabel.setForeground(new Color(222, 206, 129));
		
		//creating black timer label
		blackCounterLabel = new JLabel("");
		blackCounterLabel.setBounds(550, 230, 200, 100);
		blackCounterLabel.setHorizontalAlignment(JLabel.CENTER);
		blackCounterLabel.setFont(font1);
		
		//creating end turn button
	//	btn = new JButton("End Turn");
		//btn.addActionListener(this);
		//btn.setBounds(300, 400, 200, 50);
		//btn.setHorizontalAlignment(JButton.CENTER);
		//btn.setFont(font2);
		
		//window.add(whiteCounterLabel);
		//window.add(blackCounterLabel);
		//window.add(btn);
		//window.setVisible(true);

		//Creates a normal timer that counts up starting at 00:00
//		counterLabel.setText("00:00");
//		second = 0;
//		minute = 0;
//		normalTimer();
//		timer.start();
		
		//Creates a countdown timer starting from a specified time until 00:00. Change default label time and minute variable to change start time.
		whiteCounterLabel.setText("03:00");
		blackCounterLabel.setText("03:00");
		whiteSecond = 0;
		blackSecond = 0;
		whiteMinute = 3;
		blackMinute = 3;
		countdownTimer();
		//whiteTimer.start();
		
		
	}
	
	//normal timer that counts upwards starting from 0
//	public void normalTimer() {
//		timer = new Timer(1000, new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				second++;
//				ddSecond = dFormat.format(second);
//				ddMinute = dFormat.format(minute);
//				
//				counterLabel.setText(ddMinute + ":" + ddSecond);
//				
//				if(second == 60) {
//					second  = 0;
//					minute++;
//					
//					ddSecond = dFormat.format(second);
//					ddMinute = dFormat.format(minute);
//					counterLabel.setText(ddMinute + ":" + ddSecond);
//				}
//			}
//		});
//	}
	
	//creates timers that count down
	public void countdownTimer() {
		whiteTimer = new Timer(1000, new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				whiteSecond--;
				ddSecond = dFormat.format(whiteSecond);
				ddMinute = dFormat.format(whiteMinute);
				whiteCounterLabel.setText(ddMinute + ":" + ddSecond);
				//blackCounterLabel.setText(ddMinute + ":" + ddSecond);
				
				if(whiteSecond == -1) {
					whiteSecond = 59;
					whiteMinute--;
					ddSecond = dFormat.format(whiteSecond);
					ddMinute = dFormat.format(whiteMinute);
					whiteCounterLabel.setText(ddMinute + ":" + ddSecond);
					//blackCounterLabel.setText(ddMinute + ":" + ddSecond);
				}
				if(whiteMinute == 0 && whiteSecond == 0) {
					whiteTimer.stop();
					timesUp = true;
				}
				
			}
		});
		
		blackTimer = new Timer(1000, new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				blackSecond--;
				ddSecond = dFormat.format(blackSecond);
				ddMinute = dFormat.format(blackMinute);
				//whiteCounterLabel.setText(ddMinute + ":" + ddSecond);
				blackCounterLabel.setText(ddMinute + ":" + ddSecond);
				
				if(blackSecond == -1) {
					blackSecond = 59;
					blackMinute--;
					ddSecond = dFormat.format(blackSecond);
					ddMinute = dFormat.format(blackMinute);
					//whiteCounterLabel.setText(ddMinute + ":" + ddSecond);
					blackCounterLabel.setText(ddMinute + ":" + ddSecond);
				}
				if(blackMinute == 0 && blackSecond == 0) {
					blackTimer.stop();
					timesUp = true;
				}
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			buttonCount++;
			System.out.println("button pressed");
			if(buttonCount == 0) {
				blackTimer.stop();
				whiteTimer.start();
			}
			if(buttonCount % 2 == 0) {
				blackTimer.stop();
				whiteTimer.start();
			}
			else {
				whiteTimer.stop();
				blackTimer.start();
			}
		}
		
	}

}
