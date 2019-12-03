/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix_1;
/**
 *
 * @author acer
 */
public class Matrix_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int[][] a = {{ 0, 0, 0, 0, 1 },
        { 0, 0, 0, 1, 1 },
        { 0, 0, 5, 4, 1 },
        { 11, 11, 43, 1, 4 },
        { 21, 33, 42, 55, 12 } 
        };
        
        int[][] b = {{ 1, 3, 2, 4, 1 },
        { 5, 6, 7, 8, 9 },
        { 11, 2, 3, 5, 4 },
        { 12, 25, 12, 9, 7 },
        { 14, 55, 11, 63, 18 } 
        };
        
        int row =a[0].length;
        int col =a.length;
        
        int[][] result = {{ 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 } 
        };
        
        for(int i =0; i < a[0].length; i++){
            
            for(int j=0; j < a.length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        
        for(int i =0; i < a[0].length; i++){
            
            for(int j=0; j < a.length; j++){
               
                    System.out.print(result[i][j] + "\t");                
            }
            System.out.println();
        }
       
    }
    
}
