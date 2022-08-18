public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "User 1");
        User user2 = new UserImpl(mediator, "User 2");
        User user3 = new UserImpl(mediator, "User 3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Tes");
    }
}