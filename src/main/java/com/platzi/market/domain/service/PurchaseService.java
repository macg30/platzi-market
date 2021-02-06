package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;
import com.platzi.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }

    /**
    public Optional<Purchase> getPurchase(int idPurchase) {
        return purchaseRepository.getPurchase(idPurchase);
    }
    **/
    public Optional<List<Purchase>> getByClient(String clientId) {
        return purchaseRepository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    /**
    public boolean delete(int purchaseId) {
        if (getPurchase(purchaseId).isPresent()) {
            purchaseRepository.delete(purchaseId);
            return true;
        } else {
            return false;
        }
    }
     **/
}
