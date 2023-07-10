package out.production.Selenium_Demo;

import java.util.Arrays;
import java.util.List;

public class StreamsExampleCrt {


        public static void  main(String args[])
        {
            List<Integer> al = Arrays.asList(12,45,6,34,89);
            System.out.println(al.stream().filter(s->s%2==0).mapToInt(s->s*2).sum());


    }

}
