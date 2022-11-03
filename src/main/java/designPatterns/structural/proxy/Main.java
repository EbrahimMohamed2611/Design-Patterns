package designPatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = {"Java", "Python", "Go","C#"};
//        for(String fileName: fileNames)
//            library.add(new ProxyEbook(fileName));
        for(String fileName: fileNames)
            library.add(new LoggingEbook(fileName));

        library.open("Java");
    }
}
