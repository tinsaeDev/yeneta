		 import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
/*    */ import java.io.EOFException;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.ObjectInputStream;
/*    */ import java.io.ObjectOutputStream;
		 import javax.swing.UIManager;
/*    */ import javax.swing.UnsupportedLookAndFeelException;
/*    */ 
/*    */ public class Yeneta
/*    */ {
/*    */   MainUI ui;
/*    */   static User user;
/* 14 */   static Boolean userNotRegistred = true;
/*    */   static FileInputStream fileInputStream;
/*    */   static FileOutputStream fileOutputStream;
/*    */   static ObjectInputStream objectInputStream;
/*    */   static ObjectOutputStream objectOutputStream;
/*    */   
/*    */    public Yeneta(){
/*    */     try{
/* 34 */       fileInputStream = new FileInputStream("data\\object\\user.o");
/* 35 */       objectInputStream = new ObjectInputStream(fileInputStream);
/*    */       try{
/* 41 */         user = (User)objectInputStream.readObject();
/* 42 */         userNotRegistred = false;
/*    */       }
/*    */       catch (EOFException|ClassNotFoundException localEOFException) {}
/*    */     }
/*    */     catch (IOException localIOException) {

                    }
    

/* 72 */     if (!userNotRegistred) {
/* 73 */       this.ui = new MainUI(user);
/*    */     }
/*    */     else{
/* 77 */       User user = new User();
/* 78 */       User.saveUser(user);
/* 79 */       this.ui = new MainUI(user);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public static void main(String[] args) throws Exception{
    
/* 87 */     UIManager.setLookAndFeel( new SyntheticaPlainLookAndFeel() );
             
/* 88 */     Yeneta m = new Yeneta();

/*    */   }
/*    */ }