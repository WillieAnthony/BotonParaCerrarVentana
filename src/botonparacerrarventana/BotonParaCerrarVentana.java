package botonparacerrarventana;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BotonParaCerrarVentana extends JFrame {
    
    // Constructor para configurar el panel
    public BotonParaCerrarVentana() {
        setTitle("Boton Para Cerrar Ventana"); // Título de la ventana
        setSize(1280, 720); // Dimensiones del panel
        setLayout(null); // Sin diseño predeterminado
        setResizable(false); // No permite cambiar el tamaño
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // No cerrar automáticamente
        setVisible(true); // Hacer visible la ventana
        
        // Crear botones
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        
        // Configurar posiciones y tamaños de los botones
        boton1.setBounds(100, 100, 200, 50);
        boton2.setBounds(100, 200, 200, 50);
        boton3.setBounds(100, 300, 200, 50);
        
        // Agregar botones al formulario
        add(boton1);
        add(boton2);
        add(boton3);
        
        // Agregar acción para el botón 3 para cerrar la aplicación
        boton3.addActionListener(e -> System.exit(0));
    }
    
    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new BotonParaCerrarVentana();
    }
}
