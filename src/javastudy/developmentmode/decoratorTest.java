package javastudy.developmentmode;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/16 11:52
 */
public class decoratorTest {

    private interface FileConditionSearch {

        String addCondition(String sql);
    }

    private static  abstract class FileSearchPart implements FileConditionSearch {

        @Override
        public abstract String addCondition(String sql);

    }

    private static class FileNameSearchPart extends FileSearchPart {
        protected String fileName;


        public FileNameSearchPart(String component) {
            fileName=component;
        }


        private String addFileNameSql(String sql) {
            String fileNameSql = "FILE_NAME=%" + fileName + "%@like";
            return sql += fileNameSql;
        }



        @Override
        public String addCondition(String sql) {
            return addFileNameSql(sql);
        }

    }

    private static class BusinessTypeSearchPart extends FileSearchPart {

        protected String businessType;
        public BusinessTypeSearchPart(String component) {
            businessType=component;
        }
        private String addFileNameSql(String sql) {
            String businessTypeSql = "&FILE_BUSINESS_TYPE=" + businessType;
            return sql += businessTypeSql;
        }

        @Override
        public String addCondition(String sql) {
            return addFileNameSql(sql);
        }

    }


    private static class FileSearchPartChan {
        FileSearchPart[] sdp = new FileSearchPart[2];
        int pos = 0;
        int n = 0;
        String res = "";

        void addFileSearchPart(FileSearchPart dc) {
            sdp[n++] = dc;
        }

        public String doFilter(String sql) {
            res = sql;
            internalDoFilter();
            return res;
        }

        void internalDoFilter() {
            while (pos < n) {
                FileSearchPart sqlHandler = sdp[pos];
                pos++;
                res = sqlHandler.addCondition(res);
            }
        }
    }

    public static void main(String[] args) {
        FileSearchPart dc = new FileNameSearchPart("FILE_NAME");
        FileSearchPart dc1 = new BusinessTypeSearchPart("1");
        FileSearchPartChan chain = new FileSearchPartChan();
        chain.addFileSearchPart(dc);
        chain.addFileSearchPart(dc1);
        System.out.println(chain.doFilter(""));
    }
}
