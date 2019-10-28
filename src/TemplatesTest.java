import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author gmtcover
 * @date 2019-10-24-20:57
 *
 * 1.idea中代码模版所处的位置：settings--Editor-live Templates/ postfix completion
 * 2.常用的模版
 *
 */
public class TemplatesTest {
    //prsf
    //private static final
    public static final int NUMx = 100;
    public static final String NATION = "china";





    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello!");
        //变形soutp/soutm/soutv/xxx.out
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        //soutv
        int num1 = 10;
        System.out.println("num1 = " + num1);
        //num1.sout
        System.out.println(num1);

        //模版fori
        String[] arr =new  String[]{"ton", "jaery", "li"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s;
            s = arr[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //list.for
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn  / xxx.nn




        }
    }



