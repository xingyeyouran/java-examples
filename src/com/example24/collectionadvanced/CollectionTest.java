package com.example24.collectionadvanced;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    private static List<User> users = create();

    private static List<User> create() {
        users = new ArrayList<>();
        User user = new User("BO");
        User user2 = new User("SUN");
        User user3 = new User("SUN");
        User user4 = new User("ZHANG");
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }

    public static void main(String[] args) {
        // getConcurrentModificationException();
        // getIterator();
        // getRemoveIf();
    }

    private static void getConcurrentModificationException() {
        // 试图在foreach遍历时，动态改变集合长度，异常
        /*for (User u : users) {
            if ("BO".equals(u.getName())) {
                users.remove(u);
            }
        }*/
        // 试图在基于索引遍历时，改变集合长度，致使循环次数错误
        for (int i = 0; i < users.size(); i++) {
            if ("SUN".equals(users.get(i).getName())) {
                users.remove(i);
            }
        }
        users.forEach(u -> System.out.println(u.getName()));
    }

    private static void getIterator() {
        Iterator<User> iUsers = users.iterator();
        while (iUsers.hasNext()) {
            User u = iUsers.next();
            if ("SUN".equals(u.getName())) {
                iUsers.remove();
            }
        }
        users.forEach(u -> System.out.println(u.getName()));
    }
    private static void getRemoveIf() {
        users.removeIf(u -> "SUN".equals(u.getName()));
        users.forEach(u -> System.out.println(u.getName()));
    }
}
