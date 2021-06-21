
import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
          import javax.swing.JToolBar;
/*     */ import javax.swing.JToolTip;
/*     */ 
         class LessonUI implements java.awt.event.ActionListener, java.awt.event.MouseListener
/*     */ {
/*     */   static User user;
/*     */   static JFrame lessonFrame;
/*     */   static JPanel superPanel;
            LessonUI leesonUI = this;
/*  17 */   static GridLayout gridLayout = new GridLayout(5, 7, 19, 19);
/*  18 */   static BorderLayout borderLayout = new BorderLayout();
/*     */   
/*     */   static JToolBar menuPanel;
/*  21 */   static JPanel[] lesson = new JPanel[8];
/*     */   
/*  23 */   static JButton[][] fidelButton = new JButton[35][7];
/*     */   
/*     */ 
/*  26 */   static ImageIcon back_icon = new ImageIcon("data\\image\\back_icon.png");
/*  27 */   static ImageIcon forward_icon = new ImageIcon("data\\image\\forward_icon.png");
/*     */   
/*  29 */   static JButton nextLessonButton = new JButton(forward_icon);
/*  30 */   static JButton preLessonButton = new JButton(back_icon);
/*     */   
/*  32 */   static JLabel[] quxirLabel = new JLabel[8];
/*     */   
/*  34 */   static Font nyalaMiddium = new Font("nyala", 0, 30);
/*     */   
/*     */   static Color originalColor;
/*     */   
/*     */   static int currentlyAttachedLessonToSuperPanel;
/*     */   
/*  40 */   Fidel myFidels = new Fidel();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public LessonUI(JFrame frameArg, JToolBar menuPanelArg, User userArg)
/*     */   {
/*  47 */     lessonFrame = frameArg;
/*  48 */     menuPanel = menuPanelArg;
/*  49 */     user = userArg;
/*  50 */     User.saveUser(user);
/*  51 */     superPanel = new JPanel(borderLayout);
/*     */     
/*     */ 
/*  54 */     createFidelButton();
/*  55 */     createLessonToolTips();
/*  56 */     createLesson();
/*  57 */     registerListener();
/*     */     
JButton resetProfileButton = new JButton("Reset my score");
        resetProfileButton.setFont(  new Font("Segoe UI Light",Font.PLAIN,18) );
			resetProfileButton.addActionListener( new ActionListener(){
				
                                @Override
				public void actionPerformed(ActionEvent event){
					
					int result = JOptionPane.showConfirmDialog(lessonFrame,"Are sure, unlocked lessons will be locked ?","confirm",JOptionPane.YES_NO_OPTION);
					if(result==0){
						
						user.setUnlockedLevel(0);
						User.saveUser(user);
						superPanel.remove(lesson[currentlyAttachedLessonToSuperPanel]);
						superPanel.remove(quxirLabel[currentlyAttachedLessonToSuperPanel]);
						lessonFrame.remove(superPanel);
						currentlyAttachedLessonToSuperPanel=0;
						nextLessonButton.setEnabled(true);
						setPanel(-1);
						
					}
					else{
						
						
					}
					
					
				}
				
				
			} );
	
              menuPanel.add(resetProfileButton);
/*     */     preLessonButton.addMouseListener(this);
/*  61 */     nextLessonButton.addMouseListener(this);
/*     */     
/*  63 */     superPanel.add(lesson[0], "Center");
/*  64 */     superPanel.add(quxirLabel[0], "Last");
/*  65 */     currentlyAttachedLessonToSuperPanel = 0;
/*  66 */     preLessonButton.setEnabled(false);
/*     */     

/*  89 */     superPanel.add(menuPanel, "North");
/*  90 */     superPanel.add(preLessonButton, "West");
/*  91 */     superPanel.add(nextLessonButton, "East");
/*  92 */     lessonFrame.add(superPanel);
/*  93 */     lessonFrame.setVisible(true);
/*     */   }

/*     */   public void createFidelButton()
/*     */   {
/*  99 */     for (int i = 0; i < 35; i++) {
/* 100 */       for (int j = 0; j < 7; j++) {
    
/* 101 */         fidelButton[i][j] = new JButton(this.myFidels.fidel[i][j])
/*     */         {
/*     */           @Override
                    public JToolTip createToolTip() {
/* 104 */             JToolTip ttip = super.createToolTip();
/* 107 */             ttip.setFont(new Font("Segoe UI Light", 0, 30));
/* 108 */             return ttip;
/*     */           }
/*     */           
/* 111 */         };
/* 112 */         fidelButton[i][j].setFont(nyalaMiddium);
/* 113 */         fidelButton[i][j].setToolTipText(this.myFidels.sound[i][j]);
/*     */       }
/*     */     }
/*     */     
/* 117 */     originalColor = fidelButton[0][0].getBackground();
/*     */   }
/*     */   
/*     */   public void createLessonToolTips(){
    
/* 122 */     quxirLabel[0] = new JLabel("Lesson 1");
/* 123 */     quxirLabel[1] = new JLabel("Lesson 2");
/* 124 */     quxirLabel[2] = new JLabel("Lesson 3");
/* 125 */     quxirLabel[3] = new JLabel("Lesson 4");
/* 126 */     quxirLabel[4] = new JLabel("Lesson 5");
/* 127 */     quxirLabel[5] = new JLabel("Lesson 6");
/* 128 */     quxirLabel[6] = new JLabel("Lesson 7");
              quxirLabel[7] = new JLabel("Congrats!, You have completed all lessons!");
/*     */     
/* 130 */     for (int i = 0; i < 8; i++) {
/* 131 */       quxirLabel[i].setFont(new Font("Segoe UI Light",Font.PLAIN,30));
/* 132 */       quxirLabel[i].setToolTipText("Lesson " + (i + 1));
/*     */     }
/*     */   }
/*     */   
/*     */   public void createLesson() {
/* 137 */     JLabel ethiopicNumeral = new JLabel("Lesson ፩");
/* 138 */     ethiopicNumeral.setFont(nyalaMiddium);
/* 139 */     superPanel.add(ethiopicNumeral, "Last");
/* 140 */     for (int a = 0; a < 7; a++) {
/* 141 */       lesson[a] = new JPanel(gridLayout);
/* 142 */       for (int i = 0; i < 5; i++) {
/* 143 */         for (int j = 0; j < 7; j++) {
/* 144 */           lesson[a].add(fidelButton[(i + a * 5)][j]);
/*     */         }
/*     */       }
/*     */     }
                   lesson[7] = new JPanel(){
                        
                       BufferedImage img;

                       
                       @Override
                       public void paintComponent(Graphics gg){
                           
                           
                           if(img==null){
                                try{
                                    img= ImageIO.read( new File("data\\image\\finished.png") );
                                }
                                catch(Exception e){
                                   System.out.println("could not file file : finished.png");
                            }
                           }
                               Graphics2D g = (Graphics2D)gg;
                               g.fillRect(0, 0, 355,355);
                               g.drawImage(img,0, 0, null);

                       }
                   };

/*     */   }
/*     */   
/*     */   public void registerListener() {
/* 151 */     for (int i = 0; i < 35; i++) {
/* 152 */       for (int j = 0; j < 7; j++) {
/* 153 */         fidelButton[i][j].addActionListener(this);
/* 154 */         fidelButton[i][j].addMouseListener(this);
/*     */       }
/*     */     }
/* 157 */     nextLessonButton.addActionListener(this);
/* 158 */     preLessonButton.addActionListener(this);
/*     */   }
/*     */   
/*     */   public static void setPanel(int indexOfLessonToAddToLessonUI) {
/* 162 */     if (indexOfLessonToAddToLessonUI >= 0) {
/* 163 */       currentlyAttachedLessonToSuperPanel += 1;
/* 164 */       if (currentlyAttachedLessonToSuperPanel == 7) {
/* 165 */         nextLessonButton.setEnabled(false);
/*     */       }
/* 168 */       superPanel.add(lesson[currentlyAttachedLessonToSuperPanel]);
/* 169 */       superPanel.add(quxirLabel[currentlyAttachedLessonToSuperPanel], "Last");
/* 170 */       superPanel.repaint();
/* 171 */       lessonFrame.add(superPanel);
/* 172 */       lessonFrame.repaint();
/* 173 */       lessonFrame.validate();
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 178 */       if (currentlyAttachedLessonToSuperPanel == 0) {
/* 179 */         preLessonButton.setEnabled(false);
/*     */       }
/*     */       
/* 182 */       superPanel.add(quxirLabel[currentlyAttachedLessonToSuperPanel], "Last");
/* 183 */       superPanel.add(lesson[currentlyAttachedLessonToSuperPanel]);
/* 184 */       superPanel.repaint();
/* 185 */       lessonFrame.add(superPanel);
/* 186 */       lessonFrame.repaint();
/* 187 */       lessonFrame.validate();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void actionPerformed(ActionEvent event)
/*     */   {
/* 196 */     JButton theClickedButton = (JButton)event.getSource();
/* 197 */     if (theClickedButton == nextLessonButton) {
/* 198 */       superPanel.remove(lesson[currentlyAttachedLessonToSuperPanel]);
/* 199 */       superPanel.remove(quxirLabel[currentlyAttachedLessonToSuperPanel]);
/* 200 */       lessonFrame.remove(superPanel);
/* 201 */       preLessonButton.setEnabled(true);
/* 202 */       if (currentlyAttachedLessonToSuperPanel ==7) {
/* 203 */         nextLessonButton.setEnabled(false);
/*     */       }
/* 205 */       else if (currentlyAttachedLessonToSuperPanel + 1 > user.getUnlockedLevel()) {
/* 206 */         QuizUI qu = new QuizUI(lessonFrame, user);
/* 207 */         qu.prepareQuiz(currentlyAttachedLessonToSuperPanel);
/*     */       }
/*     */       else {
/* 210 */         setPanel(currentlyAttachedLessonToSuperPanel);
/*     */       }
/*     */       
/*     */     }
/* 214 */     else if (theClickedButton == preLessonButton) {
/* 215 */       nextLessonButton.setEnabled(true);
/* 216 */       if (currentlyAttachedLessonToSuperPanel == 0) {
/* 217 */         preLessonButton.setEnabled(false);
/*     */       }
/*     */       
/* 220 */       superPanel.remove(lesson[currentlyAttachedLessonToSuperPanel]);
/* 221 */       superPanel.remove(quxirLabel[currentlyAttachedLessonToSuperPanel]);
/* 222 */       currentlyAttachedLessonToSuperPanel -= 1;
/* 223 */       setPanel(-1);
/* 224 */       superPanel.repaint();
/* 225 */       lessonFrame.validate();
/*     */     }
/*     */   }

   @Override
   public void mouseEntered(MouseEvent event){
     JButton theClickedButton = (JButton)event.getSource();
     if ((theClickedButton != nextLessonButton) && (theClickedButton != preLessonButton))
     {
       theClickedButton.setBackground(new Color(0, 162, 232));
       theClickedButton.setForeground(Color.WHITE);
       theClickedButton.setFont(new Font("nyala", 1, 40));
        Narrator.playFidel(theClickedButton.getText());
     }
   }
   
   @Override
   public void mouseExited(MouseEvent event)
/*     */   {
/* 251 */     JButton button = (JButton)event.getSource();
/* 252 */     button.setBackground(originalColor);
/* 253 */     button.setForeground(Color.BLACK);
/* 254 */     button.setFont(nyalaMiddium);
/*     */   }
/*     */   
/*     */   public void mousePressed(MouseEvent event) {}
/*     */   
/*     */   public void mouseReleased(MouseEvent event) {}
/*     */   
/*     */   public void mouseClicked(MouseEvent event) {}
/*     */ }
