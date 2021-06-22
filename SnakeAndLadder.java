public class SnakeAndLadder
{
public static void main(String[] args)
{
System.out.println("Welcome to Snake And Ladder");
int PlayerPosition=1;
System.out.println("Player position is : "+PlayerPosition);
int die = (int) (Math.floor( Math.random() * 10) % 6+1);
System.out.println("Die rolled is :" +die);
}
}

