package Project.OnlineUser.Repo;

import Project.OnlineUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface  UserRepo extends JpaRepository<User,Integer> {
}
