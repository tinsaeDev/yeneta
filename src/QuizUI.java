
import java.awt.Font;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ class QuizUI implements java.awt.event.ActionListener, java.awt.event.MouseListener
/*     */ {
/*     */   private static int quizProgress;
/*     */   private static JPanel progressPanel;
/*  11 */   int quizStackSize = 35;
/*  12 */   String[][] quizStack = new String[35][4];
/*  13 */   int quizStackTop = -1;
/*  14 */   int currentQuizStackSize = 0;
/*     */   
/*  16 */   int answerStackSize = 4;
/*  17 */   String[] answerStack = new String[this.answerStackSize];
/*  18 */   int answerTop = -1;
/*  19 */   int currentAnswerStackSize = 0;
/*     */   
/*     */ 
/*  22 */   java.awt.Font nyalaMiddium = new java.awt.Font("nyala", 1, 30);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  27 */   javax.swing.ImageIcon speaker_image = new javax.swing.ImageIcon("data\\image\\speaker.png");
/*     */   
/*     */   JFrame frame;
/*     */   JPanel panel;
/*  31 */   JButton[][] alternativeAnswer = new JButton[35][4];
/*  32 */   JPanel[] quizPanel = new JPanel[35];
/*     */   
/*  34 */   javax.swing.Timer[] timer = new javax.swing.Timer[35];
/*     */   
/*  36 */   int currentQuizPanel = 0;
/*  37 */   boolean userPassed = false;
/*     */   int indexOfAnswerFidel;
/*  39 */   String[] realAnswer = new String[35];
/*     */   
/*     */   JButton listenToQuestion;
/*  42 */   java.awt.BorderLayout borderLayout = new java.awt.BorderLayout();
/*     */   
/*     */ 
/*  45 */   static JLabel[] quxir = new JLabel[35];
/*  46 */   static JLabel[] questionNumber = new JLabel[35];
/*     */   
/*     */   java.awt.Color originalColor;
/*     */   
/*     */   User user;
/*  51 */   private int errorCount = 0;
/*     */   private int level;
/*     */   
/*     */   public QuizUI(JFrame frameArg, User user)
/*     */   {
/*  56 */     this.panel = new JPanel();
/*  57 */     this.panel.setLayout(this.borderLayout);
/*  58 */     this.frame = frameArg;
/*  59 */     this.user = user;
/*  60 */     this.frame.add(this.panel);
/*     */     
/*  62 */     progressPanel = new JPanel()
/*     */     {
                @Override
                public void paintComponent(java.awt.Graphics g) {
                  java.awt.Graphics2D dd = (java.awt.Graphics2D)g;
                  dd.setColor(java.awt.Color.GREEN);
                 dd.fillRect(0, 0, (int)(QuizUI.quizProgress * 25.71428571428571D), QuizUI.this.panel.getHeight());
                   }
                 };
               }



           public boolean isQuestionStackHas(String question)   {
/*  76 */     boolean wtr = false;
/*     */     
/*  78 */     for (int i = 0; i < this.quizStackSize; i++)
/*     */     {
/*  80 */       if (question.equals(this.quizStack[i][0]))
/*     */       {
/*  82 */         wtr = true;
/*  83 */         break;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */     return wtr;
/*     */   }
/*     */   
/*     */   public boolean isAnswerStackHas(String probableAnswer)
/*     */   {
/*  99 */     boolean wtr = false;
/*     */     
/* 101 */     for (int i = 0; i < this.currentAnswerStackSize; i++)
/*     */     {
/* 103 */       if (probableAnswer.equals(this.quizStack[this.quizStackTop][i]))
/*     */       {
/* 105 */         wtr = true;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 112 */     return wtr;
/*     */   }
/*     */   
/*     */   public void createQuxirLabels()
/*     */   {
/* 117 */     quxir[0] = new JLabel("Quiz ፩ /1 of ፴፭/35 ");
/* 118 */     quxir[1] = new JLabel("Quiz ፪ /2  of ፴፭/35 ");
/* 119 */     quxir[2] = new JLabel("Quiz ፫ /3  of ፴፭/35 ");
/* 120 */     quxir[3] = new JLabel("Quiz ፬ /4  of ፴፭/35 ");
/* 121 */     quxir[4] = new JLabel("Quiz ፭ /5  of ፴፭/35 ");
/* 122 */     quxir[5] = new JLabel("Quiz ፮ /6  of ፴፭/35 ");
/* 123 */     quxir[6] = new JLabel("Quiz ፯ /7  of ፴፭/35 ");
/* 124 */     quxir[7] = new JLabel("Quiz ፰ /8  of ፴፭/35 ");
/* 125 */     quxir[8] = new JLabel("Quiz ፱ /9  of ፴፭/35 ");
/* 126 */     quxir[9] = new JLabel("Quiz ፲ /10  of ፴፭/35 ");
/*     */     
/* 128 */     quxir[10] = new JLabel("Quiz ፲፩ /11  of ፴፭/35 ");
/* 129 */     quxir[11] = new JLabel("Quiz ፲፪ /12  of ፴፭/35 ");
/* 130 */     quxir[12] = new JLabel("Quiz ፲፫ /13  of ፴፭/35 ");
/* 131 */     quxir[13] = new JLabel("Quiz ፲፬ /14  of ፴፭/35 ");
/* 132 */     quxir[14] = new JLabel("Quiz ፲፭ /15  of ፴፭/35 ");
/* 133 */     quxir[15] = new JLabel("Quiz ፲፮ /16  of ፴፭/35 ");
/* 134 */     quxir[16] = new JLabel("Quiz ፲፯ /17  of ፴፭/35 ");
/* 135 */     quxir[17] = new JLabel("Quiz ፲፰ /18  of ፴፭/35 ");
/* 136 */     quxir[18] = new JLabel("Quiz ፲፱ /19  of ፴፭/35 ");
/*     */     
/* 138 */     quxir[19] = new JLabel("Quiz ፳ /20  ");
/* 139 */     quxir[20] = new JLabel("Quiz ፳፩ /21  of ፴፭/35 ");
/* 140 */     quxir[21] = new JLabel("Quiz ፳፪ /22  of ፴፭/35 ");
/* 141 */     quxir[22] = new JLabel("Quiz ፳፫ /23  of ፴፭/35 ");
/* 142 */     quxir[23] = new JLabel("Quiz ፳፬ /24  of ፴፭/35 ");
/* 143 */     quxir[24] = new JLabel("Quiz ፳፭ /25  of ፴፭/35 ");
/* 144 */     quxir[25] = new JLabel("Quiz ፳፮ /26  of ፴፭/35 ");
/* 145 */     quxir[26] = new JLabel("Quiz ፳፯ /27  of ፴፭/35 ");
/* 146 */     quxir[27] = new JLabel("Quiz ፳፰ /28  of ፴፭/35 ");
/* 147 */     quxir[28] = new JLabel("Quiz ፳፱ /29  of ፴፭/35 ");
/* 148 */     quxir[29] = new JLabel("Quiz ፴ /30  of ፴፭/35 ");
/*     */     
/* 150 */     quxir[30] = new JLabel("Quiz ፴፩ /31  of ፴፭/35 ");
/* 151 */     quxir[31] = new JLabel("Quiz ፴፪ /32  of ፴፭ /35 ");
/* 152 */     quxir[32] = new JLabel("Quiz ፴፫ /33  of ፴፭/35 ");
/* 153 */     quxir[33] = new JLabel("Quiz ፴፬ /34  of ፴፭/35 ");
/* 154 */     quxir[34] = new JLabel("Quiz ፴፭ /35  of ፴፭/35 ");
/*     */     
/*     */ 
/*     */ 
/* 158 */     for (int a = 0; a < 35; a++) {
/* 159 */       quxir[a].setFont(this.nyalaMiddium);
/*     */     }
/*     */   }

/*     */   public void prepareQuiz(int currentlyAttachedLessonToSuperPanel)
/*     */   {
/* 167 */     this.quizStackTop = -1;
/* 168 */     this.currentQuizStackSize = 0;
/*     */     
/* 170 */     while (this.currentQuizStackSize < 35)
/*     */     {
/* 172 */       java.util.Random random = new java.util.Random();
/* 173 */       int row = random.nextInt(5);
/* 174 */       int col = random.nextInt(7);
/* 175 */       row += 5 * currentlyAttachedLessonToSuperPanel;
/*     */       
/* 177 */       Fidel myFidels = new Fidel();
/* 178 */       String selectedFidelText = myFidels.fidel[row][col];
/*     */       
/*     */ 
/* 181 */       if (!isQuestionStackHas(selectedFidelText))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */         this.quizStackTop += 1;
/* 189 */         this.currentQuizStackSize += 1;
/* 190 */         this.quizStack[this.quizStackTop][0] = selectedFidelText;
/* 191 */         this.answerTop = 0;
/* 192 */         this.currentAnswerStackSize = 1;
/*     */         
/*     */ 
/* 195 */         while (this.currentAnswerStackSize < 4)
/*     */         {
/* 197 */           col = random.nextInt(7);
/* 198 */           String selectedAnswerText = myFidels.fidel[row][col];
/*     */           
/* 200 */           if (!isAnswerStackHas(selectedAnswerText))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 205 */             this.currentAnswerStackSize += 1;
/* 206 */             this.answerTop += 1;
/* 207 */             this.quizStack[this.quizStackTop][this.answerTop] = selectedAnswerText;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */     createQuxirLabels();
/* 219 */     startQuiz();
/*     */   }
              public void startQuiz()
/*     */   {
/* 226 */     for (int i = 0; i < 35; i++){

/* 235 */       this.realAnswer[i] = this.quizStack[i][0];
/* 236 */       int indexOfAnsweredFidel = new java.util.Random().nextInt(4);
/*     */       
/* 238 */       String temp = this.quizStack[i][0];
/* 239 */       this.quizStack[i][0] = this.quizStack[i][indexOfAnsweredFidel];
/* 240 */       this.quizStack[i][indexOfAnsweredFidel] = temp;
/*     */       
/* 242 */       this.listenToQuestion = new JButton(this.speaker_image);
/* 243 */       this.originalColor = this.listenToQuestion.getBackground();
/* 244 */       this.listenToQuestion.setToolTipText("Listen to question");
/* 245 */       this.listenToQuestion.setFont(this.nyalaMiddium);
/* 246 */       this.listenToQuestion.addMouseListener(this);
/* 247 */       this.listenToQuestion.addActionListener(new java.awt.event.ActionListener()
/*     */       {
/*     */         public void actionPerformed(java.awt.event.ActionEvent event)
/*     */         {
/* 251 */           Narrator.playFidel(QuizUI.this.realAnswer[QuizUI.this.currentQuizPanel]);
/*     */ 
/*     */         }
/*     */         
/*     */ 
/* 256 */       });
/* 257 */       java.awt.GridBagLayout b = new java.awt.GridBagLayout();
/* 258 */       java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
/*     */       
/* 260 */       int x = 0;
/* 261 */       int y = 0;
/*     */       
/* 263 */       this.quizPanel[i] = new JPanel(b);
/* 264 */       this.timer[i] = new javax.swing.Timer(1000, new QuizUI.TimerActionListenerl());
/* 265 */       questionNumber[i] = quxir[i];
/*     */       
/* 267 */       c.gridx = x;
/* 268 */       c.gridy = y;
/* 269 */       c.gridwidth = 5;
/* 270 */       c.gridheight = 4;
/* 271 */       c.fill = 1;
/* 272 */       c.anchor = 18;
/* 273 */       c.ipady = 0;
/*     */       
/* 275 */       c.insets = new java.awt.Insets(0, 0, 30, 0);
/*     */       
/*     */ 
/*     */ 
/* 279 */       b.setConstraints(questionNumber[i], c);
/*     */       
/*     */ 
/*     */ 
/* 283 */       c.gridwidth = 4;
/* 284 */       c.gridheight = 1;
/* 285 */       c.fill = 2;
/* 286 */       c.anchor = 10;
/* 287 */       y += 5;
/* 288 */       x = 0;
/* 289 */       c.gridheight = 1;
/* 290 */       c.gridy = y;
/* 291 */       c.ipady = 0;
/*     */       
/* 293 */       c.insets = new java.awt.Insets(30, 0, 0, 0);
/* 294 */       b.setConstraints(this.listenToQuestion, c);
/* 295 */       this.quizPanel[i].add(this.listenToQuestion);
/*     */       
/* 297 */       y++;
/* 298 */       x = 0;
/* 299 */       c.gridy = y;
/* 300 */       c.fill = 0;
/* 301 */       c.ipadx = 0;
/* 302 */       c.gridwidth = 1;
/*     */       
/*     */ 
/* 305 */       for (int j = 0; j < 4; j++)
/*     */       {
/* 307 */         c.insets = new java.awt.Insets(30, 0, 0, 10);
/* 308 */         c.gridx = x;
/* 309 */         c.anchor = 17;
/*     */         
/* 311 */         this.alternativeAnswer[i][j] = new JButton(this.quizStack[i][j]);
/* 312 */         this.alternativeAnswer[i][j].setFont(new java.awt.Font("nyala", 0, 60));
/* 313 */         this.alternativeAnswer[i][j].addMouseListener(this);
/* 314 */         this.alternativeAnswer[i][j].addActionListener(this);
/*     */         
/*     */ 
/* 317 */         b.setConstraints(this.alternativeAnswer[i][j], c);
/* 318 */         this.quizPanel[i].add(this.alternativeAnswer[i][j]);
/* 319 */         x++;
/*     */       }
/*     */       
/*     */ 
/* 323 */       y++;
/* 324 */       c.insets = new java.awt.Insets(30, 0, 0, 0);
/*     */       
/* 326 */       JButton cancelQuizButton = new JButton("Cancel");
/* 327 */       cancelQuizButton.setFont( new Font("Segoe UI Light",Font.PLAIN,30) );
/* 328 */       cancelQuizButton.addMouseListener(this);
/* 329 */       cancelQuizButton.addActionListener(new java.awt.event.ActionListener()
/*     */       {
/*     */ 
/*     */         public void actionPerformed(java.awt.event.ActionEvent event)
/*     */         {
/* 334 */           int i = javax.swing.JOptionPane.showConfirmDialog(QuizUI.this.frame, "Are you sure want to cancel ?, your current progres will not be saved", "Confirm", 0, 3);
/*     */           
/* 336 */           if (i == 0) {       
                    panel.remove(quizPanel[currentQuizPanel]);

/* 338 */             timer[currentQuizPanel].stop();
/* 339 */             quizProgress=0;
                        try{
                            frame.remove(panel);
                        }
                        catch(Exception ex){
                            System.err.println("Error rremoving quiz "+ex.getMessage());
                        }
/* 340 */             
/* 341 */             frame.validate();
/* 342 */             LessonUI.setPanel(-1);
/*     */           }
/*     */           
/*     */         }
/* 346 */       });
/* 347 */       c.gridy = y;
/* 348 */       x = 0;
/* 349 */       c.gridx = x;
/* 350 */       c.gridwidth = 5;
/* 351 */       c.fill = 2;
/*     */       
/*     */ 
/* 354 */       b.setConstraints(cancelQuizButton, c);
/*     */       
/* 356 */       this.quizPanel[i].add(cancelQuizButton);
/* 357 */       this.quizPanel[i].setBackground(new java.awt.Color(255, 255, 255));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 363 */     java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
/* 364 */     java.awt.GridBagLayout gbl = new java.awt.GridBagLayout();
/*     */     
/* 366 */     gbc.gridheight = 10;
/*     */     
/* 368 */     gbl.setConstraints(this.quizPanel[this.currentQuizPanel], gbc);
/*     */     
/* 370 */     this.panel.setLayout(this.borderLayout);
/* 371 */     this.panel.add(this.quizPanel[this.currentQuizPanel], "Center");
/* 372 */     this.panel.add(progressPanel, "Last");
/*     */     
/* 374 */     this.panel.setOpaque(true);
/* 375 */     this.panel.repaint();
/* 376 */     this.frame.validate();
/*     */     
/* 378 */     this.timer[this.currentQuizPanel].start();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void actionPerformed(java.awt.event.ActionEvent event)
/*     */   {
/* 386 */     JButton clickedButton = (JButton)event.getSource();
/* 387 */     String trial = clickedButton.getText();
/*     */     
/* 389 */     if (this.realAnswer[this.currentQuizPanel].equals(trial)) {
/* 390 */       this.panel.remove(this.quizPanel[this.currentQuizPanel]);
/* 391 */       this.timer[this.currentQuizPanel].stop();
/* 392 */       this.currentQuizPanel += 1;
/*     */       
/* 394 */       if (this.currentQuizPanel == 35) // change 5 back into 35
/*     */       {
/* 396 */         quizProgress = 0;
                  Narrator.playFidel("applause");
                  progressPanel.repaint();
/* 398 */         
                    dialogs.PassedDialog passedDialog = new dialogs.PassedDialog();
                                            int xWindow = this.frame.getWidth();
                                            int yWindow = this.frame.getHeight();
                                            int locXWindow = (int)this.frame.getLocation().getX();
                                            int locYWindow = (int)this.frame.getLocation().getY();
                                            int halfWidthWindow = xWindow / 2;
                                            int halfHeightWindow = yWindow / 2;
                                   passedDialog.setLocation(locXWindow + (halfWidthWindow - 133 ), locYWindow + (halfHeightWindow - 210));
                                   passedDialog.setVisible(true);
                                   passedDialog.dispose();
                 Narrator.playFidel("none");
                    

/* 399 */         this.user.setUnlockedLevel(this.user.getUnlockedLevel() + 1);
/* 400 */         User.saveUser(this.user);
/* 401 */         this.frame.remove(this.panel);
/* 402 */         this.frame.validate();
/* 403 */         LessonUI.setPanel(1);
/* 406 */         this.errorCount = 0;
/*     */       }
                    else{
                         Narrator.playFidel("correct"); 
                        }
/*     */       this.panel.add(this.quizPanel[this.currentQuizPanel]);
/* 410 */       this.panel.repaint();
/* 411 */       this.frame.validate();
/* 412 */       this.timer[this.currentQuizPanel].start();
/* 413 */       quizProgress = this.currentQuizPanel;
/* 414 */       progressPanel.repaint();
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 419 */       this.errorCount += 1;
/* 420 */       this.level = (31 - this.user.getQuizLevel());
/* 421 */       if ((this.level >= 0) && (this.level <= 10) && (this.errorCount >= 3)) {
/* 422 */         haltQuiz();
/*     */       }
/* 424 */       else if ((this.level > 10) && (this.level <= 20) && (this.errorCount >= 2)) {
/* 425 */         haltQuiz();
/*     */       }
/* 427 */       else if ((this.level > 20) && (this.errorCount >= 1)) {
/* 428 */         haltQuiz();
/*     */       }
/*     */       else {
/* 431 */           Narrator.playFidel("wrong");
                    int originalX = (int) frame.getLocation().getX();
                    int originalY = (int) frame.getLocation().getY();
                    try{
                            frame.setLocation(originalX+20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX-20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX+20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX-20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX+20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX-20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX+20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX-20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX+20, originalY);
                                Thread.sleep(50);
                            frame.setLocation(originalX-20, originalY);
                                Thread.sleep(50);
                            
                    }
                    catch(InterruptedException e){
                    }
                    frame.setLocation(originalX, originalY);
/*     */       }
/*     */       
/* 434 */       System.out.println("Made error");
/*     */     }
/*     */   }
/*     */   
/*     */   public void haltQuiz() {
               
              Narrator.playFidel("faild");
/* 439 */     this.timer[this.currentQuizPanel].stop();
                    dialogs.FailedDialog failedDialog = new dialogs.FailedDialog();
                            int xWindow = this.frame.getWidth();
                            int yWindow = this.frame.getHeight();
                            int locXWindow = (int)this.frame.getLocation().getX();
                            int locYWindow = (int)this.frame.getLocation().getY();
                            int halfWidthWindow = xWindow / 2;
                            int halfHeightWindow = yWindow / 2;
                   failedDialog.setLocation(locXWindow + (halfWidthWindow - 133 ), locYWindow + (halfHeightWindow - 210));
                   failedDialog.setVisible(true);
                   failedDialog.dispose();
              Narrator.playFidel("none");
    
            

              this.frame.remove(this.panel);
/* 442 */     this.frame.remove(this.panel);
/* 443 */     this.frame.validate();
/* 444 */     LessonUI.setPanel(-1);
/* 445 */     quizProgress = 0;
/* 446 */     progressPanel.repaint();
/*     */   }
/*     */   
/*     */ 
/*     */   public void mouseEntered(MouseEvent event)
/*     */   {
/* 452 */     JButton theClickedButton = (JButton)event.getSource();
/*     */     
/* 454 */     if ("Cancel".equals(theClickedButton.getText()))
/*     */     {
/* 456 */       theClickedButton.setBackground(new java.awt.Color(255, 0, 0));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */@Override
   public void mouseExited(MouseEvent event)
/*     */   {
/* 464 */     JButton theClickedButton = (JButton)event.getSource();
/*     */     
/* 466 */     if ("Cancel".equals(theClickedButton.getText()))
/*     */     {
/* 468 */       theClickedButton.setBackground(this.originalColor);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */@Override
   public void mousePressed(MouseEvent event)
/*     */   {
/* 478 */     JButton theClickedButton = (JButton)event.getSource();
/* 479 */     theClickedButton.setBackground(new java.awt.Color(0, 162, 232));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */@Override
   public void mouseReleased(MouseEvent event)
/*     */   {
/* 487 */     JButton button = (JButton)event.getSource();
/* 488 */     button.setBackground(this.originalColor);
/*     */   }
/*     */   
/*     */ 
/*     */@Override
   public void mouseClicked(MouseEvent event) {}
/*     */   
/*     */ 
/*     */   class TimerActionListenerl
/*     */     implements java.awt.event.ActionListener
/*     */   {
/* 498 */     int waitingSecond = QuizUI.this.user.getQuizLevel();
/*     */     
/*     */ 
/*     */     public TimerActionListenerl() {}
/*     */     

                public void haltQuiz(){
                  /* 505 */       if (this.waitingSecond <= -1 ) {
/* 506 */         QuizUI.this.timer[QuizUI.this.currentQuizPanel].stop();
/* 507 */        

                    
                    Narrator.playFidel("timeout");
                    dialogs.TimeoutDialog timeoutDialog = new dialogs.TimeoutDialog();
                                            int xWindow = frame.getWidth();
                                            int yWindow = frame.getHeight();
                                            int locXWindow = (int)frame.getLocation().getX();
                                            int locYWindow = (int)frame.getLocation().getY();
                                            int halfWidthWindow = xWindow / 2;
                                            int halfHeightWindow = yWindow / 2;
                                   timeoutDialog.setLocation(locXWindow + (halfWidthWindow - 133 ), locYWindow + (halfHeightWindow - 210));
                                   timeoutDialog.setVisible(true);
                                   timeoutDialog.dispose();
                    Narrator.playFidel("none");
/* 508 */         QuizUI.this.frame.remove(QuizUI.this.panel);
/* 509 */         QuizUI.this.frame.remove(QuizUI.this.panel);
/* 510 */         QuizUI.this.frame.validate();
/* 511 */         LessonUI.setPanel(-1);
/* 512 */         QuizUI.quizProgress=0;
/* 513 */         QuizUI.progressPanel.repaint();
/* 514 */         return;
/*     */       }
/*     */       
/*     */ 
/* 518 */       java.awt.Graphics2D graphics = (java.awt.Graphics2D)QuizUI.this.quizPanel[QuizUI.this.currentQuizPanel].getGraphics();
/*     */       
/* 520 */       graphics.setColor(java.awt.Color.WHITE);
/* 521 */       graphics.fillRect(0, 20, 250, 600);
/*     */       
/*     */ 
/* 524 */       if (this.waitingSecond > 5) {
/* 525 */         graphics.setColor(java.awt.Color.GREEN);
/*     */       }
/* 527 */       else if (this.waitingSecond > 2) {
/* 528 */         graphics.setColor(java.awt.Color.YELLOW);
/*     */       }
/*     */       else {
/* 531 */         graphics.setColor(java.awt.Color.RED);
/*     */       }
/*     */       
/* 534 */       graphics.setFont(new java.awt.Font("Segoe UI Light", 0, 200));
/* 535 */       graphics.drawString(this.waitingSecond + "", 0, 200);
/* 536 */       this.waitingSecond -= 1;
                    
                }
                
                public void vibrate(){
                
                
                
                }
                
/*     */@Override
     public void actionPerformed(java.awt.event.ActionEvent event)
/*     */     {
                 haltQuiz();
                 
/*     */     }
/*     */   }
/*     */ }
