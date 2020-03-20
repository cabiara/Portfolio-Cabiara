package mdarray;

import java.util.Scanner;  

public class MDArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows;
        int columns;        
        System.out.println("Enter the number of Rows: ");
        rows = sc.nextInt();
        
        int [][] elements = new int [rows][];
        int data;               
        System.out.println("Enter the number of Coloumns: ");
        columns = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            elements[i] = new int[columns];
            
        for (int j = 0; j < columns; j++) {
                System.out.println("Row" + i + "Columns" + j);
                data = sc.nextInt();
            elements[i][j] = data;
            }
                
            }
        System.out.println("-------------------------------------");
        
        
        for (int[] element : elements) {
        for (int j = 0; j < element.length; j++) {
            System.out.print(element[j] + "\t");
            }
            System.out.println("");
        }
        }            
        }
