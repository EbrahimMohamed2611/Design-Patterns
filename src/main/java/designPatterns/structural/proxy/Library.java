package designPatterns.structural.proxy;


import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void open(String fileName){
        ebooks.get(fileName).show();
    }
}
