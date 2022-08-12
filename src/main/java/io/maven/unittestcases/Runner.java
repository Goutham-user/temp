package io.maven.unittestcases;


public class Runner {
	public RunnerInterface service;
	 
	public Runner(RunnerInterface service) {
		this.service = service;
	}

	public int perform(int number1, int number2) {
		return service.sum(number1, number2);
	}
	

}
