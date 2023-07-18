package ir.edu.farhadi.java.practice.services;

import ir.edu.farhadi.java.practice.models.Wallet;
import ir.edu.farhadi.java.practice.repository.GenericRepository;
import ir.edu.farhadi.java.practice.repository.WalletDAO;

public class WalletServiceImpUP implements WalletService{

    private GenericRepository<Wallet> walletDAO = new WalletDAO();

    @Override
    public void save(Wallet wallet) {
        walletDAO.save(wallet);
        // walletDAO.mack(wallet);
    }

    @Override
    public Wallet update(Wallet wallet) {
        Wallet walletUpdated = walletDAO.update(wallet);
        return walletUpdated;
    }

    @Override
    public void delete(Wallet wallet) {
        walletDAO.delete(wallet);
    }

    @Override
    public Wallet findByID(Wallet wallet) {
        return walletDAO.findByID(wallet);
    }

    @Override
    public void charge(Double fee) {
        System.out.println(Double.toString(fee).concat(" using UP  Services for  charged "));
    }
}
