import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftistHeapTest {
    LeftistHeap<Integer> heap1 = new LeftistHeap<Integer>();
    LeftistHeap<Integer> heap2 = new LeftistHeap<Integer>();


    void setUpHeaps() {
        heap1.insert(15);
        heap1.insert(12);
        heap1.insert(25);
        heap1.insert(8);
        heap1.insert(4);
        heap1.insert(27);
        heap1.insert(43);
        heap1.insert(19);
        heap1.insert(20);

        heap2.insert(14);
        heap2.insert(8);
        heap2.insert(6);
        heap2.insert(7);
    }

    void tearDownHeaps() {
        heap1 = null;
        heap2 = null;
    }

    @Test
    void merge() {
        setUpHeaps();
        heap1.merge(heap2);
        assertEquals(13, heap1.getSize());
        try{
            assertEquals(4, (int)heap1.findMin());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        tearDownHeaps();
    }

    @Test
    void insert() {
        LeftistHeap<Integer> heap = new LeftistHeap<Integer>();
        heap.insert(1);
        assertEquals(1, heap.getSize());
        heap.insert(2);
        heap.insert(3);
        assertEquals(3, heap.getSize());
    }

    @Test
    void findMin() {
        LeftistHeap<Integer> heap = new LeftistHeap<Integer>();
        heap.insert(10);
        heap.insert(18);
        heap.insert(-1);
        heap.insert(20);
        heap.insert(45);
        try {
            assertEquals(-1, (int) heap.findMin());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void deleteMin() {
        LeftistHeap<Integer> heap = new LeftistHeap<Integer>();
        heap.insert(10);
        heap.insert(18);
        heap.insert(-1);
        heap.insert(20);
        heap.insert(45);
        try {
            assertEquals(-1, (int) heap.deleteMin());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void isEmpty() {
        LeftistHeap<Integer> heap = new LeftistHeap<Integer>();
        assertTrue(heap.isEmpty());
        heap.insert(10);
        heap.insert(18);
        assertFalse(heap.isEmpty());
    }

    @Test
    void makeEmpty() {
        LeftistHeap<Integer> heap = new LeftistHeap<Integer>();
        heap.insert(10);
        heap.insert(18);
        heap.makeEmpty();
        assertEquals(0, heap.getSize());
    }
}