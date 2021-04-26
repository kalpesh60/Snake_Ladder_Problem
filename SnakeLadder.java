public class SnakeLadder
{
   public static void main(String[] args)
   {
   System.out.println("Welcome to the Snake & Ladder Program");
   int PlayerPosition = 0;
   int RollDice = ((int)(Math.random() * 6)+1);
   int Options = ((int)(Math.random() * 3)+1);
   System.out.println("rolldice="+RollDice);
   System.out.println("Options="+Options);
   switch (Options)
      {
      case 1:
         System.out.println("No Play");
         break;
      case 2:
         System.out.println("climb the ladder");
         PlayerPosition += RollDice;
         System.out.println("move+"+RollDice);
         break;
      case 3:
         System.out.println("Caught by snake");
         PlayerPosition -= RollDice;
         System.out.println("back-"+RollDice);
         break;
      }
   }
}
