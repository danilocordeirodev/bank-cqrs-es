package com.hayah.account.common.events;

import com.hayah.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundsWithdrawnEvent extends BaseEvent {
    private double amount;

    @Builder
    public FundsWithdrawnEvent(String id,
                               int version,
                               double amount) {
        super(id, version);
        this.amount = amount;
    }
}
