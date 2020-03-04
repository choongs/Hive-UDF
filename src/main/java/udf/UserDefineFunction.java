package udf;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public final class UserDefineFunction extends UDF {


    private final String AES = "AES";
    private final String KEY = "";

    @Description(
            name = "UserDefineFunction",
            value = "return user(data)",
            extended = "select user(data) from targetTable"
    )
    public Text evaluate(Text data){
        //logic 구현
        return new Text(data);
    }
}
