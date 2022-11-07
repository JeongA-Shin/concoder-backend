package oncoding.concoder.model;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Snapshot extends JpaBaseEntity {
    
    @CreatedDate
    @Column(updatable=false, nullable = false)
    private LocalDateTime createdDate;
    
    
    @LastModifiedDate
    @Column(updatable=false, nullable = false)
    private LocalDateTime modifiedDate;
    
    @Column
    @NotNull
    private String memo;
    
    @Column
    @NotNull
    private String content;
    
    
    public void setMemo(String memo){
        this.memo = memo;
    }
    
}
