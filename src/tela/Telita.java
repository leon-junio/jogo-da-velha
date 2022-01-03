package tela;
import java.awt.Color;
import javax.swing.JOptionPane;
public class Telita extends javax.swing.JFrame {
    int p1=1;String e,e2,j1="Jogador 1",j2="Jogador 2";
    int p2=0;int nv1=0,nv2=0,ne=0,k=0;
    public Telita() {
        initComponents();
        JOptionPane.showMessageDialog(null,"Bem Vindo ao Jogo Da Veia");
        nomes();
        jLabel3.setText(j1);
        jLabel7.setText(j2);
        Jogador.setText(j1);
        Escolha();
    }
    public void Escolha(){
        e = JOptionPane.showInputDialog(null,j1+" Deseja X ou 0");
        if (!e.equals("X") && !e.equals("0")){
            while (k==0){
            JOptionPane.showMessageDialog(null,"INVALIDO");
            e = JOptionPane.showInputDialog(null,"Digite novamente, X ou 0 ");
            if (e.equals("X")||e.equals("0")){
                k=1;
                }else{
                    k=0;
                    }
            }
        }k=0;
        if (e.equals("x")){
            e="X";
        }
        if (e.equals("X")){
           e2="0";
        }else{
           e2="X";
        }
        s1.setText("Simbolo "+e);
        s2.setText("Simbolo "+e2);
    }
    public void Game(){
        if (p1 == 1){
            Jogador.setText(j2);
            p1=0;
            p2=1;
        }else{
            Jogador.setText(j1);
            p1=1;
            p2=0;
        }
        Jg("X");
        Jg("0");
    }
    public void Jg(String x){
        if (Bt1.getText().equals(x) && Bt2.getText().equals(x) && Bt3.getText().equals(x)){
            if (Bt1.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
         if (Bt4.getText().equals(x) && Bt5.getText().equals(x) && Bt6.getText().equals(x)){
            if (Bt4.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
          if (Bt7.getText().equals(x) && Bt8.getText().equals(x) && Bt9.getText().equals(x)){
            if (Bt7.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
        if (Bt1.getText().equals(x) && Bt5.getText().equals(x) && Bt9.getText().equals(x)){
            if (Bt1.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
        if (Bt3.getText().equals(x) && Bt5.getText().equals(x) && Bt7.getText().equals(x)){
            if (Bt3.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
         if (Bt1.getText().equals(x) && Bt4.getText().equals(x) && Bt7.getText().equals(x)){
            if (Bt1.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        } 
         if (Bt2.getText().equals(x) && Bt5.getText().equals(x) && Bt8.getText().equals(x)){
            if (Bt2.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
          if (Bt3.getText().equals(x) && Bt6.getText().equals(x) && Bt9.getText().equals(x)){
            if (Bt3.getText().equals(e)){
                Ganhou(j1);
            }else {
                Ganhou(j2);
            }
        }
          if (!Bt1.getText().equals("") && !Bt2.getText().equals("")
              && !Bt3.getText().equals("") && !Bt4.getText().equals("") &&
              !Bt5.getText().equals("") && !Bt6.getText().equals("") && 
              !Bt7.getText().equals("") && !Bt8.getText().equals("") &&
              !Bt9.getText().equals("")){
              Ganhou("Velha");
          }
    } 
    public void Ganhou(String x){
        if (x.equals(j1)){
            JOptionPane.showMessageDialog(Telita.this,"Parabéns "+j1+" Você ganhou");
            nv1++;
            NdeVitoriasP1.setText("Número de vitorias: "+nv1);
            clean();
        }
        if (x.equals(j2)){
            JOptionPane.showMessageDialog(Telita.this,"Parabéns "+j2+" Você ganhou");
            nv2++;
            NdeVitoriasP2.setText("Número de vitorias: "+nv2);
            clean();
        }
        if (x.equals("Velha")){
            JOptionPane.showMessageDialog(Telita.this,"DEU VEIA POH");
            clean();
        }
        
    }
     public void clean(){
            Bt1.setText("");
            Bt2.setText("");
            Bt3.setText("");
            Bt4.setText("");
            Bt5.setText("");
            Bt6.setText("");
            Bt7.setText("");
            Bt8.setText("");
            Bt9.setText("");
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Bt5 = new javax.swing.JButton();
        Bt2 = new javax.swing.JButton();
        Bt1 = new javax.swing.JButton();
        Bt4 = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Bt6 = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        Bt7 = new javax.swing.JButton();
        Bt9 = new javax.swing.JButton();
        Lb1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        Nomes = new javax.swing.JButton();
        SairdoJogo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Jogador = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NdeVitoriasP1 = new javax.swing.JLabel();
        NdeVitoriasP2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Xou0 = new javax.swing.JButton();
        Developer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BOT = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Veia");
        setLocation(new java.awt.Point(300, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        Bt5.setBackground(new java.awt.Color(255, 0, 0));
        Bt5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });

        Bt2.setBackground(new java.awt.Color(255, 0, 0));
        Bt2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });

        Bt1.setBackground(new java.awt.Color(255, 0, 0));
        Bt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });

        Bt4.setBackground(new java.awt.Color(255, 0, 0));
        Bt4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });

        Bt3.setBackground(new java.awt.Color(255, 0, 0));
        Bt3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });

        Bt6.setBackground(new java.awt.Color(255, 0, 0));
        Bt6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt6ActionPerformed(evt);
            }
        });

        Bt8.setBackground(new java.awt.Color(255, 0, 0));
        Bt8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });

        Bt7.setBackground(new java.awt.Color(255, 0, 0));
        Bt7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });

        Bt9.setBackground(new java.awt.Color(255, 0, 0));
        Bt9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });

        Lb1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Lb1.setForeground(new java.awt.Color(255, 0, 0));
        Lb1.setText("JOGO DA VEIA");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Vez do jogador:");

        NovoJogo.setBackground(new java.awt.Color(255, 0, 0));
        NovoJogo.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        Nomes.setBackground(new java.awt.Color(255, 0, 0));
        Nomes.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Nomes.setText("Escolher nomes");
        Nomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomesActionPerformed(evt);
            }
        });

        SairdoJogo.setBackground(new java.awt.Color(255, 0, 0));
        SairdoJogo.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        SairdoJogo.setText("Sair do jogo");
        SairdoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairdoJogoActionPerformed(evt);
            }
        });

        Jogador.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Jogador.setText("Jogador");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Jogador 1");

        s1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        s1.setText("Simbolo X");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Jogador 2");

        s2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        s2.setText("Simbolo O");

        NdeVitoriasP1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NdeVitoriasP1.setText("Número de vitorias: 0");

        NdeVitoriasP2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NdeVitoriasP2.setText("Número de vitorias: 0");

        Xou0.setBackground(new java.awt.Color(255, 0, 0));
        Xou0.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Xou0.setText("Escolher X ou 0");
        Xou0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xou0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s1)
                            .addComponent(s2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NdeVitoriasP2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NdeVitoriasP1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jogador)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SairdoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nomes)
                    .addComponent(Xou0))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jogador))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NdeVitoriasP1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(s1)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NdeVitoriasP2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(s2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoJogo)
                    .addComponent(Nomes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SairdoJogo)
                    .addComponent(Xou0))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Developer.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Developer.setForeground(new java.awt.Color(51, 51, 255));
        Developer.setText("Developed by Leon Jr");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("TABULEIRO");

        BOT.setBackground(new java.awt.Color(255, 0, 0));
        BOT.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        BOT.setText("VS BOT");
        BOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addComponent(Developer)
                        .addGap(259, 259, 259)
                        .addComponent(BOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(128, 128, 128))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt4)
                            .addComponent(Bt1)
                            .addComponent(Bt7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Bt5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(Bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bt6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(Bt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bt1, Bt4, Bt5, Bt7, Bt8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt4)
                            .addComponent(Bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt7)
                            .addComponent(Bt8)
                            .addComponent(Bt9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Developer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BOT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Bt1, Bt2, Bt3, Bt4, Bt5, Bt6, Bt7, Bt8, Bt9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
        if (p1==1){
            if (Bt3.getText().equals("")){
                Bt3.setText(e);
                Game();
            }
        }else{
            if (Bt3.getText().equals("")){
                Bt3.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt3ActionPerformed

    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
        if (p1==1){
            if (Bt5.getText().equals("")){
                Bt5.setText(e);
                Game();
            }
        }else{
            if (Bt5.getText().equals("")){
                Bt5.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt5ActionPerformed

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
        Developer.setForeground(Color.BLUE);
        if (p1==1){
            if (Bt1.getText().equals("")){
                Bt1.setText(e);
                Game();
            }
        }else{
            if (Bt1.getText().equals("")){
                Bt1.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
      Developer.setForeground(Color.ORANGE);
        if (p1==1){
            if (Bt2.getText().equals("")){
                Bt2.setText(e);
                Game();
            }
        }else{
            if (Bt2.getText().equals("")){
                Bt2.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt2ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
       Developer.setForeground(Color.white);
        if (p1==1){
            if (Bt4.getText().equals("")){
                Bt4.setText(e);
                Game();
            }
        }else{
            if (Bt4.getText().equals("")){
                Bt4.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt4ActionPerformed

    private void Bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt6ActionPerformed
        Developer.setForeground(Color.RED);
        if (p1==1){
            if (Bt6.getText().equals("")){
                Bt6.setText(e);
                Game();
            }
        }else{
            if (Bt6.getText().equals("")){
                Bt6.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt6ActionPerformed

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
       Developer.setForeground(Color.cyan);
        if (p1==1){
            if (Bt7.getText().equals("")){
                Bt7.setText(e);
                Game();
            }
        }else{
            if (Bt7.getText().equals("")){
                Bt7.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
        Developer.setForeground(Color.lightGray);
        if (p1==1){
            if (Bt8.getText().equals("")){
                Bt8.setText(e);
                Game();
            }
        }else{
            if (Bt8.getText().equals("")){
                Bt8.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt8ActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
       Developer.setForeground(Color.GREEN);
        if (p1==1){
            if (Bt9.getText().equals("")){
                Bt9.setText(e);
                Game();
            }
        }else{
            if (Bt9.getText().equals("")){
                Bt9.setText(e2);
                Game();
            }
        }
    }//GEN-LAST:event_Bt9ActionPerformed
    public void nomes(){
        int r=JOptionPane.showConfirmDialog(null,"Versus bot ?");
        if (r==0){
            System.out.println("VS BOT");
            j1=JOptionPane.showInputDialog(null,"Digite seu nome jogador 1");
            j2="BOT";
            bot();
        }else{
        j1=JOptionPane.showInputDialog(null,"Digite seu nome jogador 1");
        j2=JOptionPane.showInputDialog(null,"Digite seu nome jogador 2");
        }
    }
    private void NomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomesActionPerformed
        j1=JOptionPane.showInputDialog(null,"Digite seu nome jogador 1");
        j2=JOptionPane.showInputDialog(null,"Digite seu nome jogador 2");
        jLabel3.setText(j1);
        jLabel7.setText(j2);
        if (p1==1){
            Jogador.setText(j1);
        }else{
            Jogador.setText(j2);
        }
    }//GEN-LAST:event_NomesActionPerformed

    private void Xou0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xou0ActionPerformed
       if (!Bt1.getText().equals("")||!Bt2.getText().equals("")||!Bt3.getText().equals("")||
           !Bt4.getText().equals("")||!Bt5.getText().equals("")||!Bt6.getText().equals("")||
            !Bt7.getText().equals("")||!Bt8.getText().equals("")||!Bt9.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Não pode alterar de Simbolo durante o jogo");
            }else{
        Escolha();
       }
    }//GEN-LAST:event_Xou0ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        clean();
        NdeVitoriasP1.setText("Número de vitorias: 0");
        NdeVitoriasP2.setText("Número de vitorias: 0");
        Jogador.setText("Jogador");
        JOptionPane.showMessageDialog(null,"Novo Jogo");
        JOptionPane.showMessageDialog(null,"Bem Vindo ao Jogo Da Veia");
        nomes();
        jLabel3.setText(j1);
        jLabel7.setText(j2);
        Jogador.setText(j1);
        Escolha();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SairdoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairdoJogoActionPerformed
        JOptionPane.showMessageDialog(null,"OBRIGADO POR JOGAR <3");
        System.exit(0);
    }//GEN-LAST:event_SairdoJogoActionPerformed

    private void BOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTActionPerformed
        new Telita();
    }//GEN-LAST:event_BOTActionPerformed
    public void bot(){
        BOT_IA bot = new BOT_IA();
    }
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
            java.util.logging.Logger.getLogger(Telita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOT;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt6;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JLabel Developer;
    private javax.swing.JLabel Jogador;
    private javax.swing.JLabel Lb1;
    private javax.swing.JLabel NdeVitoriasP1;
    private javax.swing.JLabel NdeVitoriasP2;
    private javax.swing.JButton Nomes;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JButton SairdoJogo;
    private javax.swing.JButton Xou0;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    // End of variables declaration//GEN-END:variables
}
