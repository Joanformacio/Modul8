package com.videos.domain;

import java.util.*;




public class Video {
	private int id;
	private String url, titol, status;
	private Date dateSaveVideo;
	private List<String> misTags = new ArrayList<String>();
	static int count=1;
	private enum enumStatusVideo {Uploading, Verifying, Public};
	
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

	
	
	public String getStatus() {
		
		
			//declarations
			Date date=new Date();
			
			
			long timeElapsed=0;
			
			
			Calendar sevedVideo=Calendar.getInstance();
			Calendar actuallyDate= Calendar.getInstance();
			
			//if lost  date data
			if (this.dateSaveVideo==null) ; 
			
			sevedVideo.setTime(this.dateSaveVideo) ;
			actuallyDate.setTime(date);
			
			long difference= (actuallyDate.getTimeInMillis()) - (sevedVideo.getTimeInMillis());
			
			//convert to minutes
			timeElapsed= ((difference/60)/1000);
			
			//check time for status
			if (timeElapsed<1) {
				this.status= enumStatusVideo.Uploading.name();
			}
			
			if (timeElapsed>1 && timeElapsed<3) {
				this.status= enumStatusVideo.Verifying.name();
			}
			
			if (timeElapsed>3 ) {
				this.status=  enumStatusVideo.Public.name();
			}
			
			return this.status;//return according to the time
		
	
	}




	public Date getDateSaveVideo() {
		return dateSaveVideo;
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
		builder.append(", status video=");
		builder.append(getStatus());
		builder.append(", Tags video=");
		builder.append(getMistags());
		builder.append("]");
		return builder.toString();
	}





	
	
}
