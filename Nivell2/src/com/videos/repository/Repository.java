package com.videos.repository;
import java.util.*;


import com.videos.domain.*;



public  class Repository {
	
	
	static List<User> users = new ArrayList<User>();
	static List<Video> videos = new ArrayList<Video>();
	static List<Integer> ids = new ArrayList<Integer>();
	//static String ids[] = new String[10];
	
	public static void AddUser(User user) {
		users.add(user);
		ids.add(user.getId());
		//ids[user.getCount()]=user.getId();
	}
	
	public static void ShowUsers () {
		for (User e:users) {
			System.out.println(e.toString());
		}
	}
	
	public static void Addvideos(int idUser) throws Exception {
		for (User e:users) {
			if (e.getId()==idUser) {
				e.CrateVideo();
			}
		}
	}
	
	public static void AddEtiquetaVideo(int idUser, int idVideo, String miTag) {
		for (User e:users) {
			if (e.getId()==idUser) {
				videos=e.getMisVideos();
				for (Video ele:videos) {
					if (ele.getId()==idVideo) {
						ele.setTag(miTag);
					}
				}
			}
		}
		
	}
	
	public static void getIdsAllUsers() {
		
		for (int e:ids) {
			System.out.println(e);
		}
		/*Object seleccion = JOptionPane.showInputDialog(
			   null,
			   "Seleccione opcion",
			   "Selector de opciones",
			   JOptionPane.QUESTION_MESSAGE,
			   null,  // null para icono defecto
			   new Object[] {ids[User.getCount()], ids[User.getCount()]},
			   "Seleccione");*/
		
		//System.out.println(seleccion);
	}
	
	
	
	public static void ShowVideosUser( int idUser) {
		for (User e:users) {
			if (e.getId()==idUser) {
				videos=e.getMisVideos();
				for (Video ele:videos) {
					System.out.println(ele.toString());
				}
			}
		}
	}
	
	public static void ShowVideoUser( int idUser, int idVideo) {
		 
		for (User e:users) {
			if (e.getId()==idUser) {
				videos=e.getMisVideos();
				for (Video ele:videos) {
					if (ele.getId()==idVideo) {
						System.out.println(ele.toString());
					}
				}
			}
		}
		
	}
	
	
}
