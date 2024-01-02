package in.kpmg.iocl.repository;

import in.kpmg.iocl.model.SKUModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SKURepository extends JpaRepository<SKUModel,Long> {
    @Query(value= "Select * from yv_material_master_all_views_e_marm sac WHERE sac.mantr= :materialCode AND sac.meinh= :alt_from_uom AND sac.meins= :alt_to_uom AND sac.UMREN :denominator_conversion AND sac.umrez= :numerator_conversion", nativeQuery = true)
    public List<SKUModel> getSKUData(
    @Param("materialCode") String materialCode,
    @Param("alt_from_uom") String alt_from_uom,
    @Param("alt_to_uom") String alt_to_uom,
    @Param("denominator_conversion") String denominator_conversion,
    @Param("numerator_conversion") String numerator_conversion
);
}









