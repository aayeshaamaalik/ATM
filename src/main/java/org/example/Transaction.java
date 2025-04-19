package org.example;

import java.util.Date;

public interface Transaction {
    String getId();
    TransactionStatus getStatus();
    Date getCreatedOn();
}

