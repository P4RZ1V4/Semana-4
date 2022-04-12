package Modelo;
import javax.swing.JOptionPane;
public class llenar{
	int v[]=new int[5];
	public void cargar(){
		for(int i=0;i<5;i++){
		    v[i]=Integer.parseInt(JOptionPane.showInputDialog("Posicion ["+i+"]:"));
		}
	}
	public void impri(){
		String salida="los datos del arreglo son:\n";
		for(int i=0;i<5;i++){
		    salida=salida+" | "+v[i]+" | "+" ";
		}
		JOptionPane.showMessageDialog(null,salida);
	}
	public void Invertir() {
		
		int filas = v.length;
       		int temporal[] = new int[filas];
        	int contador = 0;
        	for (int i = filas - 1, x = 0; x < v.length; i--, x++) {      
                	temporal[contador++] = v[i];  
        	}
        	contador = 0;
        	for (int i = 0; i < filas; i++) {   
                	v[i] = temporal[contador++];    
        	} 
        }
	public void Ordenar(){
		int op;
		op=Integer.parseInt(JOptionPane.showInputDialog("        ***Menu Ordenar****\n1. Burbuja\n2. Secuanecial\ndigite opcion"));
		if(op == 1){
			for (int i = 0; i < 5; i++) {
          			for (int j = 0; j < 5; j++) {              
                    			if (v[i] < v[j]) {
                            			int t = v[i];
                            			v[i] = v[j];
                            			v[j] = t;
                    			}
					
            			}
                     
        		}
		JOptionPane.showMessageDialog(null,"Arreglo ordenado de forma Acendente!");
       
 		}
	
		else if(op == 2){
			for (int i = 0; i < 5; i++) {
          			for (int j = 0; j < 5; j++) {              
                    			if (v[i] > v[j]) {
                            			int t = v[i];
                            			v[i] = v[j];
                            			v[j] = t;
                    			}
					
            			}
                     
        		}
       		JOptionPane.showMessageDialog(null,"Arreglo ordenado de forma Descendente!");

		}
		else{
			JOptionPane.showMessageDialog(null,"opccion incorecta");	
		}
	}
       	

}