import java.util.*;
import java.lang.*;

public class CoordDist {

    public static void main(String args[]) throws IOException
    {
       Scanner sc = new Scanner(System.in);
        String coord = sc.nextLine();
        String newstr = coord.replaceAll("[\\.$|,|;|(|)']","");
        String[] parts = newstr.split(" ");
        double x1 = Double.parseDouble(parts[0]);
        double y1 = Double.parseDouble(parts[1]);
        double x2 = Double.parseDouble(parts[2]);
        double y2 = Double.parseDouble(parts[3]);
        
        double dist = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        int val = (int)(dist);
        System.out.println(val);
    }

}
