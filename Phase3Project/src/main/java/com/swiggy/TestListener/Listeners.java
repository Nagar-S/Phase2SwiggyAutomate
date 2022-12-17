package com.swiggy.TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Pass");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Fail");
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Pass percentage");
	}
	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Execution Started");
	}
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Execution Ended");
	}
}
