import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

@Slf4j
public class RumspielKlasse {


    public static void main(String[] args) {

        Schema schema = ReflectData.get().getSchema(ListExample.class);

    }

}


