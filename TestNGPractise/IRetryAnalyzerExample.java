package TestNGPractise;


import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetryAnalyzerExample
{

    @Test
    public void m1()
    {
        Assert.assertEquals(1,5);
    }
    @Test
    public void m2()
    {
        Assert.assertEquals(1,1);
    }
}

