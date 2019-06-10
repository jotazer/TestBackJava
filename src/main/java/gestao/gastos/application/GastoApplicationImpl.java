package gestao.gastos.application;

import gestao.gastos.model.GastoModel;
import gestao.gastos.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class GastoApplicationImpl  implements  GastoApplication {

    @Autowired
    private GastoRepository gastoRepository;

    public void save(GastoModel gastoModel){
        gastoRepository.save(gastoModel);
    }

    public List<GastoModel> findByData(LocalDateTime data){
        return gastoRepository.findByData(data);
    }


}
