//*****************************************************************
// Name:
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 09 April 2018
// Project #: 01
// Driver Name: project01
// Program Description: House
// Test Oracle:
//
//use bathroom lights = 1 * hrs, units
//use oven = 5 * hrs , units
//etc. checked
//
//*****************************************************************



import java.util.Scanner;

public class project01
{
	public static void main(String[] args)
	{
		int water = 0;
		int energy = 0;
		int roomselect = 0, bathselect, laundryselect, livingselect, kitchenselect;

		Scanner scan = new Scanner(System.in);
		System.out.println("Goodmorning, you just woke up inside your house, what would you like to do?");

		while (roomselect == 0)
		{
			System.out.println("\nYou may \n(1) use the bathroom, (2) cook, (3) watch tv, \n(4) do laundry or (5) check how many resources used today and then try to go back to sleep");

			roomselect = scan.nextInt();
			bathselect = 0;
			laundryselect = 0;
			livingselect = 0;
			kitchenselect = 0;

			while (roomselect == 1)
			{
				System.out.println("You've walked into your bathroom, now what?");
				System.out.println("(1) use the lights, (2) take a shower or (3) exit bathroom");
				bathselect = scan.nextInt();

				while (bathselect == 1)
				{
					System.out.println("lights use up 1 unit/hour, how many hours will you use the lights?");
					energy += ( 1 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("Are you going to use anything else?");
					System.out.println("(1) use the lights, (2) take a shower or (3) exit bathroom");
					bathselect = scan.nextInt();
				}
				while (bathselect == 2)
				{
					System.out.println("the shower will use up 2 units/hour, how many hours will you use the water?");
					water += ( 2 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("Are you going to use anything else?");
					System.out.println("(1) use the lights, (2) take a shower or (3) exit bathroom");
					bathselect = scan.nextInt();
				}
				while (bathselect == 3)
				{
					System.out.println("You vacated the bathroom for some reason \n\n");
					bathselect = 0;
					roomselect = 0;
				}

				while ( (bathselect != 1) && (bathselect != 2) && (bathselect != 3) && (bathselect != 0) )
				{
					System.out.println("Wrong decision, try again");
					System.out.println("(1) use the lights, (2) take a shower or (3) exit bathroom");
					bathselect = scan.nextInt();
				}
			} // end bath

			while (roomselect == 2)
			{
				System.out.println("You have entered the kitchen and want to do something");
				System.out.println("(1) cook on the stove top, (2) bake in the oven, (3) use the sink or (4) leave the kitchen");
				kitchenselect = scan.nextInt();

				while (kitchenselect == 1)
				{
					System.out.println("cooking on the stove uses 3 units/hour, how many hours of energy will it take to cook your meal?");
					energy += ( 3 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("Are you going to use anything else?");
					System.out.println("(1) cook on the stove top, (2) bake in the oven, (3) use the sink or (4) leave the kitchen");
					kitchenselect = scan.nextInt();
				}
				while (kitchenselect == 2)
				{
					System.out.println("the oven will use up 5 units/hour, how many hours will you use bake in the oven?");
					energy += ( 5 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("Are you going to use anything else?");
					System.out.println("(1) cook on the stove top, (2) bake in the oven, (3) use the sink or (4) leave the kitchen");
					kitchenselect = scan.nextInt();
				}
				while (kitchenselect == 3)
				{
					System.out.println("using the sink will use 1 unit/hour, how many hours will you run the sink? (think of the fish)");
					water += ( 1 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("Are you going to use anything else?");
					System.out.println("(1) cook on the stove top, (2) bake in the oven, (3) use the sink or (4) leave the kitchen");
					kitchenselect = scan.nextInt();
				}
				while (kitchenselect == 4)
				{
					System.out.println("You left the kitchen \n\n");
					kitchenselect = 0;
					roomselect = 0;
				}
				while ( (kitchenselect != 1) && (kitchenselect != 2) && (kitchenselect != 3) && (kitchenselect != 4) && (kitchenselect != 0)  )
				{
					System.out.println("Wrong decision, try again");
					System.out.println("(1) cook on the stove top, (2) bake in the oven, (3) use the sink or (4) leave the kitchen");
					kitchenselect = scan.nextInt();
				}

			} // end kitchen

			while (roomselect == 3)
			{
				System.out.println("You adventure to the living room, what will you do?");
				System.out.println("(1) watch TV or (2) uhh, nevermind, wrong room");
				livingselect = scan.nextInt();

				while (livingselect == 1)
				{
					System.out.println("watching tv is a drain on your brain and electricy at 3 units/hour, how many hours will you watch tv?");
					energy += ( 3 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("will you continue to veg or leave the room?");
					System.out.println("(1) watch TV or (2) leave the room");
					livingselect = scan.nextInt();
				}
				while (livingselect == 2)
				{
					System.out.println("walked away");
					livingselect = 0;
					roomselect = 0;
				}
				while ( (livingselect != 1) && (livingselect != 2) && (livingselect != 0))
				{
					System.out.println("Can't do that, try again");
					System.out.println("(1) watch TV or (2) leave the room");
					livingselect = scan.nextInt();
				}
			} // end living

			while (roomselect == 4)
			{
				System.out.println("You need to do laundry");
				System.out.println("Must you (1) start a load in the washing machine, (2) engage the drier or (3) done with chores");
				laundryselect = scan.nextInt();

				while (laundryselect == 1)
				{
					System.out.println(" you have clothes to wash and it takes 4 units/load of energy and 2 units/load for water, how many loads will you run?");

					int washer = scan.nextInt();

					energy += ( 4 * washer );

//	ADD CHECK FOR NEGATIVE	//

					water += ( 2 * washer );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("washing machine has been loaded and started, any more work?");
					System.out.println("Must you (1) start a load in the washing machine, (2) engage the drier or (3) done with chores");
					laundryselect = scan.nextInt();
				}
				while (laundryselect == 2)
				{
					System.out.println("this drier uses 5 energy/load, engage? how many loads?");
					energy += ( 5 * scan.nextInt() );

//	ADD CHECK FOR NEGATIVE	//

					System.out.println("drier engaged");
					System.out.println("Must you (1) start a load in the washing machine, (2) engage the drier or (3) done with chores");
					laundryselect = scan.nextInt();
				}
				while ( laundryselect == 3)
				{
					System.out.println("no more chores please");
					laundryselect = 0;
					roomselect = 0;
				}
				while ( (laundryselect != 1) && (laundryselect != 2) && (laundryselect != 0) )
				{
					System.out.println("make up your mind - ");
					System.out.println("Must you (1) start a load in the washing machine, (2) engage the drier or (3) done with chores");
					laundryselect=scan.nextInt();
				}
			}
			if (roomselect == 5)
			{
				System.out.println("\n\n" + energy + " energy units used and " + water + " water units used");
				System.out.println("Nighty night");
			}
		} // end roomselect
	} // end main
} // end class