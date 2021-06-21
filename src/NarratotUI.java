



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;



public class NarratotUI  {

    GridBagLayout l;
    GridBagConstraints c;
    
    JTextArea boardTextArea;
    JLabel errorIndicator;
    boolean removeErrorText=false;
    JProgressBar progressIndicatorJProgressBar;
    
    JButton playPauseResumeButton;
    JButton stopButton;
    JScrollPane sp;
    
    JPopupMenu popupMenu;
        JMenuItem copyMenuItem;
        JMenuItem cutMenuItem;
        JMenuItem pasteMenuItem;
        JMenuItem selectAllMenuItem;
        
    
    
    JPanel narratorPanel;
    JFrame mainFrame;
    JPanel superPanel;
    
    NarratotUI me;
    Worker wo;
    
    Fidel f = new Fidel();
    boolean stopIt;
    
    public NarratotUI(JFrame mainFrameArg,JToolBar menuPanel){
        me = this;
        this.mainFrame = mainFrameArg;

        l = new GridBagLayout();
        c = new GridBagConstraints();      
        
        this.narratorPanel = new JPanel( l );
       
        errorIndicator = new JLabel("");
                errorIndicator.setForeground( Color.RED);
        boardTextArea = new JTextArea(10,30);
                boardTextArea.setFont( new Font("nyala",Font.PLAIN,40) );
       
        sp = new JScrollPane(boardTextArea);
        progressIndicatorJProgressBar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
        playPauseResumeButton = new JButton("Play");
        stopButton = new JButton("Stop");
            stopButton.setEnabled(false);
                
        popupMenu = new JPopupMenu();
                copyMenuItem = new JMenuItem("Copy");
                cutMenuItem = new JMenuItem("Cut");
                pasteMenuItem = new JMenuItem("Paste");
                selectAllMenuItem = new JMenuItem("Sellect all");
                
                popupMenu.add(copyMenuItem);
                popupMenu.add(cutMenuItem);
                popupMenu.add(pasteMenuItem);
                popupMenu.add( selectAllMenuItem );
                boardTextArea.setComponentPopupMenu(popupMenu);
                
                setConstraints(); // set constraints to components, as the layout uses GridBagBox layout
                RegisterActionListener(); // register action listener for ecah component
   
        narratorPanel.add(sp);
        narratorPanel.add(errorIndicator);
        narratorPanel.add(progressIndicatorJProgressBar);
        narratorPanel.add(playPauseResumeButton);
        narratorPanel.add(stopButton);
        
        superPanel = new JPanel( new BorderLayout(10,10));
            superPanel.add(menuPanel,BorderLayout.NORTH);
            superPanel.add(narratorPanel,BorderLayout.CENTER);
        mainFrame.add(superPanel);
        mainFrame.validate();
    }
    

    
    public boolean isValidCharcter(String input){
                for(int i=0;i<35;i++){ // for all fidels
                        for(int j=0;j<7;j++){ // for all sounds
                            if(  f.fidel[i][j].equals(input) ){
                                return  true;
                            }
                        }
                    }
                    return false;
        }
    public void RegisterActionListener(){
        
    playPauseResumeButton.addActionListener( new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e){
                    wo=new Worker(me);
                    wo.start();
        }
        } );
    
    stopButton.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if( wo.isAlive() ){
                stopIt=true;
            }
        }
    } );
    
    selectAllMenuItem.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event){
            boardTextArea.selectAll();
        }
    } );
    
    cutMenuItem.addActionListener( new ActionListener(){ // not implemented
        @Override
        public void actionPerformed(ActionEvent event){
            boardTextArea.cut();
        }
    
    } );
    
    copyMenuItem.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event){
           boardTextArea.copy();
        }
    } );
    
    pasteMenuItem.addActionListener( new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                       boardTextArea.paste();
                }
    } );
    
    }
    
    
    public void setConstraints(){
         
                c.gridx=0;
                c.gridy=0;
                c.weighty=0.8;
                c.weightx=1;
                c.gridwidth=10;
                c.insets = new Insets(0, 0, 20, 0);
                
                c.fill=GridBagConstraints.BOTH;
                        
                l.setConstraints(sp, c);
                
                c.gridy=1;
                c.weighty=0.01;
                l.setConstraints(errorIndicator, c);
                
                c.gridy=2;
                c.weighty=0.06;
                l.setConstraints(progressIndicatorJProgressBar, c);
                
                c.gridwidth=1;
                c.gridy=3;
                c.weighty=0.1;
                c.insets = new Insets(0, 0, 0, 10);
                c.gridx=GridBagConstraints.RELATIVE;
                
                l.setConstraints(playPauseResumeButton, c);
                c.insets = new Insets(0, 10, 0, 0);
                l.setConstraints(stopButton, c);
        
    }

}

class Worker extends Thread {
    NarratotUI he;
    public Worker(NarratotUI he){
        this.he = he;
    }
    
    @Override
    public void run(){
             
             he.playPauseResumeButton.setEnabled(false);
             he.stopButton.setEnabled(true);
             he.boardTextArea.requestFocusInWindow();
             he.boardTextArea.setEditable(false);
            String boardContent = he.boardTextArea.getText();    // get text from board.
            
            for(int i=0;i<boardContent.length();i++){
                        if( (he.isValidCharcter(boardContent.charAt(i)+"" ) || boardContent.charAt(i) == ' ') || boardContent.charAt(i)=='\n' ){
                            he.errorIndicator.setText("");
                        } else {
                            he.errorIndicator.setText("Invalid or unsupported characters inside. note: only standard fidels are supported, no punctation or latin or else ");
                            he.mainFrame.validate();
                            stopIt();
                            return;
                 }
                    }
            
            for(int i=0;i<boardContent.length();i++){
                        if(he.stopIt){
                            stopIt();
                            return;
                        }
                        
                        he.boardTextArea.select(i,i+1);
                        he.progressIndicatorJProgressBar.setValue( he.progressIndicatorJProgressBar.getValue() + (100/boardContent.length()) );
                        he.progressIndicatorJProgressBar.repaint();
                        he.mainFrame.validate();
                        
                        if( boardContent.charAt(i)!=' ' && boardContent.charAt(i)!='\n' ){
                            Narrator.play(boardContent.charAt(i)+"" );
                        }else{
                            Narrator.play("none");
                        }
                        
      
                 }
                
                this.stopIt();

    }
    
    public void stopIt(){
            he.progressIndicatorJProgressBar.setValue(0);
            he.boardTextArea.setEditable(true); // allow edition of board. 
            he.playPauseResumeButton.setEnabled(true); // change text from pause to play
            he.superPanel.validate();
            he.stopButton.setEnabled(false);
            he.stopIt=false;
            he.playPauseResumeButton.requestFocusInWindow();
            
            
    }

}
