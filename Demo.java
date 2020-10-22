public class Demo
{
  public static void main(String[] args)
  {
    if (args.length == 0)
    {
      printLoop(5);
    }
    else
    {
      printLoop(Integer.parseInt(args[0]));
    }
    //int[] five = new int[5]; //testing arrToString
    //five[0] = 2; //testing arrToString
    //five[1] = 4; //testing arrToString
    //five[2] = 3; //testing arrToString
    //five[3] = 1; //testing arrToString
    //five[4] = 7; //testing arrToString
    //System.out.println(arrToString(five)); //should print {2, 4, 3, 1, 7}
    //testing arrayDeepToString
    //int[][] twod = {{1, 2, 3}, {5,5,5,5,5}, {8, 2, 3, 1}, {1}}; //testing arrayDeepToString
    //System.out.println(arrayDeepToString(twod).replace("}, ","},\n ")); //testing arrayDeepToString
    //testing create2DArray
    //System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ","},\n ")); //testing create2DArray
    //System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ","},\n ")); //testing create2DArray
    //System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ","},\n ")); //testing create2DArray
    //System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ","},\n ")); //testing create2DArray
  }
  public static void printLoop(int n)
  {
    for (int i = 1; i <= n; i++)
    {
      for (int j = i; j < n+1; j++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static String arrToString(int[] arr)
  {
    String stringarr = "{";
    for (int i = 0; i < arr.length; i++)
    {
      if (i == arr.length - 1)
      {
        stringarr = stringarr + arr[i];
      }
      else
      {
        stringarr = stringarr + arr[i];
        stringarr = stringarr + ", ";
      }
    }
    stringarr = stringarr + "}";
    return stringarr;
  }
  public static String arrayDeepToString(int[][] arr)
  {
    String stringarr = "{";
    for (int subarray = 0; subarray < arr.length; subarray++)
    {
      if (subarray != arr.length - 1)
      {
        stringarr = stringarr + arrToString(arr[subarray]);
        stringarr = stringarr + ", ";
      }
      else
      {
        stringarr = stringarr + arrToString(arr[subarray]);
      }
    }
    stringarr = stringarr + "}";
    return stringarr;
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue)
  {
    int[][] twod = new int[rows][cols];
    for (int subarray = 0; subarray < twod.length; subarray++)
    {
      for (int element = 0; element < cols; element++)
      {
        twod[subarray][element] = (int) Math.round(Math.random() * maxValue);
      }
    }
    return twod;
  }
}
