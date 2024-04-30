package com.hayah.cqrs.core.events;

import com.hayah.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEvent extends Message {
    private int version;

    public BaseEvent(String id, int version) {
        super(id);
        this.version = version;
    }
}
