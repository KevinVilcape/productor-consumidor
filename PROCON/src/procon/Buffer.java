package procon;

import java.util.ArrayList;

import javax.swing.JTextArea;

public class Buffer {
	JTextArea textA1;
	ArrayList <Character> buffer = new ArrayList<Character>();
	private char c;
	int tama�o=buffer.size();
	
	public void Tam(int t) {
		this.tama�o=t;
		
	}
	public void setTextA1(JTextArea ta1) {
		this.textA1 = ta1;
		}
	public synchronized  char sacar(){
		
		if(buffer.size()==0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	
		c = buffer.remove(0);
		
		notify();
		
		return c;
		
	}	
	
	public synchronized char poner(char c){	
		if(buffer.size()>=25){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
		buffer.add(c);
		notify();
		
		return c;

	}

	
	

}
