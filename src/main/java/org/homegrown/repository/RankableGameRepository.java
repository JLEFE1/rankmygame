package org.homegrown.repository;

import org.homegrown.domain.Game;
import org.homegrown.domain.RankableGame;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by JoLe on 22/04/15.
 */
public interface RankableGameRepository extends CrudRepository<RankableGame,Long> {

}
