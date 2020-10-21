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
}
