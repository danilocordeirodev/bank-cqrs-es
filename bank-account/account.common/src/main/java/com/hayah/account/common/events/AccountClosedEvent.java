package com.hayah.account.common.events;

import com.hayah.cqrs.core.events.BaseEvent;
import lombok.Builder;
import lombok.Data;

@Data
public class AccountClosedEvent extends BaseEvent {
    @Builder
    public AccountClosedEvent(String id,
                               int version) {
        super(id, version);
    }
}
