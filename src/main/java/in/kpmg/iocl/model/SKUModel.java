package in.kpmg.iocl.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="yv_material_master_all_views_e_marm")
public class SKUModel {
        @Id
        private Long id;
        private Boolean isActive = true;
        @CreationTimestamp
        @Column(name="createddate")
        public LocalDateTime createdOn;
        @UpdateTimestamp
        @Column(name="modifieddate")
        public LocalDateTime modifiedDate;

        private String MANTR;
        private String UMREN;
        private String MEINH;
        private String SEPRTR;
        private String UMREZ;
        private String MEINS;
    }

