package 行为型模式.迭代器模式;

interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}
