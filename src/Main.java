import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Main implements ActionListener {

    private static JLabel label2;
    private static JFrame frame;
    private static JPanel panel;
    private static JButton button;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(920, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Le Saviez-vous?");
        frame.setFont(Font.getFont("Comic Sans MS"));


        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        JLabel label1 = new JLabel("Le Saviez-vous?");
        label1.setBounds(20, 20, 500, 25);
        panel.add(label1);
        label1.setFont(new Font("Comic Sans MS",Font.PLAIN,19));
        label1.setForeground(Color.LIGHT_GRAY);


        label2 = new JLabel("");
        label2.setBounds(20, 300, 900, 50);
        panel.add(label2);
        label2.setFont(new Font("Comic Sans MS",Font.PLAIN,19));
        label2.setForeground(Color.WHITE);

        button = new JButton("MONTRER UN AUTRE FAIT");
        button.setBounds(20, 600, 860, 40);
        button.addActionListener(new Main());
        button.setFont(new Font("Verdana",Font.BOLD,15));
        panel.add(button);





        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("La bière ne fait pas prendre du ventre!!");
        quotes.add("Etre amoureux vous rendre fainéant");
        quotes.add("LE MUSCLE LE PLUS PUISSANT DU CORPS EST LA LANGUE");
        quotes.add("L’ARBRE DU KIWI EST APPELÉ L’ACTINIDIA");
        quotes.add("LES NOIX DE COCO TUENT PLUS DE GENS QUE LES REQUINS");
        quotes.add("SI ON METTAIT LES POUMONS À PLAT ILS COUVRIRAIENT 140M2");
        quotes.add("IL Y A 26 OS DANS UN PIED");
        quotes.add("CE SONT LES HIPPOCAMPES MÂLES QUI PORTENT LES BÉBÉS DANS LEUR VENTRE");
        quotes.add("L'OURS POLAIRE A LA PEAU TOUTE NOIRE SOUS SA FOURRURE BLANCHE");


        int indx = (int) (Math.random()* (quotes.size()  - 1) + 0);
        Random loun = new Random();
        // Java 'Color' class takes 3 floats, from 0 to 1.
        float r = loun.nextFloat();
        float g = loun.nextFloat();
        float b = loun.nextFloat();
        Color randomColor = new Color(r, g, b);
        panel.setBackground(randomColor);
        button.setForeground(randomColor);

        label2.setText(quotes.get(indx));
    }
}
