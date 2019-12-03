/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix_2;
import java.util.Scanner; 

/**
 *
 * @author acer
 */
public class Matrix_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris matrix : ");
        
        int row = scan.nextInt();
  
        System.out.print("Masukkan jumlah kolom matrix : ");
        int col = scan.nextInt();
        
        int m1[][] = new int[row][col];
        int m2[][] = new int[row][col];
        int m3[][] = new int[row][col];
        
        
       
      System.out.println("Masukan elemen matrix 1 : ");
 
      for (int i = 0; i < row; i++){
          for (int j = 0; j < col; j++)
            m1[i][j] = scan.nextInt();
      }
       System.out.println();   
         
      System.out.println("Masukan elemen matrix 2 : ");
       System.out.println();   
 
      for (int i = 0; i < row; i++){
          for (int j = 0; j < col; j++)
            m2[i][j] = scan.nextInt();
      }
      
        for (int i = 0; i < row; i++){
          for (int j = 0; j < col; j++)
            m3[i][j] = m1[i][j] + m2[i][j];
      }
        
       
        System.out.println("Matrix 1 + matrix 2 ");
        for(int i =0; i < row; i++){
            
            for(int j=0; j < col; j++){
               
                    System.out.print(m3[i][j] + "\t");                
            }
            System.out.println();
        }
       
    }
    
}
