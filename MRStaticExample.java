package Java_8;


interface Print{  
    void print(String msg);  
}   
public class MRStaticExample {
	   public static void printMsg(String name){  
		   if(name!=null) {
				System.out.println("Hello "+name);
			}else {
				System.out.println("No name provided");
			} 
	    }  
	public static void main(String[] args) {
		
		Print print=MRStaticExample::printMsg;
		print.print("Ram");

	}

}
