package map;

/**
 * @author: LiuHao
 * @Date: 2019/4/3
 * @Time: 23:15
 * @Description: LiuHao 2019/4/3 23:15
 */
public class StringKeyDirtyFlagMap extends DirtyFlagMap<String, Object> {
    public void put(String key, String value) {
        super.put(key, value);
    }
}

