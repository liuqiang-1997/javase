package interfaces;

/**
 * 对比当前对象大小
 */
public interface CompareObject {
    /**
     * 返回值为0，则相等；大于0，则当前对象大；小于0，则当前对象小
     * @param o
     * @return
     */
    public int compareTo(Object o);
}
