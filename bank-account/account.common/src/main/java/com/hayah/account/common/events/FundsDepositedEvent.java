package com.hayah.account.common.events;

import com.hayah.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FundsDepositedEvent extends BaseEvent {
    private double amount;
}
