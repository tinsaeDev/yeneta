
import dialogs.AboutDialog;
/*     */ import java.awt.BorderLayout;
import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
/*     */ import sun.audio.AudioPlayer;
/*     */ 
/*     */ class MainUI extends java.awt.event.WindowAdapter implements java.awt.event.ActionListener {
    
            public Font font18 = new Font( "Segoe UI Light",Font.PLAIN,18 );
            public Font font20 = new Font( "Segoe UI Light",Font.PLAIN,20 );
            
            User user;
            public JFrame mainFrame;
            public JPanel mainPanel;

            
            public  JToolBar menuToolBar;
            public NarratotUI narratorUI;
            public LessonUI lessonUI;
            BorderLayout borderLayout;       
  
/*     */   JButton startLessonButton;
            JButton narratorButton;
            JButton settings;
/*     */   JButton exitAppButton;
/*     */   JButton showAboutButton;
/*  28 */   javax.swing.ImageIcon homeBgImage = new javax.swing.ImageIcon("data\\image\\home.png");
/*  29 */   JLabel homeBgImageLabel = new JLabel(this.homeBgImage);
/*     */   

/*     */   java.io.InputStream homeAudioFile;
/*     */   
/*     */   sun.audio.AudioStream homeAudioStream;
/*     */   
/*     */   AudioPlayer homeAudioPlayer;
/*     */   /*     */   /*     */   /*     */   
/*     */   public MainUI(User userArg)
/*     */   {
              this.mainFrame = new JFrame("Yeneta");
                try {
                    this.mainFrame.setIconImage( ImageIO.read( new File("data\\image\\icon.png"))  );
                } catch (IOException ex) {
                   System.err.println("Unable to open icon image file");
                }
 this.mainPanel = new JPanel(new BorderLayout());
/*     */      
               menuToolBar= new JToolBar(SwingConstants.HORIZONTAL);
               menuToolBar.setFloatable(false);
               
/*  48 */     this.user = userArg;

/*  50 */     this.startLessonButton = new JButton("Start Lesson");
                   startLessonButton.setFont(font18);
                   
              
              this.narratorButton = new JButton("Narrator");
                                    narratorButton.setFont(font18);
              this.settings = new JButton("Settings");
                   settings.setFont(font18);

/*  52 */     this.exitAppButton = new JButton("Exit App");
                   exitAppButton.setFont(font18);

             this.showAboutButton = new JButton("About");
                   showAboutButton.setFont(font18);

/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  60 */       this.homeAudioFile = new java.io.FileInputStream("data\\abugida.wav");
/*  61 */       this.homeAudioStream = new sun.audio.AudioStream(this.homeAudioFile);
/*  62 */       AudioPlayer.player.start(this.homeAudioStream);
/*     */     }
/*     */     catch (java.io.IOException localIOException) {}
/*     */               createUI();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void createUI()
/*     */   {
/*  79 */     this.menuToolBar.add("Tinsae",this.startLessonButton);
              this.menuToolBar.add(this.narratorButton);
/*  81 */     this.menuToolBar.add(this.settings);
/*  82 */     this.menuToolBar.add(this.exitAppButton);
/*  80 */     this.menuToolBar.add(this.showAboutButton);
              
/*     */     /*     */     
/*  84 */     this.mainPanel.add(this.menuToolBar, "North");
/*  85 */     this.mainPanel.add(this.homeBgImageLabel, "Center");
/*  86 */     this.mainFrame.add(this.mainPanel);
/*     */     
/*  88 */     this.mainFrame.setBackground(java.awt.Color.WHITE);
/*  89 */     this.mainFrame.setLocation(200, 200);
/*  90 */     this.mainFrame.setSize(900, 500);
/*     */     
/*  92 */     this.mainFrame.setResizable(false);
/*  93 */     this.mainFrame.setVisible(true);
/*  94 */     this.mainFrame.setDefaultCloseOperation(0);
/*     */     
/*  96 */     registerEvents();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void registerEvents()
/*     */   {
/* 103 */     this.startLessonButton.addActionListener(this);
              this.narratorButton.addActionListener(this);
/* 105 */     this.settings.addActionListener(this);
/* 106 */     this.exitAppButton.addActionListener(this);
/* 104 */     this.showAboutButton.addActionListener(this);
/* 107 */     this.mainFrame.addWindowListener(this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ /*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   @Override
             public void actionPerformed(ActionEvent actionEvent)
/*     */   {
/* 115 */     JButton theClickedButton = (JButton)actionEvent.getSource();
/* 116 */     String theClickedButtonText = theClickedButton.getText();
/*     */     /*     */     /*     */     /*     */     /*     */     /*     */     /*     */     /*     */     
/* 118 */     switch (theClickedButtonText) {
/*     */     case "Start Lesson": 
/* 120 */       AudioPlayer.player.stop(this.homeAudioStream);
                this.startLessonButton.hide();
                this.narratorButton.hide();
                this.mainFrame.remove( mainPanel );
                    lessonUI = new LessonUI(this.mainFrame, this.menuToolBar, this.user);
                    mainFrame.validate();
                break;
               
              case "Narrator": {
/* 120 */       AudioPlayer.player.stop(this.homeAudioStream);
                    startLessonButton.hide();
                    narratorButton.hide();
                  
                   mainFrame.remove(mainPanel);
                      
                 new NarratotUI(mainFrame,menuToolBar);
                 mainFrame.validate();
                 break;
                   
              }
/*     */     case "About": 
                    AboutDialog aboutDialog = new AboutDialog();
                                            int  xWindow = mainFrame.getWidth();
                                            int yWindow = mainFrame.getHeight();
                                            int locXWindow = (int)mainFrame.getLocation().getX();
                                            int locYWindow = (int)mainFrame.getLocation().getY();
                                            int halfWidthWindow = xWindow / 2;
                                            int halfHeightWindow = yWindow / 2;
                                   aboutDialog.setLocation(locXWindow + (halfWidthWindow - 133 ), locYWindow + (halfHeightWindow - 210));
                                   aboutDialog.setVisible(true);
                                   aboutDialog.dispose();
                    
/* 154 */       break;
/*     */     
/*     */     /*     */     
/*     */     
/*     */     case "Settings": 
/* 157 */       final JDialog settingsDialog = new JDialog(this.mainFrame);
/* 158 */       settingsDialog.setSize(400, 200);
/* 159 */       settingsDialog.setTitle("Settings");
            /* 160 */       xWindow = this.mainFrame.getWidth();
            /* 161 */       yWindow = this.mainFrame.getHeight();
            /* 162 */       locXWindow = (int)this.mainFrame.getLocation().getX();
            /* 163 */       locYWindow = (int)this.mainFrame.getLocation().getY();
            /* 164 */       halfWidthWindow = xWindow / 2;
            /* 165 */       halfHeightWindow = yWindow / 2;
            /* 166 */       settingsDialog.setLocation(locXWindow + (halfWidthWindow - 200), locYWindow + (halfHeightWindow - 150));
/* 167 */       JPanel settingPanel = new JPanel(new java.awt.GridLayout(2, 2));
/* 168 */       JPanel superPanel = new JPanel(new BorderLayout());
/* 169 */       JLabel langaugeLabel = new JLabel("Language");
                       langaugeLabel.setFont(font20);
/* 170 */       JLabel quizLevelLabel = new JLabel("Quiz difficuty");
                       quizLevelLabel.setFont( font20 );
/* 171 */       final JSlider quizLevelSlider = new JSlider(0, 0, 29, 31 - this.user.getQuizLevel());
/* 172 */       JButton okButton = new JButton("Ok");
                        okButton.setFont( new Font("Segoe UI Light",Font.PLAIN,12) );
/* 173 */       okButton.addActionListener(new java.awt.event.ActionListener()  {
/*     */           @Override
                    public void actionPerformed(ActionEvent e) {
/* 176 */                    MainUI.this.user.setQuizLevel(31 - quizLevelSlider.getValue());
/* 177 */                    settingsDialog.setVisible(false);
/*     */         }
/* 179 */       });
/* 180 */       JComboBox languageComboBox = new JComboBox();
/* 181 */               languageComboBox.addItem("English");
/* 182 */               settingsDialog.setModal(true);
/* 183 */       
                settingPanel.add(langaugeLabel);
/* 184 */       settingPanel.add(languageComboBox);
/* 185 */       settingPanel.add(quizLevelLabel);
/* 186 */       settingPanel.add(quizLevelSlider);
/* 187 */       settingPanel.setVisible(true);
/* 188 */       superPanel.add(settingPanel, "Center");
/* 189 */       superPanel.add(okButton, "South");
/* 190 */       settingsDialog.add(superPanel);
/* 191 */       settingsDialog.setVisible(true);
/* 192 */       break;
/*     */     case "Exit App": 
                JLabel exitPrompt = new JLabel("Are you sure to exit ? unlocked lessons will be saved");
                       exitPrompt.setFont(font18);
/* 194 */       int result = JOptionPane.showConfirmDialog(this.mainFrame,exitPrompt, "Comfirm", 0);
/* 195 */       if (result == 0) {
/* 196 */         User.saveUser(this.user);
/* 197 */         System.exit(0);
/*     */       }
/*     */       
/*     */ 
/*     */       break;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void windowClosing(java.awt.event.WindowEvent event)
/*     */   {
/* 210 */     int result = JOptionPane.showConfirmDialog(this.mainFrame, "Are sure ? unlocked lessons will be saved", "Comfirm", 0);
/* 211 */     if (result == 0) {
/* 212 */       User.saveUser(this.user);
/* 213 */       System.exit(0);
/*     */     }
/*     */   }
/*     */ }
