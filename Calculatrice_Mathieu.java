package ProjetCalculatrice;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calculatrice_Mathieu extends JFrame{
	
	/* Booléen qui indique si on est en train d'entrer le premier ou le deuxieme nombre du calcul
	 * false -> saisie du premier nombre
	 * true -> saisie du deuxieme nombre */
	static boolean nb = false;
	
	/* Booléen qui indique si une virgule a déjà été saisie dans le nombre
	 * false -> aucune virgule n'a été saisie
	 * true -> une virgule a déjà été saisie */
	static boolean virgule = false;
	
	// Chaine de caractère qui stocke temporairement le nombre saisi
	static String tab = "";
	
	// Les nombres du calcul
	static double nombre1;
	static double nombre2;
	
	// Ajoute le chiffre qui vient d'être saisi à la fin de la chaine de caractère
	public static void ajouter(char a) {
		tab+=a;
	}
	
	// Convertit la chaine de caratère en double et l'affiche
	public static void afficherTableau() {
		System.out.println(Double.parseDouble(tab));
	}
	
	// Réinitialise les valeurs des nombres à 0 et les booleens à false
	public static void reset() {
		nb = false;
		virgule = false;
		tab = "";
		nombre1 = 0;
		nombre2 = 0;
	}
	
	// Déclaration de la calculatrice
	public Calculatrice_Mathieu() {
		
		// Création de la fenêtre
		super("Ma Calculatrice");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		
		// Déclaration des boutons
		JButton bouton1 = new JButton("1");
		JButton bouton2 = new JButton("2");
		JButton bouton3 = new JButton("3");
		JButton bouton4 = new JButton("4");
		JButton bouton5 = new JButton("5");
		JButton bouton6 = new JButton("6");
		JButton bouton7 = new JButton("7");
		JButton bouton8 = new JButton("8");
		JButton bouton9 = new JButton("9");
		JButton bouton10 = new JButton(".");
		JButton bouton11 = new JButton("+");
		JButton bouton12 = new JButton("-");
		JButton bouton13 = new JButton("*");
		JButton bouton14 = new JButton("/");
		JButton bouton15 = new JButton("=");
		JButton bouton16 = new JButton("C");
		
		// Ajout des Actions sur les boutons
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('1');
				afficherTableau();
			}
		});
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('2');
				afficherTableau();
			}
		});
		bouton1.setSize(100, 100);
		bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('3');
				afficherTableau();
			}
		});
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('4');
				afficherTableau();
			}
		});
		bouton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('5');
				afficherTableau();
			}
		});
		bouton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('6');
				afficherTableau();
			}
		});
		bouton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('7');
				afficherTableau();
			}
		});
		bouton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('8');
				afficherTableau();
			}
		});
		bouton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('9');
				afficherTableau();
			}
		});
		bouton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ajouter('.');
			}
		});
		bouton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("+");
			}
		});
		bouton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("-");
			}
		});
		bouton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("*");
			}
		});
		bouton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("/");
			}
		});
		bouton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("=");
			}
		});
		bouton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("C");
				reset();
			}
		});
		
		// Ajout des boutons sur la fenêtre
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(bouton1);
		contentPane.add(bouton2);
		contentPane.add(bouton3);
		contentPane.add(bouton4);
		contentPane.add(bouton5);
		contentPane.add(bouton6);
		contentPane.add(bouton7);
		contentPane.add(bouton8);
		contentPane.add(bouton9);
		contentPane.add(bouton10);
		contentPane.add(bouton11);
		contentPane.add(bouton12);
		contentPane.add(bouton13);
		contentPane.add(bouton14);
		contentPane.add(bouton15);
		contentPane.add(bouton16);
	}
	
	public static void main(String[] args) {
		
		// Création de la calculatrice
		Calculatrice_Mathieu calculatrice = new Calculatrice_Mathieu();
		calculatrice.setVisible(true);

	}

}