import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GitDemoUnitTests
{
  @Test
  public void testSum()
  {
    int[] testArr = { 1, 2, 3 };
    int expectedSum = 6;
    assertEquals(expectedSum, GitDemo.getSum(testArr));
  }
  
  @Test
  public void testMean()
  {
    int[] testArr = { 1, 2, 3 };
    float expectedMean = 2f;
    assertEquals(expectedMean, GitDemo.getMean(testArr));
  }
}
