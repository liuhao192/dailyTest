/**
 * @author: LiuHao
 * @Date: 2019/2/27
 * @Time: 23:48
 * @Description: LiuHao 2019/2/27 23:48
 * enum和switch结合在一起
 */
public enum Spiciness {

    NOT,MILD,MEDIUM,HOT,FLAMING

}

class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describre(){
        switch (degree){
            case HOT:
                System.out.println("HOT");
                break;
            case MILD:
                System.out.println("MILD");
                break;
            case FLAMING:
                System.out.println("FLAMING");
                break;
        }
    }
    public static void main(String[] args) {
        Burrito burrito =new Burrito(Spiciness.HOT);
        burrito.describre();
    }

}

