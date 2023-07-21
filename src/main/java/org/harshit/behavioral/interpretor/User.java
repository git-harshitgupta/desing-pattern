package org.harshit.behavioral.interpretor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class User {

    private final List<String> permissions;
    private final String username;

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUsername() {
        return username;
    }

    public User(String username, String... permissions){
        this.username = username;
        this.permissions = new ArrayList<>();
        Arrays.stream(permissions).forEach(p->this.permissions.add(p.toLowerCase()));
    }

}
