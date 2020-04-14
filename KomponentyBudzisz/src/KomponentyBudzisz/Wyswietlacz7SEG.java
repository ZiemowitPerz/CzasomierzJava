
package KomponentyBudzisz;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Dimension2D;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Wyswietlacz7SEG extends Panel {
   Button SEG1, SEG2, SEG3, SEG4, SEG5, SEG6, SEG7, SEG8;

   public Wyswietlacz7SEG() {   //konstruktor

            SEG1 = new Button("");
            SEG2 = new Button("");
            SEG3 = new Button("");
            SEG4 = new Button("");
            SEG5 = new Button("");
            SEG6 = new Button("");
            SEG7 = new Button("");
            SEG8 = new Button("");
            
            setLayout(new BorderLayout());

            add("North",SEG1);
            add("North",SEG2);
            add("North",SEG3);
            add("North",SEG4);
            add("North",SEG5);
            add("North",SEG6);
            add("North",SEG7);
            add("North",SEG8);
         
            //setBounds(int x-coordinate, int y-coordinate, int width, int height)
            SEG1.setBounds(10, 10,   80, 10);
            SEG2.setBounds(80, 20,   10, 80);
            SEG3.setBounds(80, 100,  10, 80);
            SEG4.setBounds(10, 170,  80, 10);
            SEG5.setBounds(10, 100,  10, 80);
            SEG6.setBounds(10, 20,   10, 80);
            SEG7.setBounds(20, 95,  60, 10);   //srodkowy
            
            SEG8.setBounds(0, 0,  0, 0);   //widmo bo walka z layoutem
            SEG8.setVisible(false);
            
            SEG1.setBackground(Color.red);
            SEG2.setBackground(Color.red);
            SEG3.setBackground(Color.red);
            SEG4.setBackground(Color.red);
            SEG5.setBackground(Color.red);
            SEG6.setBackground(Color.red);
            SEG7.setBackground(Color.red);
      
   } // KONIEC konstructora
  
   
   
   private int i = 0;
   
    public void setWartosc(int x) {
        this.i = x;
    }
    public int getWartosc() {
        return i;
    }
   
    
 public void odswierz(){
          if(macierz[i][0] == 1){
          SEG1.setBackground(Color.GREEN);}
          else{
          SEG1.setBackground(Color.RED);}
          
          if(macierz[i][1] == 1){
          SEG2.setBackground(Color.GREEN);}
          else{
          SEG2.setBackground(Color.RED);}
          
          if(macierz[i][2] == 1){
          SEG3.setBackground(Color.GREEN);}
          else{
          SEG3.setBackground(Color.RED);}
          
          if(macierz[i][3] == 1){
          SEG4.setBackground(Color.GREEN);}
          else{
          SEG4.setBackground(Color.RED);}
          
          if(macierz[i][4] == 1){
          SEG5.setBackground(Color.GREEN);}
          else{
          SEG5.setBackground(Color.RED);}
          
          if(macierz[i][5] == 1){
          SEG6.setBackground(Color.GREEN);}
          else{
          SEG6.setBackground(Color.RED);}
          
          if(macierz[i][6] == 1){
          SEG7.setBackground(Color.GREEN);}
          else{
          SEG7.setBackground(Color.RED);}
}   
    
   
  public void Dodaj1(int liczba){
          i=i+liczba;
          
          if(i>=10){
              i = (i%10);
          }
          odswierz();
  }
  
  public void odliczaj(int iMax) throws InterruptedException{
          for(i=0; i<=iMax; i++){
          
          TimeUnit.SECONDS.sleep(1);
              
          //if(i==iMax){
          //   i=0;
          //}
          odswierz();
          }
  }
  
    public void czysc(){
        SEG1.setBackground(Color.RED);
        SEG2.setBackground(Color.RED);
        SEG3.setBackground(Color.RED);
        SEG4.setBackground(Color.RED);
        SEG5.setBackground(Color.RED);
        SEG6.setBackground(Color.RED);
        SEG7.setBackground(Color.RED);
    }
    
        public void zeruj(){
        i = 10;
        SEG1.setBackground(Color.RED);
        SEG2.setBackground(Color.RED);
        SEG3.setBackground(Color.RED);
        SEG4.setBackground(Color.RED);
        SEG5.setBackground(Color.RED);
        SEG6.setBackground(Color.RED);
        SEG7.setBackground(Color.RED);
    }
  

   
    private int liczby [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    
                               //  1, 2, 3, 4, 5, 6, 7
    private int macierz [][] = {{  1, 1, 1, 1, 1, 1, 0},   //0
                                {  0, 1, 1, 0, 0, 0, 0},   //1
                                {  1, 1, 0, 1, 1, 0, 1},   //2
                                {  1, 1, 1, 1, 0, 0, 1},   //3
                                {  0, 1, 1, 0, 0, 1, 1},   //4
                                {  1, 0, 1, 1, 0, 1, 1},   //5
                                {  1, 0, 1, 1, 1, 1, 1},   //6
                                {  1, 1, 1, 0, 0, 0, 0},   //7
                                {  1, 1, 1, 1, 1, 1, 1},   //8
                                {  1, 1, 1, 1, 0, 1, 1},   //9
                                {  0, 0, 0, 0, 0, 0, 0}};  //nic
    
    private int nic [] =        {  0, 0, 0, 0, 0, 0, 0};
    private int zero [] =       {  1, 1, 1, 1, 1, 1, 0};
    private int jeden [] =      {  0, 1, 1, 0, 0, 0, 0};
    private int dwa [] =        {  1, 1, 0, 1, 1, 0, 1};
    private int trzy [] =       {  1, 1, 1, 1, 0, 0, 1}; 
    private int cztery [] =     {  0, 1, 1, 0, 0, 1, 1};
    private int piec [] =       {  1, 0, 1, 1, 0, 1, 1};
    private int szesc [] =      {  1, 0, 1, 1, 1, 1, 1};
    private int siedem [] =     {  1, 1, 1, 0, 0, 0, 0};
    private int osiem [] =      {  1, 1, 1, 1, 1, 1, 1};
    private int dziewiec [] =   {  1, 1, 1, 1, 0, 1, 1};
    
    
    
    public void setLiczby(int[] liczby) {
        this.liczby = liczby;
    }
    public int[] getLiczby() {
        return liczby;
    }
   
    
     public void setMacierz(int[][] macierz) {
        this.macierz = macierz;
    }
    public int[][] getMacierz() {
        return macierz;
    }
   
}//public class Wyswietlacz7SEG extends Panel {