package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.domain.Admin;
import com.etoiledespoir.onlinekvshop.repository.AdminRepo.AdminRepository;

public class AdminRepoFactory {
    public static AdminRepository getAdmin()
    {
        return  AdminRepository.getAdm();
    }
}
