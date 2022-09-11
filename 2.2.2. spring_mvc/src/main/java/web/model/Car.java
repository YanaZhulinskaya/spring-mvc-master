package web.model;

public class Car {
    private String model;
    private String color;
    private String engine;

    public Car(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return String.format("Car [model = %s, color= %s, engine = %s", model, color, engine);
    }

}
