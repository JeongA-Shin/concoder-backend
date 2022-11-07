package oncoding.concoder.repository;

import java.util.List;
import java.util.UUID;
import oncoding.concoder.model.ProblemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemCategoryRepository extends JpaRepository<ProblemCategory, UUID> {
    List<ProblemCategory> findByCategoryId(UUID id);

}
