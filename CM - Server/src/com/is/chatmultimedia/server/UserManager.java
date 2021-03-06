package com.is.chatmultimedia.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.is.chatmultimedia.server.models.User;

public class UserManager {

  private Map<String, User> users;
  private static UserManager instance;

  private UserManager() {
    users = new ConcurrentHashMap<>();
  }

  public static UserManager getInstance() {
    if (instance == null) {
      instance = new UserManager();
    }
    return instance;
  }

  public void addUser(User user) {
    users.put(user.getUsername(), user);
  }

  public User removeUser(User user) {
    return users.remove(user.getUsername());
  }

  public User getUserByUsername(String username) {
    return users.get(username);
  }

  public int getNumberOfUsers() {
    return users.size();
  }

  public List<String> getListOfUsers() {
    ArrayList<String> list = new ArrayList<String>();
    for (String it : users.keySet()) {
      list.add(it);
    }
    return list;
  }

}
