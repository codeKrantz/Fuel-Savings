import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner myInput = new Scanner(System.in);
System.out.println("How many miles will Erin Thetires drive yearly?");//you'll need the mile number to set up future calculations.
double userMile = myInput.nextDouble();
System.out.println("Now, what is the Miles per Gallon of her current car?");//saving the variable of the old car MPG
double CurrentMPG = myInput.nextDouble();    
System.out.println("What will be the Miles per Gallon of her new car?");//saving the variable of the New car's MPG
double NewMPG = myInput.nextDouble();
System.out.println("How much will gasoline cost per gallon?");
double Gas$ = myInput.nextDouble();//saving the cost of gas per gallon.
double CurrentCost = userMile/CurrentMPG*Gas$; // this will calculate the total yearly cost of the current car.
double NewCost = userMile/NewMPG*Gas$;    // This will calculate the yearly cost of the new car. 
double Difference = CurrentCost-NewCost;// getting the difference
System.out.println("The current car costs her $"+CurrentCost+" yearly. Then the new car will cost her $"+NewCost+" yearly. There will be a difference of $"+Difference+" a year.");// The way the answer is given is universal for a posative savings or a negative loss, but if I had an "If" statment I could show if there was a saving or loss.
  }
}