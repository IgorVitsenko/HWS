/**
 * Created by Игорь и Людмила on 08.03.2016.
 */
public class ForEach
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < 5; i++)
        {
            sum += nums[i];
            System.out.println(sum);
        }
    }

}
