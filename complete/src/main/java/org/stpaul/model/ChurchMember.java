package org.stpaul.model;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

/**
 * Created by tjc4h on 3/10/2017.
 */
@Entity
@Table(name = "CHURCH_MEMBER", uniqueConstraints = {@UniqueConstraint(name = "UK_CHURCH_MEMBER_NAME", columnNames = {"CHURCH_MEMBER_NAME"})})
public class ChurchMember
// need to extend entity manager for boilerplate functions
{

        @Column(name = "CHURCH_MEMBER_NAME")
        @Size(max = 100)
        @NotNull
        private String churchMemberName;

        public String getChurchMemberName() {
            return churchMemberName;
        }

        public void setChurchMemberName(String churchMemberName) {
            this.churchMemberName = churchMemberName;
        }

//        @Id

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (o == null || getClass() != o.getClass()) {
//                return false;
//            }
//            ChurchMember that = (ChurchMember) o;
//            return Objects.equals(this.getId(), that.getId()) &&
//                    Objects.equals(this.getChurchMemberName(), that.getChurchMemberName());
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(super.hashCode(), this.getId(), this.getChurchMemberName());
//        }
}
