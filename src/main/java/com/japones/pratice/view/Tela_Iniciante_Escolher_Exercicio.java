/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.japones.pratice.view;

import java.awt.Color;
import java.awt.font.TextAttribute;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

/**
 *
 * @author Suporte TI
 */
public class Tela_Iniciante_Escolher_Exercicio extends javax.swing.JFrame {

    /**
     * Creates new form Tela_3
     */
	
	private static String tipo_atividade = "h";
	private static boolean praticar_tudo = false;
	private static int atividade = 1;
	
	public static boolean getPraticarTudo() {
		
		return praticar_tudo;
	}
	
	
    public Tela_Iniciante_Escolher_Exercicio() {
        initComponents();
        getContentPane().setBackground(new Color(255, 170, 170));
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	tipo_atividade = Tela_Iniciante_Escolher_Treino.getTipoTreino();
    	atividade = Tela_Iniciante_Escolher_Atividade.getAtividade();

        jLabel1 = new javax.swing.JLabel("", SwingConstants.CENTER);
        jButtonVoltar = new javax.swing.JButton();
        jButtonPraticarTudo = new javax.swing.JButton();
        jButtonTreinoEscrita = new javax.swing.JButton();
        jButtonTreinoLeitura = new javax.swing.JButton();
        jButtonRevisaoEscrita = new javax.swing.JButton();
        jButtonRevisaoLeitura = new javax.swing.JButton();
        jButtonRomaji2Hiragana = new javax.swing.JButton();
        jButtonHiragana2Romaji = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 170, 170));
        
        String treino ="";
        if(tipo_atividade.equals("h"))
        	treino = "Hiragana";
        else
        	treino = "Katakana";
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atividade " + atividade);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon("src/Imagens/btn_voltar.png")); // NOI18N
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonPraticarTudo.setBackground(new java.awt.Color(255, 252, 255));
        jButtonPraticarTudo.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonPraticarTudo.setForeground(new java.awt.Color(255, 155, 155));
        jButtonPraticarTudo.setText("Praticar tudo");
        jButtonPraticarTudo.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonPraticarTudo.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonPraticarTudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPraticarTudoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPraticarTudoMouseExited(evt);
            }
        });
        jButtonPraticarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonPraticarTudoActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonTreinoEscrita.setBackground(new java.awt.Color(255, 252, 255));
        jButtonTreinoEscrita.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonTreinoEscrita.setForeground(new java.awt.Color(255, 155, 155));
        jButtonTreinoEscrita.setText("Treino - Escrita");
        jButtonTreinoEscrita.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonTreinoEscrita.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonTreinoEscrita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTreinoEscritaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTreinoEscritaMouseExited(evt);
            }
        });
        jButtonTreinoEscrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonTreinoEscritaActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonTreinoLeitura.setBackground(new java.awt.Color(255, 252, 255));
        jButtonTreinoLeitura.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonTreinoLeitura.setForeground(new java.awt.Color(255, 155, 155));
        jButtonTreinoLeitura.setText("Treino - Leitura");
        jButtonTreinoLeitura.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonTreinoLeitura.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonTreinoLeitura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTreinoLeituraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTreinoLeituraMouseExited(evt);
            }
        });
        jButtonTreinoLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonTreinoLeituraActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonRevisaoEscrita.setBackground(new java.awt.Color(255, 252, 255));
        jButtonRevisaoEscrita.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonRevisaoEscrita.setForeground(new java.awt.Color(255, 155, 155));
        jButtonRevisaoEscrita.setText("Revis�o - Escrita");
        jButtonRevisaoEscrita.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonRevisaoEscrita.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonRevisaoEscrita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRevisaoEscritaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRevisaoEscritaMouseExited(evt);
            }
        });
        jButtonRevisaoEscrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonRevisaoEscritaActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonRevisaoLeitura.setBackground(new java.awt.Color(255, 252, 255));
        jButtonRevisaoLeitura.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonRevisaoLeitura.setForeground(new java.awt.Color(255, 155, 155));
        jButtonRevisaoLeitura.setText("Revis�o - Leitura");
        jButtonRevisaoLeitura.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonRevisaoLeitura.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonRevisaoLeitura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRevisaoLeituraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRevisaoLeituraMouseExited(evt);
            }
        });
        jButtonRevisaoLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonRevisaoLeituraActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonRomaji2Hiragana.setBackground(new java.awt.Color(255, 252, 255));
        jButtonRomaji2Hiragana.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonRomaji2Hiragana.setForeground(new java.awt.Color(255, 155, 155));
        jButtonRomaji2Hiragana.setText("Romaji para " + treino);
        jButtonRomaji2Hiragana.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonRomaji2Hiragana.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonRomaji2Hiragana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRomaji2HiraganaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRomaji2HiraganaMouseExited(evt);
            }
        });
        jButtonRomaji2Hiragana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonRomaji2HiraganaActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonHiragana2Romaji.setBackground(new java.awt.Color(255, 252, 255));
        jButtonHiragana2Romaji.setFont(new java.awt.Font("Goudy Old Style", 2, 25)); // NOI18N
        jButtonHiragana2Romaji.setForeground(new java.awt.Color(255, 155, 155));
        jButtonHiragana2Romaji.setText(treino + " para Romaji");
        jButtonHiragana2Romaji.setMaximumSize(new java.awt.Dimension(280, 50));
        jButtonHiragana2Romaji.setMinimumSize(new java.awt.Dimension(280, 50));
        jButtonHiragana2Romaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHiragana2RomajiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHiragana2RomajiMouseExited(evt);
            }
        });
        jButtonHiragana2Romaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonHiragana2RomajiActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRomaji2Hiragana, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jButtonRevisaoEscrita, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jButtonTreinoEscrita, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonHiragana2Romaji, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jButtonRevisaoLeitura, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jButtonTreinoLeitura, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonVoltar)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPraticarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jButtonPraticarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTreinoEscrita, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonTreinoLeitura, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRevisaoEscrita, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonRevisaoLeitura, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRomaji2Hiragana, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonHiragana2Romaji, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        new Tela_Iniciante_Escolher_Atividade().main(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonPraticarTudoActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonPraticarTudoActionPerformed
        praticar_tudo = true;
        Tela_Iniciante_Treino_Revisao_Escrita.setContexto("t");
      
    	
        new Tela_Iniciante_Treino_Revisao_Escrita().main(null);;
        
        
        this.dispose();
    }//GEN-LAST:event_jButtonPraticarTudoActionPerformed

    private void jButtonTreinoEscritaActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonTreinoEscritaActionPerformed
    	praticar_tudo = false;
    	Tela_Iniciante_Treino_Revisao_Escrita.setContexto("t");
    	new Tela_Iniciante_Treino_Revisao_Escrita().main(null);
    	    	
    	 this.dispose();
    }//GEN-LAST:event_jButtonTreinoEscritaActionPerformed

    private void jButtonTreinoLeituraActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonTreinoLeituraActionPerformed
    	praticar_tudo = false;
    	
    	Tela_Iniciante_Treino_Revisao_Leitura.setContexto("t");
    	new Tela_Iniciante_Treino_Revisao_Leitura().main(null);
    	
    	 this.dispose();
    }//GEN-LAST:event_jButtonTreinoLeituraActionPerformed

    private void jButtonRevisaoEscritaActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonRevisaoEscritaActionPerformed
    	praticar_tudo = false;
    	
    	Tela_Iniciante_Treino_Revisao_Escrita.setContexto("r");
    	new Tela_Iniciante_Treino_Revisao_Escrita().main(null);
    	
    	 this.dispose();
    }//GEN-LAST:event_jButtonRevisaoEscritaActionPerformed

    private void jButtonRevisaoLeituraActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonRevisaoLeituraActionPerformed
    	praticar_tudo = false;
    	
    	Tela_Iniciante_Treino_Revisao_Leitura.setContexto("r");
    	new Tela_Iniciante_Treino_Revisao_Leitura().main(null);
    	
    	 this.dispose();
    }//GEN-LAST:event_jButtonRevisaoLeituraActionPerformed

    private void jButtonRomaji2HiraganaActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonRomaji2HiraganaActionPerformed
    	praticar_tudo = false;
    	if(tipo_atividade.equals("h"))
    		Tela_Iniciante_Converter.setContexto("r2h");
    	else
    		Tela_Iniciante_Converter.setContexto("r2k");
    	
    	new Tela_Iniciante_Converter().main(null);
    	 this.dispose();
    }//GEN-LAST:event_jButtonRomaji2HiraganaActionPerformed

    private void jButtonHiragana2RomajiActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonHiragana2RomajiActionPerformed
    	praticar_tudo = false;
    	
    	if(tipo_atividade.equals("h"))
    		Tela_Iniciante_Converter.setContexto("h2r");
    	else
    		Tela_Iniciante_Converter.setContexto("k2r");
    	
    	new Tela_Iniciante_Converter().main(null);
    	
    	 this.dispose();
    }//GEN-LAST:event_jButtonHiragana2RomajiActionPerformed

    private void jButtonPraticarTudoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPraticarTudoMouseEntered
         jButtonPraticarTudo.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonPraticarTudoMouseEntered

    private void jButtonPraticarTudoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPraticarTudoMouseExited
        jButtonPraticarTudo.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonPraticarTudoMouseExited

    private void jButtonTreinoEscritaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTreinoEscritaMouseEntered
         jButtonTreinoEscrita.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonTreinoEscritaMouseEntered

    private void jButtonTreinoEscritaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTreinoEscritaMouseExited
        jButtonTreinoEscrita.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonTreinoEscritaMouseExited

    private void jButtonTreinoLeituraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTreinoLeituraMouseEntered
         jButtonTreinoLeitura.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonTreinoLeituraMouseEntered

    private void jButtonTreinoLeituraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTreinoLeituraMouseExited
        jButtonTreinoLeitura.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonTreinoLeituraMouseExited

    private void jButtonRevisaoEscritaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRevisaoEscritaMouseEntered
         jButtonRevisaoEscrita.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonRevisaoEscritaMouseEntered

    private void jButtonRevisaoEscritaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRevisaoEscritaMouseExited
        jButtonRevisaoEscrita.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonRevisaoEscritaMouseExited

    private void jButtonRevisaoLeituraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRevisaoLeituraMouseEntered
         jButtonRevisaoLeitura.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonRevisaoLeituraMouseEntered

    private void jButtonRevisaoLeituraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRevisaoLeituraMouseExited
        jButtonRevisaoLeitura.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonRevisaoLeituraMouseExited

    private void jButtonRomaji2HiraganaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRomaji2HiraganaMouseEntered
         jButtonRomaji2Hiragana.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonRomaji2HiraganaMouseEntered

    private void jButtonRomaji2HiraganaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRomaji2HiraganaMouseExited
        jButtonRomaji2Hiragana.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonRomaji2HiraganaMouseExited

    private void jButtonHiragana2RomajiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHiragana2RomajiMouseEntered
        jButtonHiragana2Romaji.setFont(new java.awt.Font("Arial", 2, 25));
    }//GEN-LAST:event_jButtonHiragana2RomajiMouseEntered

    private void jButtonHiragana2RomajiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHiragana2RomajiMouseExited
        jButtonHiragana2Romaji.setFont(new java.awt.Font("Goudy Old Style", 2, 25));
    }//GEN-LAST:event_jButtonHiragana2RomajiMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela_Iniciante_Escolher_Exercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Iniciante_Escolher_Exercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Iniciante_Escolher_Exercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Iniciante_Escolher_Exercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Iniciante_Escolher_Exercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHiragana2Romaji;
    private javax.swing.JButton jButtonPraticarTudo;
    private javax.swing.JButton jButtonRevisaoEscrita;
    private javax.swing.JButton jButtonRevisaoLeitura;
    private javax.swing.JButton jButtonRomaji2Hiragana;
    private javax.swing.JButton jButtonTreinoEscrita;
    private javax.swing.JButton jButtonTreinoLeitura;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}