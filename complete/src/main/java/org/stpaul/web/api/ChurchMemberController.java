package org.stpaul.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.stpaul.model.ChurchMember;
import org.stpaul.service.ChurchMemberService;

/**
 * Created by tjc4h on 3/10/2017.
 */
public class ChurchMemberController {

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChurchMember> getChurchMemberById(@PathVariable("id") Long id) {
        ChurchMember churchMember = ChurchMemberService.findById(id);
        if (churchMember == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(churchMember);
    }
}
