package vacationapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("Vacation-REQUESTS");

	public void execute(DelegateExecution execution) throws Exception {
//		Random rando = new Random();
//		boolean randoVar = rando.nextBoolean();
		
		boolean randoVar = false;
		
		Double dayVar = (Double) execution.getVariable("day");
		if ( dayVar % 2 == 0 )
	        randoVar = true;
	     else
	    	 randoVar = false;

		execution.setVariable("vacationApproved", randoVar);

		LOGGER.info("\n-------------------------------------------------------");
		
		LOGGER.info("\nRajat Testing : " + "\nCustomer Name : " + execution.getVariable("customerName") + "\nDay : "
				+ execution.getVariable("day") + "\nCondition : " + randoVar);
		
		if (randoVar == true)
			LOGGER.info("\nVacation Approved because date is even.");
		else
			LOGGER.info("\nVacation Rejected because date is odd.");
		
		LOGGER.info("\n-------------------------------------------------------");
	}
}