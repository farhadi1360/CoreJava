package ir.edu.farhadi.java.practice.repository;

import ir.edu.farhadi.java.practice.models.Wallet;

import java.util.List;

public class WalletDAO extends GenericRepository<Wallet> {

    @Override
    public void save(Wallet wallet) {
        System.out.println("wallet with amount of ".concat(Double.toString(wallet.amount())).concat(" was saved"));
    }

    @Override
    public Wallet update(Wallet wallet) {
        System.out.println("wallet with amount of ".concat(Double.toString(wallet.amount())).concat(" was updated"));
        return wallet;
    }

    @Override
    public void delete(Wallet wallet) {
        System.out.println("wallet with amount of ".concat(Double.toString(wallet.amount())).concat(" was deleted"));
    }

    @Override
    public Wallet findByID(Wallet wallet) {
        return wallet;
    }

    @Override
    public List<Wallet> getAll() {
        return null;
    }
}
