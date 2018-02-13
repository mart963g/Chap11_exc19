package Exc_19;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Exc_19
{
    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("Martin",2);
        map.put("Shit",1);
        map.put("Erik",789);
        map.put("Troels",123);
        map.put("Tino",2345);
        map.put("Mick Mick",234);
        System.out.println(rarest(map));
    }

    public static int rarest(Map<String,Integer> map)
    {
        if(map.isEmpty())
        {
            throw new EmptyStackException();
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i:map.values())
        {
            if(countMap.containsKey(i))
            {
                int count = countMap.get(i);
                countMap.put(i,count+1);
            } else
            {
                countMap.put(i,1);
            }
        }
        int min = 100;
        int retVal = 1000000000;
        for(Map.Entry<Integer,Integer> e:countMap.entrySet())
        {
            if(e.getValue()<=min)
            {
                min = e.getValue();
                if(e.getKey()<retVal)
                {
                    retVal = e.getKey();
                }
            }
        }
        return retVal;
    }

}
