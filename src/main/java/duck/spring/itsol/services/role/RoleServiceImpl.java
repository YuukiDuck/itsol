<<<<<<< HEAD
package duck.spring.itsol.services.role;

import duck.spring.itsol.models.Role;
import duck.spring.itsol.repositories.RoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{
    private final RoleRepo roleRepo;
    @Override
    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }
}
=======
//package duck.spring.itsol.services.role;
//
//import duck.spring.itsol.models.Role;
//import duck.spring.itsol.repositories.RoleRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class RoleServiceImpl implements RoleService{
//    private final RoleRepo roleRepo;
//    @Override
//    public List<Role> getAllRoles() {
//        return roleRepo.findAll();
//    }
//}
>>>>>>> 5e37fb11d587543ea3407f4acfb082ec00170d9c
