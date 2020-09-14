package homework8;

import java.util.*;

public class SetUtilisClass implements SetUtils{
    private LinkedList<Integer> collection1;

    public SetUtilisClass() {
    }

    public SetUtilisClass(LinkedList<Integer> collection1) {
        this.collection1 = collection1;
    }

    public LinkedList<Integer> getCollection1() {
        return collection1;
    }

    public void setCollection1(LinkedList<Integer> collection1) {
        this.collection1 = collection1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetUtilisClass)) return false;
        SetUtilisClass that = (SetUtilisClass) o;
        return Objects.equals(getCollection1(), that.getCollection1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCollection1());
    }

    @Override
    public String toString() {
        return "SetUtilisClass{" +
                "collection1=" + collection1 +
                '}';
    }

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        SortedSet<String> collection2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        collection2.addAll(set2);
       for(Integer n: collection1){
           collection2.add(n.toString());

       }

        return collection2;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
      LinkedHashSet<Integer>set = new LinkedHashSet<>();
       set.add(val1);
        set.add(val2);
        set.add(val3);
        set.add(val4);
        set.add(val5);
        return set;
    }
}
