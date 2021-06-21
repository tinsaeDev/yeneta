/*     */ class Fidel
/*     */ {
/*   3 */   String[][] fidel = new String[35][7];
/*   4 */   String[][] sound = new String[35][7];
/*     */   
/*     */ 
/*     */ 
/*     */   public Fidel()
/*     */   {
/*  10 */     this.fidel[0][0] = "ሀ";
/*  11 */     this.fidel[0][1] = "ሁ";
/*  12 */     this.fidel[0][2] = "ሂ";
/*  13 */     this.fidel[0][3] = "ሃ";
/*  14 */     this.fidel[0][4] = "ሄ";
/*  15 */     this.fidel[0][5] = "ህ";
/*  16 */     this.fidel[0][6] = "ሆ";
/*     */     
/*     */ 
/*     */ 
/*  20 */     this.fidel[1][0] = "ለ";
/*  21 */     this.fidel[1][1] = "ሉ";
/*  22 */     this.fidel[1][2] = "ሊ";
/*  23 */     this.fidel[1][3] = "ላ";
/*  24 */     this.fidel[1][4] = "ሌ";
/*  25 */     this.fidel[1][5] = "ል";
/*  26 */     this.fidel[1][6] = "ሎ";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  31 */     this.fidel[2][0] = "ሐ";
/*  32 */     this.fidel[2][1] = "ሑ";
/*  33 */     this.fidel[2][2] = "ሒ";
/*  34 */     this.fidel[2][3] = "ሓ";
/*  35 */     this.fidel[2][4] = "ሔ";
/*  36 */     this.fidel[2][5] = "ሕ";
/*  37 */     this.fidel[2][6] = "ሖ";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  42 */     this.fidel[3][0] = "መ";
/*  43 */     this.fidel[3][1] = "ሙ";
/*  44 */     this.fidel[3][2] = "ሚ";
/*  45 */     this.fidel[3][3] = "ማ";
/*  46 */     this.fidel[3][4] = "ሜ";
/*  47 */     this.fidel[3][5] = "ም";
/*  48 */     this.fidel[3][6] = "ሞ";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */     this.fidel[4][0] = "ሠ";
/*  55 */     this.fidel[4][1] = "ሡ";
/*  56 */     this.fidel[4][2] = "ሢ";
/*  57 */     this.fidel[4][3] = "ሣ";
/*  58 */     this.fidel[4][4] = "ሤ";
/*  59 */     this.fidel[4][5] = "ሥ";
/*  60 */     this.fidel[4][6] = "ሦ";
/*     */     
/*     */ 
/*     */ 
/*  64 */     this.fidel[5][0] = "ረ";
/*  65 */     this.fidel[5][1] = "ሩ";
/*  66 */     this.fidel[5][2] = "ሪ";
/*  67 */     this.fidel[5][3] = "ራ";
/*  68 */     this.fidel[5][4] = "ሬ";
/*  69 */     this.fidel[5][5] = "ር";
/*  70 */     this.fidel[5][6] = "ሮ";
/*     */     
/*     */ 
/*  73 */     this.fidel[6][0] = "ሰ";
/*  74 */     this.fidel[6][1] = "ሱ";
/*  75 */     this.fidel[6][2] = "ሲ";
/*  76 */     this.fidel[6][3] = "ሳ";
/*  77 */     this.fidel[6][4] = "ሴ";
/*  78 */     this.fidel[6][5] = "ስ";
/*  79 */     this.fidel[6][6] = "ሶ";
/*     */     
/*     */ 
/*     */ 
/*  83 */     this.fidel[7][0] = "ሸ";
/*  84 */     this.fidel[7][1] = "ሹ";
/*  85 */     this.fidel[7][2] = "ሺ";
/*  86 */     this.fidel[7][3] = "ሻ";
/*  87 */     this.fidel[7][4] = "ሼ";
/*  88 */     this.fidel[7][5] = "ሽ";
/*  89 */     this.fidel[7][6] = "ሾ";
/*     */     
/*     */ 
/*     */ 
/*  93 */     this.fidel[8][0] = "ቀ";
/*  94 */     this.fidel[8][1] = "ቁ";
/*  95 */     this.fidel[8][2] = "ቂ";
/*  96 */     this.fidel[8][3] = "ቃ";
/*  97 */     this.fidel[8][4] = "ቄ";
/*  98 */     this.fidel[8][5] = "ቅ";
/*  99 */     this.fidel[8][6] = "ቆ";
/*     */     
/*     */ 
/*     */ 
/* 103 */     this.fidel[9][0] = "በ";
/* 104 */     this.fidel[9][1] = "ቡ";
/* 105 */     this.fidel[9][2] = "ቢ";
/* 106 */     this.fidel[9][3] = "ባ";
/* 107 */     this.fidel[9][4] = "ቤ";
/* 108 */     this.fidel[9][5] = "ብ";
/* 109 */     this.fidel[9][6] = "ቦ";
/*     */     
/*     */ 
/*     */ 
/* 113 */     this.fidel[10][0] = "ቨ";
/* 114 */     this.fidel[10][1] = "ቩ";
/* 115 */     this.fidel[10][2] = "ቪ";
/* 116 */     this.fidel[10][3] = "ቫ";
/* 117 */     this.fidel[10][4] = "ቬ";
/* 118 */     this.fidel[10][5] = "ቭ";
/* 119 */     this.fidel[10][6] = "ቮ";
/*     */     
/*     */ 
/*     */ 
/* 123 */     this.fidel[11][0] = "ተ";
/* 124 */     this.fidel[11][1] = "ቱ";
/* 125 */     this.fidel[11][2] = "ቲ";
/* 126 */     this.fidel[11][3] = "ታ";
/* 127 */     this.fidel[11][4] = "ቴ";
/* 128 */     this.fidel[11][5] = "ት";
/* 129 */     this.fidel[11][6] = "ቶ";
/*     */     
/*     */ 
/*     */ 
/* 133 */     this.fidel[12][0] = "ቸ";
/* 134 */     this.fidel[12][1] = "ቹ";
/* 135 */     this.fidel[12][2] = "ቺ";
/* 136 */     this.fidel[12][3] = "ቻ";
/* 137 */     this.fidel[12][4] = "ቼ";
/* 138 */     this.fidel[12][5] = "ች";
/* 139 */     this.fidel[12][6] = "ቾ";
/*     */     
/*     */ 
/*     */ 
/* 143 */     this.fidel[13][0] = "ኀ";
/* 144 */     this.fidel[13][1] = "ኁ";
/* 145 */     this.fidel[13][2] = "ኂ";
/* 146 */     this.fidel[13][3] = "ኃ";
/* 147 */     this.fidel[13][4] = "ኄ";
/* 148 */     this.fidel[13][5] = "ኅ";
/* 149 */     this.fidel[13][6] = "ኆ";
/*     */     
/*     */ 
/*     */ 
/* 153 */     this.fidel[14][0] = "ነ";
/* 154 */     this.fidel[14][1] = "ኑ";
/* 155 */     this.fidel[14][2] = "ኒ";
/* 156 */     this.fidel[14][3] = "ና";
/* 157 */     this.fidel[14][4] = "ኔ";
/* 158 */     this.fidel[14][5] = "ን";
/* 159 */     this.fidel[14][6] = "ኖ";
/*     */     
/*     */ 
/*     */ 
/* 163 */     this.fidel[15][0] = "ኘ";
/* 164 */     this.fidel[15][1] = "ኙ";
/* 165 */     this.fidel[15][2] = "ኚ";
/* 166 */     this.fidel[15][3] = "ኛ";
/* 167 */     this.fidel[15][4] = "ኜ";
/* 168 */     this.fidel[15][5] = "ኝ";
/* 169 */     this.fidel[15][6] = "ኞ";
/*     */     
/*     */ 
/*     */ 
/* 173 */     this.fidel[16][0] = "አ";
/* 174 */     this.fidel[16][1] = "ኡ";
/* 175 */     this.fidel[16][2] = "ኢ";
/* 176 */     this.fidel[16][3] = "ኣ";
/* 177 */     this.fidel[16][4] = "ኤ";
/* 178 */     this.fidel[16][5] = "እ";
/* 179 */     this.fidel[16][6] = "ኦ";
/*     */     
/*     */ 
/*     */ 
/* 183 */     this.fidel[17][0] = "ከ";
/* 184 */     this.fidel[17][1] = "ኩ";
/* 185 */     this.fidel[17][2] = "ኪ";
/* 186 */     this.fidel[17][3] = "ካ";
/* 187 */     this.fidel[17][4] = "ኬ";
/* 188 */     this.fidel[17][5] = "ክ";
/* 189 */     this.fidel[17][6] = "ኮ";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 194 */     this.fidel[18][0] = "ኸ";
/* 195 */     this.fidel[18][1] = "ኹ";
/* 196 */     this.fidel[18][2] = "ኺ";
/* 197 */     this.fidel[18][3] = "ኻ";
/* 198 */     this.fidel[18][4] = "ኼ";
/* 199 */     this.fidel[18][5] = "ኽ";
/* 200 */     this.fidel[18][6] = "ኾ";
/*     */     
/*     */ 
/*     */ 
/* 204 */     this.fidel[19][0] = "ወ";
/* 205 */     this.fidel[19][1] = "ዉ";
/* 206 */     this.fidel[19][2] = "ዊ";
/* 207 */     this.fidel[19][3] = "ዋ";
/* 208 */     this.fidel[19][4] = "ዌ";
/* 209 */     this.fidel[19][5] = "ው";
/* 210 */     this.fidel[19][6] = "ዎ";
/*     */     
/*     */ 
/*     */ 
/* 214 */     this.fidel[20][0] = "ዐ";
/* 215 */     this.fidel[20][1] = "ዑ";
/* 216 */     this.fidel[20][2] = "ዒ";
/* 217 */     this.fidel[20][3] = "ዓ";
/* 218 */     this.fidel[20][4] = "ዔ";
/* 219 */     this.fidel[20][5] = "ዕ";
/* 220 */     this.fidel[20][6] = "ዖ";
/*     */     
/*     */ 
/*     */ 
/* 224 */     this.fidel[21][0] = "ዘ";
/* 225 */     this.fidel[21][1] = "ዙ";
/* 226 */     this.fidel[21][2] = "ዚ";
/* 227 */     this.fidel[21][3] = "ዛ";
/* 228 */     this.fidel[21][4] = "ዜ";
/* 229 */     this.fidel[21][5] = "ዝ";
/* 230 */     this.fidel[21][6] = "ዞ";
/*     */     
/*     */ 
/*     */ 
/* 234 */     this.fidel[22][0] = "ዠ";
/* 235 */     this.fidel[22][1] = "ዡ";
/* 236 */     this.fidel[22][2] = "ዢ";
/* 237 */     this.fidel[22][3] = "ዣ";
/* 238 */     this.fidel[22][4] = "ዤ";
/* 239 */     this.fidel[22][5] = "ዥ";
/* 240 */     this.fidel[22][6] = "ዦ";
/*     */     
/*     */ 
/*     */ 
/* 244 */     this.fidel[23][0] = "የ";
/* 245 */     this.fidel[23][1] = "ዩ";
/* 246 */     this.fidel[23][2] = "ዪ";
/* 247 */     this.fidel[23][3] = "ያ";
/* 248 */     this.fidel[23][4] = "ዬ";
/* 249 */     this.fidel[23][5] = "ይ";
/* 250 */     this.fidel[23][6] = "ዮ";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 255 */     this.fidel[24][0] = "ደ";
/* 256 */     this.fidel[24][1] = "ዱ";
/* 257 */     this.fidel[24][2] = "ዲ";
/* 258 */     this.fidel[24][3] = "ዳ";
/* 259 */     this.fidel[24][4] = "ዴ";
/* 260 */     this.fidel[24][5] = "ድ";
/* 261 */     this.fidel[24][6] = "ዶ";
/*     */     
/*     */ 
/*     */ 
/* 265 */     this.fidel[25][0] = "ዸ";
/* 266 */     this.fidel[25][1] = "ዹ";
/* 267 */     this.fidel[25][2] = "ዺ";
/* 268 */     this.fidel[25][3] = "ዻ";
/* 269 */     this.fidel[25][4] = "ዼ";
/* 270 */     this.fidel[25][5] = "ዽ";
/* 271 */     this.fidel[25][6] = "ዾ";
/*     */     
/*     */ 
/*     */ 
/* 275 */     this.fidel[26][0] = "ጀ";
/* 276 */     this.fidel[26][1] = "ጁ";
/* 277 */     this.fidel[26][2] = "ጂ";
/* 278 */     this.fidel[26][3] = "ጃ";
/* 279 */     this.fidel[26][4] = "ጄ";
/* 280 */     this.fidel[26][5] = "ጅ";
/* 281 */     this.fidel[26][6] = "ጆ";
/*     */     
/*     */ 
/*     */ 
/* 285 */     this.fidel[27][0] = "ገ";
/* 286 */     this.fidel[27][1] = "ጉ";
/* 287 */     this.fidel[27][2] = "ጊ";
/* 288 */     this.fidel[27][3] = "ጋ";
/* 289 */     this.fidel[27][4] = "ጌ";
/* 290 */     this.fidel[27][5] = "ግ";
/* 291 */     this.fidel[27][6] = "ጎ";
/*     */     
/*     */ 
/*     */ 
/* 295 */     this.fidel[28][0] = "ጠ";
/* 296 */     this.fidel[28][1] = "ጡ";
/* 297 */     this.fidel[28][2] = "ጢ";
/* 298 */     this.fidel[28][3] = "ጣ";
/* 299 */     this.fidel[28][4] = "ጤ";
/* 300 */     this.fidel[28][5] = "ጥ";
/* 301 */     this.fidel[28][6] = "ጦ";
/*     */     
/*     */ 
/*     */ 
/* 305 */     this.fidel[29][0] = "ጨ";
/* 306 */     this.fidel[29][1] = "ጩ";
/* 307 */     this.fidel[29][2] = "ጪ";
/* 308 */     this.fidel[29][3] = "ጫ";
/* 309 */     this.fidel[29][4] = "ጬ";
/* 310 */     this.fidel[29][5] = "ጭ";
/* 311 */     this.fidel[29][6] = "ጮ";
/*     */     
/*     */ 
/*     */ 
/* 315 */     this.fidel[30][0] = "ጰ";
/* 316 */     this.fidel[30][1] = "ጱ";
/* 317 */     this.fidel[30][2] = "ጲ";
/* 318 */     this.fidel[30][3] = "ጳ";
/* 319 */     this.fidel[30][4] = "ጴ";
/* 320 */     this.fidel[30][5] = "ጵ";
/* 321 */     this.fidel[30][6] = "ጶ";
/*     */     
/*     */ 
/*     */ 
/* 325 */     this.fidel[31][0] = "ጸ";
/* 326 */     this.fidel[31][1] = "ጹ";
/* 327 */     this.fidel[31][2] = "ጺ";
/* 328 */     this.fidel[31][3] = "ጻ";
/* 329 */     this.fidel[31][4] = "ጼ";
/* 330 */     this.fidel[31][5] = "ጽ";
/* 331 */     this.fidel[31][6] = "ጾ";
/*     */     
/*     */ 
/*     */ 
/* 335 */     this.fidel[32][0] = "ፀ";
/* 336 */     this.fidel[32][1] = "ፁ";
/* 337 */     this.fidel[32][2] = "ፂ";
/* 338 */     this.fidel[32][3] = "ፃ";
/* 339 */     this.fidel[32][4] = "ፄ";
/* 340 */     this.fidel[32][5] = "ፅ";
/* 341 */     this.fidel[32][6] = "ፆ";
/*     */     
/*     */ 
/*     */ 
/* 345 */     this.fidel[33][0] = "ፈ";
/* 346 */     this.fidel[33][1] = "ፉ";
/* 347 */     this.fidel[33][2] = "ፊ";
/* 348 */     this.fidel[33][3] = "ፋ";
/* 349 */     this.fidel[33][4] = "ፌ";
/* 350 */     this.fidel[33][5] = "ፍ";
/* 351 */     this.fidel[33][6] = "ፎ";
/*     */     
/*     */ 
/* 354 */     this.fidel[34][0] = "ፐ";
/* 355 */     this.fidel[34][1] = "ፑ";
/* 356 */     this.fidel[34][2] = "ፒ";
/* 357 */     this.fidel[34][3] = "ፓ";
/* 358 */     this.fidel[34][4] = "ፔ";
/* 359 */     this.fidel[34][5] = "ፕ";
/* 360 */     this.fidel[34][6] = "ፖ";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 367 */     this.sound[0][0] = "he";
/* 368 */     this.sound[0][1] = "hu";
/* 369 */     this.sound[0][2] = "hi";
/* 370 */     this.sound[0][3] = "ha";
/* 371 */     this.sound[0][4] = "hie";
/* 372 */     this.sound[0][5] = "h";
/* 373 */     this.sound[0][6] = "ho";
/*     */     
/*     */ 
/*     */ 
/* 377 */     this.sound[1][0] = "le";
/* 378 */     this.sound[1][1] = "lu";
/* 379 */     this.sound[1][2] = "li";
/* 380 */     this.sound[1][3] = "la";
/* 381 */     this.sound[1][4] = "lie";
/* 382 */     this.sound[1][5] = "l";
/* 383 */     this.sound[1][6] = "lo";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 388 */     this.sound[2][0] = "ha";
/* 389 */     this.sound[2][1] = "hu";
/* 390 */     this.sound[2][2] = "hi";
/* 391 */     this.sound[2][3] = "ha";
/* 392 */     this.sound[2][4] = "hie";
/* 393 */     this.sound[2][5] = "h";
/* 394 */     this.sound[2][6] = "ho";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 399 */     this.sound[3][0] = "me";
/* 400 */     this.sound[3][1] = "mu";
/* 401 */     this.sound[3][2] = "mi";
/* 402 */     this.sound[3][3] = "ma";
/* 403 */     this.sound[3][4] = "mie";
/* 404 */     this.sound[3][5] = "m";
/* 405 */     this.sound[3][6] = "mo";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */     this.sound[4][0] = "sse";
/* 412 */     this.sound[4][1] = "ssu";
/* 413 */     this.sound[4][2] = "ssi";
/* 414 */     this.sound[4][3] = "ssa";
/* 415 */     this.sound[4][4] = "ssie";
/* 416 */     this.sound[4][5] = "ss";
/* 417 */     this.sound[4][6] = "sso";
/*     */     
/*     */ 
/*     */ 
/* 421 */     this.sound[5][0] = "re";
/* 422 */     this.sound[5][1] = "ru";
/* 423 */     this.sound[5][2] = "ri";
/* 424 */     this.sound[5][3] = "ra";
/* 425 */     this.sound[5][4] = "rie";
/* 426 */     this.sound[5][5] = "r";
/* 427 */     this.sound[5][6] = "ro";
/*     */     
/*     */ 
/* 430 */     this.sound[6][0] = "se";
/* 431 */     this.sound[6][1] = "su";
/* 432 */     this.sound[6][2] = "si";
/* 433 */     this.sound[6][3] = "sa";
/* 434 */     this.sound[6][4] = "sie";
/* 435 */     this.sound[6][5] = "s";
/* 436 */     this.sound[6][6] = "so";
/*     */     
/*     */ 
/*     */ 
/* 440 */     this.sound[7][0] = "xe";
/* 441 */     this.sound[7][1] = "xu";
/* 442 */     this.sound[7][2] = "xi";
/* 443 */     this.sound[7][3] = "xa";
/* 444 */     this.sound[7][4] = "xie";
/* 445 */     this.sound[7][5] = "x";
/* 446 */     this.sound[7][6] = "xo";
/*     */     
/*     */ 
/*     */ 
/* 450 */     this.sound[8][0] = "qe";
/* 451 */     this.sound[8][1] = "qu";
/* 452 */     this.sound[8][2] = "qi";
/* 453 */     this.sound[8][3] = "qa";
/* 454 */     this.sound[8][4] = "qie";
/* 455 */     this.sound[8][5] = "q";
/* 456 */     this.sound[8][6] = "qo";
/*     */     
/*     */ 
/*     */ 
/* 460 */     this.sound[9][0] = "be";
/* 461 */     this.sound[9][1] = "bu";
/* 462 */     this.sound[9][2] = "bi";
/* 463 */     this.sound[9][3] = "ba";
/* 464 */     this.sound[9][4] = "bie";
/* 465 */     this.sound[9][5] = "b";
/* 466 */     this.sound[9][6] = "bo";
/*     */     
/*     */ 
/*     */ 
/* 470 */     this.sound[10][0] = "ve";
/* 471 */     this.sound[10][1] = "vu";
/* 472 */     this.sound[10][2] = "vi";
/* 473 */     this.sound[10][3] = "va";
/* 474 */     this.sound[10][4] = "vie";
/* 475 */     this.sound[10][5] = "v";
/* 476 */     this.sound[10][6] = "vo";
/*     */     
/*     */ 
/*     */ 
/* 480 */     this.sound[11][0] = "te";
/* 481 */     this.sound[11][1] = "tu";
/* 482 */     this.sound[11][2] = "ti";
/* 483 */     this.sound[11][3] = "ta";
/* 484 */     this.sound[11][4] = "tie";
/* 485 */     this.sound[11][5] = "t";
/* 486 */     this.sound[11][6] = "to";
/*     */     
/*     */ 
/*     */ 
/* 490 */     this.sound[12][0] = "ce";
/* 491 */     this.sound[12][1] = "cu";
/* 492 */     this.sound[12][2] = "ci";
/* 493 */     this.sound[12][3] = "ca";
/* 494 */     this.sound[12][4] = "cie";
/* 495 */     this.sound[12][5] = "c";
/* 496 */     this.sound[12][6] = "co";
/*     */     
/*     */ 
/*     */ 
/* 500 */     this.sound[13][0] = "hhe";
/* 501 */     this.sound[13][1] = "hhu";
/* 502 */     this.sound[13][2] = "hhi";
/* 503 */     this.sound[13][3] = "hha";
/* 504 */     this.sound[13][4] = "hhie";
/* 505 */     this.sound[13][5] = "hh";
/* 506 */     this.sound[13][6] = "hho";
/*     */     
/*     */ 
/*     */ 
/* 510 */     this.sound[14][0] = "ne";
/* 511 */     this.sound[14][1] = "nu";
/* 512 */     this.sound[14][2] = "ni";
/* 513 */     this.sound[14][3] = "na";
/* 514 */     this.sound[14][4] = "nie";
/* 515 */     this.sound[14][5] = "n";
/* 516 */     this.sound[14][6] = "no";
/*     */     
/*     */ 
/*     */ 
/* 520 */     this.sound[15][0] = "nge";
/* 521 */     this.sound[15][1] = "ngu";
/* 522 */     this.sound[15][2] = "ngi";
/* 523 */     this.sound[15][3] = "nga";
/* 524 */     this.sound[15][4] = "ngie";
/* 525 */     this.sound[15][5] = "ng";
/* 526 */     this.sound[15][6] = "ngo";
/*     */     
/*     */ 
/*     */ 
/* 530 */     this.sound[16][0] = "a";
/* 531 */     this.sound[16][1] = "u";
/* 532 */     this.sound[16][2] = "i";
/* 533 */     this.sound[16][3] = "a";
/* 534 */     this.sound[16][4] = "ie";
/* 535 */     this.sound[16][5] = "e";
/* 536 */     this.sound[16][6] = "o";
/*     */     
/*     */ 
/*     */ 
/* 540 */     this.sound[17][0] = "ke";
/* 541 */     this.sound[17][1] = "ku";
/* 542 */     this.sound[17][2] = "ki";
/* 543 */     this.sound[17][3] = "ka";
/* 544 */     this.sound[17][4] = "kie";
/* 545 */     this.sound[17][5] = "k";
/* 546 */     this.sound[17][6] = "ko";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 551 */     this.sound[18][0] = "khe";
/* 552 */     this.sound[18][1] = "khu";
/* 553 */     this.sound[18][2] = "khi";
/* 554 */     this.sound[18][3] = "kha";
/* 555 */     this.sound[18][4] = "khie";
/* 556 */     this.sound[18][5] = "kh";
/* 557 */     this.sound[18][6] = "kho";
/*     */     
/*     */ 
/*     */ 
/* 561 */     this.sound[19][0] = "we";
/* 562 */     this.sound[19][1] = "wu";
/* 563 */     this.sound[19][2] = "wi";
/* 564 */     this.sound[19][3] = "wa";
/* 565 */     this.sound[19][4] = "wie";
/* 566 */     this.sound[19][5] = "w";
/* 567 */     this.sound[19][6] = "wo";
/*     */     
/*     */ 
/*     */ 
/* 571 */     this.sound[20][0] = "A /";
/* 572 */     this.sound[20][1] = "Au /";
/* 573 */     this.sound[20][2] = "Ai /";
/* 574 */     this.sound[20][3] = "Aa /";
/* 575 */     this.sound[20][4] = "Aie/";
/* 576 */     this.sound[20][5] = "Ae /";
/* 577 */     this.sound[20][6] = "Ao /";
/*     */     
/*     */ 
/*     */ 
/* 581 */     this.sound[21][0] = "ze";
/* 582 */     this.sound[21][1] = "zu";
/* 583 */     this.sound[21][2] = "zi";
/* 584 */     this.sound[21][3] = "za";
/* 585 */     this.sound[21][4] = "zie";
/* 586 */     this.sound[21][5] = "z";
/* 587 */     this.sound[21][6] = "zo";
/*     */     
/*     */ 
/*     */ 
/* 591 */     this.sound[22][0] = "zhe";
/* 592 */     this.sound[22][1] = "zhu";
/* 593 */     this.sound[22][2] = "zhi";
/* 594 */     this.sound[22][3] = "zha";
/* 595 */     this.sound[22][4] = "zhie";
/* 596 */     this.sound[22][5] = "zh";
/* 597 */     this.sound[22][6] = "zho";
/*     */     
/*     */ 
/*     */ 
/* 601 */     this.sound[23][0] = "ye";
/* 602 */     this.sound[23][1] = "yu";
/* 603 */     this.sound[23][2] = "yi";
/* 604 */     this.sound[23][3] = "ya";
/* 605 */     this.sound[23][4] = "yie";
/* 606 */     this.sound[23][5] = "y";
/* 607 */     this.sound[23][6] = "yo";
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 612 */     this.sound[24][0] = "de";
/* 613 */     this.sound[24][1] = "du";
/* 614 */     this.sound[24][2] = "di";
/* 615 */     this.sound[24][3] = "da";
/* 616 */     this.sound[24][4] = "die";
/* 617 */     this.sound[24][5] = "d";
/* 618 */     this.sound[24][6] = "do";
/*     */     
/*     */ 
/*     */ 
/* 622 */     this.sound[25][0] = "ዸ";
/* 623 */     this.sound[25][1] = "ዹ";
/* 624 */     this.sound[25][2] = "ዺ";
/* 625 */     this.sound[25][3] = "ዻ";
/* 626 */     this.sound[25][4] = "ዼ";
/* 627 */     this.sound[25][5] = "ዽ";
/* 628 */     this.sound[25][6] = "ዾ";
/*     */     
/*     */ 
/*     */ 
/* 632 */     this.sound[26][0] = "je";
/* 633 */     this.sound[26][1] = "ju";
/* 634 */     this.sound[26][2] = "ji";
/* 635 */     this.sound[26][3] = "ja";
/* 636 */     this.sound[26][4] = "jie";
/* 637 */     this.sound[26][5] = "j";
/* 638 */     this.sound[26][6] = "jo";
/*     */     
/*     */ 
/*     */ 
/* 642 */     this.sound[27][0] = "ge";
/* 643 */     this.sound[27][1] = "gu";
/* 644 */     this.sound[27][2] = "gi";
/* 645 */     this.sound[27][3] = "ga";
/* 646 */     this.sound[27][4] = "gie";
/* 647 */     this.sound[27][5] = "g";
/* 648 */     this.sound[27][6] = "go";
/*     */     
/*     */ 
/*     */ 
/* 652 */     this.sound[28][0] = "the";
/* 653 */     this.sound[28][1] = "thu";
/* 654 */     this.sound[28][2] = "thi";
/* 655 */     this.sound[28][3] = "tha";
/* 656 */     this.sound[28][4] = "thie";
/* 657 */     this.sound[28][5] = "th";
/* 658 */     this.sound[28][6] = "tho";
/*     */     
/*     */ 
/*     */ 
/* 662 */     this.sound[29][0] = "che";
/* 663 */     this.sound[29][1] = "chu";
/* 664 */     this.sound[29][2] = "chi";
/* 665 */     this.sound[29][3] = "cha";
/* 666 */     this.sound[29][4] = "chie";
/* 667 */     this.sound[29][5] = "ch";
/* 668 */     this.sound[29][6] = "cho";
/*     */     
/*     */ 
/*     */ 
/* 672 */     this.sound[30][0] = "phe";
/* 673 */     this.sound[30][1] = "phu";
/* 674 */     this.sound[30][2] = "phi";
/* 675 */     this.sound[30][3] = "pha";
/* 676 */     this.sound[30][4] = "phie";
/* 677 */     this.sound[30][5] = "ph";
/* 678 */     this.sound[30][6] = "pho";
/*     */     
/*     */ 
/*     */ 
/* 682 */     this.sound[31][0] = "ጸ";
/* 683 */     this.sound[31][1] = "ጹ";
/* 684 */     this.sound[31][2] = "ጺ";
/* 685 */     this.sound[31][3] = "ጻ";
/* 686 */     this.sound[31][4] = "ጼ";
/* 687 */     this.sound[31][5] = "ጽ";
/* 688 */     this.sound[31][6] = "ጾ";
/*     */     
/*     */ 
/*     */ 
/* 692 */     this.sound[32][0] = "tse";
/* 693 */     this.sound[32][1] = "tsu";
/* 694 */     this.sound[32][2] = "tsi";
/* 695 */     this.sound[32][3] = "tsa";
/* 696 */     this.sound[32][4] = "tsie";
/* 697 */     this.sound[32][5] = "ts";
/* 698 */     this.sound[32][6] = "tso";
/*     */     
/*     */ 
/*     */ 
/* 702 */     this.sound[33][0] = "fe";
/* 703 */     this.sound[33][1] = "fu";
/* 704 */     this.sound[33][2] = "fi";
/* 705 */     this.sound[33][3] = "fa";
/* 706 */     this.sound[33][4] = "fie";
/* 707 */     this.sound[33][5] = "f";
/* 708 */     this.sound[33][6] = "fo";
/*     */     
/*     */ 
/* 711 */     this.sound[34][0] = "pe";
/* 712 */     this.sound[34][1] = "pu";
/* 713 */     this.sound[34][2] = "pi";
/* 714 */     this.sound[34][3] = "pa";
/* 715 */     this.sound[34][4] = "pie";
/* 716 */     this.sound[34][5] = "p";
/* 717 */     this.sound[34][6] = "po";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   String getSoundOf(String text)
/*     */   {
/* 727 */     String wtr = text;
/* 728 */     for (int i = 0; i < 35; i++) {
/* 729 */       for (int j = 0; j < 7; j++) {
/* 730 */         if (text.equals(this.sound[i][j])) {
/* 731 */           wtr = this.sound[i][j];
/* 732 */           break;
/*     */         }
/*     */       }
/*     */     }
/* 736 */     return wtr;
/*     */   }
/*     */ }
