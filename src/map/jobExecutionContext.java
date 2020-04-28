package map;

/**
 * @author: LiuHao
 * @Date: 2019/4/3
 * @Time: 23:21
 * @Description: LiuHao 2019/4/3 23:21
 */
public class jobExecutionContext {
    private JobDataMap jobDataMap;

    public jobExecutionContext(JobDataMap jobDataMap) {
        this.jobDataMap = jobDataMap;
    }

    public JobDataMap getJobDataMap() {
        return this.jobDataMap;
    }
}
