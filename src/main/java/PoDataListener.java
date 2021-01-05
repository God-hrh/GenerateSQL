import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: GenerateSQL
 * @description: Excel监听器
 * @author: heruihao
 * @create: 2021-01-05 14:10
 **/
public class PoDataListener <T> extends AnalysisEventListener<T> {
    List<T> list = new ArrayList<>();
    @Override
    public void invoke(T t, AnalysisContext analysisContext) {
        list.add(t);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("共解析Excel"+list.size()+"条数据");
    }

    public List<T> getResult(){
        return list;
    }

}
