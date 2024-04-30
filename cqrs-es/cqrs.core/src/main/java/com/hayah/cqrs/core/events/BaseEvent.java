package com.hayah.cqrs.core.events;

import com.hayah.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEvent extends Message {
    private int version;
}
