import java.util.*;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> list = new ArrayList<>();
    
        list.add(1);
        if(rowIndex == 0){
            return list;
        }

        list.clear();
        list.add(1);
        list.add(1);

        if(rowIndex == 1){
            return list;
        }


        List<Integer> tempList = new ArrayList<>();
        int val = 0;

        for(int i = 2; i <= rowIndex; i++){

            tempList = new ArrayList<Integer>(list);

            list.clear();
            list.add(1);

            for(int j = 0; j < tempList.size() - 1; j++){
                val = tempList.get(j) + tempList.get(j + 1);
                list.add(val);
            }

            list.add(1);

        }

        return list;
    }
}