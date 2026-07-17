class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
    List<Integer>li = new ArrayList<>();
    HashMap<Integer, Integer>map = new HashMap<>();
    for(int ele:bulbs){
        map.put(ele,map.getOrDefault(ele,0)+1);
    }
    for(int key: map.keySet()){
        if(map.get(key) % 2 !=0){
            li.add(key);
        }
    }
    Collections.sort(li);
    return li;
        
    }
}