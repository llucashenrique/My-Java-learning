package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Car {

    private String model;
    private String year;
    private String color;

    public void init (String model, String year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
        this.Printer();
    }

    public void Printer(){
        System.out.println(model);
        System.out.println(year);
        System.out.println(color);
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getYear(){
        return this.year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}

