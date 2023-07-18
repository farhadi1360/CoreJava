package ir.edu.farhadi.java.practice.services;

import ir.edu.farhadi.java.practice.models.Penalty;
import ir.edu.farhadi.java.practice.models.RedLight;
import ir.edu.farhadi.java.practice.models.SpeedLimit;
import ir.edu.farhadi.java.practice.models.User;
import ir.edu.farhadi.java.practice.repository.GenericRepository;
import ir.edu.farhadi.java.practice.repository.UserDAO;
import ir.edu.farhadi.java.practice.utils.Calculations;

public class UserServiceImpl implements UserService{
    private GenericRepository<User> userDAO = new UserDAO();
    WalletService walletService = new WalletServiceImplTOP();
    @Override
    public void save(User user) {
    userDAO.save(user);
    }

    @Override
    public User update(User user) {
        User userUpdated = userDAO.update(user);
        return userUpdated;
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public User findByID(User user) {
        return userDAO.findByID(user);
    }

    @Override
    public void deposit(User user) {
        System.out.println(" User with name of ".concat(user.getName()).concat("deposited ".concat(Double.toString(user.getWallet().amount()))));
        walletService.save(user.getWallet());
    }

    @Override
    public void charge(User user , Penalty penalty) {
        double resultCalculated;
        if (penalty instanceof RedLight){
            RedLight redLight = (RedLight) penalty;
            resultCalculated = Calculations.calculateRedLight(redLight.getPenaltyFee());
            walletService.charge(resultCalculated);
        }else if (penalty instanceof SpeedLimit){
            SpeedLimit speedLimit = (SpeedLimit) penalty;
            resultCalculated = Calculations.calculateRedLight(speedLimit.getPenaltyFee());
            walletService.charge(resultCalculated);
        }
    }
}
