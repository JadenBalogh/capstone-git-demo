public class GitDemo
{
  public static void main(String[] args)
  {
    int[] myArr = { 1, 2, 3, 4 };
    System.out.println("The sum of " + getDebugString(myArr) + " is " + getSum(myArr));
    System.out.println("The mean of " + getDebugString(myArr) + " is " + getMean(myArr));
  }

  public static int getSum(int[] arr)
  {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    return sum;
  }

  public static float getMean(int[] arr)
  {
    return (float) getSum(arr) / arr.length;
  }

  public static String getDebugString(int[] arr)
  {
    String result = "[";
    for (int i = 0; i < arr.length; i++)
    {
      result += arr[i];
      if (i < arr.length - 1)
      {
        result += ",";
      }
    }
    result += "]";
    return result;
  }
}