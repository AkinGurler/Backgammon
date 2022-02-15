
package projebackgammon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ProjeBackgammon {
    static int x;
    static int y;
    static int z;
    static int w;
    static String [][] tablo=new String[6][13];
    static ArrayList<String> devamEt=new ArrayList<String>();
    static File dosya =new File("Table.txt");
    static File dosya1 =new File("DiceHistory.txt");
    static File dosya2 =new File("Continue.txt");
    static void OkuyupDiziyeAktarma(){
       
         try (FileReader fr = new FileReader(dosya2))
        {   
            int content;
            while ((content = fr.read()) != -1) {
                 char character = (char) content;
                devamEt.add(Character.toString(character));
            }
//            for (int i = 0; i < devamEt.size(); i++) {
//             System.out.print(devamEt.get(i));
//    }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    static void dosyayaEkle(String s){
        try {
            if(!dosya.exists()){
                dosya.createNewFile();}
            
            FileWriter fw=new FileWriter(dosya,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.append(s);
            bw.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
          
    }
    static void dosyayaEkle1(String s){
        try {
            if(!dosya1.exists()){
                dosya1.createNewFile();}
            
            FileWriter fw=new FileWriter(dosya1,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.append(s);
            bw.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
          
    }
    static void dosyayaEkle2(String s){
        try {
            if(!dosya2.exists()){
                dosya2.createNewFile();}
            
            FileWriter fw=new FileWriter(dosya2,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.append(s);
            bw.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
          
    }
    static void newLine(){
        try {
//            if(!dosya.exists()){
//                dosya.createNewFile();}
            FileWriter fw=new FileWriter(dosya,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.newLine();
            bw.close();   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }   
    }
    static void newLine1(){
        try {
//            if(!dosya.exists()){
//                dosya.createNewFile();}
            FileWriter fw=new FileWriter(dosya1,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.newLine();
            bw.close();   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }   
    }
    static void newLine2(){
        try {
//            if(!dosya.exists()){
//                dosya.createNewFile();}
            FileWriter fw=new FileWriter(dosya2,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.newLine();
            bw.close();   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }   
    }
    public static int zar1Atma(){
        int zar1=(int) (Math.random()*6+1);
         
//        dosyayaEkle1(Integer.toString(zar1)+" ");
         return zar1;
         
        
    }
    public static int zar2Atma(){
        int zar2=(int) (Math.random()*6+1);
//       dosyayaEkle1(Integer.toString(zar2)+" ");
//        newLine1();
        return zar2;
    }
    public static int xTasKontrol(String a){
        int flag=1; 
         if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")){
             flag=1;
            System.out.println("Taşınızın Olduğu Yeri Seçin Lütfen");
            dosyayaEkle("Taşınızın Olduğu Yeri Seçin Lütfen");
             }else{
             flag++;
         }
         return flag;          
    }
    public static int yTasKontrol(String a){
        int flag=1; 
         if(!a.equals("1Y ")&&!a.equals("2Y ")&&!a.equals("3Y ")&&!a.equals("4Y ")&&!a.equals("5Y ")&&!a.equals("6Y ")&&
                 !a.equals("7Y ")&&!a.equals("8Y ")&&!a.equals("9Y ")&&!a.equals("10Y")&&!a.equals("11Y")){
             flag=1;
            System.out.println("Taşınızın Olduğu Yeri Seçin Lütfen");
            dosyayaEkle("Taşınızın Olduğu Yeri Seçin Lütfen");
             }else{
             flag++;
         }
         return flag;          
    }
    
    public static void tabloyuYazdir(String[][] tablo){
         for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 13; j++) {
                if(j==6){
                    System.out.print("|");
                    dosyayaEkle("|");
                }
                if(i==3&&j==5){
                    System.out.print("  ");
                         dosyayaEkle("  ");
                }
                if(i==3&&j==6){
                    System.out.print("  ");
                    dosyayaEkle("  ");
                }
                System.out.print(tablo[i][j] + " |");
                dosyayaEkle(tablo[i][j] + " |");
                 
                
            }
            newLine();
            System.out.println();
        }
         newLine();
    }

    public static int[] inputNereden1() {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Oynamak İstediğiniz Sutunu seçin(A-B-C-D-E-F-G-H-I-J-K-L)");
//        dosyayaEkle("Oynamak İstediğiniz Sutunu seçin(A-B-C-D-E-F-G-H-I-J-K-L)");
        while(!scanner.hasNextLine()){
         scanner.next();
         System.out.println("GEÇERSIZ INPUT");
         }
        String  sutun=scanner.nextLine();
        System.out.println("Oynamak İstediğiniz Satırı seçin");
//         dosyayaEkle("Oynamak İstediğiniz Satırı seçin");
        while(!scanner.hasNextInt()){
         scanner.next();
         System.out.println("GEÇERSIZ INPUT");
         }
        int satir=scanner.nextInt();
        if (sutun.equals("A")){ sutun="0";} if (sutun.equals("B")){ sutun="1";} if (sutun.equals("C")){ sutun="2";}
        if (sutun.equals("D")){ sutun="3";} if (sutun.equals("E")){ sutun="4";} if (sutun.equals("F")){ sutun="5";}
        if (sutun.equals("G")){ sutun="6";} if (sutun.equals("H")){ sutun="7";} if (sutun.equals("I")){ sutun="8";}
        if (sutun.equals("J")){ sutun="9";} if (sutun.equals("K")){ sutun="10";} if (sutun.equals("L")){ sutun="11";}
        
    return new int[] {satir,Integer.parseInt(sutun)};
}
    public static int[] inputNereden2(){
    Scanner scanner=new Scanner(System.in);
        System.out.println("2.Zar için oynamak İstediğiniz Sutunu seçin(A-B-C-D-E-F-G-H-I-J-K-L)");
        String  sutun=scanner.nextLine();
        System.out.println("2.Zar Oynamak İstediğiniz Satırı seçin");
        dosyayaEkle("Oynamak İstediğiniz Satırı seçin");
        int satir=scanner.nextInt();
        if (sutun.equals("A")){ sutun="0";} if (sutun.equals("B")){ sutun="1";} if (sutun.equals("C")){ sutun="2";}
        if (sutun.equals("D")){ sutun="3";} if (sutun.equals("E")){ sutun="4";} if (sutun.equals("F")){ sutun="5";}
        if (sutun.equals("G")){ sutun="6";} if (sutun.equals("H")){ sutun="7";} if (sutun.equals("I")){ sutun="8";}
        if (sutun.equals("J")){ sutun="9";} if (sutun.equals("K")){ sutun="10";} if (sutun.equals("L")){ sutun="11";}
        
    return new int[] {satir,Integer.parseInt(sutun)};
}
    static String tasiAzalt(String azalicak){
        switch(azalicak){
        case"10X":azalicak="9X ";break;case"9X ":azalicak="8X ";break;case"8X ":azalicak="7X ";break;
        case"7X ":azalicak="6X ";break;case"6X ":azalicak="5X ";break;case"5X ":azalicak="4X ";break;
        case"4X ":azalicak="3X ";break;case"3X ":azalicak="2X ";break;case"2X ":azalicak="1X ";break;
        case"1X ":azalicak="   ";break;case"11X":azalicak="10X";break; 
        
        case"10Y":azalicak="9Y ";break;case"9Y ":azalicak="88 ";break;case"8Y ":azalicak="7Y ";break;
        case"7Y ":azalicak="6Y ";break;case"6Y ":azalicak="5Y ";break;case"5Y ":azalicak="4Y ";break;
        case"4Y ":azalicak="3Y ";break;case"3Y ":azalicak="2Y ";break;case"2Y ":azalicak="1Y ";break;
        case"1Y ":azalicak="   ";break;case"11Y":azalicak="10Y";break;
        
  
        }
    return azalicak;
    }

    static String xTasiArttir(String articak){
        switch(articak){
          case "   ":articak="1X ";break;case "1X ":articak="2X ";break;case "2X ":articak="3X ";break;
          case "3X ":articak="4X ";break;case "4X ":articak="5X ";break;case "5X ":articak="6X ";break;
          case "6X ":articak="7X ";break;case "7X ":articak="8X ";break;case "8X ":articak="9X ";break;
          case "9X ":articak="10X";break;case "10X":articak="11X";break;
          
          case "1Y ":
              articak="1X ";
              if(tablo[3][7].equals("BFY")){
              tablo[3][7]="1Y ";}
              else{
                  tablo[3][7]=yTasiArttir(tablo[3][7]);
              }
              break;
          
        }
    return articak;
    }
    static String yTasiArttir(String articak){
        switch(articak){
          case "   ":articak="1Y ";break;case "1Y ":articak="2Y ";break;case "2Y ":articak="3Y ";break;
          case "3Y ":articak="4Y ";break;case "4Y ":articak="5Y ";break;case "5Y ":articak="6Y ";break;
          case "6Y ":articak="7Y ";break;case "7Y ":articak="8Y ";break;case "8Y ":articak="9Y ";break;
          case "9Y ":articak="10Y";break;case "10Y":articak="11Y";break;   
          
          case "1X ":
              articak="1Y ";
              if(tablo[3][4].equals("BFX")){
              tablo[3][4]="1X ";}
              else{
                  tablo[3][4]=xTasiArttir(tablo[3][4]);
              }
              break;
          
        }
    return articak;
    }
    static int xOynatmaKontrolu(String a){
        int flag=1;
         if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")
                 &&!a.equals("   ")&&!a.equals("1Y ")){
             flag=1;
            System.out.println("Oynanabilecek yer seçin");
//            dosyayaEkle("Oynanabilecek yer seçin");
             }else{
             flag++; 
         }
    return flag;
    }
    static int xKırıkOynatmaKontrolu(String a){
        int flag=1;
         if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")
                 &&!a.equals("   ")){
             flag=1;
            System.out.println("Oynanabilecek yer seçin");
//            dosyayaEkle("Oynanabilecek yer seçin");
             }else{
             flag++; 
         }
    return flag;
    }
    public static int yOynatmaKontrolu(String a){
        int flag=1;
         if(!a.equals("1Y ")&&!a.equals("2Y ")&&!a.equals("3Y ")&&!a.equals("4Y ")&&!a.equals("5Y ")&&!a.equals("6Y ")&&
                 !a.equals("7Y ")&&!a.equals("8Y ")&&!a.equals("9Y ")&&!a.equals("10Y")&&!a.equals("11Y")
                 &&!a.equals("   ")&&!a.equals("1X ")){
             flag=1;
            System.out.println("Geçersiz Hamle");
             }else{
             flag++; 
         }
    return flag;
    }
    public static void xTurn1(){
//        tablo[3][5]=Integer.toString(zar1Atma());
//        tablo[3][6]=Integer.toString(zar1Atma());
        

        Scanner scanner=new Scanner(System.in);
        //İF ZAR1>ZAR2 X TURNU
       if(tablo[3][4].equals("BFX")){//KIRIK TAŞ KONTROLÜ
           String oynancakYer="A";
      String oynanılacakYer="";
           
      
      int a=1;int b=1;
      while(a<2||b<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=xTasKontrol(oynancakYer);

//       System.out.println(tablo[x][y]);
       
       int zar1degeri=Integer.parseInt(tablo[3][5]);
       if(y<zar1degeri&&x==5&&y<6)//3. bölge kontrolu for x satir atlama
       {    
           y=-y;
           y=y+zar1degeri-1;
           if(y<0){
           y=-y;}
           x=x-4;
       }
       else if(y>=zar1degeri&&x==5&&y<6){//3.bölge satır atlamazsa
           y=y-zar1degeri;
       }
       else if(y>=zar1degeri&&x==5&&y>5)//4. bölge kontrolu for x satir atlama
       {
           y=-y;
           y=y+zar1degeri;
           if(y<0){
           y=-y;}
       }
       else{
           y=y+zar1degeri;
       }
       
       oynanılacakYer=tablo[x][y];
       b=xOynatmaKontrolu(oynanılacakYer);
       
       
//       System.out.println("oynancak yer :"+oynancakYer);
//       System.out.println("oynanılacak yer :"+oynanılacakYer);
       

        }
//      if(oynanılacakYer.equals("1Y ")){
//           oynanılacakYer="1X ";
//           tablo[3][7]="1Y ";    
//       }
//        if(tablo[x][y].equals("1Y ")){
////          tablo[x][y]=tasiAzalt(tablo[x][y]);
//          if(tablo[3][7].equals("BFY")){
//                  tablo[3][7]="1Y ";}
//          else{
//              tablo[3][7]=yTasiArttir(tablo[3][7]);
//          }
//          } 
        tablo[z][w]=tasiAzalt(tablo[z][w]);
        tablo[x][y]=xTasiArttir(tablo[x][y]);
//        tabloyuYazdir(tablo);
        
    
       }
       else{
       System.out.println("Kırık taşınızı oynayın");
           int a=1;
           a=xOynatmaKontrolu(tablo[5][12-Integer.parseInt(tablo[3][5])]);
           if(a==2){
       if(tablo[3][4].equals("1X ")){
            tablo[3][4]="BFX";
            tablo[5][12-Integer.parseInt(tablo[3][5])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][5])]);
       }else{
            tablo[3][4]=tasiAzalt(tablo[3][4]);
            tablo[5][12-Integer.parseInt(tablo[3][5])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][5])]);
       }
       }}tabloyuYazdir(tablo);}
    public static void xTurn2(){
//        tablo[3][5]=Integer.toString(zar1Atma());
//        tablo[3][6]=Integer.toString(zar1Atma());
        
      
        Scanner scanner=new Scanner(System.in);
        //İF ZAR1>ZAR2 X TURNU
       if(tablo[3][4].equals("BFX")){//KIRIK TAŞ KONTROLÜ

      String oynancakYer="A";
      String oynanılacakYer="";

      int a=1;int b=1;
      while(a<2||b<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=xTasKontrol(oynancakYer);
//       tablo[x][y]=tasiAzalt(tablo[x][y]);
       
       
       int zar2degeri=Integer.parseInt(tablo[3][6]);
       if(y<zar2degeri&&x==5&&y<6)//3. bölge kontrolu for x satir atlama
       {
           y=-y;
           y=y+zar2degeri-1;
           if(y<0){
           y=-y;}
           x=x-4;
       }
       else if(y>=zar2degeri&&x==5&&y<6){//3.bölge satır atlamazsa
           y=y-zar2degeri;
       }
       
       else if(y>=zar2degeri&&x==5&&y>5)//3. bölge kontrolu for x satir atlama
       {
           y=-y;
           y=y+zar2degeri;
           if(y<0){
           y=-y;}
       }
       else{
           y=y+zar2degeri;
       }
      
       oynanılacakYer=tablo[x][y];
       b=xOynatmaKontrolu(oynanılacakYer);
       
//       System.out.println("oynancak yer :"+oynancakYer);
//       System.out.println("oynanılacak yer :"+oynanılacakYer);
       

        }
//       if(tablo[x][y].equals("1Y ")){
////          tablo[x][y]=tasiAzalt(tablo[x][y]);
//          if(tablo[3][7].equals("BFY")){
//                  tablo[3][7]="1Y ";}
//          else{
//              tablo[3][7]=yTasiArttir(tablo[3][7]);
//          }
//          }
        tablo[z][w]=tasiAzalt(tablo[z][w]);
        tablo[x][y]=xTasiArttir(tablo[x][y]);
//        tabloyuYazdir(tablo);
        
        
       }
       else{
       System.out.println("Kırık taşınızı oynayın");
       int a=1;
           a=xOynatmaKontrolu(tablo[5][12-Integer.parseInt(tablo[3][6])]);
          
           if(a==2){
       if(tablo[3][4].equals("1X ")){
            tablo[3][4]="BFX";
            tablo[5][12-Integer.parseInt(tablo[3][6])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][6])]);
       }else{
            tablo[3][4]=tasiAzalt(tablo[3][4]);
            tablo[5][12-Integer.parseInt(tablo[3][6])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][6])]);
       }
       }
       }
       tabloyuYazdir(tablo);
    }
    
    public static void yTurn1(){

        Scanner scanner=new Scanner(System.in);
        //İF ZAR1>ZAR2 X TURNU
       if(tablo[3][7].equals("BFY")){//KIRIK TAŞ KONTROLÜ

      String oynancakYer="";
      String oynanılacakYer="";

      int a=1;int b=1;
      while(a<2||b<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=yTasKontrol(oynancakYer);//KONTROL Y DE OYNANCAK TAS VAR MI
       int zar1degeri=Integer.parseInt(tablo[3][5]);
       if(y<zar1degeri&&x==1&&y<6)//3. bölge kontrolu for y satir atlama
       {
           y=-y;
           y=y+zar1degeri-1;
           if(y<0){
           y=-y;}
           x=x+4;
       }
       else if(y>=zar1degeri&&x==1&&y<6){
           y=y-zar1degeri;
       }
       else if(y>=zar1degeri&&x==1&&y>5)//4. bölge kontrolu for y satir atlama
       {
           y=y-zar1degeri;
       }
       else{

           y=y+zar1degeri;
       }
      
       oynanılacakYer=tablo[x][y];//oynanılacak yer belirlenir
       
       b=yOynatmaKontrolu(oynanılacakYer);//kontrol yapılır
        }

//      if(tablo[x][y].equals("1X ")){
//          if(tablo[3][4].equals("BFX")){
//                  tablo[3][4]="1X ";}
//          else{
//              tablo[3][4]=xTasiArttir(tablo[3][4]);
//          }
//      }
        tablo[z][w]=tasiAzalt(tablo[z][w]);//OYNANAN YER
        tablo[x][y]=yTasiArttir(tablo[x][y]);//OYNANILAN YER
//        tabloyuYazdir(tablo);
       }
       else{
       System.out.println("Kırık taşınızı oynayın");
       int a=1;
           a=yOynatmaKontrolu(tablo[1][12-Integer.parseInt(tablo[3][5])]);
           System.out.println(a);
           if(a==2){
       if(tablo[3][7].equals("1Y ")){
            tablo[3][7]="BFY";
            tablo[1][12-Integer.parseInt(tablo[3][5])]=yTasiArttir(tablo[1][12-Integer.parseInt(tablo[3][5])]);
       }else{
            tablo[3][7]=tasiAzalt(tablo[3][7]);
            tablo[1][12-Integer.parseInt(tablo[3][5])]=yTasiArttir(tablo[1][12-Integer.parseInt(tablo[3][5])]);
       }
       }}
       tabloyuYazdir(tablo);
    }
    public static void yTurn2(){
        
        Scanner scanner=new Scanner(System.in);
        //İF ZAR1>ZAR2 X TURNU
       if(tablo[3][7].equals("BFY")){//KIRIK TAŞ KONTROLÜ

      String oynancakYer="";
      String oynanılacakYer="";

      

      int a=1;int b=1;
      while(a<2||b<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=yTasKontrol(oynancakYer);//KONTROL Y DE OYNANCAK TAS VAR MI
       int zar2degeri=Integer.parseInt(tablo[3][6]);
       if(y<zar2degeri&&x==1&&y<6)//3. bölge kontrolu for y satir atlama
       {
           y=-y;
           y=y+zar2degeri-1;
           if(y<0){
           y=-y;}
           x=x+4;
       }
       else if(y>=zar2degeri&&x==1&&y<6){
           y=y-zar2degeri;
       }
       else if(y>=zar2degeri&&x==1&&y>5)//4. bölge kontrolu for y satir atlama
       {
           y=y-zar2degeri;
       }
       else{

           y=y+zar2degeri;
       }
      
       oynanılacakYer=tablo[x][y];//oynanılacak yer belirlenir
       
       b=yOynatmaKontrolu(oynanılacakYer);//kontrol yapılır
       
        }
      
//      if(tablo[x][y].equals("1X ")){
//          if(tablo[3][4].equals("BFX")){
//                  tablo[3][4]="1X ";}
//          else{
//              tablo[3][4]=xTasiArttir(tablo[3][4]);
//          }
//      }
        tablo[z][w]=tasiAzalt(tablo[z][w]);
        tablo[x][y]=yTasiArttir(tablo[x][y]);
//        tabloyuYazdir(tablo);
          
       }
       else{
      System.out.println("Kırık taşınızı oynayın");
      int a=1;
           a=yOynatmaKontrolu(tablo[1][12-Integer.parseInt(tablo[3][6])]);
           if(a==2){
       if(tablo[3][7].equals("1Y ")){
            tablo[3][7]="BFY";
            tablo[1][12-Integer.parseInt(tablo[3][6])]=yTasiArttir(tablo[1][12-Integer.parseInt(tablo[3][6])]);
       }else{
            tablo[3][7]=tasiAzalt(tablo[3][7]);
            tablo[1][12-Integer.parseInt(tablo[3][6])]=yTasiArttir(tablo[1][12-Integer.parseInt(tablo[3][6])]);
       }
       
       }}tabloyuYazdir(tablo);
    }
    public static void xTamTurn(){
        int bitis=0;
        bitis=xBitisKontrol();
        if(bitis==25){
             System.out.println("OYUN BİTTİ X KAZANDI");
             System.exit(0);
         }
        tablo[3][8]="X  ";
        tablo[3][5]=Integer.toString(zar1Atma());
         tablo[3][6]=Integer.toString(zar1Atma());
         
         tabloyuYazdir(tablo);
         System.out.println("X TURU");
        
         
        
         if(tablo[3][5].equals(tablo[3][6])){
             System.out.println("ÇİFT GELDİ VUHU");
              int b=0;
              b=xTasToplamaKontrol();
             if(b==19){
            xTasToplama1();
            xTasToplama2();
            xTasToplama1();
            xTasToplama2();
              
             }
             else{
                  int a=0;
             xTurn1();
             a=xTasToplamaKontrol();
              if(a==19){
                  xTasToplama2();
                  xTasToplama1();
                  xTasToplama2();
              }
              else{
                  xTurn2();
                  a=xTasToplamaKontrol();
                  if(a==19){
                  xTasToplama1();
                  xTasToplama2();
              }    else{
                      xTurn1();
                      a=xTasToplamaKontrol();
                       if(a==19){
                       xTasToplama2();
                   }    else{
                       xTurn2(); 
                  }
                      
                  }
              }
              
         }}
         else{
         System.out.println("Hangi zarla başlamak istersiniz(Soldaki için 1 Sağdaki için 2 yazınız)");
        System.out.println("1)Soldaki zar :"+" "+tablo[3][5]);
         System.out.println("2)Sağdaki zar :"+" "+tablo[3][6]);
         System.out.println("3)Kaydet ve Çık");
         System.out.println("4)Kaydetmeden Çık");
         Scanner zarscanner=new Scanner(System.in);
        
         while(!zarscanner.hasNextInt()){
         zarscanner.next();
         System.out.println("GEÇERSIZ INPUT");
         }
         
         
         int xZar=zarscanner.nextInt();
         int a=0;
         a=xTasToplamaKontrol();
         if(xZar==3){
             SaveEtme();
             System.exit(0);
         }
         if(xZar==4){
             dosya.delete();
             dosya1.delete();
             dosya2.delete();
             System.exit(0);
         }
         if(a==19){
             if(xZar==1){
             xTasToplama1();
             xTasToplama2();
         }else if(xZar==2){
             xTasToplama2();
             xTasToplama1();
         }   
         }
         else{
         if(xZar==1){
             xTurn1();
              a=xTasToplamaKontrol();
              if(a==19){
                  xTasToplama2();
              }
              else{
                  xTurn2();
              }
         }else if(xZar==2){
             xTurn2();
              a=xTasToplamaKontrol();
              if(a==19){
                  xTasToplama1();
              }
              else{
                  xTurn1();
              }
         }}}
        
         
    }
    public static void yTamTurn(){//Y NİN KONTOROLLU Full hali
        int bitis=0;
        bitis=yBitisKontrol();
        if(bitis==25){
             System.out.println("OYUN BİTTİ Y KAZANDI");
             System.exit(0);
         }
         tablo[3][8]="Y  ";
         tablo[3][5]=Integer.toString(zar1Atma());
         tablo[3][6]=Integer.toString(zar1Atma());
         tabloyuYazdir(tablo);
//         dosyayaEkle1(tablo[3][8]+" ");
//         dosyayaEkle1(tablo[3][5]+" ");
//         dosyayaEkle1(tablo[3][6]);
//         newLine1();
//         tabloyuYazdir(tablo);
         System.out.println("Y TURU");
        
         if(tablo[3][5].equals(tablo[3][6])){
             System.out.println("ÇİFT GELDİ VUHU");
              int b=0;
              b=yTasToplamaKontrol();
              
             if(b==19){
            yTasToplama1();
             yTasToplama2();yTasToplama1();
             yTasToplama2();
             }
             else{
             int a=0;
             yTurn1();
             a=yTasToplamaKontrol();
              if(a==19){
                  yTasToplama2();
                  yTasToplama1();
                  yTasToplama2();
              }
              else{
                  yTurn2();
                  a=yTasToplamaKontrol();
                  if(a==19){
                  yTasToplama1();
                  yTasToplama2();
              }    else{
                      yTurn1();
                      a=yTasToplamaKontrol();
                       if(a==19){
                       yTasToplama2();
                   }    else{
                       yTurn2(); 
                  }
                      
                  }
              }
              
         
             
              
         }}
         else{
         System.out.println("Hangi zarla başlamak istersiniz(Soldaki için 1 Sağdaki için 2 yazınız)");
         System.out.println("1)Soldaki zar :"+" "+tablo[3][5]);
         System.out.println("2)Sağdaki zar :"+" "+tablo[3][6]);
         System.out.println("3)Kaydet ve Çık");
         System.out.println("4)Kaydetmeden Çık");
         Scanner zarscanner=new Scanner(System.in);
         while(!zarscanner.hasNextInt()){
         zarscanner.next();
         System.out.println("GEÇERSIZ INPUT");
         }
         int yZar=zarscanner.nextInt();
         int a=0;
         a=yTasToplamaKontrol();
         if(yZar==3){
             SaveEtme();
             System.exit(0);
         }
         if(yZar==4){
             dosya.delete();
             dosya1.delete();
             dosya2.delete();
             System.exit(0);
         }
         if(a==19){
             if(yZar==1){
             yTasToplama1();
             yTasToplama2();
         }else if(yZar==2){
             yTasToplama2();
             yTasToplama1();
         }   
         }
         else{
         if(yZar==1){
              yTurn1();
              a=yTasToplamaKontrol();
              if(a==19){
                  yTasToplama2();
              }
              else{
                  yTurn2();
              }
         }else if(yZar==2){
             yTurn2();
             a=yTasToplamaKontrol();
              if(a==19){
                  yTasToplama1();
              }
              else{
                  yTurn1();
              }
             
         }}}
    }
    public static void xKirikTasiOynatma(){
        System.out.println("Kırık taşınızı oynayın");
        Scanner scanner=new Scanner(System.in);
     int  secilenZarKırıkTas=scanner.nextInt();
       if(secilenZarKırıkTas==1){
           int a=1;
           a=xOynatmaKontrolu(tablo[5][12-Integer.parseInt(tablo[3][5])]);
           if(a==1){
       if(tablo[3][4].equals("1X ")){
            tablo[3][4]="BFX";
            
            
            tablo[5][12-Integer.parseInt(tablo[3][5])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][5])]);
       }else{
            tablo[3][4]=tasiAzalt(tablo[3][4]);
            tablo[5][12-Integer.parseInt(tablo[3][5])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][5])]);
       }}
       }
       else if(secilenZarKırıkTas==2){
           int b=1;
           b=xOynatmaKontrolu(tablo[5][12-Integer.parseInt(tablo[3][6])]);
           if(b==2){
       if(tablo[3][4].equals("1X ")){
            tablo[3][4]="BFX";
            tablo[5][12-Integer.parseInt(tablo[3][6])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][6])]);
       }else{
            tablo[3][4]=tasiAzalt(tablo[3][4]);
            tablo[5][12-Integer.parseInt(tablo[3][6])]=xTasiArttir(tablo[5][12-Integer.parseInt(tablo[3][6])]);
       }}
       
     
       }
    
    }
    public static int xTasToplamaKontrol(){
        int flag=0;
       
         for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                String a=tablo[i][j];
                if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")){
                   flag++;
                } 
              
            }
        }
         for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
               String a=tablo[i][j];
                if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")){
                   flag++;
                } 
                 
            }
        }
         if(tablo[3][4].equals("BFX")){
            flag++;
        }
         
         
         return flag;
    }//x toplama aşamasına geçmiş mi kontrol
    public static int yTasToplamaKontrol(){
        int flag=0;
        
         for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                String a=tablo[i][j];
                if(!a.equals("1Y ")&&!a.equals("2Y ")&&!a.equals("3Y ")&&!a.equals("4Y ")&&!a.equals("5Y ")&&!a.equals("6Y ")&&
                 !a.equals("7Y ")&&!a.equals("8Y ")&&!a.equals("9Y ")&&!a.equals("10Y")&&!a.equals("11Y")){
                   flag++;
                } 
                
            }
        }
         for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                String a=tablo[i][j];
                if(!a.equals("1Y ")&&!a.equals("2Y ")&&!a.equals("3Y ")&&!a.equals("4Y ")&&!a.equals("5Y ")&&!a.equals("6Y ")&&
                 !a.equals("7Y ")&&!a.equals("8Y ")&&!a.equals("9Y ")&&!a.equals("10Y")&&!a.equals("11Y")){
                   flag++;
                } 
                 
            }
        }
         if(tablo[3][7].equals("BFY")){
            flag++;
        }
         
         return flag;
    }//y toplama aşamasına geçmiş mi kontrol
    public static void xTasToplama1(){
       System.out.println("Taşlarınızı Son Bölgede Topladınız");
       System.out.println("1)Taş Topla");
       System.out.println("2)Taş oyna");
       Scanner scan=new Scanner(System.in);
       int input=scan.nextInt();
       if (input==1){
           int a=1;int b=1;
           String oynancakYer;
           while(a<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=xTasKontrol(oynancakYer);
       
       int zar1degeri=Integer.parseInt(tablo[3][5]);
     
       if(zar1degeri>=12-y){
           tablo[x][y]=tasiAzalt(tablo[x][y]);
         
       }
       else{
           a=1;
           System.out.println("Geçersiz Hamle");
       }} tabloyuYazdir(tablo);
       }
       else if(input==2){
           xTurn1();  
       }
       
//         bu fonkisyonu tamamlıcan;
        int bitis=0;
        bitis=xBitisKontrol();
         if(bitis==25){
             System.out.println("OYUN BİTTİ X KAZANDI");
             System.exit(0);
          }
    }//x tas toplama turn 1
    public static void xTasToplama2(){
       System.out.println("Taşlarınızı Son Bölgede Topladınız");
       System.out.println("1)Taş Topla");
       System.out.println("2)Taş oyna");
       Scanner scan=new Scanner(System.in);
       int input=scan.nextInt();
       if (input==1){
           int a=1;int b=1;
           String oynancakYer;
           while(a<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=xTasKontrol(oynancakYer);
       System.out.println(tablo[x][y]);
       int zar1degeri=Integer.parseInt(tablo[3][6]);
       
       if(zar1degeri>=12-y){
           tablo[x][y]=tasiAzalt(tablo[x][y]);
       }
       else{
           a=1;
           System.out.println("Geçersiz Hamle");
       }}tabloyuYazdir(tablo);
       }
       else if(input==2){
           xTurn2();  
       }
       int bitis=0;
        bitis=xBitisKontrol();
         if(bitis==25){
             System.out.println("OYUN BİTTİ X KAZANDI");
             System.exit(0);
          }
       
      
    }//x tas toplama turn 2
    public static void yTasToplama1(){
       System.out.println("Taşlarınızı Son Bölgede Topladınız");
       System.out.println("1)Taş Topla");
       System.out.println("2)Taş oyna");
       Scanner scan=new Scanner(System.in);
       int input=scan.nextInt();
       if (input==1){
           int a=1;int b=1;
           String oynancakYer;
           while(a<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=yTasKontrol(oynancakYer);
      
       int zar1degeri=Integer.parseInt(tablo[3][5]);
       
       if(zar1degeri>=12-y){
           tablo[x][y]=tasiAzalt(tablo[x][y]);
       }
       else{
           a=1;
           System.out.println("Geçersiz Hamle");
       }}tabloyuYazdir(tablo);
       }
       else if(input==2){
           yTurn1();  
       }
       int bitis=0;
        bitis=yBitisKontrol();
         if(bitis==25){
             System.out.println("OYUN BİTTİ Y KAZANDI");
             System.exit(0);
          }
    }//y tas toplama turn 1
    public static void yTasToplama2(){
       System.out.println("Taşlarınızı Son Bölgede Topladınız");
       System.out.println("1)Taş Topla");
       System.out.println("2)Taş oyna");
       Scanner scan=new Scanner(System.in);
       int input=scan.nextInt();
       if (input==1){
           int a=1;int b=1;
           String oynancakYer;
           while(a<2){ 
      int oynancakinputs[]=inputNereden1();
      x=oynancakinputs[0];
      y=oynancakinputs[1];
      z=x;
      w=y;
       oynancakYer=tablo[oynancakinputs[0]][oynancakinputs[1]];
      a=yTasKontrol(oynancakYer);
       System.out.println(tablo[x][y]);
       int zar2degeri=Integer.parseInt(tablo[3][6]);
       
       if(zar2degeri>=12-y){
           tablo[x][y]=tasiAzalt(tablo[x][y]);
       }
       else{
           a=1;
           System.out.println("Geçersiz Hamle");
       }}tabloyuYazdir(tablo);
       }
       else if(input==2){
           yTurn2();  
       }
       int bitis=0;
        bitis=yBitisKontrol();
         if(bitis==25){
             System.out.println("OYUN BİTTİ Y KAZANDI");
             System.exit(0);
          }
    }//y tas toplama turn 2
    public static int xBitisKontrol(){
        int flag=0;
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                 String a=tablo[i][j];
                if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")){
                   flag++;
                } 
              
            }
        }
         for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
               String a=tablo[i][j];
                if(!a.equals("1X ")&&!a.equals("2X ")&&!a.equals("3X ")&&!a.equals("4X ")&&!a.equals("5X ")&&!a.equals("6X ")&&
                 !a.equals("7X ")&&!a.equals("8X ")&&!a.equals("9X ")&&!a.equals("10X")&&!a.equals("11X")){
                   flag++;
                } 
                 
            }
        }
         if(tablo[3][4].equals("BFX")){
            flag++;
        }
      return flag;  
    }
    public static int yBitisKontrol(){
        int flag=0;
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                String a=tablo[i][j];
                if(!a.equals("1Y ")&&!a.equals("2Y ")&&!a.equals("3Y ")&&!a.equals("4Y ")&&!a.equals("5Y ")&&!a.equals("6Y ")&&
                 !a.equals("7Y ")&&!a.equals("8Y ")&&!a.equals("9Y ")&&!a.equals("10Y")&&!a.equals("11Y")){
                   flag++;
                } 
            }
        }
         for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
               String a=tablo[i][j];
                if(!a.equals("1Y ")&&!a.equals("2Y ")&&!a.equals("3Y ")&&!a.equals("4Y ")&&!a.equals("5Y ")&&!a.equals("6Y ")&&
                 !a.equals("7Y ")&&!a.equals("8Y ")&&!a.equals("9Y ")&&!a.equals("10Y")&&!a.equals("11Y")){
                   flag++;
                } 
                 
            }
        }
         if(tablo[3][7].equals("BFY")){
            flag++;
        }
      return flag;  
    }
    public static void zarDosya(){
      dosyayaEkle1(tablo[3][5]+" ");
      dosyayaEkle1(tablo[3][6]+" ");
        newLine1();
    }
    public static void SaveEtme(){
        dosya2.delete();
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                dosyayaEkle2(tablo[i][j]);  
            }
            
        }
        dosyayaEkle2(tablo[3][8]);
        dosyayaEkle2(tablo[3][5]);
        dosyayaEkle2(tablo[3][6]);
        
        
        for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                dosyayaEkle2(tablo[i][j]);  
            }
            
        }
        
        
    }
    public static void devamEtme(){
        OkuyupDiziyeAktarma();
        int a=0;int b=1;int c=2;
          for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                tablo[i][j]=devamEt.get(a)+devamEt.get(b)+devamEt.get(c);  
                a=a+3;b=b+3;c=c+3;
            }

        }
         tablo[3][8]=devamEt.get(a)+devamEt.get(b)+devamEt.get(c);
         c=c+1;
          tablo[3][5]=devamEt.get(c);
          c=c+1;
          tablo[3][6]=devamEt.get(c);
          a=a+2;b=b+2;
        
         for (int i = 5; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                 a=a+3;b=b+3;c=c+3;
                tablo[i][j]=devamEt.get(a)+devamEt.get(b)+devamEt.get(c);  
        
            }
        } }
    public static void main(String[] args) {
   
    

 //Başlangıç
        int zar1=zar1Atma();
        int zar2=zar2Atma();
        zar1=2;
        zar2=2;
        
//         String [][] tablo=new String[6][13];
tablo[0][0]=" A ";tablo[0][1]=" B ";tablo[0][2]=" C ";tablo[0][3]=" D ";tablo[0][4]= " E ";
 tablo[0][5]=" F ";tablo[0][6]=" G ";tablo[0][7]=" H ";tablo[0][8]=" I ";tablo[0][9]=" J ";
 tablo[0][10]=" K ";tablo[0][11]=" L ";tablo[0][12]="   ";
 
 tablo[1][0]="5Y ";tablo[1][1]="   ";tablo[1][2]="   ";tablo[1][3]="   ";tablo[1][4]="3X ";
 tablo[1][5]="   ";tablo[1][6]="5X ";tablo[1][7]="   ";tablo[1][8]="   ";tablo[1][9]="   ";
 tablo[1][10]="   ";tablo[1][11]="2Y ";tablo[1][12]=" 1 ";
 
 tablo[2][0]="   ";tablo[2][1]="   ";tablo[2][2]="   ";tablo[2][3]="   ";tablo[2][4]="   ";
 tablo[2][5]="   ";tablo[2][6]="   ";tablo[2][7]="   ";tablo[2][8]="   ";tablo[2][9]="   ";
 tablo[2][10]="   ";tablo[2][11]="   ";tablo[2][12]=" 2 ";
 
 tablo[3][0]="   ";tablo[3][1]="   ";tablo[3][2]="   ";tablo[3][3]="   ";tablo[3][4]="BFX";
 tablo[3][5]=Integer.toString(zar1);tablo[3][6]=Integer.toString(zar2);tablo[3][7]="BFY";tablo[3][8]="   ";tablo[3][9]="   ";
 tablo[3][10]="   ";tablo[3][11]="   ";tablo[3][12]=" 3 ";
 
 tablo[4][0]="   ";tablo[4][1]="   ";tablo[4][2]="   ";tablo[4][3]="   ";tablo[4][4]="   ";
 tablo[4][5]="   ";tablo[4][6]="   ";tablo[4][7]="   ";tablo[4][8]="   ";tablo[4][9]="   ";
 tablo[4][10]="   ";tablo[4][11]="   ";tablo[4][12]=" 4 ";
 
 tablo[5][0]="5X ";tablo[5][1]="   ";tablo[5][2]="   ";tablo[5][3]="   ";tablo[5][4]="3Y ";
 tablo[5][5]="   ";tablo[5][6]="5Y ";tablo[5][7]="   ";tablo[5][8]="   ";tablo[5][9]="   ";
 tablo[5][10]="   ";tablo[5][11]="2X ";tablo[5][12]=" 5 ";

 
// String a=devamEt.get(1)+devamEt.get(2)+devamEt.get(3);
 System.out.println("Hoşgeldiniz...");
 System.out.println("1)Yeni Oyuna Başla");
 System.out.println("2)Kayıtlı Oyuna Devam Et");
 
 Scanner scan=new Scanner(System.in);
   int menuInput=scan.nextInt();
   
   if(menuInput==1){
       dosya.delete();
       dosya1.delete();
       dosya2.delete();
          
       
       tabloyuYazdir(tablo);
       
        int xBitis=0;
        xBitis=xBitisKontrol();
        int yBitis=0;
        yBitis=yBitisKontrol();
        while(zar1==zar2){
            System.out.println("Tekrar Zar Atınız");
           int ezar1=zar1Atma();
           int ezar2=zar2Atma();
          tablo[3][5]=Integer.toString(ezar1);
          tablo[3][6]=Integer.toString(ezar2);
          zar1=Integer.parseInt(tablo[3][5]); 
          zar2=Integer.parseInt(tablo[3][6]); 
          zarDosya();
           tabloyuYazdir(tablo);
        }
            
         zar1=Integer.parseInt(tablo[3][5]);   
         zar2=Integer.parseInt(tablo[3][6]); 
        if( zar1>zar2){
            System.out.println("X Başlar");
            while(xBitis<25||yBitis<25){//BİTENE KADAR OYNAMA DÖNGÜSÜ
           xTamTurn();
           dosyayaEkle1(tablo[3][8]);
           zarDosya();
           yTamTurn(); 
           dosyayaEkle1(tablo[3][8]);
           zarDosya(); 
            xBitis=xBitisKontrol();
            yBitis=yBitisKontrol();
         }
           
        }
        else if(zar2>zar1){
             System.out.println("Y Başlar");
             while(xBitis<25||yBitis<25){//BİTENE KADAR OYNAMA DÖNGÜSÜ
           yTamTurn();
           dosyayaEkle1(tablo[3][8]);
           zarDosya();
           xTamTurn(); 
           dosyayaEkle1(tablo[3][8]);
            zarDosya(); 
            xBitis=xBitisKontrol();
            yBitis=yBitisKontrol();}   
        }}
   else if(menuInput==2){
       devamEtme();
       int xBitis=0;
        xBitis=xBitisKontrol();
        int yBitis=0;
        yBitis=yBitisKontrol();
        tabloyuYazdir(tablo);
       if(tablo[3][8].equals("X  ")){
           System.out.println("Zar Seçiniz(Soldaki 1 , sağdaki 2)");
           Scanner z=new Scanner(System.in);
          int y=z.nextInt();
          if(y==1){
           int a=0;
           a=0;
           a=xTasToplamaKontrol();
             if(a==19){
             xTasToplama1();
             xTasToplama2();
         }
             else{
          xTurn1();
          a=xTasToplamaKontrol();
          if(a==19){
             xTasToplama2();
         }else{
          xTurn2();}
             }
          }
          else if(y==2){
              int a=0;
              a=xTasToplamaKontrol();
             if(a==19){
             xTasToplama2();
             xTasToplama1();
         }
             else{
          xTurn2();
          a=xTasToplamaKontrol();
          if(a==19){
             xTasToplama1();
         }else{
          xTurn1();}
             }
          }
          dosyayaEkle1(tablo[3][8]);
           zarDosya();
           while(xBitis<25||yBitis<25){//BİTENE KADAR OYNAMA DÖNGÜSÜ
           yTamTurn();
           dosyayaEkle1(tablo[3][8]);
           zarDosya();
           xTamTurn(); 
           dosyayaEkle1(tablo[3][8]);
           zarDosya();
            xBitis=xBitisKontrol();
            yBitis=yBitisKontrol();}
           
       }else if(tablo[3][8].equals("Y  ")){
          System.out.println("Zar Seçiniz(Soldaki 1 , sağdaki 2)");
           Scanner z=new Scanner(System.in);
          int y=z.nextInt();
          if(y==1){
           int a=0;
           a=xTasToplamaKontrol();
             if(a==19){
             yTasToplama1();
             yTasToplama2();
         }
             else{
          yTurn1();
          a=xTasToplamaKontrol();
          if(a==19){
             yTasToplama2();
         }else{
          yTurn2();}
             }
          }
         else if(y==2){
              int a=0;
              a=xTasToplamaKontrol();
             if(a==19){
             yTasToplama2();
             yTasToplama1();
         }
             else{
          yTurn2();
          a=xTasToplamaKontrol();
          if(a==19){
             yTasToplama1();
         }else{
          yTurn1();}
             }
          }
          dosyayaEkle1(tablo[3][8]);
           zarDosya();
            
           while(xBitis<25||yBitis<25){//BİTENE KADAR OYNAMA DÖNGÜSÜ
           xTamTurn();
           dosyayaEkle1(tablo[3][8]);
           zarDosya();
           yTamTurn(); 
           dosyayaEkle1(tablo[3][8]);
           zarDosya(); 
            xBitis=xBitisKontrol();
            yBitis=yBitisKontrol();}
           
       }
   }
        

    }
    
}
