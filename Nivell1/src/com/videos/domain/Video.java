package com.videos.domain;

import java.util.*;

public class Video {
	private int id;
	private String url, titol;
	private Date dateSaveVideo;
	private List<String> misTags = new ArrayList<String>();
	static int count=1;
	public Video (String url, String titol, Date dateSaveVideo) throws Exception {
		
		if (url.equals("")) throw new Exception("The name is required");
		if (titol.equals("")) throw new Exception("The surname is required");
		
		
		//this.id= java.util.UUID.randomUUID().toString();
		this.id=count;
		this.url=url;
		this.titol=titol;
		this.dateSaveVideo=dateSaveVideo;
		count+=1;
	}

	

	

	public int getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public String getTitol() {
		return titol;
	}

	public List<String> getMistags() {
		return misTags;
	}

	public void setTag(String miTag) {
		this.misTags.add(miTag) ;
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Video [id=");
		builder.append(id);
		builder.append(", url=");
		builder.append(url);
		builder.append(", titol=");
		builder.append(titol);
		builder.append(", dateSaveVideo=");
		builder.append(dateSaveVideo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
