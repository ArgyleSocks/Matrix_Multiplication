package askjdf;
public class etal {
 
 static int[][] meme = new int[4][2];
 static int[][] joke = new int[2][3];
 static int[][] boi;
 
 public static void main(String args[]) {
  for(int i = 0; i < meme.length; i++) {
   for(int j = 0; j < meme[i].length; j++) {
    meme[i][j] = 5;
   }
  }
  System.out.println(meme.length);
  System.out.println(meme[0].length);
  System.out.println(joke.length);
  System.out.println(joke[0].length);
  for(int i = 0; i < joke.length; i++) {
   for(int j = 0; j < joke[i].length; j++) {
    joke[i][j] = 2;
   }
  } 
   
  		
  
  boi = new int[meme.length][joke[0].length];
  	
  	for(int i = 0; i < meme.length; i++) {
  		System.out.println("i" + i);
  		for(int x = 0; x < joke[0].length; x++) {
  			System.out.println("x" + x);
  			for(int j = 0; j < meme[0].length; j++) {
  				System.out.println("j" + j);
  				boi[i][x] = boi[i][x] + (meme[i][j]*joke[j][x]);
  				System.out.println(boi[i][x]);
  			}
  		}
  	}
  	for(int i = 0; i < boi.length; i++) {
  		for(int j = 0; j < boi[j].length; j++) {
  			System.out.println(boi[i][j]);
  		}
  	}
  
    }
}