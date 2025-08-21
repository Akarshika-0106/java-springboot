package codingpractice.LowLevelDesign.PracticeQuestions.PaymentGateway.User;

public class UserController {

    private UserService userService;

    public UserController(){
        userService = new UserService();
    }

    public void addUser(UserDo userDo){
        userService.addUser(userDo);
    }

    public UserDo getUserById(int userId){
        return userService.getUserById(userId);
    }
}
