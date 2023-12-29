package in.kpmg.iocl.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="tb_SKU_Data")
public class SKUModel {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
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

