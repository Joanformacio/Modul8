package com.videos.domain;

import java.util.*;

import javax.swing.JOptionPane;

public class User implements IVideo{
	private String name, surname, password;
	private int id;
	private Date dateRegister;
	List<Video> misVideos = new ArrayList<Video>();
	private static int count=1;
	
	public User(String name, String surname, String password, Date dateRegister) throws Exception {
		
		if (name.equals("")) throw new Exception("The name is required");
		if (surname.equals("")) throw new Exception("The surname is required");
		if (password.equals("")) throw new Exception("The password is required");
		if (dateRegister==null) throw new Exception("The date register is required");
		
		this.id= count;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.dateRegister = dateRegister;
		count+=1;
	}
	
	
	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	
	public List<Video> getMisVideos() {
		return misVideos;
	}

	


	public String getPassword() {
		return password;
	}

	@Override
	public void CrateVideo() throws Exception {
		// TODO Auto-generated method stub
		String url= JOptionPane.showInputDialog("Introduce url of video");
		String title= JOptionPane.showInputDialog("Introduce title of video");
		Date dateSaved= new Date();
		Video miVideo= new Video(url, title, dateSaved);
		misVideos.add(miVideo);
	}

	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", dateRegister=");
		builder.append(dateRegister);
		builder.append("]");
		return builder.toString();
	}
	
	
	


}
