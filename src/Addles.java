import java.util.Scanner;

/**
 * @author gmtcover
 * @date 2019-10-26-10:34
 */
public class Addles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idx ;
        int off ;
        boolean flag = false; //判断正负号
        int[] numOfidx = new int[101];
        int idx_max = 0;
        //第一个多项式
        do
        {
            idx = in.nextInt();//
            off = in.nextInt();//
            numOfidx[idx] = off;

            if ( idx > idx_max)
            {
                idx_max = idx;
            }
        }while(idx !=0);
        //第二个多项式
        do

        {
            idx = in.nextInt();
            off = in.nextInt();
            numOfidx[idx] = numOfidx[idx] + off;
            if ( idx > idx_max)
            {
                idx_max = idx;
            }
        }while(idx !=0);

        for( int i = idx_max; i >1; i--)
        {
            if(numOfidx[i] != 0)
            {
                if(flag && numOfidx[i] > 0) System.out.print("+");
                if(numOfidx[i] < 0 ) System.out.print("-");
                flag = true;
                System.out.print(numOfidx[i]+"x"+i);
            }
            else
                continue;
        }

        if(numOfidx[1] != 0)
        {
            if(numOfidx[1] > 0) System.out.print("+");
            System.out.print(numOfidx[1]+"x");
        }

        if(numOfidx[0] !=0)
        {
            if(numOfidx[0] > 0) System.out.print("+");
            System.out.print(numOfidx[0]);

        }
        if(!flag) System.out.print("0");
        in.close();
    }
}
