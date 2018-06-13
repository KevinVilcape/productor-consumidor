package procon;

import java.awt.TextArea;
import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Productor extends Thread {
	JTextField textF;
	
	JTextArea textA;
	JScrollPane scrollP = new JScrollPane(textA);
	
	private Buffer buffer;
	private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private char c;
	
	String nombre;
	
	private Random random = new Random();
	
	
	
	public void empresa(JTextField tf) {
		this.nombre = tf.getText();
	}
	
	public void setTextA(JTextArea ta) {
		this.textA = ta;
	}
	public void setScroll(JScrollPane sp) {
		this.scrollP = sp;
		
	}
	
	//public Productor (Buffer buffer, int cant){
		//this.buffer = buffer;
	
	//}
	
	public Productor (Buffer b){
		this.buffer = b;
	}
	
	public void run (){
		
		
		for (int i = 0; i < 1000 ; i++){
			c = alfabeto.charAt(random.nextInt(26));
			buffer.poner(c);
			System.out.println("productor "+this.nombre+" :"+c);
			textA.append(this.nombre+": "+c+"\n");
			
			
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

