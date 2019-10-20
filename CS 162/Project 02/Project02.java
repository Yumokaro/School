//*****************************************************************
// Name:
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 16 April 2018
// Project #: 02
// Driver Name: Project02
// Program Description: Project 02, will be using project 01 of Ann Kent
// Test Oracle:
// 1) create a text file with dog's name, size, and fur == cliff big red
// 2) What do you want to do? 4
//Dogs name is sml and it is a sml dog. It is sml
//Dogs name is big and it is a big dog. It is big
//
// Notes:
// lines 43,45,47 i used print, println, println - magically fixed errors. idk why.
// created case 4: in the switch statement to print what is in file "stats.txt"
//
//
//*****************************************************************


import java.io.*;  // Will be using PrintWriter
import java.util.Scanner;

public class Project02 {
    public static void main(String[] args)throws IOException {

        Scanner fileScan, dogScan;
        String dogStats, dogName = "", dogSize = "", dogFur = "";


        System.out.println("Dog Builder 2000");
        Scanner userInput = new Scanner(System.in);
        int option;
        String size, fur, name;
        name="null";
		fur="null";
        size= "null";
        while(true){
            System.out.println("\nDoggo Menu\n");
            System.out.print("1.) Create Doggo! \n");
            System.out.print("2.) Give the doggo a Pat \n");
            System.out.print("3.) uh... What dog? (dog info)\n");
            System.out.print("4.) Read Dog Stats from reserve file\n");
            System.out.print("5.) Exit Dog Builder 2000\n");
            System.out.print("\nWhat do you want to do? ");

            option = userInput.nextInt();

            switch(option){

                case 1:
                    System.out.print("Do you want a Big or Small Doggo? ");
                    size = userInput.next(); // if I remove this, it puts size into fur, if I move fur under the fur question, it pushes the size and fur question onto the same line... I don't Know why!
                    System.out.println("What color fur do you want your doggy to have? ");
                    fur = userInput.next();
                    System.out.println("What will you name the Doggo? ");
                    name = userInput.next();

                    // file writing
                    PrintWriter outFile = new PrintWriter ("stats.txt");
                    outFile.write(name + " ");
                    outFile.write(size + " ");
                    outFile.write(fur);
                    outFile.close();
                    break;


                case 2:
                    System.out.print("You gave "+name+" a pat!!!!! \n");
                    System.out.print(name+ " is very happy!\n \n"); // wanted to include the dog's name here, not sure how to make that happpen.
                    //because I had the Strings, name, fur, and size defined at the top as null, every time the menu ran,
//		   jokes on me, i fixed it. put it outside the loop duh!

                    break;

                case 3:
                    //info about the dog
                    // TO DO: make a way that if there is not a dog created, tell user to make dog. Also do this for Pat
                    System.out.println("Dog Info: \n Name: " +name+ "\n Size: "+size+"\n Fur Color: "+fur+"\n");
                    break;

                case 4:
                {
					fileScan = new Scanner(new File("stats.txt"));

                    while ( fileScan.hasNext() )
                    {
						dogStats = fileScan.nextLine();
						dogScan = new Scanner(dogStats);

                        dogName = dogScan.next();
                        dogSize = dogScan.next();
                        dogFur = dogScan.next();
                        System.out.println("Dogs name is " + dogName + " and it is a " + dogSize + " dog. It is " + dogFur);
                    }
				}
                    break;

                case 5:

                    System.out.println("Bye-bye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("*customer service voice* That Option isn't on our menu. Please try again and this time order off the menu!");
            }
        }
    }
}