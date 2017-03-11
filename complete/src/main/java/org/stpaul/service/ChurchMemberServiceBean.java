package org.stpaul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.stpaul.model.ChurchMember;

import javax.validation.constraints.NotNull;

/**
 * Created by tjc4h on 3/10/2017.
 */
@Service
@CacheConfig(cacheResolver = "customCacheResolver")
public class ChurchMemberServiceBean implements ChurchMemberService {

    public ChurchMember findById(@NotNull Long id) {return findById(id);
    }

    @Override
    public ChurchMember findChurchMemberByName(String churchMemberName) {
        return null;
    }

    @Override
    public ChurchMember findChurchMemberById(Long id) {
        return null;
    }
}
