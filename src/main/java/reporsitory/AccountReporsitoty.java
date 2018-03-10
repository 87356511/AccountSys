package reporsitory;

import domain.Account;


import java.util.List;

public interface AccountReporsitoty {
    List<Account> list();
    Account account(int number);

}
