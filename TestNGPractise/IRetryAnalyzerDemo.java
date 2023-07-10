package TestNGPractise;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerDemo implements IRetryAnalyzer
{
    int count = 0;
    int retry =3;

    @Override
    public boolean retry(ITestResult iTestResult)
    {
        if(count<retry)
        {
           count++;
           return true;
        }
        return false;
    }
}
