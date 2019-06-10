package gestao.gastos.repository;

import gestao.gastos.model.GastoModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface GastoRepository  extends MongoRepository<GastoModel, String> {

    @Query("{'data' : {$gt : ?0}}")
    List<GastoModel> findByData(LocalDateTime data);


}
