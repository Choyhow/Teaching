package adt;

/**
 *
 * @author Low Sin Mun
 */
import entity.Course;
//import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SortedDoublyLinkedList<T extends Comparable<T>> implements SortedDoublyLinkedListInterface<T> {

    public Node<T> firstNode;
    public Node<T> lastNode;
    private int size;
    private int numberOfEntries;

    public SortedDoublyLinkedList() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public static class Node<T> {

        public T data;
        public Node<T> next;
        private Node<T> previous;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    // Iterator implementation for Course
    private class CourseIterator implements Iterator<Course> {   //Low Sin Mun

        private Node<T> current = firstNode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Course next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Course course = (Course) current.data; // Cast data to Course
            current = current.next;
            return course;
        }
    }

    public Iterator<Course> iterator() {            //Low Sin Mun
        return new CourseIterator();
    }

    @Override
    public boolean add(T newEntry) {                //Low Sin Mun
        Node<T> newNode = new Node<>(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else if (newEntry.compareTo(firstNode.data) <= 0) {
            newNode.next = firstNode;
            firstNode.previous = newNode;
            firstNode = newNode;
        } else {
            Node<T> currentNode = firstNode;
            while (currentNode.next != null && newEntry.compareTo(currentNode.next.data) > 0) {
                currentNode = currentNode.next;
            }
            if (currentNode.next == null) {
                newNode.previous = currentNode;
                currentNode.next = newNode;
                lastNode = newNode;
            } else {
                newNode.next = currentNode.next;
                newNode.previous = currentNode;
                currentNode.next.previous = newNode;
                currentNode.next = newNode;
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean update(int givenPosition, T newEntry) {
        if (givenPosition < 1 || givenPosition > size) {
            throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
        }

        Node<T> currentNode = getNodeAt(givenPosition);
        currentNode.data = newEntry;
        return true;
    }

    private Node<T> getNodeAt(int givenPosition) {
        if (givenPosition < 1 || givenPosition > size) {
            throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
        }

        Node<T> currentNode = firstNode;
        for (int i = 1; i < givenPosition; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

//    @Override
//    public T remove(int givenPosition) {
//        if (givenPosition < 1 || givenPosition > size) {
//            throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
//        }
//
//        T removedData;
//        if (givenPosition == 1) {
//            // Remove the first node
//            removedData = firstNode.data;
//            firstNode = firstNode.next;
//            if (firstNode != null) {
//                firstNode.previous = null;
//            } else {
//                lastNode = null; // If the list becomes empty after removal
//            }
//        } else if (givenPosition == size) {
//            // Remove the last node
//            removedData = lastNode.data;
//            lastNode = lastNode.previous;
//            if (lastNode != null) {
//                lastNode.next = null;
//            } else {
//                firstNode = null; // If the list becomes empty after removal
//            }
//        } else {
//            // Remove a node in between
//            Node<T> currentNode = getNodeAt(givenPosition);
//            removedData = currentNode.data;
//            currentNode.previous.next = currentNode.next;
//            currentNode.next.previous = currentNode.previous;
//        }
//
//        size--;
//        return removedData;
//    }
    @Override
    public T remove(int givenPosition) {                     //Low Sin Mun
        if (givenPosition < 1 || givenPosition > size) {
            throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
        }

        T removedData;
        if (givenPosition == 1) {
            // Remove the first node
            removedData = firstNode.data;
            firstNode = firstNode.next;
            if (firstNode != null) {
                firstNode.previous = null;
            } else {
                lastNode = null; // If the list becomes empty after removal
            }
        } else if (givenPosition == size) {
            // Remove the last node
            removedData = lastNode.data;
            lastNode = lastNode.previous;
            if (lastNode != null) {
                lastNode.next = null;
            } else {
                firstNode = null; // If the list becomes empty after removal
            }
        } else {
            // Remove a node in between
            Node<T> currentNode = getNodeAt(givenPosition);
            removedData = currentNode.data;
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
        }

        size--;
        return removedData;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        if (givenPosition < 1 || givenPosition > numberOfEntries) {
            throw new IndexOutOfBoundsException("Invalid position: " + givenPosition);
        }

        Node<T> currentNode = firstNode;
        for (int i = 1; i < givenPosition; ++i) {
            currentNode = currentNode.next; // Advance currentNode to the node at givenPosition
        }
        currentNode.data = newEntry; // Update the data at the specified position
        return true;
    }

    @Override
    public T getEntry(int givenPosition) {
        // Implementation omitted for brevity
        return null;
    }

    @Override
    public boolean contains(T anEntry) {
        // Implementation omitted for brevity
        return false;
    }

    @Override
    public int getNumberOfEntries() {  //Low Sin Mun
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        // A linked list is typically not considered "full"
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            sb.append(currentNode.data).append("\n");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}
