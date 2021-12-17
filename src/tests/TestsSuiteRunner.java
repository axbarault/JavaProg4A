package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestsSuiteRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(TestsSuite.class);
		
		for (Failure fail : result.getFailures()) // Affiche les probl�mess 
		{
			System.out.println(fail.toString());
		}
		
		if (result.wasSuccessful()) // Si aucun probl�me 
		{
			System.out.println("All tests finished successfully...");
		}
	}
}