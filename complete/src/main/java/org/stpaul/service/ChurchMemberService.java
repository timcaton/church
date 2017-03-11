package org.stpaul.service;

import org.stpaul.model.ChurchMember;

/**
 * Created by tjc4h on 3/10/2017.
 */
public interface ChurchMemberService {
    ChurchMember findChurchMemberByName(String churchMemberName);
    ChurchMember findById(Long id);
}
