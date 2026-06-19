class Solution118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> mainList = new ArrayList<>();

        if(numRows == 0){
            return mainList;
        }

        List<Integer> prev = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);

        mainList.add(new ArrayList<Integer>(list));
        list.clear();

        if(numRows == 1){
            return mainList;
        }

        list.add(1);
        list.add(1);

        mainList.add(new ArrayList<Integer>(list));

        if(numRows == 2){
            return mainList;
        }


        int k = 0;
        int val = 0;
        
        for(int i = 2; i < numRows; i++){
            list.clear();
            prev = mainList.get(mainList.size() - 1);

            list.add(1);

            for(int j = 0; j < prev.size() - 1; j++){
                val = prev.get(k) + prev.get(k + 1);
                list.add(val);
                k++;
            }
            k = 0;

            list.add(1);

            mainList.add(new ArrayList<Integer>(list));
        }

        return mainList;
    }
}