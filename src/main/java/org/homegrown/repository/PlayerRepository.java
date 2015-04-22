package org.homegrown.repository;

import org.homegrown.domain.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by JoLe on 22/04/15.
 */
public interface PlayerRepository extends CrudRepository<Player,Long> {
}
