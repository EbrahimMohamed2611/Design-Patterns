package designPatterns.structural.proxy;

public class LoggingEbook implements Ebook {
    private final String fileName;
    private RealEbook ebook;

    public LoggingEbook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        ebook = (ebook == null) ? new RealEbook(fileName) : ebook;
        //Add here some logging info
        System.out.println("Logging " + ebook + " .....");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
