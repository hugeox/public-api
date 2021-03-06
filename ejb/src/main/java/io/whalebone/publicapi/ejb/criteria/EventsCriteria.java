package io.whalebone.publicapi.ejb.criteria;

import io.whalebone.publicapi.ejb.dto.EReason;
import io.whalebone.publicapi.ejb.dto.EThreatType;
import lombok.Builder;
import lombok.Getter;

@Getter
public class EventsCriteria extends ClientCriteria {
    private EThreatType type;
    private EReason reason;

    @Builder
    public EventsCriteria(String clientId,
                          String domain,
                          int days,
                          Integer resolverId,
                          String clientIp,
                          EThreatType type,
                          EReason reason) {
        super(clientId, domain, days, resolverId, clientIp);
        this.type = type;
        this.reason = reason;
    }
}
