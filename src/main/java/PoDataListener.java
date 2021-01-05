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
public class PoDataListener extends AnalysisEventListener<KefuPo> {
    List<KefuPo> list = new ArrayList<>();
    @Override
    public void invoke(KefuPo t, AnalysisContext analysisContext) {
        list.add(t);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }

    public List<KefuPo> getResult(){
        return list;
    }

}
