package machine.coding.practice.LLD.Practice.PaymentGateway.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {
    private static List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
    }

    public void addUser(UserDo userDo){
        User user = new User();
        user.setUserId(new Random().nextInt(1000));
        user.setUserName(userDo.getName());
        user.setUserEmail(userDo.getEmail());
        userList.add(user);
    }

    public UserDo getUserById(int userId){
        for(User user:userList){
            if(user.getUserId() == userId){
                return convertUserToUserDo(user);
            }
        }
        return null;
    }

    public UserDo convertUserToUserDo(User user){
        UserDo userDo = new UserDo();
        userDo.setId(user.getUserId());
        userDo.setName(user.getUserName());
        userDo.setEmail(user.getUserEmail());
        return userDo;
    }
}
