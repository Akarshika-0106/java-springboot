package machine.coding.practice.LLD.Practice.PaymentGateway.Instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {

    private Map<Integer, List<Instrument>> userIdInstrumentMap;

    public InstrumentService(){
        userIdInstrumentMap = new HashMap<>();
    }

    public abstract void addInstrument(InstrumentDo instrumentDo);

    public abstract List<InstrumentDo> getInstrumentsByUserId();
}
