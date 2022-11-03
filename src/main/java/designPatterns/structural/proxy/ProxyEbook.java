package designPatterns.structural.proxy;

public class ProxyEbook implements Ebook{
    private final String fileName;
    private RealEbook ebook; // don't initialize it here or contracture we need to initialize just we need because this Object is costly and heavy

    public ProxyEbook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName);
        ebook.show();
    }
    @Override
    public String getFileName() {
        return fileName;
    }
}
