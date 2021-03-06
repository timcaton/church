package org.stpaul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stpaul.BaseJpaRepository;
import org.stpaul.model.ChurchMember;

/**
 * Created by tjc4h on 3/10/2017.
 */
@Repository
public interface ChurchMemberRepository extends BaseJpaRepository<ChurchMember, Long> {
    ChurchMember findById(Long id);
}
