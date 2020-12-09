class Main {
  public static void main(String[] args) {
    // Declare an Array
    int[] arr1 = new int[10];
    System.out.println("The array has " + arr1.length + " slots");
    // Defaults all slots to 0

    //Modify what is being stored
    arr1[1] = 50;
    arr1[arr1.length - 1] = 100;
    arr1[0] = arr1[1] + arr1[arr1.length - 1];
    arr1[2]++;
    arr1[1]--;

    // Print the contents of the Array
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }

    //Fill an array with values using a loop
    System.out.println("======================");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i;
    }

    //Print the contents of the array
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }

    //Decalre and initialize an array with values
System.out.println("======================");
    int[] arr2 = { 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

  }
}