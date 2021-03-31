package test;




public class Testvideos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu.ImprimirMenu();
		try {
			Menu.SeleccionarOpcion();	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
