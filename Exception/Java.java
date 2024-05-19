import java.io.File;
import java.util.Scanner;

import java.util.*;
import java.io.FileNotFoundException;
public class Java {
    public static void main(String[] args) {
        try
        {
            File file=new File("exanple.text");

            Scanner sc=new Scanner(file);
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }

        
    }

    
}
