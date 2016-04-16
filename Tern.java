/**
 * Created by Игорь и Людмила on 08.03.2016.
 */
public class Tern {
    public static void main(String[] args) {

        int largerNum;
        int lowNum = 9;
        int highNum = 27;
        int n = 3;

        largerNum = lowNum > highNum ? n : lowNum; // условие ? значение1 : значение2

        System.out.println(largerNum);

//        if (lowNum < highNum) {
//            largerNum = highNum;
//        } else {
//            largerNum = lowNum;
//        }


    }


}
