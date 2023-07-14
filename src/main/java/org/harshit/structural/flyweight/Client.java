package org.harshit.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        SystemErrorMessage msg = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg.getText("4056"));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
        System.out.println(msg2.getText(null));
    }

}
