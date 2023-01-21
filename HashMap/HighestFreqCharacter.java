import java.util.*;
   /*   input : abnacababna
     output: 5  (a)
     Gfg link : https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
      */



public class HighestFreqCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        //brutefoce
        /*
        need a sorted array (alphabetically)
        testsample  : o/p 2 (e)
        int n=s.length();              
        char k='a'; // (random chracter)
        int count=0,max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j))
                count++;
                if(count>max)
                { max=count;
                    k=s.charAt(i);
                }
            }}
            
            System.out.print(k);
            */
       

            //HashMap
            int n=s.length();     
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(map.containsKey(ch))
                { int oldfreq=map.get(ch);
                int newfreq=oldfreq+1;
            map.put(ch,newfreq);
        }
        else{
            map.put(ch,1);}
        }
        char k=s.charAt(0);
        for(Character key:map.keySet())
        { if(map.get(key)>map.get(k))
           k=key;
        }
        System.out.print(k);
        }
            }
      