/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2j17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Oswaldo
 */
public class Interfaz extends javax.swing.JFrame {
    JTextArea[] tabs = new JTextArea[5];
    public Tokens[] cabezaT = new Tokens[5];
    Errores[] cabezaE = new Errores[5];
    boolean[] guardado = new boolean[5];
    String[] archivo = new String[5];
    ArrayList<MiniToken> TpS = new ArrayList();
    ArrayList<ExpresionRegular> ER;
    ArrayList<Producciones> Prod;
    ArrayList<String> contER = new ArrayList();
    ArrayList<String> contPR = new ArrayList();
    String Inicio;
    ArrayList NT = new ArrayList();
    ArrayList T = new ArrayList();
    ArrayList R = new ArrayList();
    ArrayList nodos = new ArrayList();
    ArrayList partes = new ArrayList();
    Tokens temporalT;
    Errores error;
    Errores temporalE;
    int prueba = 0;
    int NoTab = 0;
    int TabA =0;
    int ERsel = 0;
    int PRsel = 0;
    int posicion = 0;
    int eliminados =0;
    boolean cerrado = false;
   int y= 0;
    String codigo = "";
    String[] ubica = new String[5];
    
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        
        for (int i = 0; i<5;i++){
            guardado[i] = false;
            archivo[i] = ""; 
            cabezaT[i] = new Tokens("","","",0,0,0,null);
            cabezaE[i] = new Errores("", "", "", "", 0, 0, null);
            ubica[i]="";
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Paneles = new javax.swing.JTabbedPane();
        ButtonA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCL = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaP = new javax.swing.JList();
        ButtonGCL = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ButtonA1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JTokens = new javax.swing.JMenuItem();
        JErrores = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Paneles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Paneles.setAutoscrolls(true);

        ButtonA.setText("Analizar");
        ButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAActionPerformed(evt);
            }
        });

        ListaCL.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaCL.setToolTipText("Componentes Lexicos");
        ListaCL.setName(""); // NOI18N
        jScrollPane1.setViewportView(ListaCL);

        jScrollPane2.setViewportView(ListaP);

        ButtonGCL.setText("Graficar Componente Lexico");
        ButtonGCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGCLActionPerformed(evt);
            }
        });

        jButton3.setText("Graficar Produccion");

        ButtonA1.setText("Graficar AP");
        ButtonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Cerrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        JTokens.setText("Tokens");
        JTokens.setEnabled(false);
        JTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTokensActionPerformed(evt);
            }
        });
        jMenu2.add(JTokens);

        JErrores.setText("Errores");
        JErrores.setEnabled(false);
        JErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JErroresActionPerformed(evt);
            }
        });
        jMenu2.add(JErrores);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Paneles, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ButtonGCL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Paneles)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonGCL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (NoTab <5){
        tabs[NoTab] = new JTextArea();
        tabs[NoTab].setText("");
        tabs[NoTab].setAutoscrolls(true);
        JScrollPane scroll = new JScrollPane (tabs[NoTab], 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        Paneles.add(scroll,"NewTab");
        Paneles.setSelectedIndex(NoTab);
        NoTab++;
        }else{
            JOptionPane.showMessageDialog(null, "Se a alcanzado el numero maximo de paneles");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (NoTab <5){
        tabs[NoTab] = new JTextArea();          
        tabs[NoTab].setAutoscrolls(true);
        tabs[NoTab].setAutoscrolls(true);
        JScrollPane scroll = new JScrollPane (tabs[NoTab], 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.ecys","ecys");
        fileChooser.setFileFilter(filter);
        File selectedFile = null;
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")+"/Desktop"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
        selectedFile = fileChooser.getSelectedFile();
        }
        try{
                    FileReader reader = new FileReader( selectedFile );
                    BufferedReader br = new BufferedReader(reader);
                    tabs[NoTab].read( br, null );
                    br.close();
                    tabs[NoTab].requestFocus();
                    archivo[NoTab] = selectedFile.getAbsolutePath();
                    String[] parts = archivo[NoTab].split("\\\\");
                    
                    guardado[NoTab] = true;
                    ubica[NoTab] = selectedFile.getParent();
                    Paneles.add(scroll,parts[parts.length -1]);
                    Paneles.setSelectedIndex(NoTab);
                    NoTab++;
                }
                catch(Exception e2) { System.out.println(e2); 
                }
             }else{
            JOptionPane.showMessageDialog(null, "Se a alcanzado el numero maximo de paneles");
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TabA = Paneles.getSelectedIndex();
        try
                {
        if (guardado[TabA] == false){
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.ecys","ecys");
            fileChooser.setFileFilter(filter);
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")+"/Desktop"));
            fileChooser.setDialogTitle("Specify a file to save");   
            int userSelection = fileChooser.showSaveDialog(this);
            File fileToSave = null;
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    fileToSave = fileChooser.getSelectedFile();
                    
                }
            archivo[TabA] = fileToSave.getAbsolutePath();
            ubica[TabA] = fileToSave.getParent();
            
            guardado[TabA] = true;
}
        
            if (!archivo[TabA].endsWith(".ecys"))
                archivo[TabA] += ".ecys";
        
        
                    FileWriter writer = new FileWriter( archivo[TabA] );
                    BufferedWriter bw = new BufferedWriter( writer );
                    tabs[TabA].write( bw );
                    bw.close();
                    
                   tabs[TabA].requestFocus();
                   String[] parts = archivo[TabA].split("\\\\");
                    Paneles.setTitleAt(TabA,parts[parts.length -1]);
                }
                catch(Exception e2) {}
        
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void ButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAActionPerformed
        TabA = Paneles.getSelectedIndex();
        Lexico lexico = new Lexico();
        lexico.AnalisisLexico(TabA,tabs[TabA].getText());
        cabezaT[TabA] = lexico.getCabezaT();
        cabezaE[TabA] = lexico.getCabezaE();
        JTokens.setEnabled(true);
        JErrores.setEnabled(true);
        CrearArray();
       Sintactico sintactico = new Sintactico(TpS);
       sintactico.analizar();
       
       temporalE = cabezaE[TabA];
       while(temporalE.getSiguiente() != null){
           temporalE = temporalE.getSiguiente();
           
       }
        temporalE.setSiguiente(sintactico.getCabezaEr().getSiguiente()); 
        PoblarER(sintactico.getER());
        PoblarPR(sintactico.getProd());
        
        T = sintactico.getT();
        NT = sintactico.getNT();
        R = sintactico.getR();
        Inicio = sintactico.getInicio();
        Chequeo();
        
        
        
        
        
        
        
    }//GEN-LAST:event_ButtonAActionPerformed

    private void JTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTokensActionPerformed
        TabA = Paneles.getSelectedIndex();
        int num = 1;
       temporalT = cabezaT[TabA].getSiguiente();
       
        
        
        try {
            File file = new File(ubica[TabA]+"\\Tokens.html");
            file.getParentFile().mkdirs(); // Will create parent directories if not exists
            file.createNewFile();
            java.io.FileOutputStream archivo = new java.io.FileOutputStream(file);
            archivo.write("<html>".getBytes());
            archivo.write("<head>".getBytes());
            archivo.write("<title>Proyecto 2</title>".getBytes());
            archivo.write("<style>\n table, th, td { border: 1px solid black;   border-collapse: collapse; padding: 10px; } </style>".getBytes());
            archivo.write("</head>".getBytes());
            archivo.write("<body>".getBytes());
            archivo.write("<center>".getBytes());
            archivo.write("<h1>Listado de Tokens </h1>".getBytes());
            
            
            archivo.write("<center><table border=\"1\"><col width=\"130\"><col width=\"130\"><col width=\"130\"><col width=\"130\"><col width=\"130\"><col width=\"130\"> ".getBytes());
            
            archivo.write("<tr><th>No.</th><th>Token</th><th>Lexema</th><th>Linea</th><th>Columna</th><th>Id</th></tr>".getBytes());
            
            while(temporalT != null){
        archivo.write("<tr>".getBytes());
        
            archivo.write(("<td>" + String.valueOf(num) + "</td> <td> " + temporalT.getCompLex() + "</td> <td> " + temporalT.getLexema() + "</td><td> " + String.valueOf(temporalT.getFila()) + "</td> <td> " + String.valueOf(temporalT.getColumna()) + "</td><td> " + temporalT.getId() + "</td>").getBytes());
                
        
                archivo.write("<tr>".getBytes());
                
        temporalT = temporalT.getSiguiente();
        num++;
        }
         archivo.write("</table>".getBytes());   
            
            
            
            archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
           Runtime.getRuntime().exec("explorer.exe "+ubica[TabA]+"\\Tokens.html");
        } catch (java.io.IOException ae) {
            
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_JTokensActionPerformed

    private void JErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JErroresActionPerformed
        TabA = Paneles.getSelectedIndex();
        int num = 1;
        temporalE = cabezaE[TabA].getSiguiente();
       
       
        
        
        try {
            File file = new File(ubica[TabA]+"\\Errores.html");
            file.getParentFile().mkdirs(); // Will create parent directories if not exists
            file.createNewFile();
            java.io.FileOutputStream archivo = new java.io.FileOutputStream(file);
            archivo.write("<html>".getBytes());
            archivo.write("<head>".getBytes());
            archivo.write("<title>Proyecto 2</title>".getBytes());
            archivo.write("<style>\n table, th, td { border: 1px solid black;   border-collapse: collapse; padding: 10px; } </style>".getBytes());
            archivo.write("</head>".getBytes());
            archivo.write("<body>".getBytes());
            archivo.write("<center>".getBytes());
            archivo.write("<h1>Listado de Errores </h1>".getBytes());
            
            
            archivo.write("<center><table border=\"1\"><col width=\"130\"><col width=\"130\"><col width=\"130\"><col width=\"130\"><col width=\"130\"> <col width=\"130\">".getBytes());
            
            archivo.write("<tr><th>No.</th><th>Causa</th><th>Tipo</th><th>Descripcion</th><th>Fila</th><th>Columna</th></tr>".getBytes());
            
            while(temporalE != null){
        archivo.write("<tr>".getBytes());
                archivo.write(("<td>" + String.valueOf(num) + "</td> <td> " + temporalE.getLexema()+ "</td> <td> " + temporalE.getTipo()+ "</td> <td> " + temporalE.getDescripcion()+ "</td> <td> " + String.valueOf(temporalE.getFila()) + "</td> <td> " + String.valueOf(temporalE.getColumna()) + "</td>").getBytes());
                archivo.write("<tr>".getBytes());
                
        temporalE = temporalE.getSiguiente();
        num++;
        }
         archivo.write("</table>".getBytes());   
            
            
            
            archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe "+ubica[TabA]+"\\Errores.html");
        } catch (java.io.IOException ae) {
            System.out.println(ae);
        }
    }//GEN-LAST:event_JErroresActionPerformed

    private void ButtonA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA1ActionPerformed
        TabA = Paneles.getSelectedIndex();
        String produce = "";
        String line = "";
        codigo = "digraph{\n" +
        "rankdir=LR\n" +
        "n1[label=\"i\",shape=\"circle\"];\n" +
        "n2[label=\"P\",shape=\"circle\"];\n" +
        "n3[label=\"q\",shape=\"circle\"];\n" +
        "n1->n2[label=\"λ,λ;#\"];\n" +
        "n2->n3[label=\"λ,λ;<"+Inicio+">\"];\n";
        
        reparar();
        
        for(int i =0;i<Prod.size();i++){
            String[] partsR = Prod.get(i).getProduccion().split("//");
            for(int j = 1;j<partsR.length;j++ ){
//                System.out.println(partsR[j]);
                line = line +partsR[j];
                if(partsR[j].equals("|")){
                    produce +="λ,"+Prod.get(i).getTitulo()+";"+line.substring(0, line.length()-1)+"\n";
                    line = "";
                }
                
            }
            produce +="λ,"+Prod.get(i).getTitulo()+";"+line+"\n";
                    line = "";
        }
        produce += "-----------------------------------------\n";
        
        for(int i = 0;i<T.size();i++){
            produce+=T.get(i).toString() +","+T.get(i).toString()+";λ\n";
            
        }
        
        codigo+="n3->n3[label=\""+produce+"\"];\n";
        codigo+="n4[label=\"f\",shape=\"doublecircle\"];\n"
                + "n3->n4[label=\"λ,#;λ\"];}";
        
        System.out.println(codigo);
        
        Dibujo dib = new Dibujo();
        dib.Dibujar(codigo,ubica[TabA],"AP");
        dib.setVisible(true);
        
        
        
        //System.out.println(codigo);








// TODO add your handling code here:
    }//GEN-LAST:event_ButtonA1ActionPerformed

    private void ButtonGCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGCLActionPerformed
       TabA = Paneles.getSelectedIndex();
       nodos.clear();
       partes.clear();
       
        ERsel = ListaCL.getSelectedIndex();
       String Expresion;
       Expresion = ER.get(ERsel).getER();
       String[] parts = Expresion.split("//");
        
        CrearCodigo(parts);
        Dibujo dib = new Dibujo();
        dib.Dibujar(codigo,ubica[TabA],ER.get(ERsel).getTitulo());
        dib.setVisible(true);
        
        
        
    }//GEN-LAST:event_ButtonGCLActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonA;
    private javax.swing.JButton ButtonA1;
    private javax.swing.JButton ButtonGCL;
    private javax.swing.JMenuItem JErrores;
    private javax.swing.JMenuItem JTokens;
    public javax.swing.JList ListaCL;
    private javax.swing.JList ListaP;
    private javax.swing.JTabbedPane Paneles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void debugeo() {
        int xyz =0;
        xyz++;
    }

    private void CrearArray() {
        TpS.clear();
        TabA = Paneles.getSelectedIndex();
        int num = 0;
        temporalT = cabezaT[TabA].getSiguiente();
        debugeo();
        while(temporalT != null){
            if (temporalT.getId() != 0){
                TpS.add(new MiniToken(temporalT.getLexema(),temporalT.getId(),temporalT.getCompLex(),temporalT.getFila(),temporalT.getColumna()));
                
                num++;   
                
            }
            temporalT = temporalT.getSiguiente();
        }
        debugeo();
//        for (int i = 0; i < TpS.size();i++){
//            System.out.println(TpS.get(i).getId() + "    " + TpS.get(i).getLexema() + "     " + TpS.get(i).getTipo() + "   " + TpS.get(i).getFila()+ "   " + TpS.get(i).getColumna());
//        }
        
        
        
        
    }

    private void PoblarER(ArrayList<ExpresionRegular> er) {
       ER = er;
       DefaultListModel<String> model = new DefaultListModel<>();
       ListaCL.setModel(model);
       for (int i = 0;i<ER.size();i++){
           contER.add(ER.get(i).getTitulo());
          model.addElement(contER.get(i));
          // System.out.println(ER.get(i).getTitulo()+" -> "+ER.get(i).getER());
        }
       
       
       
       
       
    }

    private void PoblarPR(ArrayList<Producciones> prod) {
        Prod = prod;
       DefaultListModel<String> model = new DefaultListModel<>();
       ListaP.setModel(model);
       for (int i = 0;i<Prod.size();i++){
           contPR.add(Prod.get(i).getTitulo());
          model.addElement(contPR.get(i));
        //   System.out.println(Prod.get(i).getTitulo()+" -> "+Prod.get(i).getProduccion());
        }
        
        
       
    }

    private void CrearCodigo(String[] parts) {
        eliminados = 0;
        for (int k = 1;k<parts.length;k++){
            partes.add(parts[k]);
            
            
        }
        boolean vuelta = false;
      codigo ="digraph{\n" +
        "rankdir=UD;";
        nodos = CrearNodos(parts);
        int papo = 1;
        for(int i =0;i<nodos.size();i++){
            System.out.println("0   "+nodos.get(i));
        }
        
        BuscarP(nodos);
        for(int i =0;i<nodos.size();i++){
            System.out.println("1   "+nodos.get(i));
        }
        
        

        buscarmasastint(nodos,0);
        for(int i =0;i<nodos.size();i++){
            System.out.println("2   "+nodos.get(i));
        }
        buscarConcat(nodos,0);
        for(int i =0;i<nodos.size();i++){
            System.out.println("3   "+nodos.get(i));
        }
        buscarO(nodos,0);
        for(int i =0;i<nodos.size();i++){
            System.out.println("4   "+nodos.get(i));
        }
        codigo+="}";
        System.out.println(codigo);
        
        
        
        
        
    }

    private ArrayList CrearNodos(String[] parts) {
        
        
        
        
        
        ArrayList nodos = new ArrayList();
        int n=1;
        for (int i =1; i < parts.length;i++){
            if (parts[i].equals("(")){
                nodos.add(41);
                
            }else if(parts[i].equals(")")){
                nodos.add(42);
                
                
            }else if (parts[i].equals("+") || parts[i].equals("?")|| parts[i].equals("*")){
                nodos.add("3,"+n);
                codigo+="\nn"+n+"[label=\""+parts[i]+"\",shape=\"circle\"];";
                n++;
                
            }else if (parts[i].equals(".")){
                nodos.add("2,"+n);
                codigo+="\nn"+n+"[label=\""+parts[i]+"\",shape=\"circle\"];";
                n++;
                
            }else if (parts[i].equals("|")){
                nodos.add("1,"+n);
                codigo+="\nn"+n+"[label=\""+parts[i]+"\",shape=\"circle\"];";
                n++;
                
            }else{
                nodos.add("0,"+n);
                codigo+="\nn"+n+"[label=\""+parts[i]+"\",shape=\"circle\"];";
                n++;
                
            }
            
            
            
            
        }
//        System.out.println(codigo);
        for(int i =0 ; i<nodos.size();i++){
            System.out.println(nodos.get(i));
        }
        
        return nodos;
    }

    private void buscarParentesis(ArrayList parts) {
        boolean pare = false;
        
        ArrayList par = new ArrayList();
        
        for(int i = 0; i<parts.size();i++){
            
            if(parts.get(i).equals("(")){
                debugeo();
                posicion = i;
                
            pare = true;
            }else if(parts.get(i).equals(")")){
                
                buscarmasastint(par, posicion);
                buscarConcat(par, posicion);
                buscarO(par,posicion);
                nodos.set(posicion, nodos.get(posicion+1));
                nodos.set(i, nodos.get(i-1));
                
                pare = false;
            }
            if (pare){
                par.add(parts.get(i));
            }
            
        }
        
        
        
        
        
    }

    private void buscarmasastint(ArrayList parts, int pos) {
        
        for (int i = pos;i<parts.size();i++){
            String[] splite = parts.get(i).toString().split(",");
            switch(splite[0]){
                case "3":
                    String[] splite2 = parts.get(i-1).toString().split(",");
                    System.out.println(parts.get(i-1));
                    System.out.println(splite[1]+"  "+splite2[0]);
                    codigo+="\nn"+splite[1]+"->n"+splite2[1]+";";
                    nodos.set(i,"0,"+splite[1]);
                    nodos.remove(i-1);
                    eliminados++;
                    i = pos;
                    break;
                case "42":
                    
                    
                    eliminados++;
                    i = parts.size();
                    
                    
                    break;
                
                
                
                
            }
            
            
            
            
            
        }
        
        debugeo();
        
        
        
        
    }

    private void buscarConcat(ArrayList parts,int pos) {
        for (int i = pos;i<parts.size();i++){
            String[] splite = parts.get(i).toString().split(",");
            switch(splite[0]){
                
                case "2":
                    String[] splite2 = parts.get(i-1).toString().split(",");
                    String[] splite3 = parts.get(i+1).toString().split(",");
                    codigo+="\nn"+splite[1]+"->n"+splite2[1]+";";
                    codigo+="\nn"+splite[1]+"->n"+splite3[1]+";";
                    nodos.set(i,"0,"+splite[1]);
                    nodos.remove(i+1);
                    eliminados++;
                    nodos.remove(i-1);
                    eliminados++;
                    i = pos;
                    break;
                case "42":
                    
                    eliminados++;
                    i = parts.size();
                    
                    
                    break;
                
                
                
                
            }
            
            
            
            
            
        }
            
            
            
            
            
        }
    

    private void buscarO(ArrayList parts, int pos) {
        for (int i = pos;i<parts.size();i++){
            String[] splite = parts.get(i).toString().split(",");
            switch(splite[0]){
                case "1":
                    String[] splite2 = parts.get(i-1).toString().split(",");
                    String[] splite3 = parts.get(i+1).toString().split(",");
                    codigo+="\nn"+splite[1]+"->n"+splite2[1]+";";
                    codigo+="\nn"+splite[1]+"->n"+splite3[1]+";";
                    
                    nodos.set(i,"0,"+splite[1]);
                    nodos.remove(i+1);
                    eliminados++;
                    nodos.remove(i-1);
                    eliminados++;
                    debugeo();
                    i=pos;
                    break;
                case "42":
                    nodos.remove(i);
                    eliminados++;
                    i = parts.size();
                    cerrado = true;
                    
                    break;
                
                
                
                
            }
            
            
            
            
            
        }
            
            
            
            
            
        }

    private void Chequeo() {
        if(repetidasERR()){
            System.out.println("Repetidas");
            error = new Errores("","","","",0,0,null);
        }else{
            System.out.println("NO");
        }
        
        
        
        
        
    }

    private boolean repetidasERR() {
        ArrayList lista = new ArrayList();
        for(int i = 0; i < ER.size();i++){
            lista.add(ER.get(i).getTitulo());
            
        }
        for(int i = 0; i < R.size();i++){
            lista.add(R.get(i));
            
        }
        
         Set inputSet = new HashSet(lista);
         if(inputSet.size()< lista.size()){
            return true;
        }
        return false;
    }

    private void reparar() {
        String prub = "";
        boolean si = false;
        for (int i = 0;i<Prod.size();i++){
            
            String[] partsR = Prod.get(i).getProduccion().split("//");
            for (int j = 0;j<partsR.length;j++){
                if(si){
                   prub = prub + partsR[j]; 
                    
                    
                }else{
                    prub = prub +"//"+partsR[j];
                }
                if(partsR[j].equals("<")){
                    
                    si = true;
                }else if(partsR[j].equals(">")){
                    si = false;
                }
                
            }
            //System.out.println(prub);
            Prod.get(i).setProduccion(prub);
            prub ="";
            
            
            
            
        }
        
        for(int k =0; k < Prod.size();k++){
            //System.out.println(Prod.get(k).getProduccion());
            
        }
        
        
    }

    private void BuscarP(ArrayList nodos) {
        boolean pare = false;
        ArrayList par = new ArrayList();
        
        for(int i = 0; i<nodos.size();i++){
            if(nodos.get(i).toString().equals("41")){
                debugeo();
                posicion = i;
                nodos.remove(i);
                eliminados++;
                
                
                buscarmasastint(nodos, posicion);
                
                buscarConcat(nodos, posicion);
                
                buscarO(nodos, posicion);
                debugeo();
                for(int j = 0;j<nodos.size();j++){
                    if (nodos.get(j).toString().equals("42")){
                        nodos.remove(j);
                        j = nodos.size();
                    }
                    
                }
                
                
            pare = true;}
//            }else if(nodos.get(i).toString().equals("42")){
//                
//                
//                buscarConcat(par, posicion);
//                buscarO(par,posicion);
//                nodos.set(posicion, nodos.get(posicion+1));
//                nodos.set(i, nodos.get(i-1));
//                
//                pare = false;
//            }
            if (pare){
                par.add(nodos.get(i));
            }
            
            
            
        }
    
    
    
    
    
    }

    
}

    
    

  
    
    
    
