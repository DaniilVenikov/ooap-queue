public abstract class QueueATD<T> {

    public static int GET_NIL = 0;
    public static int GET_OK = 1;
    public static int GET_ERR = 2;

    // конструктор
    // постусловие: создана новая пустая очередь
    public abstract QueueATD<T> QueueATD();

    // команды

    // постусловие: произведена вставка в хвост очереди
    public abstract void enqueue(T item);

    // постусловие: удалён элемент из головы очереди
    public abstract void remove();


    // запросы

    // предусловие: очередь не пустая
    public abstract T get(); // значение элемента из головы очереди

    public abstract int size();

    public abstract int getGetStatus();
}
