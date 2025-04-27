import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaGestionAcademica extends JFrame {
    
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    
    public VistaGestionAcademica() {
        // Set up the frame
        setTitle("Sistema de Gestión Academica");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create a panel with a grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Create buttons
        button1 = createButton("Verificar A", "Action 1");
        button2 = createButton("Button 2", "Action 2");
        button3 = createButton("Button 3", "Action 3");
        button4 = createButton("Button 4", "Action 4");
        button5 = createButton("Button 5", "Action 5");
        
        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        
        // Add panel to the frame
        add(panel);
    }
    
    private JButton createButton(String text, String actionCommand) {
        JButton button = new JButton(text);
        button.setActionCommand(actionCommand);
        button.addActionListener(new ButtonClickListener());
        return button;
    }
    
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            System.out.println("Button clicked: " + command);
            
            // You can add specific actions for each button here
            switch(command) {
                case "Action 1":
                    JOptionPane.showMessageDialog(VistaGestionAcademica.this, "You clicked Button 1");
                    break;
                case "Action 2":
                    JOptionPane.showMessageDialog(VistaGestionAcademica.this, "You clicked Button 2");
                    break;
                case "Action 3":
                    JOptionPane.showMessageDialog(VistaGestionAcademica.this, "You clicked Button 3");
                    break;
                case "Action 4":
                    JOptionPane.showMessageDialog(VistaGestionAcademica.this, "You clicked Button 4");
                    break;
                case "Action 5":
                    JOptionPane.showMessageDialog(VistaGestionAcademica.this, "You clicked Button 5");
                    break;
                default:
                    System.out.println("Unknown action");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VistaGestionAcademica app = new VistaGestionAcademica();
                app.setVisible(true);
            }
        });
    }
}