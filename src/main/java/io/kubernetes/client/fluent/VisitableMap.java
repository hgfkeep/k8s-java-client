package io.kubernetes.client.fluent;

import java.lang.Iterable;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Spliterator;

public class VisitableMap extends HashMap<String,List<Visitable>> implements Iterable<Visitable>{



    @Override public List<Visitable> get(Object key){
            if (!containsKey(key)) {
    put(String.valueOf(key), new ArrayList());
}
            return super.get(key);
    }

    public List<Visitable> aggregate(){
            ArrayList<Visitable> all = new ArrayList();
            for (Collection<Visitable> list : this.values()) {
    all.addAll(list);
}
            return all;
    }

    @Override public Iterator iterator(){
            return aggregate().iterator();
    }

    @Override public void forEach(Consumer action){
            aggregate().forEach(action);
    }

    @Override public Spliterator spliterator(){
            return aggregate().spliterator();
    }




}
