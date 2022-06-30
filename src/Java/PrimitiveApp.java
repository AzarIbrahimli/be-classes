package Java;

import java.io.SyncFailedException;

/*
multiple comment
*/
// one line comment
public class PrimitiveApp{
    public static void main (String[]args){
        boolean b = true; //false
        char c = 'a';

        byte firstByte = 127; // -128 127 2**8
        short aShort = firstByte; // 2 byte
        int i;
        long l= 151315131313L;

        float f;
        double firstDouble=0.2;
        double secondDouble=0.1;
        double sum= firstDouble+ secondDouble;
        System.out.println(sum);
        System.out.println(firstByte);
        System.out.println(aShort);


        short secondShort = 128;
        byte secondByte = (byte) secondShort;  // we do manually
        System.out.println(secondByte);



    }
}

