package net.jaayou.web.users;

import net.jaayou.dao.users.UserDao;
import net.jaayou.domain.users.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/form")
	public String form() {
		log.debug("form method~");
		return "users/form";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String create(User user) {
		log.debug("User : " + user);
		userDao.create(user);
		log.debug("Database : {}", userDao.findById(user.getUserId()));
		return "users/form";
	}
}
