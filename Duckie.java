public class Duckie {

	public static void main( String argv[] ) {

		int howManyTimesToPrint = 5;
		int begin = 0;
	
		/*
		for ( int i = begin; i < howManyTimesToPrint; i++ )
			System.out.println( "Hello World !" + argv[0] );
		*/

		//System.out.println( argv[0] + " is smarter than " + argv[1] );

		System.out.println( "sum of " + argv[0] + " and " + argv[1] + " is " + (Integer.parseInt(argv[0]) + Integer.parseInt(argv[1])));

		Dog space = new Dog( " Turtley " );
		space.canRun();
		space.canBark();
		space.canSleep(argv[4]);
		space.canFetch(" a " + argv[2] + " ball");
        space.canSwim( argv[3]);
	}



}

class Dog {

	String name;

	Dog( String name ) {
		this.name = name;	
	}

	void canSwim(String speed) {
		System.out.println( this.name + " can swim " + speed );
	}

	void canSleep(String time ) {
		System.out.println( this.name + " can sleep for " + time);
	}

	void canBark() {
		System.out.println( this.name + " can bark" );
	}

	void canRun() {
		System.out.println( this.name + " can run" );
	}

	void canFetch(String thing) {
		System.out.println( this.name + " can fetch" + thing );
	}
}