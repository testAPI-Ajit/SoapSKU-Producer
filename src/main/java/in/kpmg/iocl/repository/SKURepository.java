package in.kpmg.iocl.repository;

import in.kpmg.iocl.model.SKUModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SKURepository extends JpaRepository<SKUModel,Long> {
    @Query(value= "Select * from tb_SKU_Data sac WHERE sac.mantr= :materialCode AND sac.meinh= :alt_from_uom AND sac.meins= :alt_to_uom AND sac.umrez= :conversion_factor", nativeQuery = true)
    public List<SKUModel> getSKUData(
    @Param("materialCode") String materialCode,
    @Param("alt_from_uom") String alt_from_uom,
    @Param("alt_to_uom") String alt_to_uom,
    @Param("conversion_factor") String conversion_factor
);
}









