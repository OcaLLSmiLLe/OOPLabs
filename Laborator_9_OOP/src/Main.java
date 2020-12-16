import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	 private static JButton button;
	    private static JTextField divizibil;
	    private static JTextField divizor;
	    private static JLabel devisableLabel;
	    private static JLabel devisorLabel;
	    private static JLabel rezultat;
	    private static JLabel error;

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 

		    
		        JFrame frame = new JFrame("Lab 9 ->Simple devizion calculator");
		        frame.setLayout(null);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(600, 400);
		        frame.setResizable(false);
		        Container c = frame.getContentPane();

		        divizibil = new JTextField();
		        divizibil.setSize(100, 20);
		        divizibil.setLocation(120, 70);
		        c.add(divizibil);

		        divizor = new JTextField();
		        divizor.setSize(100, 20);
		        divizor.setLocation(120, 120);
		        c.add(divizor);

		        devisableLabel = new JLabel("De devizat: ");
		        devisableLabel.setSize(70, 20);
		        devisableLabel.setLocation(30, 70);
		        c.add(devisableLabel);

		        devisorLabel = new JLabel("Devizor:");
		        devisorLabel.setSize(70, 20);
		        devisorLabel.setLocation(30, 120);
		        c.add(devisorLabel);

		        rezultat = new JLabel("Rezultat: ");
		        rezultat.setSize(100, 20);
		        rezultat.setLocation(30, 170);
		        c.add(rezultat);

		        error = new JLabel();
		        error.setForeground(Color.red);
		        error.setSize(400, 20);
		        error.setLocation(30, 220);
		        c.add(error);

		        button = new JButton(" / ");
		        button.setSize(120, 40);
		        button.setLocation(240, 270);
		        button.addActionListener(new ActionListener() {
		            @Override
		            public void  actionPerformed (ActionEvent e) {
		                try {
		                    rezultat.setText("Resultat:");
		                    
		                    float numar1 =  Float.parseFloat(divizibil.getText());
		                    float numar2 = Float.parseFloat(divizor.getText());

		                    if (numar2 == 13) {
		                        throw new UnluckyException();
		                    }
		                    float resultat = numar1 / numar2;
		                    rezultat.setText(String.format("%3f", resultat));
		                } catch(NullPointerException npe) {
		                   System.err.println("Nu toate randurile au fost completate!");
		                } catch (NumberFormatException nfe) {
		                   error.setText("Formatul numarului nu e potrivit!");
		                } catch (ArithmeticException ae) {
		                   error.setText("Expresia nu poate fi calculata");
		                } catch (UnluckyException ue) {
		                    error.setText(ue.text);
		                }
		            }
		        });

		        c.add(button);

		        frame.setVisible(true);
		    }

	}


