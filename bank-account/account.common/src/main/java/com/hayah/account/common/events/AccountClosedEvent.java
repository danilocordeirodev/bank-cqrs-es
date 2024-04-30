package com.hayah.account.common.events;

import com.hayah.cqrs.core.events.BaseEvent;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountClosedEvent extends BaseEvent {
}
