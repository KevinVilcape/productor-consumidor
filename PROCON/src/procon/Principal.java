package procon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.Font;

public class Principal {

	
	
	private JFrame frame;
Buffer buffer = new Buffer();
	
	Productor pro1 = new Productor(buffer);
	Productor pro2 = new Productor(buffer);
	Consumidor con1 = new Consumidor (buffer);
	Consumidor con2 = new Consumidor (buffer);
	private JTextField txtCocacola;
	private JTextField txtIncakola;
	private JButton btnNewButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 693, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\KEVIN\\eclipse-workspaceo\\PROCON\\cocacola.png"));
		btnNewButton.setBounds(10, 11, 95, 76);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setIcon(new ImageIcon("C:\\Users\\KEVIN\\eclipse-workspaceo\\PROCON\\inca.jpg"));
		button.setBounds(10, 182, 95, 76);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setVerticalAlignment(SwingConstants.TOP);
		button_1.setIcon(new ImageIcon("C:\\Users\\KEVIN\\eclipse-workspaceo\\PROCON\\consumidor1.jpg"));
		button_1.setBounds(572, 11, 95, 76);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setIcon(new ImageIcon("C:\\Users\\KEVIN\\eclipse-workspaceo\\PROCON\\consumidor2.jpg"));
		button_2.setBounds(572, 182, 95, 76);
		frame.getContentPane().add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(214, 22, 255, 215);
		frame.getContentPane().add(scrollPane);
	
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		pro1.setTextA(textArea);
		pro2.setTextA(textArea);
		
		JButton inicio1 = new JButton("iniciar");
		inicio1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				inicio1.setEnabled(false);
				inicio1.setBackground(Color.GREEN);
				
			}
		});
		inicio1.setBackground(Color.RED);
		inicio1.setForeground(Color.BLACK);
		inicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.empresa(txtCocacola);
				pro1.start();
				
				
			}
		});
		inicio1.setBounds(115, 11, 89, 23);
		frame.getContentPane().add(inicio1);
		
		JButton continuar1 = new JButton("continuar");
		continuar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				continuar1.setBackground(Color.GREEN);
				
				
				
			}
		});
		continuar1.setBackground(Color.RED);
		continuar1.setForeground(Color.BLACK);
		continuar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				pro1.resume();
			}
		});
		continuar1.setBounds(115, 64, 89, 23);
		frame.getContentPane().add(continuar1);
		
		JButton continuar2 = new JButton("continuar");
		continuar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				continuar2.setBackground(Color.GREEN);
			}
		});
		continuar2.setBackground(Color.RED);
		continuar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro2.resume();
			}
		});
		continuar2.setBounds(115, 235, 89, 23);
		frame.getContentPane().add(continuar2);
		
		JButton inicio2 = new JButton("iniciar");
		inicio2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inicio2.setEnabled(false);
				inicio2.setBackground(Color.GREEN);
			}
		});
		inicio2.setBackground(Color.RED);
		inicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pro2.empresa(txtIncakola);
				pro2.start();
			}
		});
		inicio2.setBounds(115, 182, 89, 23);
		frame.getContentPane().add(inicio2);
		
		JButton inicio3 = new JButton("iniciar");
		inicio3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inicio3.setEnabled(false);
				inicio3.setBackground(Color.GREEN);
			}
		});
		inicio3.setBackground(Color.RED);
		inicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con1.Nom(1); 
				con1.start();
				
			}
		});
		inicio3.setBounds(479, 11, 89, 23);
		frame.getContentPane().add(inicio3);
		
		JButton continuar3 = new JButton("continuar");
		continuar3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				continuar3.setBackground(Color.GREEN);
			}
		});
		continuar3.setBackground(Color.RED);
		continuar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con1.resume();
			}
		});
		continuar3.setBounds(479, 64, 89, 23);
		frame.getContentPane().add(continuar3);
		
		JButton inicio4 = new JButton("iniciar");
		inicio4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inicio4.setEnabled(false);
				inicio4.setBackground(Color.GREEN);
			}
		});
		inicio4.setBackground(Color.RED);
		inicio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con2.start();
			}
		});
		inicio4.setBounds(479, 182, 89, 23);
		frame.getContentPane().add(inicio4);
		
		JButton continuar4 = new JButton("continuar");
		continuar4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				continuar4.setBackground(Color.GREEN);
			}
		});
		continuar4.setBackground(Color.RED);
		continuar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con2.resume();
			}
		});
		continuar4.setBounds(479, 235, 89, 23);
		frame.getContentPane().add(continuar4);
		
		JLabel lblConsumidor_1 = new JLabel("consumidor1");
		lblConsumidor_1.setBounds(572, 101, 82, 14);
		frame.getContentPane().add(lblConsumidor_1);
		
		JLabel lblConsumidor = new JLabel("consumidor2");
		lblConsumidor.setBounds(572, 269, 82, 14);
		frame.getContentPane().add(lblConsumidor);
		
		txtCocacola = new JTextField();
		txtCocacola.setText("cocacola");
		txtCocacola.setBounds(20, 98, 86, 20);
		frame.getContentPane().add(txtCocacola);
		txtCocacola.setColumns(10);
		
		txtIncakola = new JTextField();
		txtIncakola.setText("incakola");
		txtIncakola.setBounds(19, 266, 86, 20);
		frame.getContentPane().add(txtIncakola);
		txtIncakola.setColumns(10);
		
		JButton pausar1 = new JButton("pausar");
		pausar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				pausar1.setBackground(Color.GREEN);
				continuar1.setBackground(Color.RED);
			}
		});
		pausar1.setBackground(Color.RED);
		pausar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					pro1.suspend();
				
				
			}
		});
		pausar1.setBounds(115, 38, 89, 23);
		frame.getContentPane().add(pausar1);
		
		JButton pausar2 = new JButton("pausar");
		pausar2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pausar2.setBackground(Color.GREEN);
				continuar2.setBackground(Color.RED);
			}
		});
		pausar2.setBackground(Color.RED);
		pausar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro2.suspend();
			}
		});
		pausar2.setBounds(115, 209, 89, 23);
		frame.getContentPane().add(pausar2);
		
		JButton pausar3 = new JButton("pausar");
		pausar3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pausar3.setBackground(Color.GREEN);
				continuar3.setBackground(Color.RED);
			}
		});
		pausar3.setBackground(Color.RED);
		pausar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con1.suspend();
			}
		});
		pausar3.setBounds(479, 38, 89, 23);
		frame.getContentPane().add(pausar3);
		
		JButton pausar4 = new JButton("pausar");
		pausar4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pausar4.setBackground(Color.GREEN);
				continuar4.setBackground(Color.RED);
			}
		});
		pausar4.setBackground(Color.RED);
		pausar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con2.suspend();
			}
		});
		pausar4.setBounds(479, 209, 89, 23);
		frame.getContentPane().add(pausar4);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBackground(Color.WHITE);
		textArea1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 17));
		textArea1.setForeground(Color.RED);
		textArea1.setText("KEVIN VILCAPE QUISPE");
		textArea1.setBounds(244, 260, 204, 23);
		frame.getContentPane().add(textArea1);
		
		
		
	}
}
