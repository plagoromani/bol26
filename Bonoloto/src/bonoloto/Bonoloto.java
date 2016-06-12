/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoloto;

/**
 *
 * @author Pablite5
 */
public class Bonoloto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Menu menu1=new Menu();
        
        menu1.setVisible(true);
    }
     public int num1;
     public int num2;
     public int num3;
     public int num4;
     public int num5;
     public int num6;
    
    public  void generarNumeros(){
    num1 = (int) (Math.random() * 49 + 1);
    num2 = (int) (Math.random() * 49 + 1);
    num3 = (int) (Math.random() * 49 + 1);
    num4 = (int) (Math.random() * 49 + 1);
    num5 = (int) (Math.random() * 49 + 1);
    num6 = (int) (Math.random() * 49 + 1);
    }
    
    public void GenerarLimpieza(){
    num1=0;
    num2=0;
    num3=0;
    num4=0;
    num5=0;
    num6=0;
    
    }
    
    public  int[] play( int[] numeros){
    int[] numerosbien = new int[6];
    
    for(int i=0;i<numerosbien.length;i++){
    if(num1==numeros[i]){numerosbien[i]=num1;}
    else if(num2==numeros[i]){numerosbien[i]=num2;}
    else if(num3==numeros[i]){numerosbien[i]=num3;}
    else if(num4==numeros[i]){numerosbien[i]=num4;}
    else if(num5==numeros[i]){numerosbien[i]=num5;}
    else if(num6==numeros[i]){numerosbien[i]=num6;}
    else{numerosbien[i]=00;}
    
    
    }
    return numerosbien;
    }
}
