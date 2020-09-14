package homework8;

import java.util.ArrayList;
import java.util.List;

public class ListUtilisClass implements ListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> result = new ArrayList<>();
       for(String s: strings){
           result.add(s);
        }
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        return null;
    }
}
