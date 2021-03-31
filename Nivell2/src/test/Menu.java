package test;



import javax.swing.JOptionPane;
import com.videos.repository.*;
import com.videos.domain.User;
import com.videos.factory.*;

public class Menu {
	public static void ImprimirMenu(){
		
		System.out.println("1- Crear usuario");
		System.out.println("2- Crear video");
		System.out.println("3- Listar Usuarios");
		System.out.println("4- Listar videos de un usuario");
		System.out.println("5- Listar un video de un usuario");
		System.out.println("6- Añadir un Tag a un video");
		System.out.println("-1- Para Salir");
		
	}
	
	public static void SeleccionarOpcion() throws Exception {
		int opc,  id, idVideo;
		String miTag;
		
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una opcion de menu")) ;
		
			if (opc<-1 && opc>6) throw new Exception("Opcion no disponible");
		
			switch(opc) {
				case 1:
					User user =  Userfactory.Createuser();
					Repository.AddUser(user);
					break;
				case 2:
					Repository.getIdsAllUsers();
					 id=Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una id de usuario"));
					Repository.Addvideos(id);
					break;
				case 3:
					Repository.ShowUsers();
					break;
				case 4:
					Repository.getIdsAllUsers();
					 id=Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una id de usuario"));
					Repository.ShowVideosUser(id);
					break;
				case 5:
					Repository.getIdsAllUsers();
					 id=Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una id de usuario"));
					 
					Repository.ShowVideosUser(id);
					idVideo= Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una id de video"));
					
					Repository.ShowVideoUser(id, idVideo);
					
					break;
					
				case 6:
			
					Repository.getIdsAllUsers();
					 id=Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una id de usuario"));
					 
					 Repository.ShowVideosUser(id);
					 idVideo= Integer.parseInt(JOptionPane.showInputDialog("Seelcciona una id de video"));
					
					 miTag= JOptionPane.showInputDialog("Añade un tag a tu video");
					Repository.AddEtiquetaVideo(id, idVideo, miTag);
					
					break;
				case -1:
					break;
					
			}		
			
		}while(opc!=-1);
		
	}
}
