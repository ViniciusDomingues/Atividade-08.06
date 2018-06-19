 //Classes e métodos abstratos

abstract class Carro {  
	
	 abstract void cor(); 
	 abstract void placa();
	 
 } 
 class Ferrari extends Carro { 
	 
	 void cor() { 
	 System.out.println("vermelho"); 
	 } 
 
 void placa() { 
	 System.out.println("JHKL1025"); 
	 } 
 } 
 
 class Celta extends Carro { 
	 void cor()  { 
		 System.out.println("Rosa");
} 
 
 void placa() { 
	 System.out.println("HJU677");
	 } 
 } 