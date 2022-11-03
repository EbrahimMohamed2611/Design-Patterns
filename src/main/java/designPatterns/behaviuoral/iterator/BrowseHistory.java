package designPatterns.behaviuoral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory<E extends Comparable<E>> {
    private final List<E> urls = new ArrayList<>();

    public BrowseHistory() {
    }

    public void addUrl(E url) {
        urls.add(url);
    }

    public designPatterns.behaviuoral.iterator.Iterator<E> createIterator() {
        return new ListIterator<>(this);
    }

    private class ListIterator<E extends Comparable<E>> implements designPatterns.behaviuoral.iterator.Iterator<E> {
        private final BrowseHistory<E> browseHistory;
        private int index;

        public ListIterator(BrowseHistory<E> browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            //we can access Urls field here directly because we are inside the class itself
            return index < browseHistory.urls.size();
        }

        @Override
        public E next() {
            // we don't need to remove the element
            return browseHistory.urls.get(index++);
        }
    }
}
