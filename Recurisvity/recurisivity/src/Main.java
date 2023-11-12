
public class Main {

	public static void main(String[] args) {
		String tecnologies[] = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		String word = "supercalifragilisticoespialidoso";
		int i = word.length() -1;
		int num2 = 33;
		char[] text = word.toCharArray();
		Main m = new Main();
//			m.moveInTecnologies(tecnologies,i);
//			System.out.println();
//			m.moveToHTML(tecnologies,i);
//			m.fibonnacci(0,1);
//			m.reverse(text,i);
		int resultado = m.sum( num2);
		System.out.println( resultado);
		
    }
	public boolean moveInTecnologies(String[] tec, int i){
		
		System.out.println(tec[i]);
		i++;
		if(i < tec.length) {
			moveInTecnologies(tec, i);
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public boolean moveToHTML(String[] tec, int i) {
	    if (i < tec.length && i != 3) {
	        System.out.println(tec[i]); 
	        i++;
	        moveToHTML(tec, i);
	        return true;
	    } else {
	        return false;
	    }
	    }
	  public void fibonnacci(int num, int prev) {
	        System.out.println(num);

	        int next = num + prev;

	        if (next <= 55) {
	            fibonnacci(next, num);
	        }
	    }
	  public void reverse (char[] w,int i) {
		  System.out.print(w[i]);
		  i--;
		  if (i >= 0) {
			  reverse(w, i);
		}
		  
		  
		  
	  }
	  public int sum( int n) {
		  if (n != 0) {
			  return n % 10 + sum(n/10);
			
		}
		  else {
			  return 0;
		  }
		  
	  }
	  
	  
	  
	    	
	


}