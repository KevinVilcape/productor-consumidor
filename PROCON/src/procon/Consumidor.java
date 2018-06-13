package procon;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Consumidor extends Thread {
	private Buffer buffer;
	JTextArea textA;
int nam;
	public void setTextA(JTextArea ta) {
		this.textA = ta;
	}
	public Consumidor (Buffer buffer){
		this.buffer = buffer;
	}
	
	public void Nom(int n) {
		this.nam = n;
	}

	public void run (){

		
		for(int i = 0; i < 1000; i++){
			char c;
			c = buffer.sacar();
			
			System.out.println("Consumidor "+this.nam+" :"+c);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
