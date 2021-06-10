
public class FooBar {

	public static void main(String[] args) {
		FooBar fb=new FooBar();
		
		fb.fooBar(-1);
		fb.fooBar(150);
	}
	
	public void fooBar(int end) {
		//output variable
		String output="";
		
		//check for invalid endpoints to avoid errors
		if(end<=0) {
			System.out.println("Invalid Endpoint: Must be greater than 0.");
		}
		
		//here's the meat of the code
		else {
			//loop until you hit the endpoint + 1 so you include everything
			//i<=1 also works
			for(int i = 1; i < end+1;i++) {
				//set output to initial state
				output="";
				//check for modulus 5 == 0
				if(i%5==0) {
					output+="Foo";
					
					//check for both conditions
					if(i%3==0) output+="Bar";
				}
				
				//check for modulus 3 == 0
				else if(i%3==0) output+="Bar";
				
				//failsafe
				else output+=i;
				
				//output time :)
				System.out.println(output);
			}
		}
		
	}

}
