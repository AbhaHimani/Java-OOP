public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel= model.toLowerCase();
        if (validModel.equals("porsche")|| validModel.equals("holden")){
            this.model=model;

        }
        else{
            this.model="Unknown";
        }
//        this.model= model;
    }
    public String getModel(){
        return this.model;
    }


}


