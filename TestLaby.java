import iut.algo.Clavier;

public class TestLaby 
{
	public static void main(String[] a)
	{
		Labyrinthe laby = new Labyrinthe(2,1);
		char dir;
		
		
		while (true)
		{
			System.out.println ( laby );
			
			System.out.println ( "direction ( N O S E )  : ");
			dir = Clavier.lire_char();
			
			laby.deplacer ( dir );
			
		}
	}
}