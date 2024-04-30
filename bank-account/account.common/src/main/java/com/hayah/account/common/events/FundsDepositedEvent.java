package com.hayah.account.common.events;

import com.hayah.account.common.dto.AccountType;
import com.hayah.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundsDepositedEvent extends BaseEvent {
    private double amount;

    @Builder
    public FundsDepositedEvent(String id,
                              int version,
                              double amount) {
        super(id, version);
        this.amount = amount;
    }

}
