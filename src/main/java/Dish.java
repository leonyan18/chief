
/**
 * @author yan
 */
public class Dish {
    private String name;
    private String core;
    private String assist_ingredient1;
    private String assist_ingredient2;

    public Dish(String name, String core, String assist_ingredient1, String assist_ingredient2) {
        this.name = name;
        this.core = core;
        this.assist_ingredient1 = assist_ingredient1;
        this.assist_ingredient2 = assist_ingredient2;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getAssist_ingredient1() {
        return assist_ingredient1;
    }

    public void setAssist_ingredient1(String assist_ingredient1) {
        this.assist_ingredient1 = assist_ingredient1;
    }

    public String getAssist_ingredient2() {
        return assist_ingredient2;
    }

    public void setAssist_ingredient2(String assist_ingredient2) {
        this.assist_ingredient2 = assist_ingredient2;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", core='" + core + '\'' +
                ", assist_ingredient1='" + assist_ingredient1 + '\'' +
                ", assist_ingredient2='" + assist_ingredient2 + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
