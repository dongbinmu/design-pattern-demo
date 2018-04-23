package template;

import java.util.List;

/**
 * Created by dongbin on 2018/4/23.
 */
public class IntegerListBubbleSorter extends BubbleSorter<List<Integer>> {

    private List<Integer> list;

    @Override
    protected void setArray(List<Integer> array) {
        this.list = array;
    }

    @Override
    protected int getLength() {
        return list == null ? 0 : list.size();
    }

    @Override
    protected boolean needSwap(int index) {
        return list != null && list.get(index) > list.get(index + 1);
    }

    @Override
    protected void swap(int index) {
        Integer tmp = list.get(index);
        list.set(index, list.get(index + 1));
        list.set(index + 1, tmp);
    }
}
