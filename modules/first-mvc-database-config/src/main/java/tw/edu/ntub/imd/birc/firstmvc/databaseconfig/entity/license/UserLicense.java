package tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity.license;

import tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity.User;
import tw.edu.ntub.imd.birc.firstmvc.databaseconfig.entity.WaterRecord;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDate;

public class UserLicense {

    @PrePersist
    public void preSave(User user) {
        if (user.getBmi() == null) {
            user.setBmi((double) (user.getWeight() / (user.getHeight() * user.getHeight())));
        }
    }

    @PreUpdate
    public void preUpdate(User user) {
        if (user.getBmi() == null) {
            user.setBmi((double) (user.getWeight() / (user.getHeight() * user.getHeight())));
        }
    }
}
