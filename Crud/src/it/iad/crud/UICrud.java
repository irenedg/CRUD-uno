package it.iad.crud;

public class UICrud extends javax.swing.JFrame
        implements UIAutomabile {

    private Automa automa;

    public UICrud() {
        initComponents();

        automa = new Automa(this);
    }

    @Override
    public void vaiStatoRicerca() {
        jPanel1.setVisible(false);
        buttonNuova.setEnabled(true);
        buttonNuova.setVisible(true);
        textCodice.setVisible(false);
        textDescrizione.setVisible(false);
        buttonModifica.setVisible(false);
        buttonConferma.setVisible(false);
        buttonAnnulla.setVisible(false);
        buttonRimuovi.setVisible(false);
        textCerca.setVisible(true);
        buttoCerca.setVisible(true);
        buttonSeleziona.setVisible(true);
        jScrollPane2.setVisible(true);

    }

    @Override
    public void vaiStatoAggiungi() {
        jPanel1.setVisible(true);
        buttonNuova.setEnabled(false);
        textCodice.setVisible(true);
        textCodice.setText("");
        textCodice.setEnabled(true);
        textDescrizione.setVisible(true);
        textDescrizione.setText("");
        textDescrizione.setEnabled(true);
        buttonModifica.setVisible(false);
        buttonConferma.setVisible(true);
        buttonAnnulla.setVisible(true);
        buttonRimuovi.setVisible(false);
        textCerca.setVisible(false);
        buttoCerca.setVisible(false);
        buttonSeleziona.setVisible(false);
        jScrollPane2.setVisible(false);
    }

    @Override
    public void vaiStatoVisualizza() {
        jPanel1.setVisible(true);
        buttonNuova.setEnabled(true);
        buttonNuova.setVisible(true);
        textCodice.setVisible(true);
        textCodice.setText("codice");
        textCodice.setEnabled(false);
        textDescrizione.setVisible(true);
        textDescrizione.setText("descrizione");
        textDescrizione.setEnabled(false);
        buttonModifica.setVisible(true);
        buttonConferma.setVisible(false);
        buttonAnnulla.setVisible(false);
        buttonRimuovi.setVisible(true);
        textCerca.setVisible(true);
        buttoCerca.setVisible(true);
        buttonSeleziona.setVisible(true);
        jScrollPane2.setVisible(true);
    }

    @Override
    public void vaiStatoModifica() {
        jPanel1.setVisible(true);
        buttonNuova.setEnabled(false);
        textCodice.setVisible(true);
        textCodice.setEnabled(true);
        textDescrizione.setVisible(true);
        textDescrizione.setEnabled(true);
        buttonModifica.setVisible(false);
        buttonConferma.setVisible(true);
        buttonAnnulla.setVisible(true);
        buttonRimuovi.setVisible(false);
        textCerca.setVisible(false);
        buttoCerca.setVisible(false);
        buttonSeleziona.setVisible(false);
        jScrollPane2.setVisible(true);
    }

    @Override
    public void vaiStatoRimuovi() {
        jPanel1.setVisible(true);
        buttonNuova.setVisible(false);
        textCodice.setVisible(true);
        textCodice.setText("codice");
        textCodice.setEnabled(false);
        textDescrizione.setVisible(true);
        textDescrizione.setText("descrizione");
        textDescrizione.setEnabled(false);
        buttonModifica.setVisible(false);
        buttonConferma.setVisible(true);
        buttonAnnulla.setVisible(true);
        buttonRimuovi.setVisible(false);
        textCerca.setVisible(false);
        buttoCerca.setVisible(false);
        buttonSeleziona.setVisible(true);
        jScrollPane2.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textCodice = new javax.swing.JTextField();
        textDescrizione = new javax.swing.JTextField();
        buttonModifica = new javax.swing.JButton();
        buttonConferma = new javax.swing.JButton();
        buttonAnnulla = new javax.swing.JButton();
        buttonRimuovi = new javax.swing.JButton();
        buttonNuova = new javax.swing.JButton();
        textCerca = new javax.swing.JTextField();
        buttoCerca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        crudTable = new javax.swing.JTable();
        buttonSeleziona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(427, 564));
        setMinimumSize(new java.awt.Dimension(427, 564));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(334, 110));
        jPanel1.setMinimumSize(new java.awt.Dimension(334, 110));

        textCodice.setText("codice");
        textCodice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodiceActionPerformed(evt);
            }
        });

        textDescrizione.setText("descrizione");
        textDescrizione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescrizioneActionPerformed(evt);
            }
        });

        buttonModifica.setText("Modifica");
        buttonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificaActionPerformed(evt);
            }
        });

        buttonConferma.setText("Conferma");
        buttonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfermaActionPerformed(evt);
            }
        });

        buttonAnnulla.setText("Annulla");
        buttonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnnullaActionPerformed(evt);
            }
        });

        buttonRimuovi.setText("Rimuovi");
        buttonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRimuoviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonModifica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonConferma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAnnulla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRimuovi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textCodice, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModifica)
                    .addComponent(buttonConferma)
                    .addComponent(buttonAnnulla)
                    .addComponent(buttonRimuovi))
                .addContainerGap())
        );

        buttonNuova.setText("Nuova");
        buttonNuova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuovaActionPerformed(evt);
            }
        });

        textCerca.setText("cerca per codice");

        buttoCerca.setText("Cerca");
        buttoCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoCercaActionPerformed(evt);
            }
        });

        jScrollPane2.setMaximumSize(new java.awt.Dimension(452, 402));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(452, 402));

        crudTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codice", "Descrizione", "Seleziona"
            }
        ));
        crudTable.setMaximumSize(new java.awt.Dimension(450, 400));
        crudTable.setMinimumSize(new java.awt.Dimension(450, 400));
        crudTable.setPreferredSize(new java.awt.Dimension(450, 400));
        jScrollPane2.setViewportView(crudTable);

        buttonSeleziona.setText("Seleziona");
        buttonSeleziona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelezionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(buttoCerca)
                        .addGap(100, 100, 100)
                        .addComponent(buttonSeleziona))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buttonNuova)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonNuova)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttoCerca)
                    .addComponent(buttonSeleziona))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDescrizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescrizioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescrizioneActionPerformed

    private void buttonNuovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovaActionPerformed
        automa.next(new AddEvent());
    }//GEN-LAST:event_buttonNuovaActionPerformed

    private void buttonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificaActionPerformed
        automa.next(new ModificaEvent());
    }//GEN-LAST:event_buttonModificaActionPerformed

    private void buttonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfermaActionPerformed
        automa.next(new ConfermaEvent());
    }//GEN-LAST:event_buttonConfermaActionPerformed

    private void buttonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnnullaActionPerformed
        automa.next(new AnnullaEvent());
    }//GEN-LAST:event_buttonAnnullaActionPerformed

    private void buttonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRimuoviActionPerformed
        automa.next(new RimuoviEvent());
    }//GEN-LAST:event_buttonRimuoviActionPerformed

    private void buttoCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoCercaActionPerformed
        automa.next(new RicercaEvent());
    }//GEN-LAST:event_buttoCercaActionPerformed

    private void buttonSelezionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelezionaActionPerformed
        automa.next(new SelezionaEvent());
    }//GEN-LAST:event_buttonSelezionaActionPerformed

    private void textCodiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodiceActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoCerca;
    private javax.swing.JButton buttonAnnulla;
    private javax.swing.JButton buttonConferma;
    private javax.swing.JButton buttonModifica;
    private javax.swing.JButton buttonNuova;
    private javax.swing.JButton buttonRimuovi;
    private javax.swing.JButton buttonSeleziona;
    private javax.swing.JTable crudTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField textCerca;
    private javax.swing.JTextField textCodice;
    private javax.swing.JTextField textDescrizione;
    // End of variables declaration//GEN-END:variables
}
