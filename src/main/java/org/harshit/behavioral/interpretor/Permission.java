package org.harshit.behavioral.interpretor;

public class Permission implements PermissionExpression{

    private final String permission;
    public Permission(String permission){
        this.permission=permission.toLowerCase();
    }
    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
