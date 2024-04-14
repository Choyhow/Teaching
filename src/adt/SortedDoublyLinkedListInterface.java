package adt;

/**
 *
 * @author Low Sin Mun
 */
public interface SortedDoublyLinkedListInterface<T> {

    public boolean add(T newEntry);   //Low Sin Mun

    public T remove(int givenPosition); //Low Sin Mun
    // Added remove method with index

    public void clear();

    public boolean replace(int givenPosition, T newEntry);

    public T getEntry(int givenPosition);

    public boolean contains(T anEntry);

    public int getNumberOfEntries();

    public boolean isEmpty();

    public boolean isFull();

    //public boolean remove(T anEntry); // Update the existing remove method

    public boolean update(int givenPosition, T newEntry); // Added update method

//    public String getAllCourses();
//    public boolean isCourseNameExists(String courseName);
//    public void displayCourses();
}
