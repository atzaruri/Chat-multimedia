package com.is.chatmultimedia.models;

import java.io.Serializable;

public abstract class ClientMessage implements Serializable {

  private ClientMessageType messageType;
  private static final long serialVersionUID = 1;

  public enum ClientMessageType {
    REGISTER_RESPONSE, LOGIN_RESPONSE, CONVERSATION, USER_CAME_ONLINE, USER_WENT_OFFLINE, ADD_FRIEND_RESPONSE, DELETE_FRIEND_RESPONSE, FRIEND_REQUEST, NEW_FRIEND, SERVER_STOPPED
  }

  public ClientMessage(ClientMessageType messageType) {
    this.messageType = messageType;
  }

  public ClientMessageType getMessageType() {
    return this.messageType;
  }

}
