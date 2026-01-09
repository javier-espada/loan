package com.example.loan.services;

import com.example.loan.models.Loan;
import com.example.loan.models.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UserService {
    private static HashMap<Long, User> usuarios;

    public static void testUsers() {
        long testId = 0L;
        usuarios.put(testId++, new User("Tania", "Rguez",2500));
        usuarios.put(testId++, new User("Carlos", "Rivera",1000));
        usuarios.put(testId++, new User("Alicia", "Lopez",2000));
        usuarios.put(testId++, new User("Javier", "Espada",2000));
    }

    public static User getUser(long id) {
        return usuarios.get(id);
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
