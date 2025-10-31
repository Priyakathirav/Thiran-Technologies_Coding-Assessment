import java.util.*;
public class MetroRailStation{
    public static void main(String[]args){
        List<String>greenLine=Arrays.asList("A","B","C","D","E","F","G","H");
        List<String>redLine=Arrays.asList("I","J","K","L","M","N");
        Set<String>allStations=new LinkedHashSet<>();
        allStations.addAll(greenLine);
        allStations.addAll(redLine);
        System.out.print("all stations names:");
        for(String station:allStations){
            System.out.print(station+" ");
        }
        String start="A";
        String destination="E";
        int startIndex=greenLine.indexOf(start);
        int destIndex=greenLine.indexOf(destination);
        int countJunctions=destIndex-startIndex;
        System.out.println("\n how many stations krish have travel to reach varun:"+countJunctions);
    }
}
