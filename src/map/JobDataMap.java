package map;

import java.io.Serializable;

/**
 * @author: LiuHao
 * @Date: 2019/4/3
 * @Time: 23:15
 * @Description: LiuHao 2019/4/3 23:15
 */
public class JobDataMap extends StringKeyDirtyFlagMap implements Serializable {
    public void putAsString(String key, String value) {
        super.put(key, value);
    }
}
