/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordcounter;
import java.util.*;
public class Wordcounter {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to proceed");
        String sent = sc.nextLine();
        if (sent==""){
            System.out.println("Please enter valid sentence"); 
            return;
        }
        String[] frek = sent.split(" ");
        int len=sent.length();
        char[] arr = new char[sent.length()];

        for (int i = 0; i < len; i++) {
            arr[i] = sent.charAt(i);
        }
        for (int i = 0; i < len; i++) {
            arr[i] = sent.charAt(i);
            if(arr[i]!=' ') {
                continue;
            } else
                count++;
        }
        System.out.println("Total number of words in the sentence is: "+(count+1));
        Unique(sent);
        String[] uniqueKeys;
        int counte = 0;
        System.out.println("The frequency of each word is as below:");
        
        
        uniqueKeys = outputfrequency(frek);
        
        
        for(String key: uniqueKeys)
        {
            if(null == key)
            {
                break;
            }           
            for(String s : frek)
            {
                if(key.equals(s))
                {
                    counte++;
                }               
            }
            System.out.println("Count of "+key+" is : "+counte);
            counte=0;
        }

        //for (char x : arr) {
         //   System.out.println(x);
        }
     static void Unique(String str)
    {
        int count;
        
        String[] words = str.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            count = 1;
 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
 
                    words[j] = "";
                }
            }
             if (count == 1 && words[i] != "")
                System.out.println("The unique word is->"+words[i]);
        }
        
    }
     private static String[] outputfrequency(String[] words)
    {
        String[] freq = new String[words.length];

        freq[0] = words[0];
        int freq_i = 1;
        boolean br = false;

        for(int i=1; i<words.length ; i++)
        {
            for(int j=0; j<=freq_i; j++)
            {
                if(words[i].equals(freq[j]))
                {
                    br = true;
                }
            }           

            if(!br)
            {
                freq[freq_i] = words[i];
                freq_i++;               
            }
            br = false;
        }       
        return freq;
    }
}