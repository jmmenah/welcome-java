/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints 10 times "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/

public class TenUseArgument {

    public static void main(String[] args) {
	int i;
	for (i=1; i<=10; i++) {
	    System.out.println( i +" Hi, "+args[0]+" "+args[1]+". How are you?");
	}
	// out loop
	System.out.println("i= "+ i);

	
	/*System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	System.out.println( "Hi, "+args[0]+" "+args[1]+". How are you?");
	*/
    }

}
