package com.huh.coll;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInject {
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProp;

    public List<String> getMyList() {
        return myList;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public Properties getMyProp() {
        return myProp;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProp(Properties myProp) {
        this.myProp = myProp;
    }
}
