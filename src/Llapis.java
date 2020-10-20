public class Llapis implements Comparable {
    int color;
    float gruix;


//(int) (Math.random()*7 + 1)
    //(float) (Math.random()*3)

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }



    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}';
    }

    public Llapis(int color) {
        this.color = color;
    }

    public Llapis(int color , float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
