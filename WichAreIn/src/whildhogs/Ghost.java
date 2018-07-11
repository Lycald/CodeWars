package whildhogs;

public class Ghost{
    public String color;

    public Ghost() {
        int i = (int) (Math.random()*4);
        System.out.println(i);
        switch (i) {
            case 0:
                this.color = "white";
                break;
            case 1:
                this.color = "yellow";
                break;
            case 2:
                this.color = "red";
                break;
            case 3:
                this.color = "purple";
                break;
        }
    }
    public String getColor() {
        return color;
    }

}
