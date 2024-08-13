//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 { 
    public static void main(String[] arg){ 
        //Make a scanner 
        Scanner myScanner = new Scanner( System.in);
        //Create my variables 
        int length = 0;
        int width = 0;
        int area = 0; 
        int perimeter = 0;
        //Get input 
        System.out.println("Please enter the length: ");
        length = myScanner.nextInt();
        System.out.println("Please enter the width: ");
        
        //Calculate 
        width = myScanner.nextInt();
        System.out.println("Please enter the area; ");
        area = length * width;
        perimeter= 2*length + 2*width; 
        //Output 
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        System.out.println("The area is " + area);
        System.out.println("The permieter is " +  perimeter);
    }
}



//Paste console output below:
/*


*/
