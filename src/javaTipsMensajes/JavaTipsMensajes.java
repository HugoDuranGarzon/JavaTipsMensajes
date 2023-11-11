package javaTipsMensajes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaTipsMensajes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaTipsMensajes window = new JavaTipsMensajes();
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
	public JavaTipsMensajes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JButton boton1 = new JButton("Boton1");
		boton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("El boton 1 ha sido pulsado");
				System.out.println("¿Sabias que en una gran cantidad de programas en windows puedes pulsar Ctrl+E para seleccionar todo?");
			}
		});
		
		JButton boton2 = new JButton("Boton2");
		boton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("El boton 2 ha sido pulsado");
				System.out.println("¿Sabias que si pulas la tecla Windows+E se abrira el explorador de archivos?");
			}
		});
		
		JButton boton3 = new JButton("Boton3");
		boton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("El boton 3 ha sido pulsado");
				System.out.println("¿Sabias que si pulsas el boton Windows+1 , Windows+2, etc se abrira las aplicaciones que estan fijadas en la barra de tareas?");
			}
		});
		
		JButton boton4 = new JButton("Boton4");
		boton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("El boton 4 ha sido pulsado");
				System.out.println("¿Sabias que el si al ejecutar un programa desde el cuadro de busqueda de windows pulsas Mayus+Ctrl+Enter este programa se ejecutara como administrador?");
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(boton3)
						.addComponent(boton1))
					.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(boton4)
						.addComponent(boton2))
					.addGap(58))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(boton2)
						.addComponent(boton1))
					.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(boton3)
						.addComponent(boton4))
					.addGap(41))
		);
		panel.setLayout(gl_panel);
	}
}
