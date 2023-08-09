import java.util.*;


//Reference used: https://www.vogella.com/tutorials/JavaAlgorithmsTowersOfHanoi/article.html

public class TowersOfHanoi
{
    public static void main(String[] args)
    {
        moveDisks(4, 1, 3);
    }

    public static void moveDisks(int n, int startPole, int endPole)
    {
        if(n == 0)
        {
            return;
        }
        int middlePole = 6 - startPole - endPole;
        moveDisks(n - 1, startPole, middlePole);
        System.out.println("Move " + n + " from " + startPole + " to "+ endPole);
        moveDisks(n - 1, middlePole, endPole);
    }



}