package designPatterns.behaviuoral.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory<String> browseHistory = new BrowseHistory<>();
        browseHistory.addUrl("https://www.google.com");
        browseHistory.addUrl("https://www.amazon.com");
        browseHistory.addUrl("https://www.meta.com");
        browseHistory.addUrl("https://www.apple.com");
        Iterator<String> iterator = browseHistory.createIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
