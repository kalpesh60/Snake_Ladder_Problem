class SnakeLadder 
{
public static void main(String[] args)
   {
   System.out.println("Welcome to the Snake and Ladder Program");
   int Player1Position = 0;
   int Player2Position = 0;
   int CountDicePlayer1 = 0;
   int CountDicePlayer2 = 0;

      while(Player1Position < 100 && Player2Position < 100)
      {
	  CountDicePlayer1++;
      int optionsPlayer1 = ((int)(Math.random()*3)+1);
      int RollDicePlayer1 = ((int)(Math.random()*6)+1);
      System.out.println("RolldicePlayer1=" +RollDicePlayer1);
         switch (optionsPlayer1)
         {
         case 1:
            Player1Position = Player1Position;
            System.out.println("No_Play");
            System.out.println("Current Position Player1 =" +Player1Position);
            break;
         case 2:
            Player1Position += RollDicePlayer1;
              if(Player1Position > 100)
              {
              Player1Position -= RollDicePlayer1;
              }
              System.out.println("Ladder");
              System.out.println("Current Position Player1 =" +Player1Position);
              break;
          case 3:
            Player1Position -= RollDicePlayer1;
              if(Player1Position < 0)
              {
              Player1Position = 0;
              }
              System.out.println("Snake");
              System.out.println("Current Position Player1 =" +Player1Position);
              break;
              default: System.out.println("Invalid");
          }
          CountDicePlayer1++;
          System.out.println("count of dice Player1="+CountDicePlayer1);



          CountDicePlayer2++;
          int optionsPlayer2 = ((int)(Math.random()*3)+1);
          int RollDicePlayer2 = ((int)(Math.random()*6)+1);
          System.out.println("Rolldice Player2=" +RollDicePlayer2);
          switch (optionsPlayer2)
          {
          case 1:
             Player2Position = Player2Position;
             System.out.println("No_Play");
             System.out.println("Current Position Player2 =" +Player2Position);
             break;
          case 2:
             Player2Position +=RollDicePlayer2;
               if(Player2Position > 100)
               {
               Player2Position -= RollDicePlayer2;
               }
               System.out.println("Ladder");
               System.out.println("Current Position Player2=" +Player2Position);
               break;
          case 3:
             Player2Position -= RollDicePlayer2;
               if(Player2Position < 0)
               {
               Player2Position = 0;
               }
               System.out.println("Snake");
               System.out.println("Current Position Player2=" +Player2Position);
               break;
               default: System.out.println("Invalid");
            }
            CountDicePlayer2++;
            System.out.println("count of dice Player2="+CountDicePlayer2);
      }
            if(Player1Position == 100)
            System.out.println("Player 1 wins");
            else
            System.out.println(("Player 2 wins"));
   }
}
