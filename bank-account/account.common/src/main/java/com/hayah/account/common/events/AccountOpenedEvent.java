package com.hayah.account.common.events;

import com.hayah.account.common.dto.AccountType;
import com.hayah.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountOpenedEvent extends BaseEvent {
    private String accountHolder;
    private AccountType accountType;
    private Date createdDate;
    private double openingBalance;

    @Builder
    public AccountOpenedEvent(String id,
                              int version,
                              String accountHolder,
                              AccountType accountType,
                              Date createdDate,
                              double openingBalance) {
        super(id, version);
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.createdDate = createdDate;
        this.openingBalance = openingBalance;
    }
}
