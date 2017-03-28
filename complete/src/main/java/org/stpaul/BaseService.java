package org.stpaul;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tjc4h on 3/28/2017.
 */
public class BaseService<T extends TransactionalEntity, R extends JpaRepository<T, Long>> {
}
