package com.Benelzane.pojo.account;

import java.util.Objects;

public class Account {
    private String accountId;
    private String accountName;

    protected Account(){}

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public static class AccountBuilder{
        private String accountId;
        private String accountName;

        public AccountBuilder buildAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public AccountBuilder buildAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Account buildAccount(){
            Account account = new Account();
            account.accountId = this.accountId;
            account.accountName = this.accountName;
            return account;
        }

    }//end of Account builder class

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId) && Objects.equals(accountName, account.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountName);
    }
}//end of Account class
