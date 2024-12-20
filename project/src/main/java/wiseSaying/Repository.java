package wiseSaying;

import java.util.Optional;
import java.util.Set;

public interface Repository {
    Long add(WiseSaying wise);

    Optional<WiseSaying> findById(Long id);

    Set<WiseSaying> findByContent(String content);

    Long modify(Long id, String content, String author);

    Set<WiseSaying> findAll();

    Long remove(Long id);
}
