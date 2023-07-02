package Behavioral_Patterns.Iterator;

public interface UserIterator {
  User next();
  void reset();
  boolean hasNext();
}
