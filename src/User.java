/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.ObjectOutputStream;
/*    */ import java.io.Serializable;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ class User implements Serializable
/*    */ {
/*    */   private int unlockedLesson;
/*    */   private int quizLevel;
/*    */   static FileInputStream fileInputStream;
/*    */   static FileOutputStream fileOutputStream;
/*    */   static java.io.ObjectInputStream objectInputStream;
/*    */   static ObjectOutputStream objectOutputStream;
/*    */   static User user;
/*    */   
/*    */   public User()
/*    */   {
/* 20 */     this.unlockedLesson = 3;
/* 21 */     this.quizLevel = 10;
/*    */   }
/*    */   
/*    */   public static void saveUser(User userTosave)
/*    */   {
/* 26 */     user = userTosave;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 31 */       File filedirectory = new File("data\\object");
/* 32 */       filedirectory.mkdirs();
/*    */       
/* 34 */       fileOutputStream = new FileOutputStream("data\\object\\user.o");
/* 35 */       objectOutputStream = new ObjectOutputStream(fileOutputStream);
/*    */       
/* 37 */       objectOutputStream.writeObject(user);
/*    */       
/* 39 */       objectOutputStream.flush();
/* 40 */       objectOutputStream.close();
/* 41 */       fileOutputStream.flush();
/* 42 */       fileOutputStream.close();
/*    */ 
/*    */ 
/*    */ 
/*    */     }
/*    */     catch (Exception ioex)
/*    */     {
/*    */ 		JOptionPane.showMessageDialog(null, "Cannot save application data ! please check application permissions", "Error writing a file", 0);
/* 52 */        System.exit(0);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   int getQuizLevel()
/*    */   {
/* 61 */     return this.quizLevel;
/*    */   }
/*    */   
/*    */   public void setQuizLevel(int level) {
/* 65 */     this.quizLevel = level;
/*    */   }
/*    */   
/*    */   int getUnlockedLevel() {
/* 69 */     return this.unlockedLesson;
/*    */   }
/*    */   
/*    */   void setUnlockedLevel(int i) {
/* 73 */     this.unlockedLesson = i;
/*    */   }
/*    */ }
