import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * @program: GenerateSQL
 * @description:
 * @author: heruihao
 * @create: 2021-01-09 19:03
 **/
public class AssembleJson {
    public static void main(String[] args) {
        String fileName = "/Users/didi/Desktop/1.xlsx";
        PoDataListener<KefuPo> poDataListener = new PoDataListener();
        EasyExcel.read(fileName, KefuPo.class, poDataListener).sheet().doRead();
        List<KefuPo> result = poDataListener.getResult();
        StringBuffer stringBuffer = new StringBuffer();
        for (KefuPo kefuPo : result) {
            stringBuffer.append("{\n" +
                    "        \"misId\": \"");
            stringBuffer.append(kefuPo.getMisNumber()+"\",\n" +
                    "        \"roleType\": 1,\n" +
                    "        \"tenantId\": \"chengxin\"\n" +
                    "    },");
        }
        System.out.println(stringBuffer);
    }
}
