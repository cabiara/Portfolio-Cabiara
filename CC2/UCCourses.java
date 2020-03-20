
package uccourses;
import java.util.Scanner;

public class UCCourses {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int dep;
        String prog;
                
        System.out.println("Choose a department.");
        System.out.println(" ");
        System.out.println("[1] College of Accountancy\n"+
                           "[2] College of College of Engineering and Architecture\n"+
                           "[3] College of Information Technology and Computer Science\n"+
                           "[4] College of Teacher Education\n"+
                           "[5] College of Arts and Sciences\n"+
                           "[6] College of Business Administration");
        
        dep = scan.nextInt();
        switch (dep) {    
            
            case 1:
                System.out.println("----------------------------------------");
                System.out.println("College of Accountancy");
                System.out.println("Choose a program.");
                System.out.println(" ");
                System.out.println("[1] Bachelor of Science in Accountancy\n"+
                                   "[2] Bachelor of Schience in Accounting Technology\n"+
                                   "[3] Bachelor of Science in Management Accounting\n"+
                                   "[4] Bachelor of Science in Forensic Accouting");                
                prog = scan.next();
                    if(prog.equalsIgnoreCase("1")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Accountancy\n"+
                                       "Program: Bachelor of Science in Accountancy");
                    System.out.println(" ");
                }
                else if(prog.equalsIgnoreCase("2")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Accountancy\n"+
                                       "Program: Bachelor of Science in Accounting Technology");
                    System.out.println(" ");
                }
                else if(prog.equalsIgnoreCase("3")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Accountancy\n"+
                                       "Program: Bachelor of Science in Management Accounting");
                }
                else if(prog.equalsIgnoreCase("4")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Accountancy\n"+
                                       "Program: Bachelor of Science in Forensic Accounting");                    
                }
                else{
                    System.out.println("Error. Try again.");
                }
                break;
                
                
            case 2:
                System.out.println("----------------------------------------");
                System.out.println("College of Engineering and Architecture");
                System.out.println("Choose a program.");
                System.out.println(" ");
                System.out.println("[1] Bachelor of Science in Architecture\n"+
                                   "[2] Bachelor of Science in Civil Engineering\n"+
                                   "[3] Bachelor of Science in Computer Engineering\n"+
                                   "[4] Bachelor of Science in Electronics Engineering\n"+
                                   "[5] Bachelor of Scince in Environmental and Sanitary Engineering");
                prog = scan.next();
                if(prog.equalsIgnoreCase("1")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Engineering and Achitecture\n"+
                                       "Program: Bachelor of Science in Architecture");
                }
                else if(prog.equalsIgnoreCase("2")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Engineering and Achitecture\n"+
                                       "Program: Bachelor of Science in Civil Engineering");
                }
                else if(prog.equalsIgnoreCase("3")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Engineering and Achitecture\n"+
                                       "Program: Bachelor of Science in Computer Engineering");
                }
                else if(prog.equalsIgnoreCase("4")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Engineering and Achitecture\n"+
                                       "Program: Bachelor of Science in Electronics Engineering");
                }
                else if(prog.equalsIgnoreCase("5")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Engineering and Achitecture\n"+
                                       "Program: Bachelor of Science in Environmental and Sanitary Engineering");
                }
                else {
                    System.out.println("Error. Try again.");
                }
                break;
                
                
            case 3:
                System.out.println("----------------------------------------");
                System.out.println("College of Informations Technology and Computer Science");
                System.out.println("Choose a program.");
                System.out.println(" ");
                System.out.println("[1] Bachelor of Science in Computer Science\n"+
                                   "[2] Bachelor of Science in Information System\n"+
                                   "[3] Bachelor of Science in Information Technology\n"+
                                   "[4] Bachelor of Science in Computer Technology\n");
                prog = scan.next();
                if(prog.equalsIgnoreCase("1")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Information Technology and Computer Science\n"+
                                       "Program: Bachelor of Science in Computer Science");
                }
                else if(prog.equalsIgnoreCase("2")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Information Technology and Computer Science\n"+
                                       "Program: Bachelor of Science in Information System");
                }
                else if(prog.equalsIgnoreCase("3")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Information Technology and Computer Science\n"+
                                       "Program: Bachelor of Science in Information Technology");
                }
                else if(prog.equalsIgnoreCase("4")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Information Technology and Computer Science\n"+
                                       "Program: Bachelor of Science in Computer Technology");
                }
                else {
                    System.out.println("Error. Try again.");
                }
                break;
                
                
            case 4:
                System.out.println("----------------------------------------");
                System.out.println("College of Teacher Education");
                System.out.println("Choose a program.");
                System.out.println(" ");
                System.out.println("[1] Bachelor of Science in Elementary Education-General\n"+
                                   "[2] Bachelor of Science in Elementary Education\n"+
                                   "[3] Bachelor of Science in Secondary Education");
                prog = scan.next();
                if(prog.equalsIgnoreCase("1")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Teacher Education\n"+
                                       "Program: Bachelor of Science in Education-General");
                }
                else if(prog.equalsIgnoreCase("2")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Teacher Education\n"+
                                       "Program: Bachelor of Science in Elementary Education");
                }
                else if(prog.equalsIgnoreCase("3")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Teacher Education\n"+
                                       "Program: Bachelor of Science in Secondary Education");
                }
                else {
                    System.out.println("Error. Try again.");
                }
                break;
                
                
            case 5:
                System.out.println("----------------------------------------");
                System.out.println("College of Arts and Sciences");
                System.out.println("Choose a program.");
                System.out.println(" ");
                System.out.println("[1] Bachelor of Arts and English\n"+
                                   "[2] Bachelor of Arts in Political Science\n"+
                                   "[3] Bachelor of Arts in Communication\n"+"Bachelor of Science in Psychology");
                prog = scan.next();
                if(prog.equalsIgnoreCase("1")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Arts and Sciences\n"+
                                       "Program: Bachelor of Arts and English");                    
                }
                else if(prog.equalsIgnoreCase("2")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Arts and Sciences\n"+
                                       "Program: Bachelor of Arts in Political Science");
                    System.out.println("\n");
                }
                else if(prog.equalsIgnoreCase("3")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Arts and Sciences\n"+
                                       "Program: Bachelor of Arts in Communication");
                }
                else if(prog.equalsIgnoreCase("4")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Arts and Sciences\n"+
                                       "Program: Bachelor of Science in Psychology");
                }
                else {
                    System.out.println("Error. Try again.");
                }
                break;
                
                
            case 6:
                System.out.println("----------------------------------------");
                System.out.println("Collegeof Business Administration");
                System.out.println("Choose a program.");
                System.out.println(" ");
                System.out.println("[1] Bachelor of Science in Business Administration\n"+
                                   "[2] Bachelor of Science in Entrepreneurship\n"+
                                   "[3] Bachelor of Science in Office Administration\n");
                prog = scan.next();
                if(prog.equalsIgnoreCase("1")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Business Administration\n"+
                                       "Program: Bachelor of Science in Business Administration");
                }
                else if(prog.equalsIgnoreCase("2")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Business Administration\n"+
                                       "Program: Bachelor of Science in Entrepreneurship");
                }
                else if(prog.equalsIgnoreCase("3")){
                    System.out.println("----------------------------------------"+
                                       "\nDepartment: College of Business Administration\n"+
                                       "Program: Bachelor of Science in Office Administration");                    
                }
                else{
                    System.out.println("Error. Try again.");
                }
                break;
            
            case 7:
                
                System.out.println("Error. Try Again");
                break;
        }
    }
    
}