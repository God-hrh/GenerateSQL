import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: GenerateSQL
 * @description: sql属性拼接的实体类
 * @author: heruihao
 * @create: 2021-01-05 11:46
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KefuPo {
    private int role;
    private String misNumber;
}
