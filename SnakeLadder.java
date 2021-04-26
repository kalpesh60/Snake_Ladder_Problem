class SnakeLadder {
public static void main(String[] args){
System.out.println("Welcome to the Snake and Ladder Program");
int PlayerPosition = 0;
int CountDice = 0;
while(PlayerPosition < 100)
{
int options = ((int)(Math.random()*3)+1);
int RollDice = ((int)(Math.random()*6)+1);
System.out.println("Rolldice="+RollDice);
switch (options){
case 1:
PlayerPosition = PlayerPosition;
System.out.println("No_Play");
System.out.println("Current Position =" +PlayerPosition);
break;
case 2:
PlayerPosition +=RollDice;
if(PlayerPosition>100){
PlayerPosition-=RollDice;
}
System.out.println("Ladder");
System.out.println("Current Position =" +PlayerPosition);
break;
case 3:
PlayerPosition -=RollDice;
if(PlayerPosition<0){
PlayerPosition=0;
}

System.out.println("Snake");
System.out.println("Current Position =" +PlayerPosition);
break;
default: System.out.println("Invalid");
}
CountDice++;
System.out.println("count of dice="+CountDice);
 }
}
}

