package com.videos.factory;



import java.util.*;

import javax.swing.JOptionPane;


import com.videos.domain.User;

public  class Userfactory   {
	
	
	
	
	public static User Createuser() throws Exception {
		// TODO Auto-generated method stub
		String name= JOptionPane.showInputDialog("Introduce name of user");
		String surname= JOptionPane.showInputDialog("Introduce surname of user");
		String password=JOptionPane.showInputDialog("Introduce password of user");
		Date dateResgister = new Date();
		
		 return  new User(name, surname, password, dateResgister);
		
		
	}

	
	

}
