/**
 * @(#)ICS3U2JavaISUAustinHo.java
 * ICS3U2 Java ISU
 * Computer Hardware Java application. This program is designed to teach users
 * about the different parts of computer hardware and then quiz them on the
 * things they have learned. There is a point system to keep track of how 
 * well they do on the quiz.
 * January 14, 2016
 * Austin Ho 
 * @version 1.00 2016/1/14
 */
 
 import java.util.Scanner;
 import java.lang.Math;
 
public class ICS3U2JavaISUAustinHo {
    
    //Declare Public Variables
    public static Scanner input = new Scanner(System.in);
    public static String userName;
      
    public static void mainMenu(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Print Asterisks
    	asteriskPrinter();
    	
    	//Print Out Menu
    	System.out.println("MAIN MENU\n");
    	System.out.println("1. Start Game");
    	System.out.println("2. Instructions");
    	System.out.println("3. About Program");
    	System.out.println("4. Exit Application");
    	
    	//Get User Input
    	choice = userChoice(4);
    	
    	if (choice == 1) //Begins the Game
    		startGame();
    		
    	else if (choice == 2) //Goes to the Instructions Page
    		instructions();
    		
    	else if (choice == 3) //Goes to the About Program Page
    		aboutProgram();
    		
    	else if (choice ==4){ //Diplays Message and Exits Program
    		System.out.println("Thank you for using the Computer Blaster Program.");
    		System.out.println("Have a nice day!");
    	}

    }
    
    public static void startGame(){
		
		//Declare Variables
		int choice;
		
		//Prints Asterisks
    	asteriskPrinter();
    	
    	//Print Out Menu
    	System.out.println("START GAME\n");
    	System.out.println("1. Learn About Computers");
    	System.out.println("2. Take the Quiz on Computers");
    	System.out.println("3. Exit to Main Menu");
    	
    	//Get User Input
    	choice = userChoice(3);
    	
    	if (choice == 1) //Goes to Learn About Page
    		learn();
    		
    	else if (choice == 2) //Goes to Quiz Page
    		quiz();
    		
    	else if (choice == 3) //Goes to Main Menu
    		mainMenu();
    }
    
    public static void instructions(){
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Title and Instructions for the Program
    	System.out.println("INSTRUCTIONS\n");
    	System.out.println("This program designed to teach you about the parts of a computer and quiz you");
    	System.out.println("about it. To get to the learning section, press 1 on the Main Menu and then 1");
    	System.out.println("on the Start Menu. Then enter the corresponding number to get to a certain");
    	System.out.println("topic. When you enter the Quiz, you have an option to continue or go back and");
    	System.out.println("learn. Each question is worth 500 points if you get it right, and if you get it");
    	System.out.println("wrong you lose 500 points. There are 15 questions to answer. At the end you can");
    	System.out.println("go to the end of the game or take the Bonus Quiz, where points are worth double");
    	System.out.println("of the Quiz, but if you get a question wrong, you will also lose double the");
    	System.out.println("points. At the end of the Quiz, you can choose to retake the Quiz, go back and");
    	System.out.println("learn about a topic, or exit the program.\n");
    	
    	//Goes to Main Menu After User Enters Anything
    	System.out.print("Enter any key to go back to the Main Menu: ");
    	input.nextLine();
    	input.nextLine();
    	mainMenu();
    }
    
    public static void aboutProgram(){
    	
    	//Prints Asterisks
    	asteriskPrinter();
		
		//Prints Title and Information About Program
    	System.out.println("ABOUT PROGRAM\n");
    	System.out.println("Computer Blasters V1.0.0");
    	System.out.println("Copyright 1999-2016 Imagine Studios");
    	System.out.println("This Product is Licensed to: USER");
    	System.out.println("Serial Number: 0123456789");
    	System.out.println("Warning: This computer program is protected by copyright law and international");
    	System.out.println("treaties. Unauthorized reproduction or distribution of this program, or any");
    	System.out.println("portion of it, may result in severe civil and criminal penalties, and will be");
    	System.out.println("prosecuted to the maximum extent possible under law.\n");
    	
    	//Goes to Main Menu After User Enters Anything
    	System.out.print("Enter any key to go back to the Main Menu: ");
    	input.nextLine();
    	input.nextLine();
    	mainMenu();
    }
    
    public static void learn(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Out Menu
    	System.out.println("LEARN ABOUT\n");
    	System.out.println("1. Computer Memory");
    	System.out.println("2. Hard Disk / Floppy Disk");
    	System.out.println("3. CDs");
    	System.out.println("4. BIOS");
    	System.out.println("5. CD-Burners");
    	System.out.println("6. Exit to Start Menu");
    	
    	//Gets User Input
    	choice = userChoice(6);
    	
    	if (choice == 1) //Goes to Computer Memory Information
    		computerMemory();
    		
    	else if (choice == 2) //Goes to Hard Disk / Floppy Disk Information
    		hardFloppyDisk();
    		
    	else if (choice == 3) //Goes to CDs Information
    		CDs();
    		
    	else if (choice == 4) //Goes to BIOS Information
    		BIOS();
    		
    	else if (choice == 5) //Goes to CD-Burners Information
    		CDBurners();
    		
    	else if (choice ==6) //Goes to Start Menu
    		startGame();
    }
    
    public static void computerMemory(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Title and Information on Computer Memory
    	System.out.println("COMPUTER MEMORY\n");
    	System.out.println("Computer memory is any type of electronic storage. Some examples are Random");
    	System.out.println("Access Memory (RAM), Read Only Memory (ROM), cache, flash memory, hard disks,");
    	System.out.println("virtual memory, and registers. We have many types of memory because the CPU");
    	System.out.println("processes data at extremely high speeds and needs access to large amounts of");
    	System.out.println("data to maximize its performance. However, memory that can keep up with the CPU");
    	System.out.println("would be way too expensive for consumers to be able to buy, so computer");
    	System.out.println("designers have tiered memory to deal with this problem. What this does is use");
    	System.out.println("small amounts of expensive, fast memory such as RAM, and large amounts of cheap");
    	System.out.println("memory to support it, such as hard disks. This way, people will still be able");
    	System.out.println("to almost maximize their CPU performance without spending large amounts of");
    	System.out.println("money. RAM is the memory that passes on bits to the CPU to process, but does");
    	System.out.println("not usually operate at optimum speed due to latency, the number of clock cycles");
    	System.out.println("needed to read a bit. However, the CPU uses special processes known as burst");
    	System.out.println("mode and pipelining to reduce the effect of latency. Burst mode is when the");
    	System.out.println("memory controller predicts that the same series of memory addresses will be");
    	System.out.println("accessed by the CPU, so it reads multiple consecutive bits together, so that");
    	System.out.println("only the first bit is subjected to latency. Pipelining is when the memory");
    	System.out.println("controller reads off a word or words from memory, sends it to the CPU, and");
    	System.out.println("writes it to memory cells simultaneously. Cache is the form of memory built");
    	System.out.println("right into the CPU, or has a direct link to it so it is accessed the fastest.");
    	System.out.println("It is used to store information accessed frequently by the CPU. There are two");
    	System.out.println("types of memory, volatile and nonvolatile memory. Volatile is when the memory");
    	System.out.println("is lost when the power is turned off, such as RAM, while nonvolatile memory");
    	System.out.println("does not lose its data when the power is turned off, such as ROM.");
    	
    	System.out.println();
    	
    	//Displays Options
    	System.out.println("1. Go back to Learn About page");
    	System.out.println("2. Take Quiz");
    	
    	//Gets User Input
    	choice = userChoice(2);
    	
    	if (choice == 1) //Goes Back to Learn About Page
    		learn();
    		
    	else if (choice == 2) //Goes to Quiz
    		quiz();
    }
    
    public static void hardFloppyDisk(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Title and Information on Hark Disks / Floppy Disks
    	System.out.println("HARD DISKS / FLOPPY DISKS\n");
    	
    	//Hard Disk Paragraph
    	System.out.println("HARD DISKS");
    	System.out.println("Hard disks are storage devices that are used to store changing digital");
    	System.out.println("information in a relatively permanent form. They were first invented during");
    	System.out.println("the 1950s, where it was a device that held a hard platter, which held a");
    	System.out.println("magnetic medium. It used magnetic recording techniques, in which it was covered");
    	System.out.println("in iron oxide, a ferromagnetic compound that remains magnetized. It allowed the");
    	System.out.println("hard disk to be easily erased and rewritten. The disk is made of aluminum or");
    	System.out.println("glass, in which it is polished to mirror smoothness. Some other features");
    	System.out.println("include that the disk spins can spin at 272 KPH, the read and write head never");
    	System.out.println("actually touch the disk, and that the data is stored on very small domains. All");
    	System.out.println("of these factors allow the hard disk to store huge amounts of information in a");
    	System.out.println("tiny space, and be able to access in a fraction of a second. Three important");
    	System.out.println("factors of a hard drive is the capacity of the drive, the data rate, which is");
    	System.out.println("the number of bytes per second the drive can deliver to the CPU, and the seek");
    	System.out.println("time, which is the amount of time between when the CPU requests a file and when");
    	System.out.println("the first byte is sent to the CPU. The platter can spin at 3,600 to 7,200 RPM");
    	System.out.println("while the read / write heads is located on the arm, which moves it around. The");
    	System.out.println("hard drive can have multiple platters and heads, which allows it to store more");
    	System.out.println("information. The data is stored in sectors, which are pie-shaped wedges on the");
    	System.out.println("platter, in which groups of sectors are known as clusters, or in tracks, which");
    	System.out.println("are concentric circles around the platter. Low-level formatting creates the");
    	System.out.println("tracks and sectors on the platter, while high-level formatting writes the");
    	System.out.println("file-storage structures into the sectors.");
    	
    	System.out.println();
    	
    	//Continues to Floppy Disks
    	System.out.print("Enter any key to read about Floppy Disks: ");
    	input.nextLine();
    	input.nextLine();
    	
    	System.out.println();
    	
    	//Floppy DIsks Paragraph
    	System.out.println("FLOPPY DISKS");
    	System.out.println("The floppy disk was invented in 1967, and was called floppy because the");
    	System.out.println("packaging was a flexible plastic envelope. By the mid 1990's, the floppy disk");
    	System.out.println("fell out of popularity with the rise of CDs and because the recording surface");
    	System.out.println("was easily contaminated by fingerprints. It used a thin plastic base covered in");
    	System.out.println("iron oxide, a ferromagnetic compound which remained permanently magnetized if");
    	System.out.println("exposed to a magnetic field, making it very easy to record, erase, and rewrite.");
    	System.out.println("The floppy disk was also easy to use and very cheap. The tracks on the disk");
    	System.out.println("were also arranged in concentric rings, which allowed the computer to jump");
    	System.out.println("between files without having to go through the files in between. The diskette");
    	System.out.println("spins around while the read / write heads move to the proper track, which is");
    	System.out.println("known as direct access storage. The heads are not directly opposite each other");
    	System.out.println("to avoid interference on the two sides of the surface. There is also an erase");
    	System.out.println("head, which is wider than the read / write head so that it prevents interfering");
    	System.out.println("with other data on a nearby track. The diskette can be spun at either 300 or");
    	System.out.println("360 RPM. To write on the floppy disk, the disk is spun, the heads are moved to");
    	System.out.println("the right track and the location is checked, the eraser clears s sector, the");
    	System.out.println("write head encodes the data by magnetising the iron particles, and the disk");
    	System.out.println("stops spinning.");
    	
    	System.out.println();
    	
    	//Displays Image When User is Ready
    	System.out.print("Enter any key to see an image of a Floppy Disk: ");
    	input.nextLine();
    	
    	System.out.println();
    	
    	//Displays Floppy Disk Image
		System.out.println(" _________________");
		System.out.println("| | ___________ |o|");
		System.out.println("| | ___________ | |");
		System.out.println("| | ___________ | |");
		System.out.println("| | ___________ | |");
		System.out.println("| |_____________| |");
		System.out.println("|     _______     |");
		System.out.println("|    |       |   ||");
		System.out.println("| DD |       |   V|");
		System.out.println("|____|_______|____|");
    	
    	System.out.println();
    	
    	//Displays Options
    	System.out.println("1. Go back to Learn About page");
    	System.out.println("2. Take Quiz");
    	
    	//Gets User Input
    	choice = userChoice(2);
    	
    	if (choice == 1)//Goes Back to Learn About Page
    		learn();
    		
    	else if (choice == 2) //Goes to Quiz
    		quiz();
    }
    
    public static void CDs(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Title and Information on CDs
    	System.out.println("CDS\n");
    	System.out.println("CDs, Compact Discs, is a storage device that is made from an injection-molded");
    	System.out.println("piece of clear, polycarbonate plastic. It is covered by a reflective aluminum");
    	System.out.println("layer, and then a thin acrylic layer is sprayed over it for protection. It has");
    	System.out.println("a single track of data, that spirals from the centre to the outside, which is");
    	System.out.println("0.5 microns wide and 1.6 microns between tracks. The data stored in the CD is");
    	System.out.println("stored in the elongated bumps that make up the track, which are 0.5 microns");
    	System.out.println("wide, at least 0.83 microns long, and 125 nanometers high. A CD is read using a");
    	System.out.println("CD player, which contains a drive motor to spin the disc, in which it spins");
    	System.out.println("between 200 to 500 rpm depending on the track being read. The farther the track");
    	System.out.println("from the centre, the slower it has to spin to maintain a constant rate and");
    	System.out.println("speed in which the data is read off the CD. It also contains a laser to read");
    	System.out.println("the bumps by reflecting light off the track, and having a opto-electric sensor");
    	System.out.println("detect the changes in the light to read the bits off the CD. It also has a");
    	System.out.println("tracking mechanism to move the laser to follow the track. Data is encoded on a");
    	System.out.println("CD using Eight-Fourteen Modulation (EFM), in which 8-bit bytes is converted");
    	System.out.println("into 14 bits, so that some of the bits are guaranteed to be a one, so that");
    	System.out.println("there are no long gaps on the tracks. Interleaving the data on a CD stores the");
    	System.out.println("data non-sequentially around the circuit, in which the drive reads it one");
    	System.out.println("revolution at a time and has to un interleave the data in order to play it.");
    	System.out.println("This prevents a scratch or speck on the disc from making data unrecoverable.");
    	
    	System.out.println();
    	
    	//Allows User to Read and Then Display Image When Ready
    	System.out.print("Enter any key to see an image of a CD: ");
    	input.nextLine();
    	input.nextLine();
    	
    	System.out.println();
    	
    	//Displays CD Image
		System.out.println("           .:=?++======++~,");             
		System.out.println("        :?+===~~~~~:,,,...,~?=");          
		System.out.println("    .?+~~~~=====~~~:,,.........,?,");      
		System.out.println("   =+~~~~~~~====~~~:,....   .....:?.");    
		System.out.println("  +~~~~~~~~~~~===~~:,...      ....,?,");   
		System.out.println(" :?~~~~~~~~~~~===~~:,....     .....~=");   
		System.out.println(":?~~~~~~~~~~~~~~~===,.....     .....~=  ");
		System.out.println("?~~~~~~~~~~~~~=??+===?=,.............=: ");
		System.out.println("+~~~~~~~~~~~~~??~:~~:~?+,............== ");
		System.out.println("=:::::::::::=?~~=.   :=~?=:::::::::::~+.");
		System.out.println("=::::,,:,,,,~?=~=,   :=~?+~:::::~~~~~~+.");
		System.out.println("=,,,,,......,~?~~=~:=~:+?~~~~~~~~~~~~=="); 
		System.out.println("+,............,+?=~~~+?+~~~~~~~~~~~~~+:"); 
		System.out.println("+,......  .....,=?????+~~~~~~~~~~~~~~?,"); 
		System.out.println(",+,....      ....,,:~~=~~~~~~~~~~~~~?:");  
		System.out.println(" ,?,....      ...,,:~~==~~~~~~~~~~~?:");   
		System.out.println("  ==.....     ...,,:~~===~~~~~~~~~=+");    
		System.out.println("   ,?,...... ....,,:~~=====~~~~~~?:");     
		System.out.println("     :?:.........,,:~~~=====~~~?=");       
		System.out.println("      ,?~.......,,::~~~=====~=?:");        
		System.out.println("         :+=:,.,,,::~~~~==+?~");           
		System.out.println("             ,:==+++++=:,");               
		System.out.println("                 \"\"\"\""); 
		   
		System.out.println();
		    	
    	//Displays Options
    	System.out.println("1. Go back to Learn About page");
    	System.out.println("2. Take Quiz");
    	
    	//Gets User Input
    	choice = userChoice(2);
    	
    	if (choice == 1) //Goes Back to Learn About Page
    		learn();
    		
    	else if (choice == 2) //Goes to Quiz
    		quiz();
    }
    
    public static void BIOS(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Title and Information on BIOS
    	System.out.println("BIOS\n");
    	System.out.println("BIOS (Basic Input/Output System) is a form of flash memory on your computer. It");
    	System.out.println("is a type of software that is on every computer that makes sure all the other");
    	System.out.println("ports, drives, chips, and the CPU function together. The BIOS does things such");
    	System.out.println("as performing a power-on self-test, activating other BIOS chips on other cards,");
    	System.out.println("providing a low-level set of routines for the operating system to communicate");
    	System.out.println("with other devices, and managing settings for other parts of the computer. One");
    	System.out.println("of the first things the BIOS does is check the CMOS (Complementary Metal Oxide");
    	System.out.println("Semiconductor) chip, which gives the user specific information on their");
    	System.out.println("computer system and can be changed as your system updates. The BIOS then loads");
    	System.out.println("the interrupt handlers, which are pieces of software that translate between");
    	System.out.println("hardware parts and the operating system of the computer. It also loads the");
    	System.out.println("device drivers, which are pieces of software that identify the base hardware");
    	System.out.println("components of a computer. The BIOS then checks if it was a cold boot, if the");
    	System.out.println("computer was turned on from a completely powered off state, or a reboot, where");
    	System.out.println("the computer was never fully shut down. If it is a cold boot, it performs a");
    	System.out.println("read / write test of each memory address in the RAM, checks for a keyboard and");
    	System.out.println("mouse, and looks for a PCI (Peripheral Component Interconnect) bus, in which if");
    	System.out.println("there are any errors, the BIOS will notify the user. At the end, the BIOS");
    	System.out.println("displays some information about your computer and loads the operating system.");
    	
    	System.out.println();
    	
    	//Displays Options
    	System.out.println("1. Go back to Learn About page");
    	System.out.println("2. Take Quiz");
    	
    	//Gets User Input
    	choice = userChoice(2);
    	
    	if (choice == 1)//Goes Back to Learn About Page
    		learn();
    		
    	else if (choice == 2) //Goes to Quiz
    		quiz();
    }
    
    public static void CDBurners(){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Title and Information on CD-Burners
    	System.out.println("CD-BURNERS\n");
    	System.out.println("Manufactured CDs from producers were preprogrammed, in which the CD was encoded");
    	System.out.println("using bumps on the aluminum layer. It was read by a laser, which the light");
    	System.out.println("reflected back by a flat area reached an optical sensor which read it as a 1,");
    	System.out.println("while the laser hitting a bump reflected it away from the sensor, representing");
    	System.out.println("a 0. In the 1990's, there was a demand for consumers to be able to make their");
    	System.out.println("own CD recordings, which surpassed the storage capacity of floppy disks. CD-Rs");
    	System.out.println("(CD-Recordable Discs) were created in response to demands. It did not have");
    	System.out.println("bumps on the metal layer, but instead had a photosensitive dye covered by a");
    	System.out.println("smooth, reflective metal layer. The dye is translucent when the disc is blank,");
    	System.out.println("and using a concentrated light at a certain frequency would burn the dye,");
    	System.out.println("causing the point to darken until light cannot get through. The translucent");
    	System.out.println("parts are like the flat areas of a manufactured CD, while the opaque parts were");
    	System.out.println("like the bumps. This is done using a write laser, which moves like a read");
    	System.out.println("laser, but is more powerful so that it can burn the dye. The read laser is not");
    	System.out.println("powerful enough to burn the dye, so it just passes through and is reflected by");
    	System.out.println("the metal layer. This disc allowed users to burn their own discs, however, the");
    	System.out.println("discs were unable to be rewritten. In the mid 1900's, manufacturers introduced");
    	System.out.println("a new disc, the CD-RW (CD-ReWritable Disc), which could be rewritten multiple");
    	System.out.println("times. CD-RWs use phase-change technology, in which the compound is made up of");
    	System.out.println("silver, antimony, tellurium, and indium. The material in a blank disc starts");
    	System.out.println("off as a clear, crystalline solid, and by heating it up and melting it, the");
    	System.out.println("spots becomes an opaque liquid. The clear solid acts like the flat areas of a");
    	System.out.println("manufactured CD, and represent a 1, while the liquid acts like the bumps, which");
    	System.out.println("represent 0. To erase the disc, an erase laser is used to heat the compound to");
    	System.out.println("its crystallization point, so that it condenses back to a solid, making the CD");
    	System.out.println("rewritable. The erase laser is more powerful than the read laser, but still not");
    	System.out.println("as powerful as the write laser. A drawback of CD-RWs if that it does not");
    	System.out.println("reflect as much light as other CDs, so it could not be read on older CD players");
    	System.out.println("or drives.");
    	
    	System.out.println();
    	
    	//Displays Options
    	System.out.println("1. Go back to Learn About page");
    	System.out.println("2. Take Quiz");
    	
    	//Gets User Input
    	choice = userChoice(2);
    	
    	if (choice == 1)//Goes Back to Learn About Page
    		learn();
    		
    	else if (choice == 2) //Goes to Quiz
    		quiz();
    }
    
    public static void quiz(){
    	
    	//Declare Variables
    	int random;
    	int points = 0;
    	int choice;
    	int counter = 1;
    	final int VALUE = 500;
    	//Boolean Variables to Check if a Question has been Asked Yet
    	boolean q1 = false, q2 = false, q3 = false, q4 = false, q5 = false;
    	boolean q6 = false, q7 = false, q8 = false, q9 = false, q10 = false;
    	boolean q11 = false, q12 = false, q13 = false, q14 = false, q15 = false;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    
    	//Prints Title and Information on Quiz
    	System.out.println("QUIZ\n");
    	System.out.println("Welcome to the Quiz. You will be tested on your knowledge of Computer");
    	System.out.println("Memory, Hard Disks / Floppy Disks, CDs, BIOS, and CD-Burners.");
    	System.out.println("You will be awarded 500 points for each correct question and lose");
    	System.out.println("500 points for an incorrect question.\n");
    	System.out.println("Enter 1 to continue or 2 to go back to Start Menu: ");
    	
    	//Get User Input
    	choice = userChoice(2);
    	
    	if (choice == 2) //Goes Back to Start Menu
    		startGame();
    		
    	else if (choice == 1) //Continues with Quiz
    	{
    		
    		//Loops Until All Questions Are Asked
    		do
    		{
    			
    			//Picks a Question
    			random = (int)((15-1+1) * Math.random() + 1);
    	
	    		if (random == 1 && q1 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("COMPUTER MEMORY QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("Which type of memory is accessed the fastest by the CPU?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. RAM", "2. ROM");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Cache", "4. Hard Disk\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 3){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");	
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 3. Cache.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q1 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();		
	   	 		}
	   	 		
	    		else if (random == 2 && q2 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("COMPUTER MEMORY QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What is the process of using small amounts of fast, expensive");
	    			System.out.println("memory and large amounts of slow, cheap memory to support it?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Pipelining", "2. Tiering");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Burst Mode", "4. Latency\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 2){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else{ //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 2. Tiering.");	
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q2 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    		
	    		else if (random == 3 && q3 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("COMPUTER MEMORY QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What is the process in which several bits of data are read");
	    			System.out.println("together because the CPU is predicted to continue working from");
	    			System.out.println("the same series of memory addresses, in which only the first bit");
	    			System.out.println("experiences the entire effect of latency?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Bus Cycling", "2. Pipelining");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Purging", "4. Burst Mode\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 4){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 4. Burst Mode.");	
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q3 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 4 && q4 == false){ //If Question is Selected and Has Not Been Asked Before
	    		
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("HARD DISK / FLOPPY DISK QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What part of the hard disk is a concentric circle?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Sector", "2. Track");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Cluster", "4. Platter\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 2){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 2. Track.");	
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q4 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 5 && q5 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("HARD DISK / FLOPPY DISK QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What is the process of establishing tracks and sectors on the platter");
	    			System.out.println("called?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Data-Capacitating", "2. Voice Coiling");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. High-Level Formatting", "4. Low-Level Formatting\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 4){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 4. Low-Level Formatting.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q5 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 6 && q6 == false){ //If Question is Selected and Has Not Been Asked Before
	   			
	   				//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("HARD DISK / FLOPPY DISK QUESTION\n");

	    			//Prints Out Question and Choices
	    			System.out.println("A floppy disk has a thin plastic base material that is covered in iron");
	    			System.out.println("oxide, which is what kind of a material?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Magnetic", "2. Ferromagnetic");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Ferrimagnetic", "4. Non-Magnetic\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 2){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 2. Ferromagnetic.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q6 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    		
	    		else if (random == 7 && q7 == false){ //If Question is Selected and Has Not Been Asked Before
	    		
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("CDS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What process allows a CD Drive to recover from a scratch or speck on a disc");
	    			System.out.println("that can cause packets of bytes to be misread?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Interleaving", "2. Eight-Fourteen Modulation");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Subcoding", "4. Error-Correcting Codes\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 1){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 1. Interleaving.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q7 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 8 && q8 == false){ //If Question is Selected and Has Not Been Asked Before
	    		
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("CDS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("When would the CD be spinning slowest and at what speed would it be spinning");
	    			System.out.println("at when it is being read?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Farthest from the Centre at 250 RPM", "2. Closest to the Centre at 250 RPM");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Farthest from the Centre at 200 RPM", "4. Closest to the Centre at 200 RPM\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 3){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 3. Farthest from the Centre at 200 RPM.");	
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q8 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 9 && q9 == false){ //If Question is Selected and Has Not Been Asked Before
	    		
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("CDS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("How many tracks does a CD have?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Five Round Tracks.", "2. Ten Round Tracks");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Two Spiral Tracks", "4. One Spiral Track\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 4){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 4. One Spiral Track.");	
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q9 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 10 && q10 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("BIOS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("BIOS is what type of memory?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. RAM", "2. Flash Memory");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Virtual Memory", "4. Cache\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 2){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 2. Flash Memory.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q10 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();	
	    		}
	    		
	    		else if (random == 11 && q11 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("BIOS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What provides detailed information specific to your system that can be modified as your system changes?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Device Drivers", "2. BIOS");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. CMOS", "4. Interrupt Handlers\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 3){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 3. CMOS.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q11 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    			
	    		else if (random == 12 && q12 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("BIOS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What is the purpose of interrupt handlers?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Translate Between Hardware", "2. Perform Power-On Self Test");
	    			System.out.println("  and Operating System");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Identify Base Hardware Components", "4. Determine What Devices Are Bootable\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 1){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 1. Translate Between Hardware and Operating");	
	    				System.out.println("System.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q12 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    		
	    		else if (random == 13 && q13 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("CD BURNERS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("Which CD is encoded using a laser that melts or crystallizes a phase-change");
	    			System.out.println("compound to encode 1's (crystal) and 0's (liquid)?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. CD-RWs", "2. CD-R");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Manufactured CDs", "4. All of the Above\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 1){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 1. CD-RWs.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q13 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    		
	    		else if (random == 14 && q14 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + counter);
	    			System.out.println("CD BURNERS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("How many times can a CD-R be rewritten?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. 0 Times", "2. 1 Time");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. 5 Times", "4. Infinite Times\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 1){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 1. 0 Times.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q14 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    		
	    		else if (random == 15 && q15 == false){ //If Question is Selected and Has Not Been Asked Before
	    			
	    			//Prints Asterisks
	    			asteriskPrinter();
	    			
	    			//Prints Out Points, Question Number, and Topic
	    			System.out.println("You have: " + points + " points.");
	    			System.out.println("Question " + (counter));
	    			System.out.println("CD BURNERS QUESTION\n");
	    			
	    			//Prints Out Question and Choices
	    			System.out.println("What is the most powerful laser in a CD-Burner?");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "1. Read Laser", "2. Write Laser");
	    			System.out.println();
	    			System.out.format("%-40s %-40s", "3. Erase Laser", "4. They Are All Equally Powerful\n");
	    			
	    			//Get User Input
	    			choice = userChoice(4);
	    			
	    			if (choice == 2){ //If User Selects Correct Option
	    			
	    				//Increase Points and Tell User New Points Amount
	    				points += VALUE;
	    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
	    				
	    			} 
	    				  			
	    			else { //If User Choice is Incorrect
	    			
	    				//Tells User Correct Option and Takes Away Points
	    				points -= VALUE;
	    				System.out.println("Incorrect! The correct answer is 2. Write Laser.");
	    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");	
	    			}
	    			
	    			//Makes Question Unaskable Again
	    			q15 = true;
	    			
	    			//Counts Question
	    			counter++;
	    			
	    			//Continues to Next Question		
	    			System.out.print("Enter any characters to continue: ");
	    			input.nextLine();
	    			input.nextLine();
	    		}
	    		
	    	}while (counter <= 15); 
	    	
	    	//Prints Asterisks
	    	asteriskPrinter();
	    	
	    	//Prints Options
	    	System.out.println("Congradulations on completing the Quiz. Enter 1 to continue to the end of");
	    	System.out.println("the game or enter 2 to go to the Bonus Quiz, where points are worth double!");
	    	
	    	//Gets User Input
	    	choice = userChoice(2);
	    	
	    	if (choice == 1) //Goes to the End of the Game
	    		endGame(points);

	    	else if (choice == 2) //Goes to the Bonus Quiz
	    		bonusQuiz(points);
    	}
    }
    
    public static void bonusQuiz(int points){
    	
    	//Declare Variables
    	int random;
    	int choice;
    	int counter = 1;
    	final int VALUE = 1000;
    	//Boolean Variables to Check if a Question has been Asked Yet
    	boolean q1 = false, q2 = false, q3 = false;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Title and Instructions for Bonus Quiz
    	System.out.println("BONUS QUIZ\n");
    	System.out.println("Welcome to the Bonus Quiz. ");
    	System.out.println("Points are now worth 1000, 2X the points from the Quiz.");
    	System.out.println("This means that you have a chance to win a large amount");
    	System.out.println("of points, but also lose a large amount of points.\n");
    	
    	System.out.print("Enter any key to continue: ");
    	input.nextLine();
    	input.nextLine();
    	
    	do
    	{
    		//Picks a Question
    		random = (int)((3-1+1) * Math.random() + 1);
    	
    		if (random == 1 && q1 == false){ //If Question is Selected and Has Not Been Asked Before
    			
    			//Prints Asterisks
    			asteriskPrinter();
    			
    			//Prints Points and Bonus Question Number
    			System.out.println("You have: " + points + " points.");
    			System.out.println("Bonus Question " + counter + "\n");
    			
    			//Prints Out Question and Choices	
    			System.out.println("Who invented the Java programming language?");
    			System.out.println();
    			System.out.format("%-40s %-40s", "1. James Gosling", "2. Jonathan Schwartz");
    			System.out.println();
    			System.out.format("%-40s %-40s", "3. Tim Bray", "4. Steve Jobs\n");
    			
    			//Get User Input
    			choice = userChoice(4);
    			
    			if (choice == 1){ // If User Selects Correct Option
    				
    				//Increases Points and Tells User New Total
    				points += VALUE;
    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
    			}   
    							
    			else{ //If User Selects Incorrect Option
    			
    				//Decreases Points and Tells User New Total
    				points -= VALUE;
    				System.out.println("Incorrect! The correct answer is 1. James Gosling.");
    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
    			}	
    			
    			//Makes Question Unaskable Again
    			q1 = true;
    			
    			//Counts Question
    			counter++;		
    			
    			//Continues to Next Question	
    			System.out.print("Enter any characters to continue: ");
    			input.nextLine();
    			input.nextLine();
    				
	   	 	}
	    	else if (random == 2 && q2 == false){ //If Question is Selected and Has Not Been Asked Before
	    		
	    		//Prints Asterisks
    			asteriskPrinter();
    			
    			//Prints Points and Bonus Question Number
    			System.out.println("You have: " + points + " points.");
    			System.out.println("Bonus Question " + counter + "\n");
    			
    			//Prints Out Question and Choices	
    			System.out.println("What was the fastest supercomputer in the world in 2015?");
    			System.out.println();
    			System.out.format("%-40s %-40s", "1. Sequoia", "2. Titan");
    			System.out.println();
    			System.out.format("%-40s %-40s", "3. Tianhe-2", "4. K Computer\n");
    			
    			//Get User Input
    			choice = userChoice(4);
    			
    			if (choice == 3){ // If User Selects Correct Option
    				
    				//Increases Points and Tells User New Total
    				points += VALUE;
    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
    			}   
    							
    			else{ //If User Selects Incorrect Option
    			
    				//Decreases Points and Tells User New Total
    				points -= VALUE;
    				System.out.println("Incorrect! The correct answer is 3. Tianhe-2.");
    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
    			}	
    					
    			//Makes Question Unaskable Again
    			q2 = true;
    			
    			//Counts Question
    			counter++;		
    			
    			//Continues to Next Question	
    			System.out.print("Enter any characters to continue: ");
    			input.nextLine();
    			input.nextLine();
	    	}
	    	else if (random == 3 && q3 == false){ //If Question is Selected and Has Not Been Asked Before
	    		
	    		//Prints Asterisks
    			asteriskPrinter();
    			
    			//Prints Points and Bonus Question Number
    			System.out.println("You have: " + points + " points.");
    			System.out.println("Bonus Question " + counter + "\n");
    			
    			//Prints Out Question and Choices	
    			System.out.println("What is the diameter of a standard CD?");
    			System.out.println();
    			System.out.format("%-40s %-40s", "1. 4.7 Inches", "2. 4.8 Inches");
    			System.out.println();
    			System.out.format("%-40s %-40s", "3. 4.9 Inches", "4. 5.0 Inches\n");
    			
    			//Get User Input
    			choice = userChoice(4);
    			
    			if (choice == 1){ // If User Selects Correct Option
    				
    				//Increases Points and Tells User New Total
    				points += VALUE;
    				System.out.println("Correct! You recieved " + VALUE + " points. You now have " + points + " points.");
    			}   
    							
    			else{ //If User Selects Incorrect Option
    			
    				//Decreases Points and Tells User New Total
    				points -= VALUE;
    				System.out.println("Incorrect! The correct answer is 1. 4.7 Inches.");
    				System.out.println("You have lost " + VALUE + " points. You now have " + points + " points.");
    			}	
    					
    			//Makes Question Unaskable Again
    			q3 = true;
    			
    			//Counts Question
    			counter++;		
    			
    			//Continues to Next Question	
    			System.out.print("Enter any characters to continue: ");
    			input.nextLine();
    			input.nextLine();
	    	}
	    	
    	}while (counter <=3); //Loops Until ALl 3 Question Have Been Asked
    	
    	//Continues to End Game Page
    	asteriskPrinter();
    	
    	//Goes to End Game After User Enters 1
    	do{
    		System.out.println("Congradulations. You have completed the Bonus Quiz. Enter 1 to continue");
    		System.out.print("to the end of the game: ");
    		choice = input.nextInt();
    	}while (choice != 1);
    	
    	endGame(points);
    }
    
    public static void endGame(int points){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Title
    	System.out.println("END GAME\n");
    	
    	if (points > 0){ //If the User Has Scored Points
    		
    		//Congradulations
    		System.out.println("Congradulations " + userName + "! You have completed the game with " + points + " points!");
    		
    		//Prints Fireworks
    		System.out.println("                                   .''.");       
			System.out.println("       .''.      .        *''*    :_\\/_:     . ");
			System.out.println("      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.");
			System.out.println("  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-");
			System.out.println(" :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'");
			System.out.println(" : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *");
			System.out.println("  '..'  ':::'     * /\\ *     .'/.\\'.   '");
			System.out.println("      *            *..*         :");
			System.out.println("       *");
			System.out.println("       *");
			
    	}
    	
    	else if (points <= 0){ //If the User Has Not Scored Points
    		
    		//Displays Sorry Message
    		points = 0;
    		System.out.println("Sorry " + userName + ", you finished the game with " + points + " points.");
    		System.out.println();
    		
    		//Prints Sad Face
    		System.out.println("                       ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
			System.out.println("                    ¶¶¶___________________¶¶¶¶");
			System.out.println("                ¶¶¶_________________________¶¶¶¶");
			System.out.println("              ¶¶______________________________¶¶¶");
			System.out.println("           ¶¶¶_________________________________¶¶¶");
			System.out.println("         ¶¶_____________________________________¶¶¶");
			System.out.println("        ¶¶_________¶¶¶¶¶___________¶¶¶¶¶_________¶¶");
			System.out.println("      ¶¶__________¶¶¶¶¶¶__________¶¶¶¶¶¶_________¶¶");
			System.out.println("     ¶¶___________¶¶¶¶____________¶¶¶¶___________¶¶");
			System.out.println("    ¶¶___________________________________________¶¶");
			System.out.println("   ¶¶___________________________________________¶¶");
			System.out.println("  ¶¶____________________¶¶¶¶____________________¶¶");
			System.out.println(" ¶¶_______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______________¶¶");
			System.out.println(" ¶¶____________¶¶¶¶___________¶¶¶¶¶___________¶¶");
			System.out.println("¶¶¶_________¶¶¶__________________¶¶__________¶¶");
			System.out.println("¶¶_________¶______________________¶¶________¶¶");
			System.out.println("¶¶¶______¶________________________¶¶_______¶¶");
			System.out.println("¶¶¶_____¶_________________________¶¶_____¶¶");
			System.out.println(" ¶¶¶___________________________________¶¶");
			System.out.println("  ¶¶¶________________________________¶¶");
			System.out.println("   ¶¶¶____________________________¶¶");
			System.out.println("    ¶¶¶¶______________________¶¶¶");
			System.out.println("       ¶¶¶¶¶_____________¶¶¶¶¶");
    		System.out.println("            ¶¶¶¶¶¶¶¶¶¶¶¶¶");
    		System.out.println();
    		
    		System.out.println("Better luck next time!");
    	}
    	
    	System.out.println();
    	
    	//Waits For User to Continue
    	System.out.print("Enter any key to continue: ");
    	input.nextLine();
    	input.nextLine();

    	System.out.println();
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Prints Out Menu
    	System.out.println("1. Go back to Main Menu");
    	System.out.println("2. Go back to Learn About Page.");
    	System.out.println("3. Retake the Quiz.");
    	System.out.println("4. Exit");
    	
    	//Gets User Input
    	choice = userChoice(4);
    	
    	if (choice == 1) //Goes to Main Menu
    		mainMenu();
    	else if (choice == 2) //Goes to Learn About Page
    		learn();
    	else if (choice == 3) //Retakes Quiz
    		quiz();
    	else if (choice == 4){ //Displays Message and Exits Program
    	
    		System.out.println("Thank you for using the Computer Blasters Program.");
    		System.out.println("Have a nice day!");
    	}
    }
    
    public static void asteriskPrinter(){
    	
    	
    	System.out.println();
    	
    	//Prints a line of aterisks
    	for (int i = 1; i <=80; i++){
    		System.out.print("*");
    	}
    	
    	
    	System.out.println();
    }
    
    public static int userChoice(int upperLimit){
    	
    	//Declare Variables
    	int choice;
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Get Valid User Input and Return Choice
    	do
    	{
    		System.out.print("What would you like to select? ");
    		choice = input.nextInt();
    		
    	}while(choice < 1 || choice > upperLimit);
    	
    	return choice;
    		
    }
    
    public static void main(String[] args) {
    	
    	//Prints Asterisks
    	asteriskPrinter();
    	
    	//Get User Name and Welcome
    	System.out.print("Enter your name: ");
    	userName = input.nextLine();
    	System.out.println("Welcome " + userName + " to Computer Blasters!\n" + "To select an option, enter the number next to the option.");
    	
    	//Goes to the Main Menu
    	System.out.print("Enter any key to continue: ");
    	input.nextLine();
    	mainMenu();
    
    }
}
