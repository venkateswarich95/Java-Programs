package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        //interface<Key,Value> mapObj=new implementing Class<>();
        Map<String,Integer> inventoryMap=new HashMap<>();
        System.out.println("Map size is:"+inventoryMap.size());
        System.out.println("Map is:"+inventoryMap);
        //add entry into the map using put(key,value)
        inventoryMap.put("Apples",20);
        inventoryMap.put("Oranges",50);
        inventoryMap.put("Banana",40);
        System.out.println("Map size is:"+inventoryMap.size());
        System.out.println("Map is:"+inventoryMap);

        //updating the map
        inventoryMap.put("Apples",30);//inventoryMap.put("Apples",inventoryMap.get("Apples")+10);
        System.out.println("Map size is:"+inventoryMap.size());
        System.out.println("After updating apples count is:"+inventoryMap.get("Apples"));

        //putIfAbsent(key,value)--insert the entry if it is not present in the map
        inventoryMap.putIfAbsent("Grapes",10);
        inventoryMap.putIfAbsent("Grapes",20);
        System.out.println("After adding grapes Map size is:"+inventoryMap.size());
        System.out.println("After adding grapes Map is:"+inventoryMap);

        //retrive the banana quantity using get(key)
        System.out.println("Banana count is:"+inventoryMap.get("Banana"));

        //check whether grapes is present in the map or not using containsKey()
        boolean b=inventoryMap.containsKey("Grapes");
        System.out.println("Grapes is present in inventory or not:"+b);
        boolean b1=inventoryMap.containsValue(40);
        System.out.println("40 value is present in inventory or not:"+b1);

        //check whether inventory is empty or not using isEmpty()
        boolean b2=inventoryMap.isEmpty();
        System.out.println("Inventory is empty or not:"+b2);

        //delete an entry from map using remove(key)
        inventoryMap.remove("Banana");
        System.out.println("After deleting Banana Map size is:"+inventoryMap.size());
        System.out.println("After deleting Banana Map is:"+inventoryMap);
        inventoryMap.remove("Grapes",10);
        System.out.println("After deleting Grapes Map size is:"+inventoryMap.size());
        System.out.println("After deleting Grapes Map is:"+inventoryMap);

        //replace old values with new values using replace(key,value)
        inventoryMap.replace("Apples",20);
        System.out.println("After replacing apple value Map size is:"+inventoryMap.size());
        System.out.println("After replacing apple value Map is:"+inventoryMap);
        inventoryMap.replace("Oranges",50,100);
        System.out.println("After replacing orange value Map size is:"+inventoryMap.size());
        System.out.println("After replacing orange value Map is:"+inventoryMap);

        //add entry into the map using put(key,value)
        inventoryMap.put("Watermelon",10);
        inventoryMap.put("Custard Apple",5);
        inventoryMap.put("Jack fruit",15);
        System.out.println("Map size is:"+inventoryMap.size());
        System.out.println("Map is:"+inventoryMap);

        //retrieve all the keys from map using keySet() returns Set collection
        Set<String> keys=inventoryMap.keySet();
        System.out.println("All the keys in the map are:"+keys);

        //retrieve all the keys & values from map using entrySet() returns Set collection
        Set<Map.Entry<String,Integer>> keyVal=inventoryMap.entrySet();
        System.out.println("All the keys & values in the map are:"+keyVal);

        //check any product has zero stock
        boolean b4=inventoryMap.containsValue(0);
        System.out.println("any product has zero stock:"+b4);

        //putAll() used to join two maps
        Map<String,Integer> vegetables=new LinkedHashMap<>();
        vegetables.put("Tomato",50);
        vegetables.put("Oninon",70);
        vegetables.put("Potato",30);
        System.out.println("Vegetable map collection is:"+vegetables);
        System.out.println("Vegetable map size is:"+vegetables.size());

        inventoryMap.putAll(vegetables);
        System.out.println("Map size is:"+inventoryMap.size());
        System.out.println("Map is:"+inventoryMap);

        //clear() used to reset the map
        inventoryMap.clear();
        System.out.println("Map size after clear() is:"+inventoryMap.size());
        System.out.println("Map after clear() is:"+inventoryMap);

    }

}
