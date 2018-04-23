package template;

/**
 * Created by dongbin on 2018/4/23.
 */

/**
 * 冒泡排序
 *
 * @param <T>
 */
public abstract class BubbleSorter<T> {

    /**
     * 冒泡排序 从小到大
     *
     * @param array
     */
    public void sort(T array) {
        setArray(array);
        int length = getLength();
        if (length <= 1) return;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (needSwap(j)) {
                    swap(j);
                }
            }
        }
    }

    /**
     * 初始化排序数组
     */
    protected abstract void setArray(T array);

    /**
     * @return 返回数组长度
     */
    protected abstract int getLength();

    /**
     * @return 是否需要交换数组中 index 和 index+1 元素
     */
    protected abstract boolean needSwap(int index);

    /**
     * 交换array数组中的 index 和 index+1 元素
     */
    protected abstract void swap(int index);
}
