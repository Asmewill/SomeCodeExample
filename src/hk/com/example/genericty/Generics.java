package hk.com.example.genericty;

/****
 *һ����ͨ��java������
 * �˴�T�������дΪ�����ʶ����������T��E��K��V����ʽ�Ĳ��������ڱ�ʾ����
 ��ʵ����������ʱ������ָ��T�ľ�������
 * @param <T>
 */

public   class Generics<T> {
    //key�����Ա����������ΪT,T���������ⲿָ��
    private T key;

    public Generics(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

}
