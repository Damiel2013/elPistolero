 
 public class functions {



 public void output(){
 	
 	System.out.println("          ROUND "+round);
			round++;
			
			System.out.println();
		System.out.println(enemigo.getNombre()+":");
		System.out.println("Salud: "+enemigo.getSalud());
		System.out.println("Balas: "+enemigo.getRecarga()+"/6");
		System.out.println();
		System.out.println();
		System.out.println(jugador.getNombre()+":");
		System.out.println("Salud: "+jugador.getSalud());
		System.out.println("Balas: "+jugador.getRecarga()+"/6");
		System.out.println();
		System.out.println();
		System.out.println("Pulsa enter para continuar");
		try{
			System.in.read();
		}catch(Exception e){}
	}

}