public class LeftistHeap<T extends Comparable<T>> {
    /**
     * Создать левостороннюю кучу.
     */
    public LeftistHeap() {
        root = null;
    }

    /**
     * Соединить rhs с this в приоритетную очередь.
     * rhs становится пустой. rhs должна отличаться от this.
     *
     * @param rhs the other leftist heap.
     */
    public void merge(LeftistHeap<T> rhs) {
        if (this == rhs)    // Avoid aliasing problems
            return;

        root = merge(root, rhs.root);
        size = size + rhs.size;
        rhs.root = null;
    }

    /**
     * Внутренний метод для обеъединения двух корней.
     * Обрабатывает исключительные случаи и вызывает метод merge1.
     */
    private LeftistNode<T> merge(LeftistNode<T> h1, LeftistNode<T> h2) {
        if (h1 == null)
            return h2;
        if (h2 == null)
            return h1;
        if (h1.element.compareTo(h2.element) < 0)
            return merge1(h1, h2);
        else
            return merge1(h2, h1);
    }

    /**
     * Внутренний метод для обеъединения двух корней.
     * Предполагает, что кучи не пусты, и h1's корень содержит меньший элемент.
     */

    private LeftistNode<T> merge1(LeftistNode<T> h1, LeftistNode<T> h2) {
        if (h1.left == null)   // Одиночный узел
            h1.left = h2;       // Другие поля h1 уже в порядке
        else {
            h1.right = merge(h1.right, h2);
            if (h1.left.npl < h1.right.npl)
                swapChildren(h1);
            h1.npl = h1.right.npl + 1;
        }
        return h1;
    }

    /**
     * Меняет местами детей t.
     */
    private static <T> void swapChildren(LeftistNode<T> t) {
        LeftistNode<T> tmp = t.left;
        t.left = t.right;
        t.right = tmp;
    }

    /**
     * Вставка в левостороннюю кучу с поддержанием приоритетной очереди.
     *
     * @param x объект к вставке.
     */
    public void insert(T x) {
        root = merge(new LeftistNode<T>(x), root);
        size += 1;
    }

    /**
     * Находит наименьший элемент приоритетной кучи.
     *
     * @return наименьший элемент, или выбрасывается Exception, если куча пуста.
     */
    public T findMin() throws Exception {
        if (isEmpty())
            throw new Exception("The heap is empty.");
        return root.element;
    }

    /**
     * Удаляет наименьший элемент приоритетной кучи.
     *
     * @return наименьший элемент, или выбрасывается Exception, если куча пуста.
     */
    public T deleteMin() throws Exception{
        if (isEmpty())
            throw new Exception("The heap is empty.");

        T minItem = root.element;
        root = merge(root.left, root.right);

        size -= 1;

        return minItem;
    }

    /**
     * Проверяет, пуста ли левосторонняя куча.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Очищает левостороннюю кучу.
     */
    public void makeEmpty() {
        root = null;
        size = 0;
    }

    private static class LeftistNode<T> {

        LeftistNode(T theElement) {
            this(theElement, null, null);
        }

        LeftistNode(T theElement, LeftistNode<T> lt, LeftistNode<T> rt) {
            element = theElement;
            left = lt;
            right = rt;
            npl = 0;
        }

        T element;      // Информация в узле
        LeftistNode<T> left;         // Левый ребенок
        LeftistNode<T> right;        // Правый ребенок
        int npl;          // null path length
    }

    private LeftistNode<T> root;    // root

    public int getSize() {
        return size;
    }

    private int size = 0;
}
