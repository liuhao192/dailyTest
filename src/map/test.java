package map;

/**
 * @author: LiuHao
 * @Date: 2019/4/3
 * @Time: 23:17
 * @Description: LiuHao 2019/4/3 23:17
 */
public class test {
    public static void main(String[] args) {
        JobDataMap jobDetail =new JobDataMap();
        jobDetail.putAsString("jobId", "1233");
        JobDataMap jobDetail2 =new JobDataMap();
        jobDetail2.putAsString("jobId", "1231222223");
        jobExecutionContext jobExecutionContext= new  jobExecutionContext(jobDetail);
        jobExecutionContext jobExecutionContext1= new  jobExecutionContext(jobDetail2);
        JobDataMap dataMap =jobExecutionContext.getJobDataMap();

        String recordId = (String) dataMap.get("jobId");
        System.out.println(recordId);
        JobDataMap dataMap1 =jobExecutionContext1.getJobDataMap();

        String recordId1 = (String) dataMap1.get("jobId");
        System.out.println(recordId1);
    }

}



