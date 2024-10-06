package week4SourceMaterial;

public class CodingProject {

  public static void main(String[] args) {
    
    //1a)
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //created an array of int named ages. it holds 8 elements of type int
    System.out.println("1a) " + (ages[ages.length - 1] - ages[0]) ); //printing the difference of the last int value in the array minus the first int value in the array
   
    //1b)
    int[] ages2 = new int[9]; //declaring an array of int call ages2 with 9 elements
    ages2[0] = 6;
    ages2[1] = 56;
    ages2[2] = 30;
    ages2[3] = 501;
    ages2[4] = 51;
    ages2[5] = 15;
    ages2[6] = 75;
    ages2[7] = 4;
    ages2[8] = 25;
    
    System.out.println("1b) " + (ages2[ages2.length - 1] - ages2[0]) ); //printing the difference of the last int value in the array minus the first int value in the array. using the .length method of the Array allows us to find the last element in the array by passing through .length - 1 as the index  
    //calling the .length on an Array returns the the number of elements in the Array
    
    //1c)
    double count = 0.0; //declaring a variable called count. we can use this variable to add up the values of the int Array
    for(int age : ages2) { //this enhanced for loop reads "for every age in the array ages2 count = count + age." 
      count += age; // We'll iterate through the entire array adding the ages together till we reach the end
    }
    System.out.println("1c) The average age is: " + count / ages2.length); //now that count represents the sum of all the ages in the array we'll divide by the number of elements in the array to get the average age
    
    
    //2)
    String[] names = {"Sam", "Tommy",  "Tim", "Sally", "Buck", "Bob"}; //here we declared an array and assigned 6 String values as elements
    int count2 = 0;
    for(String name : names) { //this enhanced for loop will iterate through the entire array
       count2 += name.length(); // with each iteration we are adding the elements to each other one after another
    }
    System.out.println("2a) The average length of each name is: " + count2 / names.length) ; //this will result in the average length of the names in the array rounded to the next integer
    
    StringBuilder allNames = new StringBuilder(""); //StringBuilder is a class that does exactly what it says. we'll use this to build the string
    for(String name : names) {
      allNames.append(name + " "); //.append() appends the object passed through to the end of the StringBuilder essentially concatenating a new string for us
    }
    System.out.println("2b) " + allNames.toString() );
    
    
    //3)
    /* array[array.length - 1] */ // how to get the last element in an array
    
    
    //4)
    /* arr[0] */ //how to get the first element in an array
    
    
    //5)
    int[] nameLengths = new int[names.length]; //declaring a new array of int called nameLengths, this is going to be as log as the names array used earlier
    
    int count3 = 0;
    for(String name : names) { //for every name in the names array
      nameLengths[count3] = name.length(); //each element in the namelengths array will match the length of characters of the element in the corresponding index of the names array
      count3++; // at the end of the loop we will increase count3 by 1 so we can update the next index in nameLength array
    }
    System.out.println("5) " + nameLengths[3]);
    
    
    //6)
    int count4 = 0;
    for(int nameLength : nameLengths) { 
      count4 += nameLength; //with iteration thru the loop the value of eavh element in nameLengths is being added up
    }
    System.out.println("6) The sum of the all the elements in the array is: " + count4);
   
   //7) TEST
    String word = "Hello";
    int n = 3;
    String newWord = repeat3Times(word, n); //we called the method repear3Times because the instructions have been written to return the result we want from the 2 arguments
    System.out.println("7) " + newWord); //the method repeat3times concatenates word as many times as the value stored in n
    
    
    //8) TEST
    String firstName = "Zel";
    String lastName = "Hogan";
    String fullName = createFullName(firstName, lastName); //this method will take ehatever strings are passed in as arguments and create a new string that combines the 2 strigns with a space in the middle
    System.out.println("8) " + fullName);
    
    
    //9) TEST
    int[] nums = {10, 40, 92, 3};
    boolean over100 = isMoreThan100(nums); // 
    System.out.println("9) " + over100); // equal to System.out.println("9) " + isMoreTHan100(nums); in this case we pass in the method direclty into our println rather than using the variable made for to represent that same method
    
    
    //10) TEST
    double[] scores = {9.9, 10.0, 3.9, 8.8, 5.0};
    double averageScore = calculateAverage(scores);
    System.out.println("10) " + averageScore);
    
    
    //11) TEST
    double[] prices = {10.99, 15.95, 60.01, 96.60};
    double[] grades = {100.00, 99.99, 81.2, 60.0, 0.0};
    boolean gradesAreHigher = isGreaterThan(prices, grades);
    System.out.println("11) " + gradesAreHigher);
    
    
    //12) TEST
    boolean isHotOutside = false;
    double pocketMoney = 13.00;
    boolean willDrink = willBuyDrink(isHotOutside, pocketMoney);
    System.out.println("12) " + willDrink);
    
    
    //13) TEST
    boolean itsHotOutside = true;
    boolean wokeUpEarly = false;
    int timeOfDay = 700;
    boolean willHeSwim = willSwim(itsHotOutside, wokeUpEarly, timeOfDay);
    if(willHeSwim) {
      System.out.println("13) Let's go for a dip!");
    }else {
      System.out.println("13) No thanks I'm going back to bed.");
    }
    
  }
  
  //7) METHOD
  public static String repeat3Times(String word, int n) {
    StringBuilder str = new StringBuilder();
    for(int i = 0; i < n; i++) {
      str.append(word);
    }
  return str.toString();
 
  
  }
  
  //8) METHOD
  public static String createFullName(String firstName, String lastName) {
    return firstName + " " + lastName; // this method takes 2 strings and creates a new string that combines the 2 with space in the middle
    
  }
  
  //9) METHOD
  public static boolean isMoreThan100(int[] nums) {
    int sum = 0;
    for(int num : nums) {
      sum += num;
    }
    if(sum > 100) { //here we are writing instructions to return a true or false boolean that tells us if the sum of the numbers in the int array is more than 100
      return true;
    }else {
      return false;
    }
  }
  
  //10) METHOD
  public static double calculateAverage(double[] scores) {
    double sum = 0.0;
    for(double score : scores) {
      sum += score; //the for loop allows us to add all the values together
    }
    return sum / scores.length;  //then we divide by the number of elements in the array in order to get an average
    
  }
  
  //11) METHOD
  static boolean isGreaterThan(double[] x, double [] y) {
    int sum = 0;
    int sum2 = 0;
    for( double a : x) {
      sum += a;
    }
    for(double b : y) { //iterating through the two arrays to find the sums of each
      sum2 += b;
    }
    if ( (sum / x.length) > (sum2 / y.length) ) { //comparing the average of each array to see which is larger
      return true;
    }else {
      return false;
    }
    
  }
  
  //12) METHOD
  static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if(isHotOutside && moneyInPocket > 10.50) {
      return true; //these instructions will return true if it is hot outside and there is more than $10.50 in the pockets
    }else { // if either is not true than the method returns as false
      return false;
    }
  }
  
  //13) METHOD
  static boolean willSwim(boolean isHotOutside, boolean wokeUpEarly, int time) {
    if(isHotOutside && wokeUpEarly && time > 500 && time < 2300) {
      return true;
    }else { // if its hot out, i woke up early, and its currently between 6am and 11pm than I am down to swim
      return false; //otherwise i'll stay in bed
    }
  }
  

}
