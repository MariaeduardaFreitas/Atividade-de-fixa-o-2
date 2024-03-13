package maria;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Fixacao extends JFrame{
    
    private JButton pedir;
    private JLabel valorbrig;
    private JLabel valorcookie;
    private JLabel valorpudim;
    private JLabel imgbrig;
    private JLabel imgcookie;
    private JLabel imgpudim;
    private JLabel loja;
    private JTextField qtdbrig;
    private JTextField qtdcookie;
    private JTextField qtdpudim;
    
    public Fixacao(){
        
        super("Login");
        setLayout(new FlowLayout());
        
        loja = new JLabel("Loja de doces");
        add(loja);
        
        ImageIcon img1 = new ImageIcon(getClass().getResource("brig.jpg"));
        imgbrig = new JLabel(img1);
        add(imgbrig);
        
        valorbrig = new JLabel("R$ 10,00");
        add(valorbrig);
        
        qtdbrig = new JTextField("0", 5);
        add(qtdbrig);
        
        img1 = new ImageIcon(getClass().getResource("cookie.jpg"));
        imgcookie = new JLabel(img1);
        add(imgcookie);
        
        valorcookie = new JLabel("R$ 15,00");
        add(valorcookie);
        
        qtdcookie = new JTextField("0",5);
        add(qtdcookie);
        
        img1 = new ImageIcon(getClass().getResource("pudim.jpg"));
        imgpudim = new JLabel(img1);
        add(imgpudim);
        
        valorpudim = new JLabel ("R$ 25,00");
        add(valorpudim);
        
        qtdpudim = new JTextField("0", 5);
        add(qtdpudim);
        
        pedir = new JButton("Finalizar pedido");
        add(pedir);
        
        Handler han = new Handler(); 
        qtdbrig.addActionListener(han);
        qtdcookie.addActionListener(han);
        qtdpudim.addActionListener(han);
        pedir.addActionListener(han);
    }
    
    private class Handler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            
            if(event.getSource() == pedir){
                String aparece = "";
                int qtd1 = Integer.parseInt(qtdbrig.getText());
                int qtd2 = Integer.parseInt(qtdcookie.getText());
                int qtd3 = Integer.parseInt(qtdpudim.getText());

                double total = qtd1*10.00 + qtd2*15.00 + qtd3*25.00;
                aparece = String.format("O total da compra: %s", total);
                JOptionPane.showMessageDialog(null, aparece);
            }
        }
    }
}
