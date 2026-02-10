package DrawingApp;

public class Triangle {

    private String type;

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void draw(){
        System.out.println(getType() + " triangle drawn");
    }
}
