package com.gmail.itakanaya9;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import java.io.File;

import javax.swing.*;

//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;


public class FW {

	public static void main(String[] args) {
		System.out.println("Finder for Windows.");
		String path = "/Users";
		
		FW frame = new FW(path);
/*
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(10, 50, 500, 500);
	    frame.setTitle(path);
	    frame.setVisible(true);
*/
	}
	
	FW(String path){
		
		File dir = new File(path);
	    File[] files = dir.listFiles();
	    
	    JPanel p = new JPanel();
	    p.setLayout(null);
	    
	    for (int i = 0; i < files.length; i++) {
	        File file = files[i];
	        System.out.println((i + 1) + ":    " + file);
	        
	        //check extension
	        String filePathName = file.toString();
	        int pathPoint = filePathName.lastIndexOf("/");
	        String fileName = filePathName.substring(pathPoint + 1);
	        String fileExtension = "";
	        
	        int extensionPoint = fileName.lastIndexOf(".");
	        if (extensionPoint != -1) {
	            //fileExtension = fileName.substring(extensionPoint + 1);
	        }else{
	        	fileExtension = "    ->";
	        }
	        
	        JLabel label = new JLabel(fileName + fileExtension);
	        label.setBounds(10, 10+i*20, 200, 20); 
	        p.add(label);
	        
	    }
	    
	    
	    //getContentPane().add(p, BorderLayout.CENTER);
	}
	/*
	public void mouseEntered(MouseEvent e){
		System.out.println("in-mouse");
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("click-mouse");
	}
*/
}
