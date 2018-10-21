package arnau;
import cat.almata.daw.utils.Log;

public class ProvaUtils {

	public static void main(String[] args) {

		try{
			System.out.println("------ Testing DAW Utils ---");

			System.out.println("--- Testing Log class ---"); 
			Log logTest = new Log("logTest.log");

			System.out.println("Going to write an Info");
			logTest.info("Some information to write in the log");

			System.out.println("Going to write a Warning");
			logTest.warning("Some warning to write in the log");
			
			System.out.println("Going to write an Error");
			logTest.error("Some error to write in the log");


		}catch(Exception e){
			//System.out.println("An Exception has been thrown, with message:" + e.getMessage());
			e.printStackTrace();
		}
	}

}
