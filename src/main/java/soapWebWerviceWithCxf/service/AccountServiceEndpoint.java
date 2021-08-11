package soapWebWerviceWithCxf.service;

import generated.com.tarawebservice.accounts.AccountService;
import generated.tarawebservice.accountservice.*;
import org.springframework.stereotype.Service;

/**
 * created by Atiye Mousavi
 * Date: 8/6/2021
 * Time: 1:48 PM
 */
@Service
public class AccountServiceEndpoint implements AccountService {
    @Override
    public AccountDetailsResponse getAccountDetails(AccountDetailsRequest parameters) {
        ObjectFactory factory=new ObjectFactory();
        AccountDetailsResponse response=factory.createAccountDetailsResponse();
        Account account=factory.createAccount();
        account.setAccountNumber("09122468246");
        account.setAccountStatus(EnumAccountStatus.ACTIVE);
        account.setAccountName("atiye mousavi");
        account.setAccountBalance(10000000);
        response.setAccountDetails(account);
        return response;
    }
}
