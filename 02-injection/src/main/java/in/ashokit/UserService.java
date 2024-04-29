package in.ashokit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.UserDao;


@Service
public class UserService {
		@Autowired
		private UserDao userdao;//FI will perform by Reflection API
		
		
//		public UserService() {
//			System.out.println("UserService ::default constructor");
//		}
	//	
//		@Autowired
//		public UserService (UserDao userdao) {
//			System.out.println("UserService ::param constructor");
//			this.userdao= userdao;
//		}
		
		
		
//		@Autowired
//		public void setuserdao( UserDao userdao) {
//			this.userdao=userdao;
//		}
		
		public void getName() {
			String name = userdao.findName(100);
			System.out.println(name);
			}
		}


