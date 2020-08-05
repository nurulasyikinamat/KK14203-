/*
   Group Members :
   1. NUR AISYAH NABILAH BINTI YUSOF (BI19110113)
   2. NURUL ASYIKIN BINTI AMAT (BI19110094)
   3. SALMAH BINTI ASMIN (BI19110112)
   4. ELLY MAZLIN BINTI RAHIM (BI19110025)
   5. NURMUNIRAH BINTI ASRI (BI19110077)
   
   TOPIC : FASHION RECOMMENDER 
*/

import java.util.Scanner;

class Colour { //NUR AISYAH NABILAH BINTI YUSOF (BI19110113)
    String item = " ";
    void Colour(){
    
        System.out.println("********Colours available*********");
    }
       
        char colour;
       public String Colour_Dress(){
       
            Scanner sc = new Scanner(System.in);
            System.out.println("A.Black\t\tB.Navy\t\tC.Emerald");
	    
	    System.out.println("Select colour choice:");
	    colour = sc.next().charAt(0);
	    if(colour == 'A'){
	        System.out.println("Dress(Black)");
	    }
	    else if(colour == 'B')
	    {
	        System.out.println("Dress(Navy)");
	        
	    }
	    else if(colour == 'C')
	    {
	        System.out.println("Dress(Emerald)");
	    }
	    else
	        System.out.println("Invalid colour");
	        
	   return item;
}
	  
	 public String Colour_Skirt(){
	       Scanner sc= new Scanner(System.in);
	       System.out.println("********Colours available********* :");
	       System.out.println("D.Red\t\tE.Nude\t\tF.Brown");
	       System.out.println("Select colour choice:");
	       colour= sc.next().charAt(0);
	       if(colour == 'D')
	       {
	           System.out.println("Skirt(Red)");
	       }
	       else if(colour == 'E' )
	       {
	           System.out.println("Skirt(Nude)");
	       }
	       else if(colour == 'F')
	       {
	           System.out.println("Skirt(Brown)");
	       }
	
	       else
	           System.out.println("Invalid colour");
	           
	           return item;
	    }
	    
	    
	   public String Colour_Shoes(){
	       
	       Scanner sc = new Scanner(System.in);
	       System.out.println("*********Colours available********* :");
	       System.out.println("G.Black\t\tH.Blue\t\tI.Mustard\t\tJ.White");
	       System.out.println("Select colour choice:");
	       colour= sc.next().charAt(0);
	    if(colour == 'G')
	    {
	        System.out.println( "Shoes(Black)");
	    }
	    else if(colour == 'H')
	    {
	        System.out.println("Shoes(Blue)");
	    }
	    else if(colour == 'I')
	   
	    {
	        System.out.println("Shoes(Mustard)");
	    }
	    else if(colour == 'J'){
	    
	        System.out.println("Shoes(White)");
	       }
	    else
	    System.out.println("Invalid colour");
	    
	    return item;
	   }
	   
	   public String Colour_Blouse()
	  {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("*********Colours available********* :");
	       System.out.println("K.Purple\t\tL.DarkGrey\t\tM.Blue");
	       System.out.println("Select colour choice:");
	       colour = sc.next().charAt(0);
	       if(colour == 'K')
	       {
	           System.out.println("Muslimah Blouse(Purple)");
	       }
	       else if(colour == 'L')
	       {
	           System.out.println("Muslimah Blouse(Dark Grey");
	       }
	       else if(colour == 'M')
	       {
	           System.out.println("Muslimah Blouse(Blue)");
	       }
	       else
	           System.out.println("Invalid colour");
	  return item;
}
	  
	  public String Colour_Hijab()
	  {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("*********Colours available********** :");
	       System.out.println("N.Brown\t\tO.Black\t\tP.Nude\t\tQ.White\t\tR.Cream");
	       System.out.println("Select colour choice:");
	       colour = sc.next().charAt(0);
	       if(colour == 'N')
	       {
	           System.out.println("Hijab(Brown)");
	       }
	       else if(colour == 'O')
	       {
	           System.out.println("Hijab(Black)");
	       }
	       else if(colour == 'P')
	       {
	           System.out.println("Hijab(Nude)");
	       }
	       else if(colour == 'Q')
	       {
	           System.out.println("Hijab(White)");
	       }
	       else if(colour == 'R')
	       {
	           System.out.println("Hijab(Cream)");
	       }
	       else 
	           System.out.println("Invalid colour");
	           
	  return item;
}
	  
	  
	  public String Colour_Jewelry()
	  {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Colours available :");
	       System.out.println("S.Rose Gold\t\tT.Silver\t\tU.White Gold\t\tV.Black");
	       System.out.println("Select colour choice:");
	       colour = sc.next().charAt(0);
	       if(colour == 'S')
	       {
	          item = "Jewels(Rose Gold)";  
	       }
	       else if(colour == 'T')
	       {
	          System.out.println("Jewels(Silver)");
	       }
	       else if(colour == 'U')
	       {
	            System.out.println("Jewels(White Gold)");
	       }
	       else if(colour == 'V')
	       {
	            System.out.println("Jewels(Black)");
	       }
	       else
	            System.out.println("Invalid colour");
	  
	   return item;  
}
      public String Colour_Top(){
           Scanner sc = new Scanner(System.in);
	       System.out.println("Colours available :");
	       System.out.println("W.Black\t\tX.White\t\tY.Dark Brown\t\tZ.Grey");
	       System.out.println("Select colour choice:");
	       colour = sc.next().charAt(0);
	       if(colour == 'W')
	       {
	          System.out.println("Top(Black)");  
	       }
	       else if(colour == 'X')
	       {
	          System.out.println( "Top(White)");
	       }
	       else if(colour == 'Y')
	       {
	           System.out.println("Top(Dark Brown)");
	       }
	       else if(colour == 'Z')
	       {
	            System.out.println("Top(Grey)");
	       }
	       else
	            System.out.println("Invalid colour");
	  
	   return item;  
}

      public String Colour_Pants(){
           Scanner sc = new Scanner(System.in);
	       System.out.println("Colours available :");
	       System.out.println("W.Black\t\tX.White\t\tY.Denim\t\tZ.Grey");
	       System.out.println("Select colour choice:");
	       colour = sc.next().charAt(0);
	       if(colour == 'W')
	       {
	          System.out.println("pants(Black)");  
	       }
	       else if(colour == 'X')
	       {
	          System.out.println( "pants(White)");
	       }
	       else if(colour == 'Y')
	       {
	           System.out.println("pants(Denim)");
	       }
	       else if(colour == 'Z')
	       {
	            System.out.println("pants(Grey)");
	       }
	       else
	            System.out.println("Invalid colour");
	  
	   return item;  
}
}

class Price{ //SALMAH BINTI ASMIN (BI19110112)
    public static int sumdress;
    public static int sumskirt;
    public static int sumcasual;
    public static int sumpants;
    public static int sumMen;
    public static int sumWomen;
    public static int sumblouse;
    public static int sumhijab;
    public static int sumring;
    public static int sumbracelet;
   
   
    public static int price1(){// AISY' FASHION
       Scanner input = new Scanner(System.in);
       System.out.println("\n\n--------------------------");
       System.out.println("PRICE");
       System.out.println("--------------------------");
       System.out.println("Select '1' for Dress!");
       System.out.println("Select '2' for Skirts!");
       System.out.println("Select 'q' to stop");
       System.out.println("--------------------------");
       int decision1;
       System.out.print("Your choice: ");
       decision1 = input.nextInt();
       
       if (decision1 == 1){
          System.out.println("\n\n----------------------------------------------");
          System.out.println("PRICE FOR DRESSES: ");
          System.out.println("----------------------------------------------");
          System.out.println("[1] Strapless Floral Peplum Dress [ RM 60 ]");
          System.out.println("[2] Dot Pattern Mini Dress        [ RM 40 ]");
          System.out.println("[3] Layered Long Sleeves Dress    [ RM 80 ]");
          System.out.println("Select [1-3] or type 'q' to exit.");
          System.out.println("----------------------------------------------");
          int quantity1;
          char pricedress; 
          
          
             System.out.print("Your choice: ");
             pricedress = input.next().charAt(0);
      
             switch(pricedress){
                 case '1':
                 System.out.println("\nYou have selected 'Strapless Floral Peplum Dress'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity1 = input.nextInt();
                 sumdress = sumdress + (60 * quantity1);
                 System.out.println("Total price: RM" + sumdress + "\n");
                 pricedress = 'q';
                 break;
                      
                 case '2':
                 System.out.println("\nYou have selected 'Dot Pattern Mini Dress'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity1 = input.nextInt();
                 sumdress = sumdress + (40 * quantity1);
                 System.out.println("Total price: RM" + sumdress + "\n");
                 break;
                      
                 case '3':
                 System.out.println("\nYou have selected 'Layered Long Sleeves Dress'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity1 = input.nextInt();
                 sumdress = sumdress + (80 * quantity1);
                 System.out.println("Total price: RM" + sumdress + "\n");
                 break;
                      
                 default:
                 if(pricedress!='q'){
                   System.out.println("\nPlease select again.\n");
                 }
                 else{
                   break;
                 }
                      
               }
              
          
            
       }else if (decision1 == 2){
            System.out.println("\n\n----------------------------------------------");
            System.out.println("PRICE FOR SKIRTS: ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Tartan Pattern Mini Skirt            [ RM 50 ]");
            System.out.println("[2] Layered Long / Maxi Skirts           [ RM 30 ]");
            System.out.println("[3] A-Line Plain Skirts with Side Pocket [ RM 40 ]");
            System.out.println("Select [1-3] or type 'q' to exit.\n");
            int quantity2; 
            char priceskirt;     
          
         
                  System.out.print("Your choice: ");
                  priceskirt = input.next().charAt(0);
      
                  switch(priceskirt){
                      case '1':
                      System.out.println("\nYou have selected 'Tartan Pattern Mini Skirt'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity2 = input.nextInt();
                      sumskirt = sumskirt + (50 * quantity2);
                      System.out.println("Total price: RM" + sumskirt + "\n");
                      break;
                      
                      case '2':
                      System.out.println("\nYou have selected 'Layered Long / Maxi Skirts");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity2 = input.nextInt();
                      sumskirt = sumskirt + (30 * quantity2);
                      System.out.println("Total price: RM" + sumskirt + "\n");
                      break;
                      
                      case '3':
                      System.out.println("\nYou have selected 'A-Line Plain Skirts with Side Pocket'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity2 = input.nextInt();
                      sumskirt = sumskirt + (40 * quantity2);
                      System.out.println("Total price: RM" + sumskirt + "\n");
                      break;
                      
                      default:
                      if(priceskirt!='q'){
                          System.out.println("\nPlease select again.\n");
                      }
                      else{
                          break;
                      }
                  }
              
          
       }else{
           System.out.println("\n\nInput unavailable.");
         }
       
      return decision1;
      } 
      
    
    public static int price2(){ //MOONIE STYLE
       Scanner input = new Scanner(System.in);
       System.out.println("\n\n--------------------------");
       System.out.println("PRICE");
       System.out.println("--------------------------");
       System.out.println("Select '1' for Casual!");
       System.out.println("Select '2' for Pants!\n");
       int decision2;
       System.out.print("Your choice: ");
       decision2 = input.nextInt();
       
       if (decision2 == 1){
          System.out.println("\n\n----------------------------------------------");
          System.out.println("PRICE FOR CASUALS: ");
          System.out.println("----------------------------------------------");
          System.out.println("[1] Slim Fit Casual Solid Shirt [ RM 50 ]");
          System.out.println("[2] Linen Shirts Long-Sleeved   [ RM 30 ]");
          System.out.println("[3] The Short Wimbledon Trench  [ RM 70 ]");
          System.out.println("Select [1-3] or type 'q' to exit. \n");
          int quantity3;
          char pricecasual;      
          
          
             System.out.print("Your choice: ");
             pricecasual = input.next().charAt(0);
      
             switch(pricecasual){
                 case '1':
                 System.out.println("\nYou have selected 'Slim Fit Casual Solid Shirt'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity3 = input.nextInt();
                 sumcasual = sumcasual + (50 * quantity3);
                 System.out.println("Total price: RM" + sumcasual + "\n");
                 break;
                      
                 case '2':
                 System.out.println("\nYou have selected 'Dot Pattern Mini Dress'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity3 = input.nextInt();
                 sumcasual = sumcasual + (30 * quantity3);
                 System.out.println("Total price: RM" + sumcasual + "\n");
                 break;
                      
                 case '3':
                 System.out.println("\nYou have selected 'Layered Long Sleeves Dress'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity3 = input.nextInt();
                 sumcasual = sumcasual + (70 * quantity3);
                 System.out.println("Total price: RM" + sumcasual + "\n");
                 break;
                      
                 default:
                 if(pricecasual!='q'){
                   System.out.println("\nPlease select again.\n");
                 }
                 else{
                   break;
                 }
                      
               }
              
          
            
       }else if (decision2 == 2){
            System.out.println("\n\n----------------------------------------------");
            System.out.println("PRICE FOR PANTS: ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Men's Casual Plaid Pants Slim Fit         [ RM 50 ]");
            System.out.println("[2] Stretch Chino-Khakis                      [ RM 30 ]");
            System.out.println("[3] Spring Summer Men's Casual Slim Fit Pants [ RM 40 ]");
            System.out.println("Select [1-3] or type 'q' to exit.\n");
            int quantity4; 
            char pricepants;     
          
         
                  System.out.print("Your choice: ");
                  pricepants = input.next().charAt(0);
      
                  switch(pricepants){
                      case '1':
                      System.out.println("\nYou have selected 'Men's Casual Plaid Pants Slim Fit'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity4 = input.nextInt();
                      sumpants = sumpants + (50 * quantity4);
                      System.out.println("\tPrice: RM" + sumpants + "\n");
                      break;
                      
                      case '2':
                      System.out.println("\nYou have selected 'Stretch Chino-Khakis'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity4 = input.nextInt();
                      sumpants = sumpants + (30 * quantity4);
                      System.out.println("\tPrice: RM" + sumpants + "\n");
                      break;
                      
                      case '3':
                      System.out.println("\nYou have selected 'Spring Summer Men's Casual Slim Fit Pants'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity4 = input.nextInt();
                      sumpants = sumpants + (40 * quantity4);
                      System.out.println("\tPrice: RM" + sumpants + "\n");
                      break;
                      
                      default:
                      if(pricepants!='q'){
                          System.out.println("\nPlease select again.\n");
                      }
                      else{
                          break;
                      }
                  }
              
          
       }else{
           System.out.println("\n\nInput unavailable.");
         }
       
      return decision2;
      }   

   
    public static int price3(){ //SAL'S COLLECTION 
       Scanner input = new Scanner(System.in);
       System.out.println("\n\n--------------------------");
       System.out.println("PRICE");
       System.out.println("--------------------------");
       System.out.println("Select '1' for Men!");
       System.out.println("Select '2' for Women!\n");
       int decision3;
       System.out.print("Your choice: ");
       decision3 = input.nextInt();
       
       if (decision3 == 1){
          System.out.println("\n\n----------------------------------------------");
          System.out.println("PRICE FOR MEN'S: ");
          System.out.println("----------------------------------------------");
          System.out.println("[1] Rivoli Sneakers Boots          [ RM 70 ]");
          System.out.println("[2] Slip-On Loafers Casual Shoes   [ RM 30 ]");
          System.out.println("[3] Suede Classic Stitch Trainers  [ RM 50 ]");
          System.out.println("Select [1-3] or type 'q' to exit. \n");
          int quantity5;
          char priceMen;      
          
        
             System.out.print("Your choice: ");
             priceMen = input.next().charAt(0);
      
             switch(priceMen){
                 case '1':
                 System.out.println("\nYou have selected 'Rivoli Sneakers Boots'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity5 = input.nextInt();
                 sumMen = sumMen + (70 * quantity5);
                 System.out.println("Total price: RM" + sumMen + "\n");
                 break;
                      
                 case '2':
                 System.out.println("\nYou have selected 'Slip-On Loafers Casual Shoes'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity5 = input.nextInt();
                 sumMen = sumMen + (30 * quantity5);
                 System.out.println("Total price: RM" + sumMen + "\n");
                 break;
                      
                 case '3':
                 System.out.println("\nYou have selected 'Suede Classic Stitch Trainers'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity5 = input.nextInt();
                 sumMen = sumMen + (50 * quantity5);
                 System.out.println("Total price: RM" + sumMen + "\n");
                 break;
                      
                 default:
                 if(priceMen!='q'){
                   System.out.println("\nPlease select again.\n");
                 }
                 else{
                   break;
                 }
                      
               }
              
          
            
       }else if (decision3 == 2){
            System.out.println("\n\n----------------------------------------------");
            System.out.println("PRICE FOR WOMEN'S: ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Olivia Heels              [ RM 30 ]");
            System.out.println("[2] Casual Sal's Woman Flat   [ RM 25 ]");
            System.out.println("[3] High Heels Leather Khaki  [ RM 50 ]");
            System.out.println("Select [1-3] or type 'q' to exit.\n");
            int quantity6; 
            char priceWomen;     
          
          
                  System.out.print("Your choice: ");
                  priceWomen = input.next().charAt(0);
      
                  switch(priceWomen){
                      case '1':
                      System.out.println("\nYou have selected 'Olivia Heels'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity6 = input.nextInt();
                      sumWomen = sumWomen + (30 * quantity6);
                      System.out.println("Total price: RM" + sumWomen + "\n");
                      break;
                      
                      case '2':
                      System.out.println("\nYou have selected 'Casual Sal's Woman Flat'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity6 = input.nextInt();
                      sumWomen = sumWomen + (25 * quantity6);
                      System.out.println("Total price: RM" + sumWomen + "\n");
                      break;
                      
                      case '3':
                      System.out.println("\nYou have selected 'High Heels Leather Khaki'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity6 = input.nextInt();
                      sumWomen = sumWomen + (50 * quantity6);
                      System.out.println("Total price: RM" + sumWomen + "\n");
                      break;
                      
                      default:
                      if(priceWomen!='q'){
                          System.out.println("\nPlease select again.\n");
                      }
                      else{
                          break;
                      }
                  }
              
          
       }else{
           System.out.println("\n\nInput unavailable.");
         }
       
      return decision3;
      }   


    public static int price4(){ //ASYIKIN BOUTIQUE
       Scanner input = new Scanner(System.in);
       System.out.println("\n\n--------------------------");
       System.out.println("PRICE");
       System.out.println("--------------------------");
       System.out.println("Select '1' for Blouses!");
       System.out.println("Select '2' for Hijabs!\n");
       int decision4;
       System.out.print("Your choice: ");
       decision4 = input.nextInt();
       
       if (decision4 == 1){
          System.out.println("\n\n----------------------------------------------");
          System.out.println("PRICE FOR BLOUSES: ");
          System.out.println("----------------------------------------------");
          System.out.println("[1] Asy' Fashion Blouse         [ RM 35 ]");
          System.out.println("[2] Muslimah Suit Amor Blouse   [ RM 50 ]");
          System.out.println("[3] Plain Blouse Asyikin        [ RM 30 ]");
          System.out.println("Select [1-3] or type 'q' to exit. \n");
          int quantity7;
          char priceblouse;      
          
          
             System.out.print("Your choice: ");
             priceblouse = input.next().charAt(0);
      
             switch(priceblouse){
                 case '1':
                 System.out.println("\nYou have selected 'Asy' Fashion Blouse'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity7 = input.nextInt();
                 sumblouse = sumblouse + (35 * quantity7);
                 System.out.println("\tPrice: RM" + sumblouse + "\n");
                 break;
                      
                 case '2':
                 System.out.println("\nYou have selected 'Muslimah Suit Amor Blouse'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity7 = input.nextInt();
                 sumblouse = sumblouse + (50 * quantity7);
                 System.out.println("\tPrice: RM" + sumblouse + "\n");
                 break;
                      
                 case '3':
                 System.out.println("\nYou have selected 'Plain Blouse Asyikin'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity7 = input.nextInt();
                 sumblouse = sumblouse + (30 * quantity7);
                 System.out.println("\tPrice: RM" + sumblouse + "\n");
                 break;
                      
                 default:
                 if(priceblouse!='q'){
                   System.out.println("\nPlease select again.\n");
                 }
                 else{
                   break;
                 }
                      
               }
              
          
            
       }else if (decision4 == 2){
            System.out.println("\n\n----------------------------------------------");
            System.out.println("PRICE FOR HIJABS: ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Floral Cotton Shawl        [ RM 25 ]");
            System.out.println("[2] Asy' Instant Shawl         [ RM 50 ]");
            System.out.println("[3] Plain Chiffon Crush Shawl  [ RM 15 ]");
            System.out.println("Select [1-3] or type 'q' to exit.\n");
            int quantity8; 
            char pricehijab;     
          
          
                  System.out.print("Your choice: ");
                  pricehijab = input.next().charAt(0);
      
                  switch(pricehijab){
                      case '1':
                      System.out.println("\nYou have selected 'Floral Cotton Shawl'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity8 = input.nextInt();
                      sumhijab = sumhijab + (25 * quantity8);
                      System.out.println("Total price: RM" + sumhijab + "\n");
                      break;
                      
                      case '2':
                      System.out.println("\nYou have selected 'Asy' Instant Shawl'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity8 = input.nextInt();
                      sumhijab = sumhijab + (50 * quantity8);
                      System.out.println("Total price: RM" + sumhijab + "\n");
                      break;
                      
                      case '3':
                      System.out.println("\nYou have selected 'Plain Chiffon Crush Shawl'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity8 = input.nextInt();
                      sumhijab = sumhijab + (15 * quantity8);
                      System.out.println("Total price: RM" + sumhijab + "\n");
                      break;
                      
                      default:
                      if(pricehijab!='q'){
                          System.out.println("\nPlease select again.\n");
                      }
                      else{
                          break;
                      }
                  }
              
          
       }else{
           System.out.println("\n\nInput unavailable.");
         }
       
      return decision4;
      }   


    public static int price5(){ //ELIgant 
       Scanner input = new Scanner(System.in);
       System.out.println("\n\n--------------------------");
       System.out.println("PRICE");
       System.out.println("--------------------------");
       System.out.println("Select '1' for Rings!");
       System.out.println("Select '2' for Bracelets!\n");
       int decision5;
       System.out.print("Your choice: ");
       decision5 = input.nextInt();
       
       if (decision5 == 1){
          System.out.println("\n\n----------------------------------------------");
          System.out.println("PRICE FOR RINGS: ");
          System.out.println("----------------------------------------------");
          System.out.println("[1] Monogram Signet Ring                 [ RM 50 ]");
          System.out.println("[2] Yunique Premier Slim Classical Ring  [ RM 20 ]");
          System.out.println("[3] Her Jewelry Double Ring              [ RM 45 ]");
          System.out.println("Select [1-3] or type 'q' to exit. \n");
          int quantity9;
          char pricering;      
          
          
             System.out.print("Your choice: ");
             pricering = input.next().charAt(0);
      
             switch(pricering){
                 case '1':
                 System.out.println("\nYou have selected 'Monogram Signet Ring'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity9 = input.nextInt();
                 sumring = sumring + (50 * quantity9);
                 System.out.println("\tPrice: RM" + sumring + "\n");
                 break;
                      
                 case '2':
                 System.out.println("\nYou have selected 'Yunique Premier Slim Classical Ring'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity9 = input.nextInt();
                 sumring = sumring + (20 * quantity9);
                 System.out.println("\tPrice: RM" + sumring + "\n");
                 break;
                      
                 case '3':
                 System.out.println("\nYou have selected 'Her Jewelry Double Ring'!");
                 System.out.println("----------------------------------------------------");
                 System.out.print("Quantity: ");
                 quantity9 = input.nextInt();
                 sumring = sumring + (45 * quantity9);
                 System.out.println("\tPrice: RM" + sumring + "\n");
                 break;
                      
                 default:
                 if(pricering!='q'){
                   System.out.println("\nPlease select again.\n");
                 }
                 else{
                   break;
                 }
                      
               }
              
          
            
       }else if (decision5 == 2){
            System.out.println("\n\n----------------------------------------------");
            System.out.println("PRICE FOR BRACELETS: ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Hockenheim Bracelet   [ RM 50 ]");
            System.out.println("[2] Daisy Bracelet        [ RM 20 ]");
            System.out.println("[3] Morse Code Bracelet   [ RM 15 ]");
            System.out.println("Select [1-3] or type 'q' to exit.\n");
            int quantity10; 
            char pricebracelet;     
          
                  System.out.print("Your choice: ");
                  pricebracelet = input.next().charAt(0);
      
                  switch(pricebracelet){
                      case '1':
                      System.out.println("\nYou have selected 'Hockenheim Bracelet'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity10 = input.nextInt();
                      sumbracelet = sumbracelet + (50 * quantity10);
                      System.out.println("\tPrice: RM" + sumbracelet + "\n");
                      break;
                      
                      case '2':
                      System.out.println("\nYou have selected 'Daisy Bracelet'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity10 = input.nextInt();
                      sumbracelet = sumbracelet + (20 * quantity10);
                      System.out.println("\tPrice: RM" + sumbracelet + "\n");
                      break;
                      
                      case '3':
                      System.out.println("\nYou have selected 'Morse Code Bracelet'!");
                      System.out.println("-----------------------------------------------------------");
                      System.out.print("Quantity: ");
                      quantity10 = input.nextInt();
                      sumbracelet = sumbracelet + (15 * quantity10);
                      System.out.println("\tPrice: RM" + sumbracelet + "\n");
                      break;
                      
                      default:
                      if(pricebracelet!='q'){
                          System.out.println("\nPlease select again.\n");
                      }
                      else{
                          break;
                      }
                  }
              
          
       }else{
           System.out.println("\n\nInput unavailable.");
         }
       
      return decision5;
      }   


}

class Size{ //NURUL ASYIKIN BINTI AMAT (BI19110094)
    char size_1;
    String message="";
    
  void list_of_size(){
    System.out.println("AVAILABLE SIZE");
    System.out.println("****************************");
    System.out.println("S: Small\t  M: Medium");
    System.out.println("L: Large\t  X: Extra Large");
    System.out.println("****************************");
    }
  void list_of_size_shoes(){
    System.out.println("AVAILABLE SIZE");
    System.out.println("****************************");
    System.out.println("Size for shoes: 6-9");
    System.out.println("****************************");
    }

       
    public String size_for_Dress( ){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Hey there! Which size you would like to know? ");
    size_1=sc.next().charAt(0);
    
    if(size_1=='S'){
      message="Thank you for choosing S size. We have 50 stocks!";
      
    }
    else if(size_1=='M'){
      message="Thank you for choosing M size. We have 50 stocks!";
    }
    else if(size_1=='L'){
      message="Thank you for choosing L size. We have 50 stocks!";
    }
    else if(size_1=='X'){
      message="Thank you for choosing XL size. We have 50 stocks!";
    }
   return message;
   }
    
    public String size_for_Tops(){
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Hey there! Which size you would like to know? ");
     size_1=sc.next().charAt(0);
    
    if(size_1=='S'){
      message="Thank you for choosing S size. We have 50 stocks!";
      
    }
    else if(size_1=='M'){
      message="Thank you for choosing M size. We have 50 stocks!";
    }
    else if(size_1=='L'){
      message="Thank you for choosing L size. We have 50 stocks!";
    }
    else if(size_1=='X'){
      message="Thank you for choosing XL size. We have 50 stocks!";
    }
    return message;
    }
    
    public String size_for_Pants(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Hey there! Which size you would like to know? ");

    size_1 = sc.next().charAt(0);

   
   if(size_1=='S'){
      message="Thank you for choosing S size. We have 50 stocks!";
      
    }
    else if(size_1=='M'){
      message="Thank you for choosing M size. We have 50 stocks!";
    }
    else if(size_1=='L'){
      message="Thank you for choosing L size. We have 50 stocks!";
    }
    else if(size_1=='X'){
      message="Thank you for choosing XL size. We have 50 stocks!";
    }
    return message;
    }
    
    public String size_for_Shoes(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Hey there! Which size you would like to know? ");
    size_1=sc.next().charAt(0);
    
    if(size_1=='6'){
         message="Thank you for choosing size 6. We have 50 stocks!";
       }
       else if(size_1=='7'){
         message="Thank you for choosing size 7. We have 50 stocks!";
       }
       else if(size_1=='8'){
         message="Thank you for choosing size 8. We have 50 stocks!";
       }
       else if(size_1=='9'){
         message="Thank you for choosing size 9. We have 50 stocks!";
       }
       return message;
       }

 
   public String size_for_Outwear(){
     Scanner sc = new Scanner(System.in);
      
     System.out.print("Hey there! Which size you would like to know? ");
       size_1=sc.next().charAt(0);
       
        if(size_1=='S'){
       message="Thank you for choosing S size. We have 50 stocks!";      
    }
    else if(size_1=='M'){
       message="Thank you for choosing M size. We have 50 stocks!";     
       }
     else if(size_1=='L'){
       message="Thank you for choosing L size. We have 50 stocks!";
     }
     else if(size_1=='X'){
       message="Thank you for choosing XL size. We have 50 stocks!";
     }
     return message;
}
}

class Brand{ //ELLY MAZLIN BINTI  (BI1911)

   public static int aisyah_brand(){
    Size sz = new Size();
    Item item = new Item();
    Colour clr = new Colour();
    Price pr = new Price();
    Scanner input = new Scanner(System.in);
    
    int dec;
    char saiz;
    System.out.println("Hye! Welcome to Aisy's FASHION! \nAisy's FASHION was created in 2010 with the intention \nof dressing young GIRLS who are highly aware of new trends.");
    System.out.println("1:Type/Information      2:Price\n");
    int decision1;
    System.out.print("Your choice: "); 
    decision1 = input.nextInt();
    if (decision1 == 1){
       System.out.print("1. Dress \t\t 2.Skirts \n Please pick one : ");
       dec = input.nextInt();
      while((dec != 1) && (dec != 2)){
        System.out.println("Error. Please pick again : ");
        dec = input.nextInt();}
      if (dec == 1){
      item.listAisyahBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Skirt());
      System.out.println("\n");
      sz.list_of_size();
      System.out.println(sz.size_for_Dress());
      }
      else {
      item.listAisyahBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Dress());
      sz.list_of_size();
      System.out.println(sz.size_for_Dress());
      }
   }else if (decision1 == 2){
      pr.price1(); 
   }
   return decision1;
}   
  
   public static int muni_brand(){
    Size sz = new Size();
    Item item = new Item();
    Colour clr = new Colour();
    Price pr = new Price();
    Scanner input = new Scanner(System.in);
    
    int dec;
    System.out.println("Welcone to the MOONIE STYLE official store. \nYour handsome look is waiting for you young MAN !");
    System.out.println("1:Type/Information      2:Price\n");
    int decision2;
    System.out.print("Your choice: "); 
    decision2 = input.nextInt();
    if (decision2 == 1){
    System.out.println("1.Tops \t\t 2. Pants \nPlease Pick One : ");
    dec = input.nextInt();
    while((dec != 1) && (dec != 2)){
        System.out.println("Error. Please pick again : ");
        dec = input.nextInt();}
           if (dec == 1){
             item.listMuniBrand(dec);
             System.out.println("\n");
             System.out.println(clr.Colour_Top());
             System.out.println("\n");
             sz.list_of_size();
             System.out.println(sz.size_for_Tops());
           }else{
             item.listMuniBrand(dec);
             System.out.println("\n");
             System.out.println(clr.Colour_Pants());
             System.out.println("\n");
             sz.list_of_size();
             System.out.println(sz.size_for_Pants()); 
           }
    }else if (decision2 == 2){
      pr.price2(); 
    }
    return decision2;
}


   public static int sal_brand(){
    Size sz = new Size();
    Item item = new Item();
    Colour clr = new Colour();
    Price pr = new Price();
    Scanner input = new Scanner(System.in);
    
    int dec;
    System.out.println("SAL's Collection \nWe will provide you with the new trends of SHOES");
    System.out.println("1:Type/Information      2:Price \n");
    int decision3;
    System.out.print("Your choice: "); 
    decision3 = input.nextInt();
    if (decision3 == 1){
    System.out.println("1.Man \t\t 2. Women \nPlease Pick One : ");
    dec = input.nextInt();
    while((dec != 1) && (dec != 2)){
        System.out.println("Error. Please pick again : ");
        dec = input.nextInt();}
     if (dec == 1){
      item.listSalBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Shoes());
      System.out.println("\n");
      sz.list_of_size_shoes();
      System.out.println(sz.size_for_Shoes()); 
     }else {
      item.listSalBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Shoes());
      System.out.println("\n");
      sz.list_of_size_shoes();
      System.out.println(sz.size_for_Shoes()); 
     }
   }else if (decision3 == 2){
      pr.price3();
   }
   return decision3;
 }

   public static int syikin_brand(){
    Size sz = new Size();
    Item item = new Item();
    Colour clr = new Colour();
    Price pr = new Price();
    Scanner input = new Scanner(System.in);

    int dec;
    System.out.println("Welcome to Asyikin's Boutique ! ! \nWe offers a fashionable MUSLIMAH items for all ages.");
    System.out.println("1:Type/Information      2:Price \n");
    int decision4;
    System.out.print("Your choice: "); 
    decision4 = input.nextInt();
    if (decision4 == 1){
    System.out.println("1.Blouse \t\t 2. Hijab \nPlease Pick One : ");
    dec = input.nextInt();
    while((dec != 1) && (dec != 2)){
        System.out.println("Error. Please pick again : ");
        dec = input.nextInt();}
    if (dec == 1){
      item.listAsyikinBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Blouse());
      System.out.println("\n");
      sz.list_of_size();
      System.out.println(sz.size_for_Outwear()); 
      }else{
      item.listAsyikinBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Hijab());
      System.out.println("\n");
      sz.list_of_size();
      System.out.println(sz.size_for_Outwear()); 
      }
    }else if (decision4 == 2){
       pr.price4();
    }
   return decision4;
   }
   
   public static int elly_brand(){
    Size sz = new Size();
    Item item = new Item();
    Colour clr = new Colour();
    Price pr = new Price();
    Scanner input = new Scanner(System.in);

    int dec;
    System.out.println("Welcome to our store! ! \nELIgant offers you with an elegant ACCESSORIES items.");
    System.out.println("1:Type/Information      2:Price \n");
    int decision5;
    System.out.print("Your choice: "); 
    decision5 = input.nextInt();
    if (decision5 == 1){ 
    System.out.println("1.Ring \t\t 2. Bracelet \nPlease Pick One : ");
    dec = input.nextInt();
    while((dec != 1) && (dec != 2)){
        System.out.println("Error. Please pick again : ");
        dec = input.nextInt();}
    if (dec == 1){
      item.listEllyBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Jewelry());
    }else {
      item.listEllyBrand(dec);
      System.out.println("\n");
      System.out.println(clr.Colour_Jewelry());
    }
  }else if (decision5 == 2){     
    pr.price5();
  }
   return decision5;
 }

}
    

class Item{ //NURMUNIRAH BINTI ASRI (BI19110077)
   
   void listAisyahBrand(int dec){
      if (dec == 1){
         System.out.println("Strapless Floral Peplum Dress");
         System.out.println("Dot Pattern Mini Dress");
         System.out.println("Layered Long Sleeves Dress");
      } else if (dec == 2){
         System.out.println("Tartan Pattern Mini Skirt");
         System.out.println("Long Layered / Maxi Skirt");
         System.out.println("A-Line Plain Skirts with Side Pocket");
      }
   }
   void listMuniBrand(int dec){
      if (dec == 1){
         System.out.println("Slim Fit Casual Solid Shirt");
         System.out.println("Linen Shirt Long Sleved");
         System.out.println("The Short Wimbledon Trench");
      }else if (dec == 2){
         System.out.println("Men's Casual Plaid Pants Slim Fit");
         System.out.println("Stretch Chino Khakis");
         System.out.println("Spring Summer Men's Casual Slim Fit Pants");
   } 
   }
   void listSalBrand(int dec){
      if (dec == 1) {
         System.out.println("Rivoli Sneakers Boots");
         System.out.println("Slip on Loafers Casual Shoes");
         System.out.println("Suede Classic Stitch");
      }  else if (dec == 2){
         System.out.println("Olivia Heels");
         System.out.println("Casual Sal's Woman Flat");
         System.out.println("High Heels Khaki");
      }
   }
   void listAsyikinBrand(int dec){
      if (dec == 1){
         System.out.println("Asy' Fashion Blouse");
         System.out.println("Muslimah Suit Amor Blouse");
         System.out.println("Plain Blouse Ayikin");
      } else if (dec == 2){
         System.out.println("Floral Cotton Shawl");
         System.out.println("Asy' Instant Shawl");
         System.out.println("Plain Chiffon Crush Shawl");
      }  
   }
   void listEllyBrand(int dec){
      if (dec == 1){
         System.out.println("Monogram Signet Ring");
         System.out.println("Yunieq Primier Slim Classical Ring");
         System.out.println("Her Jewelry Double Ring");
      }else if (dec == 2){
         System.out.println("Hockenheim Bracelet");
         System.out.println("Daisy Bracelet");
         System.out.println("Morse Code Bracelet");
      }
   }
   
   
}   

class Category{ //NURMUNIRAH BINTI ASRI (BI19110077)
   
   void item(){
    System.out.println("Welcome !!: ");
    System.out.println("Items category:");
    System.out.println("[1] Men's clothing");
    System.out.println("[2] Women's clothing");
    System.out.println("[3] Shoes");      
    System.out.println("[4] Accessories");    
    System.out.println("----------------------------------------------");     
    System.out.println("Select [1-4] Or Click [0] to Exit \n");
   }
   
}

class Projec1{ //MAIN PROGRAM
public static void main(String[] args)  throws java.io.IOException {
  Category ctg = new Category();
  Brand br = new Brand();
  Colour clr = new Colour();
  Size sz = new Size();
  
  int[] arr = new int[2];
  char choice;
  
  System.out.println("\nDear customer, please note that you can only pick the category twice.");
  for(int i = 0; i < arr.length; i++){
  ctg.item();
  System.out.print("Your choice: "); 
  choice = (char) System.in.read();
 
  if (choice == '1'){
     System.out.println("There is only 1 Brand available: MOONIE Style\n");
     br.muni_brand();
    
  }else if (choice == '2'){
    System.out.println("There are 2 Brands available: 1. Aisy' Fashion\n 2. Asyikin's Boutique");
    Scanner input = new Scanner(System.in);
    int choice2;
    System.out.print("Your choice: "); 
    choice2 = input.nextInt();
    if (choice2 == 1){
       br.aisyah_brand();
      
    }else if (choice2 == 2){
       br.syikin_brand();
      
    }
  }else if (choice == '3'){
     System.out.println("There is only 1 Brand available: SAL's Collection\n");
     br.sal_brand();
    
  }else if (choice == '4'){
     System.out.println("There is only 1 Brand available: ELIgant\n");
     br.elly_brand();
     
  }else{
    System.out.println("Thank you for using our service.");
    System.exit(0);  
  } 
  
  
  }
  System.out.println("Thank you for using our service.");
   
 }
}
