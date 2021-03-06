import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test{
	public int[] destroyHouses(int[]houses, int[]queries) {
        Arrays.sort(houses);
        List<int[]>list = new ArrayList<>();
        int[]ret = new int[queries.length];
        for (int i = 1; i < houses.length; i++) {
            if(list.isEmpty()){
                list.add(new int[]{houses[i-1], houses[i-1]});
            }
            if(houses[i] - houses[i-1] == 1){
                list.get(list.size()-1)[1] = houses[i];                
            }else{
                list.add(new int[]{houses[i], houses[i]});
            }
        }

        for (int j = 0; j < ret.length; j++) {
            int index = queries[j];
            for (int i = 0; i < list.size(); i++) {
                int[]range = list.get(i);
                if(range[0] == index && range[1] == index){
                    list.remove(i);
                    break;
                }else if(range[0] == index){
                    range[0] = index + 1;
                    list.set(i,range);
                    break;
                }else if (range[1] == index){
                    range[1] = index - 1;
                    list.set(i,range);
                    break;
                }else if(range[0] < index && range[1] > index){
                    int rightCopy = range[1];
                    range[1] = index-1;
                    list.set(i, range);
                    int[]another = new int[]{index + 1, rightCopy};
                    list.add(i+1, another);
                    break;
                }
            }
            ret[j] = list.size();
        }
        //System.out.println("Val is : "+ret);
        return ret;
    }

}
