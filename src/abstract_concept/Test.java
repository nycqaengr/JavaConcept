package abstract_concept;

public class Test {

    public static void main(String[] args) {

        //MobileUser mobileUser = new MobileUser();
        //can't create object of MobileUser
        //but create reference variable of MobileUser

        MobileUser mUser = new Nurul();
        mUser.call();
        mUser.sendMessage();

        MobileUser mUser2 = new Mahmud();
        mUser2.call();
        mUser2.sendMessage();
    }
}
