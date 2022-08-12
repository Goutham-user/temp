package io.maven.unittestcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class RunnerTest {
	Runner runner = null;
	RunnerInterface service = mock(RunnerInterface.class);
	
	@Before
	public void setUp() {
		System.out.println("\nRunning setUp...");
		runner = new Runner(service);
	}

	@Test
	public void sumReturnsCorrectResult1() {
		System.out.println("Running sumReturnsCorrectResult..." + runner.perform(1,2));
		
		int expected = 2;

		when(runner.perform(1,2)).thenReturn(2);
		
		assertEquals(expected, runner.perform(1,2));
	}
	@Test
	public void sumReturnsCorrectResult2() {
		System.out.println("Running sumReturnsCorrectResult...");
		
		int expected = 1;
		
		when(runner.perform(2,3)).thenReturn(3);
		
		assertEquals(expected, runner.perform(2,3));
	}
	@Test
	public void sumReturnsCorrectResult3() {
		System.out.println("Running sumReturnsCorrectResult...");

		int expected = 4;
		
		when(runner.perform(4,5)).thenReturn(4);
		
		assertEquals(expected, runner.perform(4,5));
	}
	
	@After
	public void tearDown() {
		System.out.println("\nRunning tearDown...");
	}
	

}
