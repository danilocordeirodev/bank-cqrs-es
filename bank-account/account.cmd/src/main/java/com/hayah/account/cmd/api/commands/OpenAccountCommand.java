package com.hayah.account.cmd.api.commands;

import com.hayah.account.common.dto.AccountType;
import com.hayah.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}