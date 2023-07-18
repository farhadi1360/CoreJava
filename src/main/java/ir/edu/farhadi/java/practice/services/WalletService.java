package ir.edu.farhadi.java.practice.services;

import ir.edu.farhadi.java.practice.models.Wallet;

public interface WalletService {
    void save(Wallet wallet);

    Wallet update(Wallet wallet);

    void delete(Wallet wallet);

    Wallet findByID(Wallet wallet);


    void charge(Double fee);
}
