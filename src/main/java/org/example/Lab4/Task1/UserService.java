package org.example.Lab4.Task1;

public class UserService implements UserRepository {
    private UserRepository userRepository;
    @Override
    public User findUserById(long id) {
        return userRepository.findUserById(id);
    }
}
