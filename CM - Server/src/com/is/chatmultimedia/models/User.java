package com.is.chatmultimedia.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeMap;

public class User implements Serializable {

  private String username;
  private String name;
  private TreeMap<String, Friend> friends;
  private static final long serialVersionUID = 1;

  public User(String username, String name, TreeMap<String, Friend> friends) {
    this.username = username;
    this.name = name;
    this.friends = friends;
  }

  public String getUsername() {
    return username;
  }

  public String getName() {
    return name;
  }

  public Collection<Friend> getFriends() {
    return friends.values();
  }

  public Friend getFriendByUsername(String username) {
    return friends.get(username);
  }

  public void addFriend(Friend friend) {
    friends.put(friend.getUsername(), friend);
  }

  public void removeFriendByUsername(String username) {
    friends.remove(username);
  }

}
