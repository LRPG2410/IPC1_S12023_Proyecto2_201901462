package Interfaz;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEditor_Menu = new javax.swing.JButton();
        btnConvertidor_Menu = new javax.swing.JButton();
        lblUsuario_Menu = new javax.swing.JLabel();
        txtUsuario_Menu = new javax.swing.JTextField();
        btnBiblioteca_Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel1.setText("USAC VIEWER");

        btnEditor_Menu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnEditor_Menu.setText("INGRESAR A EDITOR");

        btnConvertidor_Menu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnConvertidor_Menu.setText("INGRESAR A CONVERTIDOR");

        lblUsuario_Menu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblUsuario_Menu.setText("USUARIO:");

        txtUsuario_Menu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        btnBiblioteca_Menu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnBiblioteca_Menu.setText("INGRESAR A BIBLIOTECA");
        btnBiblioteca_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiblioteca_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(btnConvertidor_Menu)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditor_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUsuario_Menu)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBiblioteca_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertidor_Menu)
                    .addComponent(btnEditor_Menu))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario_Menu)
                    .addComponent(txtUsuario_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnBiblioteca_Menu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBiblioteca_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiblioteca_MenuActionPerformed
        String usuario = txtUsuario_Menu.getText();
        if ("201901462".equals(usuario)){
            
        }
    }//GEN-LAST:event_btnBiblioteca_MenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiblioteca_Menu;
    private javax.swing.JButton btnConvertidor_Menu;
    private javax.swing.JButton btnEditor_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario_Menu;
    private javax.swing.JTextField txtUsuario_Menu;
    // End of variables declaration//GEN-END:variables
}
