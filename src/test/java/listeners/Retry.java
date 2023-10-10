package listeners;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry implements IRetryAnalyzer {
    int retryCount = 0;
    int maxRetryCount = 1;
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
