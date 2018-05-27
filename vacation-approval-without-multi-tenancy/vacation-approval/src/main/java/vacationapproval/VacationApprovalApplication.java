package vacationapproval;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication("Vacation Approval App")
public class VacationApprovalApplication extends ServletProcessApplication {
	private static final String PROCESS_DEFINITION_KEY = "vacationapproval";

	  @PostDeploy
	  public void onDeploymentFinished(ProcessEngine processEngine) {

	  }
}