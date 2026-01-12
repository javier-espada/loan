package com.example.loan.services;

import com.example.loan.models.Loan;
import com.example.loan.models.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;

@Service
public class TestUserService {
    private static HashMap<Long, User> usuarios = new HashMap<>();

    public TestUserService() {
        long testId = 0L;
        usuarios.put(0L, new User("Tania", "Rodríguez",2500));
        usuarios.put(1L, new User("Carlos", "Rivera",1000));
        usuarios.put(2L, new User("Alicia", "Lopez",2000));
        usuarios.put(3L, new User("Javier", "Espada",2000));
    }

    public User getUser(long id) {
        return usuarios.get(id);
    }

    public HashMap<Long, User> getUsuarios() {
        return usuarios;
    }

    public static int existingUnpaidLoans (long clientId) {
        int cnt = 0;
        User usuario = usuarios.get(clientId);
        Iterator itLoans = usuario.getLoans().iterator();
        Loan loan = null;

        while(itLoans.hasNext()){
            loan = (Loan) itLoans.next();
            if(loan.isPaid()){
                continue;
            }
            cnt++;
        }

        return cnt;
    }
}
