package ObjectsIntroduction;

public class Car {
    private String make = "Mitsubishi";
    private String model = "Lancer";

    private String color = "white";

    private int doors = 4;

    private boolean convertible = false;

    public void describeCar() {
        System.out.printf("doors: %s\n color: %s\n make: %s\n model: %s\n %s\n", doors, color, make, model, convertible ? "Convertible" : " ");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "honda", "mazda", "mitsubishi", "toyota" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
