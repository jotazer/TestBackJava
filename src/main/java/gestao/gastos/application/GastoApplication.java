package gestao.gastos.application;

import gestao.gastos.model.GastoModel;

import java.time.LocalDateTime;
import java.util.List;

public interface GastoApplication {

    public void save(GastoModel gastoModel);

    public List<GastoModel> findByData(LocalDateTime data);
}
