package designPatterns.behaviuoral.strategy;

public class Main {
    public static void main(String[] args) {
        String profileImage = "Ebrahim";
        ImageStore imageStore = new ImageStore(new BlackAndWhiteFilter(), new PngCompressor());
        imageStore.store(profileImage);
        System.out.println("============");
        imageStore.setFilter(new HighContrastFilter());
        imageStore.store(profileImage);
    }
}
