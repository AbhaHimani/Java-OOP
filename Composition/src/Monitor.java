public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; // monitor isn't a resolution, it has a resolution that's called composition

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at " + x  + ","+y+"in color"+color);
    }
}
