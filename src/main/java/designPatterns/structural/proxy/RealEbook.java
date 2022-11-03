package designPatterns.structural.proxy;

public class RealEbook implements Ebook{
    private final String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load(){
        System.out.println("Loading the book " + fileName);
    }

    @Override
    public void show(){
        System.out.println("Showing the book " + fileName);
    }
    @Override
    public String getFileName() {
        return fileName;
    }
}
