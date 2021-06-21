/*    */ package language;
/*    */ 
/*    */ public class LanguageFactory {
/*    */   public LanguageFactory() {}
/*    */   
/*  6 */   public static Language getLanguage(String lang) { switch (lang) {
/*    */     case "English": 
/*  8 */       return new English();
/*    */     
/*    */     case "Oromo": 
/* 11 */       return new Oromo();
/*    */     
/*    */     case "Somali": 
/* 14 */       return new Somali();
/*    */     
/*    */     case "Wolaita": 
/* 17 */       return new Wolaita();
/*    */     
/*    */     case "China": 
/* 20 */       return new China();
/*    */     
/*    */     case "India": 
/* 23 */       return new India();
/*    */     
/*    */     case "French": 
/* 26 */       return new French();
/*    */     }
/*    */     
/*    */     
/*    */ 
/* 31 */     return null;
/*    */   }
/*    */ }

