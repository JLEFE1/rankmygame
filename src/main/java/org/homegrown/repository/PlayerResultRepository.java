package org.homegrown.repository;

import org.homegrown.domain.Player;
import org.homegrown.domain.PlayerResult;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by JoLe on 22/04/15.
 */
public interface PlayerResultRepository extends CrudRepository<PlayerResult,Long> {
}
