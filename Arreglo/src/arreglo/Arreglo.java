
package arreglo;



import Modelo.llenar;
import javax.swing.JOptionPane;
class Ppal{
	public static void main(String args[]){
		llenar ob1=new llenar();
		int opc;
		do{
		   opc=Integer.parseInt(JOptionPane.showInputDialog("            ***Menu Arreglo***\n1. Cargar\n2. Imprimir\n3. Invertir\n4. Ordenar\n5. Salir\nDigite opcion:"));
		   switch(opc){
			case 1:
				ob1.cargar();
				break;
			case 2:
				ob1.impri();
				break;
			case 3:
				ob1.Invertir();
				JOptionPane.showMessageDialog(null,"Arreglo invertido");
				break;
			case 4:
				ob1.Ordenar();
				break;	
			case 5:
				JOptionPane.showMessageDialog(null,"     Fin del programa\n      Hasta pronto!");	

		   }
		}while(opc!=5);
	}
}