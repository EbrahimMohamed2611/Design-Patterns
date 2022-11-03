package designPatterns.behaviuoral.strategy;

public class ImageStore {
    private Filter filter;
    private Compressor compressor;

    public ImageStore(Filter filter, Compressor compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }
    public void store(String image){
        // first filter the image
        filter.apply(image);
        // second compress the image
        compressor.compress(image);
        System.out.println("Image: "+ image + " is stored.");
    }
    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Compressor getCompressor() {
        return compressor;
    }

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }
}
