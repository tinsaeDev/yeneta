
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
/*    */ import sun.audio.AudioPlayer;
/*    */ 
/*    */ class Narrator
/*    */ {
/*    */   static AudioPlayer audioPlayer;
/*    */   static java.io.InputStream inputStream;
/*    */   static sun.audio.AudioStream audioStream;
/*    */   
/*    */   Narrator() {}
/*    */   
/*    */   public static boolean openFile(java.io.File file)
/*    */   {
/*    */     try {
/* 14 */       inputStream = new java.io.FileInputStream(file);
/* 15 */       audioStream = new sun.audio.AudioStream(inputStream);
/* 16 */       return true;
/*    */     }
/*    */     catch (java.io.IOException exception) {}
/*    */     
/*    */ 
/*    */ 
/* 22 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void playFidel(String fidelText)
/*    */   {

             AudioPlayer.player.stop(audioStream);
             java.io.File file = new java.io.File("data\\audio\\" + fidelText + ".wav");
    
             if (openFile(file)) {
                AudioPlayer.player.start(audioStream);
                }
            }
            
           public static void play(String sound){
            byte[] buffer = new byte[4096];
  
            
                File file = new File("data\\audio\\"+sound+".wav");
            try {
                    AudioInputStream is = AudioSystem.getAudioInputStream(file);
                    AudioFormat format = is.getFormat();
                    SourceDataLine line = AudioSystem.getSourceDataLine(format);
                    line.open(format);
                    line.start();
            while (is.available() > 0) {
                int len = is.read(buffer);
                line.write(buffer, 0, len);
            }
            line.drain();
            line.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
}


}
