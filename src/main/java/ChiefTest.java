import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChiefTest {
    public static void main(String[] args) throws IOException {
        String unlockedStr = getFileContent(".\\src\\main\\resources\\have.txt");
        List<Dish> unLockedDishes = JSONObject.parseArray(unlockedStr, Dish.class);
        Map<String, Boolean> unLockedDisheMap = new HashMap<String, Boolean>(64);
        for (Dish d : unLockedDishes) {
            unLockedDisheMap.put(d.getName(), true);
        }
        String assist_ingredients = getFileContent(".\\src\\main\\resources\\ingredient.txt");
        Map<String, Boolean> assist_ingredientMap = getMap(assist_ingredients);
        String core = getFileContent(".\\src\\main\\resources\\core.txt");
        Map<String, Boolean> coreMap = getMap(core);
        String all = getFileContent(".\\src\\main\\resources\\all.txt");
        String[] dish = all.split("\r\n");
        Boolean nothing = true;
        System.out.println("务必按照顺序做菜，取得最优解");
        for (String s : dish) {
            String[] t = s.split("\t");
            Dish d = new Dish(t[1], t[2], t[3], t[4]);
            if (!unLockedDisheMap.containsKey(d.getName())
                    && coreMap.containsKey(d.getCore())
                    && assist_ingredientMap.containsKey(d.getAssist_ingredient1())
                    && assist_ingredientMap.containsKey(d.getAssist_ingredient2())) {
                System.out.println(d);
                nothing=false;
            }
        }
        if(nothing){
            System.out.println("nothing");
            System.out.println("已解锁"+(unLockedDishes.size()+1)+"道菜");
        }else{
            System.out.println("招牌菜除外");
        }
    }

    public static String getFileContent(String name) throws IOException {
        FileInputStream fip = new FileInputStream(name);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        reader.close();
        return sb.toString();
    }

    /**
     * description: 返回材料映射
     * @param assistIngredients 1 材料json
     * @return java.util.Map<java.lang.String,java.lang.Boolean> 材料map
     */
    public static Map<String, Boolean> getMap(String assistIngredients) {
        List<Ingredient> assistIngredientList = JSONObject.parseArray(assistIngredients, Ingredient.class);
        Map<String, Boolean> assistIngredientMap = new HashMap<String, Boolean>(64);
        for (Ingredient i : assistIngredientList) {
            assistIngredientMap.put(i.getName(), true);
        }
        return assistIngredientMap;
    }
}
