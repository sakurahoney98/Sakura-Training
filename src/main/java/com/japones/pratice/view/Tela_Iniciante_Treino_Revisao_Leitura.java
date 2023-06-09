/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.japones.pratice.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.SwingConstants;

import com.japones.pratice.controller.Controller;
import com.japones.pratice.model.Caractere;
import com.japones.pratice.model.PalavraSorteada;

/**
 *
 * @author Suporte TI
 */
public class Tela_Iniciante_Treino_Revisao_Leitura extends javax.swing.JFrame {

	/**
	 * Creates new form Tela_3
	 */
	private static int item_atual = 0;
	private static boolean praticar_tudo = true;
	private static String treino_revisao = "t";
	private static String tipo_atividade = "h";
	private static Caractere caractere;
	private static Connection conexao = Tela_Inicial.getConexao();
	private static int quantidade_treino;
	private static int atividade = 1;
	private static ArrayList<Caractere> lista;

	public static void setContexto(String s) {
		treino_revisao = s;

	}

	public Tela_Iniciante_Treino_Revisao_Leitura() throws SQLException {
		initComponents();
		getContentPane().setBackground(new Color(255, 170, 170));
		setExtendedState(MAXIMIZED_BOTH);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 * 
	 * @throws SQLException
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() throws SQLException {

		praticar_tudo = Tela_Iniciante_Escolher_Exercicio.getPraticarTudo();
		atividade = Tela_Iniciante_Escolher_Atividade.getAtividade();
		tipo_atividade = Tela_Iniciante_Escolher_Treino.getTipoTreino();

		if (treino_revisao.equals("t"))
			quantidade_treino = 15;
		else
			quantidade_treino = 25;

		getLista();

		jButtonSair = new javax.swing.JButton();
		jLabelImagem = new javax.swing.JLabel("", SwingConstants.CENTER);
		jButtonProximo = new javax.swing.JButton();
		jButtonConferir = new javax.swing.JButton();
		jTextFieldRespostaUsuario = new javax.swing.JTextField();
		jLabelRespostaCorreta = new javax.swing.JLabel();
		jLabelProgresso = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 170, 170));

		jButtonSair.setBackground(new Color(0, 0, 0, 0));
		jButtonSair.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
		jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
		jButtonSair.setText("Sair");
		jButtonSair.setContentAreaFilled(false);
		jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButtonSairMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButtonSairMouseExited(evt);
			}
		});
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSairActionPerformed(evt);
			}
		});
		Controller controller = new Controller();
		caractere = controller.sortearCaractere(lista);
		String texto = "";

		if (tipo_atividade.equals("h"))
			texto = caractere.getHiragana();
		else
			texto = caractere.getKatakana();

		jLabelImagem.setBackground(new java.awt.Color(255, 255, 255));
		jLabelImagem.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 1, 80));
		jLabelImagem.setText(texto);
		jLabelImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
		jLabelImagem.setMaximumSize(new java.awt.Dimension(822, 239));
		jLabelImagem.setMinimumSize(new java.awt.Dimension(100, 100));
		jLabelImagem.setName(""); // NOI18N
		jLabelImagem.setOpaque(true);
		jLabelImagem.setPreferredSize(new java.awt.Dimension(1000, 1000));

		jButtonProximo.setBackground(new java.awt.Color(255, 252, 255));
		jButtonProximo.setFont(new java.awt.Font("Goudy Old Style", 2, 30)); // NOI18N
		jButtonProximo.setForeground(new java.awt.Color(255, 155, 155));
		jButtonProximo.setText("Pr�ximo");
		jButtonProximo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButtonProximoMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButtonProximoMouseExited(evt);
			}
		});
		jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButtonProximoActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jButtonProximo.setEnabled(false);

		jButtonConferir.setBackground(new java.awt.Color(255, 252, 255));
		jButtonConferir.setFont(new java.awt.Font("Goudy Old Style", 2, 30)); // NOI18N
		jButtonConferir.setForeground(new java.awt.Color(255, 155, 155));
		jButtonConferir.setText("Conferir");
		jButtonConferir.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButtonConferirMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButtonConferirMouseExited(evt);
			}
		});
		jButtonConferir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConferirActionPerformed(evt);
			}
		});

		jTextFieldRespostaUsuario.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
		jTextFieldRespostaUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextFieldRespostaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
		 jTextFieldRespostaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                try {
						jTextFieldRespostaUsuarioKeyPressed(evt);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        });

		jLabelRespostaCorreta.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
		jLabelRespostaCorreta.setForeground(new java.awt.Color(255, 255, 255));
		jLabelRespostaCorreta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelRespostaCorreta.setText("jLabel1");
		jLabelRespostaCorreta.setVisible(false);

		jLabelProgresso.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
		jLabelProgresso.setForeground(new java.awt.Color(255, 255, 255));
		jLabelProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelProgresso.setText((item_atual + 1) + "/" + quantidade_treino);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(85, Short.MAX_VALUE)
										.addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 1079,
												Short.MAX_VALUE)
										.addContainerGap(85, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(100, 100, 100).addComponent(jButtonSair)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jButtonConferir, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(57, 57, 57))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTextFieldRespostaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 294,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabelRespostaCorreta, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabelProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(50, 50, 50)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(47, Short.MAX_VALUE)
						.addComponent(jLabelProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30).addComponent(jLabelRespostaCorreta).addGap(18, 18, 18)
						.addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jTextFieldRespostaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
												75, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addGap(0, 100, Short.MAX_VALUE)
										.addComponent(jButtonConferir, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
						.addComponent(jButtonSair).addGap(50, 50, 50)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSairActionPerformed
		Tela_Sair_Confirma.setContexto(3);
		new Tela_Sair_Confirma().main(null);
		this.dispose();
	}// GEN-LAST:event_jButtonSairActionPerformed

	private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonSairMouseEntered
		Map<TextAttribute, Object> atributos = new HashMap<TextAttribute, Object>();
		atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		jButtonSair.setFont(new java.awt.Font("Calibri", 1, 30).deriveFont(atributos));
	}// GEN-LAST:event_jButtonSairMouseEntered

	private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonSairMouseExited
		jButtonSair.setFont(new java.awt.Font("Calibri", 0, 30));
	}// GEN-LAST:event_jButtonSairMouseExited

	private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_jButtonProximoActionPerformed
		item_atual++;
		if (item_atual < quantidade_treino) {
			new Tela_Iniciante_Treino_Revisao_Leitura().main(null);
		} else {
			item_atual = 0;
			if (!praticar_tudo)
				new Tela_Iniciante_Escolher_Exercicio().main(null);
			else {
				String treino = "";
				if (tipo_atividade.equals("h"))
					treino = "hiragana";
				else
					treino = "katakana";
				Tela_Mensagem.setMensagem(
						" Nessa atividade iremos trabalhar com    todos " + treino + " aprendidos at� agora");

				if (treino_revisao.equals("t"))

					Tela_Mensagem.setContexto("trl_t");

				else

					Tela_Mensagem.setContexto("trl_r");

				new Tela_Mensagem().main(null);
			}

		}

		this.dispose();
	}// GEN-LAST:event_jButtonProximoActionPerformed

	private void jButtonConferirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonConferirActionPerformed
		jButtonConferir.setEnabled(false);
		jButtonProximo.setEnabled(true);
		String resposta_usuario = jTextFieldRespostaUsuario.getText().toLowerCase().replace(" ", "");

		if (resposta_usuario.equals(caractere.getRomaji())) {
			jTextFieldRespostaUsuario.setBackground(Color.green);
			jTextFieldRespostaUsuario.setForeground(Color.white);
		} else {
			jTextFieldRespostaUsuario.setBackground(Color.red);
			jTextFieldRespostaUsuario.setForeground(Color.white);
			jLabelRespostaCorreta.setText(caractere.getRomaji());
			jLabelRespostaCorreta.setVisible(true);
		}
	}// GEN-LAST:event_jButtonConferirActionPerformed

	private void jButtonConferirMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonConferirMouseEntered
		jButtonConferir.setFont(new java.awt.Font("Arial", 2, 25));
	}// GEN-LAST:event_jButtonConferirMouseEntered

	private void jButtonConferirMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonConferirMouseExited
		jButtonConferir.setFont(new java.awt.Font("Goudy Old Style", 2, 30));
	}// GEN-LAST:event_jButtonConferirMouseExited

	private void jButtonProximoMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonProximoMouseEntered
		jButtonProximo.setFont(new java.awt.Font("Arial", 2, 25));
	}// GEN-LAST:event_jButtonProximoMouseEntered

	private void jButtonProximoMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonProximoMouseExited
		jButtonProximo.setFont(new java.awt.Font("Goudy Old Style", 2, 30));
	}// GEN-LAST:event_jButtonProximoMouseExited

	   private void jTextFieldRespostaUsuarioKeyPressed(java.awt.event.KeyEvent evt) throws SQLException {                                                     
	       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
	    	   if(jButtonConferir.isEnabled())
		        	jButtonConferirActionPerformed(null);
		        else
		        	jButtonProximoActionPerformed(null);
	       }
	    }

	private void getLista() throws SQLException {
		Controller controller = new Controller();
		if (treino_revisao.equals("t"))
			lista = controller.pegarAtividade(atividade, conexao).getCaractere();
		else
			lista = controller.pegarRevisao(atividade, conexao);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Tela_Iniciante_Treino_Revisao_Leitura.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Tela_Iniciante_Treino_Revisao_Leitura.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Tela_Iniciante_Treino_Revisao_Leitura.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Tela_Iniciante_Treino_Revisao_Leitura.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Tela_Iniciante_Treino_Revisao_Leitura().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonConferir;
	private javax.swing.JButton jButtonProximo;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabelImagem;
	private javax.swing.JLabel jLabelProgresso;
	private javax.swing.JLabel jLabelRespostaCorreta;
	private javax.swing.JTextField jTextFieldRespostaUsuario;
	// End of variables declaration//GEN-END:variables
}
