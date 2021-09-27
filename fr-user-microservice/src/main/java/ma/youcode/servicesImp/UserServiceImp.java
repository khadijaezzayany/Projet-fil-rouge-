package ma.youcode.servicesImp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ma.youcode.models.ERole;
import ma.youcode.models.Role;
import ma.youcode.models.User;
import ma.youcode.repository.RoleRepository;
import ma.youcode.repository.UserRepository;
import ma.youcode.security.Utils;
import ma.youcode.services.UserService;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
//
	@Autowired
	Utils utils;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	
	
	
	
	
	
	
	
	public UserServiceImp(UserRepository userRepository2) {
		// TODO Auto-generated constructor stub
	}












	@Override
	public User updateUser(String userId, User userUp) {
		User userEntities = userRepository.findByUserId(userId);
		if (userEntities == null)
			throw new UsernameNotFoundException(userId);
		userEntities.setPhone(userUp.getPhone());
		

		userRepository.save(userEntities);

		return userEntities;

	}
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public List<User> getUsers(int page, int limit) {
		if (page > 0)
			page -= 1;
		List<User> userList = new ArrayList<>();
		Pageable pageableRequest = PageRequest.of(page, limit);
		Page<User> userPage = userRepository.findAll(pageableRequest);

		List<User> users = userPage.getContent();
		for (User userEntity : users) {
			userList.add(userEntity);

		}

		return userList;
	}

	
	
	
	
	
	
	
	
	
	
	@Override
	public User getUserByUserId(String userId) {
		User userEntities = userRepository.findByUserId(userId);
		if (userEntities == null)
			throw new UsernameNotFoundException(userId);
		return userEntities;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void deleteUser(String userId) {
		User userEntities = userRepository.findByUserId(userId);
		if (userEntities == null)
			throw new UsernameNotFoundException(userId);
		userRepository.delete(userEntities);
	}












	@Override
	public User createUser(User user) {

				user.setUserId(utils.genereteStringId(30));
		return user;
	}
}
