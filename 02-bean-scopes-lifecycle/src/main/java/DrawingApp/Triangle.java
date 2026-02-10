package DrawingApp;

public class Triangle {

    private String type;
    private int height;

    public int getHeight(){
        return height;
    }

    // Constructor injection
    Triangle(String type){
        this.type = type;
    }

    Triangle(int height){
        this.height = height;
    }

    Triangle(String type, int height){
        this.type = type;
        this.height = height;
    }

    // Setter injection
    /*
    public void setType(String type){
        this.type = type;
    }
     */

    public String getType(){
        return this.type;
    }

    public void draw(){
        System.out.println(getType() + " triangle drawn of height " + getHeight());
    }
}
