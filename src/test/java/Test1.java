import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.SocketOption;
import java.util.Scanner;

public class Test1 extends TestCase {

        public void test() throws FileNotFoundException
        {
            try{
                File input = new File("src/test/java/resourses/numbers.txt");
                Scanner in = new Scanner(input);
                while(in.hasNextInt())
                {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    System.out.println(a +" , "+b);
                    int div = a/b;
                    divisionTest(a,b, div);
                    System.out.print(" division result: "+div);
                    int mult = a * b;
                    multiplicationTest(a,b, mult);
                    System.out.println(" multiplication result: "+mult);
                    int sub = a - b;
                    subtractionTest(a,b,sub);
                    System.out.println(" subtraction result: "+sub);
                    int sum = a+b;
                    sumTest(a,b,sum);
                    System.out.println(" addition result: "+sum);
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.print("File not found");
            }

        }

        public void sumTest(int a, int b, int sum)
        {
            int result =  a + b;
            assertEquals(sum,result);
        }

        public void subtractionTest(int a, int b, int sub)
        {
            int result =  a - b;
            assertEquals(sub,result);
        }
        public void divisionTest(int a, int b, int div)
        {
            int result = a/b;
            assertEquals(div, result);
        }
        public void multiplicationTest(int a, int b, int mult)
        {
            int result = a * b;
            assertEquals(mult,result);
        }


    }

