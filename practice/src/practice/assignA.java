package practice;

import java.util.ArrayList;

public class assignA {
public static void main(String[] args) {
		
		ArrayList sportsTypes = new ArrayList();
			
		//Adding elements
		sportsTypes.add("Football");
		sportsTypes.add("Basketball");
		sportsTypes.add("Soccer");
		sportsTypes.add("Golf");
		sportsTypes.add("Hockey");
		
		System.out.println(sportsTypes);
		
		sportsTypes.remove("Football");
		sportsTypes.remove("Basketball");
		sportsTypes.remove("Golf");
		
		System.out.println(sportsTypes);

	}

}
