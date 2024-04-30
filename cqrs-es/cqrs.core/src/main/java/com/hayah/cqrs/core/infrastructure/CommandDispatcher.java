package com.hayah.cqrs.core.infrastructure;

import com.hayah.cqrs.core.commands.BaseCommand;
import com.hayah.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
