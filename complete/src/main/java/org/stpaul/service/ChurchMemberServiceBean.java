package org.stpaul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.stpaul.BaseServiceBean;
import org.stpaul.model.ChurchMember;
import org.stpaul.repository.ChurchMemberRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by tjc4h on 3/10/2017.
 */
@Service
@CacheConfig(cacheResolver = "customCacheResolver")
public class ChurchMemberServiceBean extends BaseServiceBean<ChurchMember, ChurchMemberRepository> implements ChurchMemberService {

    @Override
    public long count() {
        return 0;
    }

    @Override
    public List<ChurchMember> findAll() {
        return null;
    }

    public ChurchMember findById(@NotNull Long id) {return findById(id);
    }

    @Override
    public ChurchMember create(ChurchMember var1) {
        return null;
    }

    @Override
    public ChurchMember update(ChurchMember var1) {
        return null;
    }

    @Override
    public void delete(Long var1) {

    }

    @Override
    public void evictCache() {

    }

}
