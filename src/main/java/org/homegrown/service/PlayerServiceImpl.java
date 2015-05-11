package org.homegrown.service;

import com.google.common.collect.Lists;
import org.homegrown.domain.Player;
import org.homegrown.domain.Player_;
import org.homegrown.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by JoLe on 16/04/15.
 */
@Service("playerService")
@Repository
@Transactional
public class PlayerServiceImpl implements PlayerService {

    Logger logger = LoggerFactory.getLogger(PlayerService.class);

    @Autowired
    private PlayerRepository playerRepo;

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Player> findAll(){
        return Lists.newArrayList(playerRepo.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Player findById(final Long id) {
        return playerRepo.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Player> findByCriteria(final String firstName, final String lastName) {

        logger.info("Finding player for firstName: " + firstName + " and lastName: " + lastName);

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Player> criteriaQuery = cb.createQuery(Player.class);
        Root<Player> playerRoot = criteriaQuery.from(Player.class);

        criteriaQuery.select(playerRoot).distinct(true);

        Predicate criteria = cb.conjunction();

        // First Name
        if (firstName != null) {
            javax.persistence.criteria.Predicate p = cb.like(playerRoot.get(Player_.firstName), "%" + firstName + "%");
            criteria = cb.and(criteria, p);
        }

        // Last Name
        if (lastName != null) {
            javax.persistence.criteria.Predicate p = cb.like(playerRoot.get(Player_.lastName), "%" + lastName + "%");
            criteria = cb.and(criteria, p);
        }

        criteriaQuery.where(criteria);
        List<Player> result = em.createQuery(criteriaQuery).getResultList();
        return result;
    }

    @Override
    public Player save(final Player player) {
        return playerRepo.save(player);
    }



}
