
import java.io.*;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.print("Enter the name of plan for wich the bill will be genterated:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		
		System.out.print("Enter the number of units for bill will be calcuated:");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		System.out.print("Bill amount for "+planName+" of "+units+" units is ");
		p.getRate();
		p.calculateBill(units);	
	}

}
