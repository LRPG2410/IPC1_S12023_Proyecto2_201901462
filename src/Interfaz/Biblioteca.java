package Interfaz;

import Codigo.ListaCircular;
import Codigo.ListaSimple;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Biblioteca extends javax.swing.JFrame {

    private JTextField txtUsuario_Menu_Simulacion;
    private ListaCircular listaCircular;
    private ListaSimple listaSimple;
    private Menu menu;

    public Biblioteca(JTextField txtUsuario_Menu, ListaCircular listaCircular, ListaSimple listaSimple, Menu menu) {
        this.txtUsuario_Menu_Simulacion = txtUsuario_Menu;
        this.listaCircular = listaCircular;
        this.listaSimple = listaSimple;
        this.menu = menu;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregarImagen_Biblioteca = new javax.swing.JButton();
        btnEliminarImagen_Biblioteca = new javax.swing.JButton();
        btnAgregarCategoria_Biblioteca = new javax.swing.JButton();
        btnEliminarCategoria_Biblioteca = new javax.swing.JButton();
        lblMenu_Biblioteca = new javax.swing.JLabel();
        lblImagen_Biblioteca = new javax.swing.JLabel();
        lblUsuario_Biblioteca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFiltro_Biblioteca = new javax.swing.JButton();
        cbFiltros = new javax.swing.JComboBox<>();
        lblAnterior = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        btnLimpiar_Biblioteca = new javax.swing.JButton();
        btnGuardar_Biblioteca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarImagen_Biblioteca.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregarImagen_Biblioteca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnAgregarImagen_Biblioteca.setText("Agregar Imagen");
        btnAgregarImagen_Biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagen_BibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarImagen_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 160, -1));

        btnEliminarImagen_Biblioteca.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarImagen_Biblioteca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEliminarImagen_Biblioteca.setText("Eliminar Imagen");
        jPanel1.add(btnEliminarImagen_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 160, -1));

        btnAgregarCategoria_Biblioteca.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregarCategoria_Biblioteca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnAgregarCategoria_Biblioteca.setText("Agregar Categoría");
        jPanel1.add(btnAgregarCategoria_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, -1));

        btnEliminarCategoria_Biblioteca.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCategoria_Biblioteca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEliminarCategoria_Biblioteca.setText("Eliminar Categoría");
        jPanel1.add(btnEliminarCategoria_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, -1));

        lblMenu_Biblioteca.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblMenu_Biblioteca.setText("Menu");
        lblMenu_Biblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu_BibliotecaMouseClicked(evt);
            }
        });
        jPanel1.add(lblMenu_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblImagen_Biblioteca.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen_Biblioteca.setOpaque(true);
        lblImagen_Biblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagen_BibliotecaMouseClicked(evt);
            }
        });
        jPanel1.add(lblImagen_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 390, 380));

        lblUsuario_Biblioteca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblUsuario_Biblioteca.setForeground(new java.awt.Color(204, 0, 0));
        lblUsuario_Biblioteca.setText("Usuario1");
        jPanel1.add(lblUsuario_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("> Biblioteca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnFiltro_Biblioteca.setBackground(new java.awt.Color(0, 204, 204));
        btnFiltro_Biblioteca.setText("FILTRO");
        btnFiltro_Biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltro_BibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltro_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        cbFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco y Negro", "Rojo", "Azul" }));
        jPanel1.add(cbFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 20));

        lblAnterior.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblAnterior.setText("<");
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseClicked(evt);
            }
        });
        jPanel1.add(lblAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        lblSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblSiguiente.setText(">");
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        jPanel1.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, -1));

        btnLimpiar_Biblioteca.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar_Biblioteca.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar_Biblioteca.setText("LIMPIAR");
        btnLimpiar_Biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar_BibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, -1));

        btnGuardar_Biblioteca.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardar_Biblioteca.setText("GUARDAR");
        btnGuardar_Biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar_BibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String usuario = txtUsuario_Menu_Simulacion.getText();
        System.out.println(usuario);
        lblUsuario_Biblioteca.setText(usuario);
        //listaSimple.insertarString("usuario1");
        //listaSimple.insertarString("usuario2");
        //listaSimple.imprimirLista(); // imprime los elementos de la lista
    }//GEN-LAST:event_formWindowOpened

    private void lblMenu_BibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu_BibliotecaMouseClicked
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblMenu_BibliotecaMouseClicked

    private void lblImagen_BibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagen_BibliotecaMouseClicked

    }//GEN-LAST:event_lblImagen_BibliotecaMouseClicked

    private void btnAgregarImagen_BibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagen_BibliotecaActionPerformed
        //Utilizar la libreria JFileChooser para mostrar una ventana que abra un archivo
        JFileChooser fileChooser = new JFileChooser();
        //Añadimos un filtro para que solo se muestren archivos .jpg, .png y .jpeg
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "jpeg");
        //Atachamos el filtro al fileChooser
        fileChooser.setFileFilter(filtro);
        //Obtenemos que boton se presionó en el fileChooser
        int seleccionDeBoton = fileChooser.showOpenDialog(null);
        //Si se seleccionó "abrir archivo"
        if (seleccionDeBoton == JFileChooser.APPROVE_OPTION) {
            try {
                //Cargar el archivo
                File archivo = fileChooser.getSelectedFile();
                //Vamos a cargar el archivo como una imagen
                Image imagen = ImageIO.read(archivo);
                //Configuramos las dimensiones de la imagen para que esta siempre mida lo mismo
                int ancho = imagen.getWidth(null);
                int alto = imagen.getHeight(null);
                if (ancho > 300 || alto > 300) {
                    //calculo de la escala correcta 
                    double escala = Math.min(400.0 / ancho, 400.0 / alto);
                    int nuevoAncho = (int) (ancho * escala);
                    int nuevoAlto = (int) (alto * escala);
                    //Ya teniendo las nuevas dimensiones ajustamos la imagen
                    imagen = imagen.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
                }

                //Poner la imagen en el JLabel
                lblImagen_Biblioteca.setIcon(new ImageIcon(imagen));

                //Insertar la imagen en la lista
                listaCircular.insertarImagen(new ImageIcon(imagen));
            } catch (IOException ex) {
                System.out.println("ERROR");
            }
        }
    }//GEN-LAST:event_btnAgregarImagen_BibliotecaActionPerformed

    private void btnFiltro_BibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltro_BibliotecaActionPerformed
        String filtroSeleccionado = (String) cbFiltros.getSelectedItem();
        switch (filtroSeleccionado) {
            case "Blanco y Negro":
                filtroBN();
                break;
            case "Rojo":
                filtroRed();
                break;
            case "Azul":
                filtroBlue();
                break;
        }
    }//GEN-LAST:event_btnFiltro_BibliotecaActionPerformed

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        lblImagen_Biblioteca.setIcon(listaCircular.getImagenSiguiente());
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseClicked
        lblImagen_Biblioteca.setIcon(listaCircular.getImagenAnterior());
    }//GEN-LAST:event_lblAnteriorMouseClicked

    private void btnLimpiar_BibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar_BibliotecaActionPerformed
        lblImagen_Biblioteca.setIcon(listaCircular.resetImagen());
    }//GEN-LAST:event_btnLimpiar_BibliotecaActionPerformed

    private void btnGuardar_BibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar_BibliotecaActionPerformed
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen_Biblioteca.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if (icono != null) {
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();

            //Mostrar el JFileChooser para elegir donde guardar la imagen
            JFileChooser fileChooser = new JFileChooser();
            //Cambiamos el titulo a "Guardar archivo"
            fileChooser.setDialogTitle("Guardar archivo");
            //Añadimos un filtro para que solo se muestren archivos .jpg, .png y .jpeg
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de imagen", "png", "jpg", "jpeg");
            //Atachamos el filtro al fileChooser
            fileChooser.setFileFilter(filtro);
            //Obtenemos que boton se presionó en el fileChooser
            int seleccionDeBoton = fileChooser.showSaveDialog(null);
            //Si se acepto guardar el archivo
            if (seleccionDeBoton == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();
                String nombreDeArchivo = archivo.getName();
                String extension = "";
                int posPunto = nombreDeArchivo.lastIndexOf(".");
                if (posPunto > 0) {
                    //imagen.pdf    /escritorio/a.jpg
                    //imagen . jpg
                    extension = nombreDeArchivo.substring(posPunto + 1);
                }
                if (!extension.equals("jpg") && !extension.equals("jpeg") && !extension.endsWith("png")) {
                    //Añadimos la extension al archivo
                    archivo = new File(archivo.getAbsolutePath() + ".png");
                    extension = "png";
                }
                //Verificamo si el archivo existe y si no existe lo creamos
                if (!archivo.exists()) {
                    try {
                        archivo.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("ERROR");
                    }
                }
                try {
                    //Guardamos la imagen en el archivo
                    ImageIO.write(bufferedImage, extension, archivo);
                    JOptionPane.showMessageDialog(this, "Imagen guardada");
                } catch (IOException ex) {
                    System.out.println("ERROR");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, no hay imagen");
        }
    }//GEN-LAST:event_btnGuardar_BibliotecaActionPerformed

    private void filtroBN() {
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen_Biblioteca.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if (icono != null) {
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            //Recorrer pixel por pixel para cambiar los valores de RGB en ese pixel
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                for (int j = 0; j < bufferedImage.getHeight(); j++) {
                    //Almacenamos los valores RGB del pixel
                    Color pixelColor = new Color(bufferedImage.getRGB(i, j));
                    //Sacamos un promedio de los valores RGB
                    int promedio = (pixelColor.getRed() + pixelColor.getBlue() + pixelColor.getGreen()) / 3;
                    //Aplicamos el filtro a un nuevo pixel
                    Color nuevo_pixelColor = new Color(promedio, promedio, promedio);
                    //Repintamos el pixel para aplicar el filtro
                    bufferedImage.setRGB(i, j, nuevo_pixelColor.getRGB());
                }
            }
            //Colocar la imagen con filtro en el JLabel
            lblImagen_Biblioteca.setIcon(new ImageIcon(bufferedImage));
            //Actualizamos el filtro de la imagen en la lista
            listaCircular.actualizarImagen(new ImageIcon(bufferedImage));
        }
    }

    private void filtroRed() {
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen_Biblioteca.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if (icono != null) {
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            //Recorrer pixel por pixel para cambiar los valores de RGB en ese pixel
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                for (int j = 0; j < bufferedImage.getHeight(); j++) {
                    //Almacenamos los valores RGB del pixel
                    Color pixelColor = new Color(bufferedImage.getRGB(i, j));
                    //Sacamos un promedio de los valores RGB
                    int promedio = (pixelColor.getRed() + pixelColor.getBlue() + pixelColor.getGreen()) / 3;
                    //Aplicamos el filtro a un nuevo pixel
                    Color nuevo_pixelColor = new Color(promedio, 0, 0);
                    //Repintamos el pixel para aplicar el filtro
                    bufferedImage.setRGB(i, j, nuevo_pixelColor.getRGB());
                }
            }
            //Colocar la imagen con filtro en el JLabel
            lblImagen_Biblioteca.setIcon(new ImageIcon(bufferedImage));
            //Actualizamos el filtro de la imagen en la lista
            listaCircular.actualizarImagen(new ImageIcon(bufferedImage));
        }
    }

    private void filtroBlue() {
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen_Biblioteca.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if (icono != null) {
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            //Recorrer pixel por pixel para cambiar los valores de RGB en ese pixel
            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                for (int j = 0; j < bufferedImage.getHeight(); j++) {
                    //Almacenamos los valores RGB del pixel
                    Color pixelColor = new Color(bufferedImage.getRGB(i, j));
                    //Sacamos un promedio de los valores RGB
                    int promedio = (pixelColor.getRed() + pixelColor.getBlue() + pixelColor.getGreen()) / 3;
                    //Aplicamos el filtro a un nuevo pixel
                    Color nuevo_pixelColor = new Color(0, 0, promedio);
                    //Repintamos el pixel para aplicar el filtro
                    bufferedImage.setRGB(i, j, nuevo_pixelColor.getRGB());
                }
            }
            //Colocar la imagen con filtro en el JLabel
            lblImagen_Biblioteca.setIcon(new ImageIcon(bufferedImage));
            //Actualizamos el filtro de la imagen en la lista
            listaCircular.actualizarImagen(new ImageIcon(bufferedImage));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria_Biblioteca;
    private javax.swing.JButton btnAgregarImagen_Biblioteca;
    private javax.swing.JButton btnEliminarCategoria_Biblioteca;
    private javax.swing.JButton btnEliminarImagen_Biblioteca;
    private javax.swing.JButton btnFiltro_Biblioteca;
    private javax.swing.JButton btnGuardar_Biblioteca;
    private javax.swing.JButton btnLimpiar_Biblioteca;
    private javax.swing.JComboBox<String> cbFiltros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblImagen_Biblioteca;
    private javax.swing.JLabel lblMenu_Biblioteca;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblUsuario_Biblioteca;
    // End of variables declaration//GEN-END:variables
}
