//Copy over your code from the Randomizer class exercise

public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random()*(10) + 1);
    }

    public static int nextInt(int min, int max)
    {
        int temp = max;
        if(min > max){
            max = min;
            min = temp;
        }
        int range = max - min;
        //Implement this method to return a random integer between min and max
        return (int)(Math.random()*(range+1) + min);
    }
}