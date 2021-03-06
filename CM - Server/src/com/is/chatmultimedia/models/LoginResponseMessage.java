package com.is.chatmultimedia.models;

public class LoginResponseMessage extends ClientMessage {

  private boolean successful;
  private String message;
  private User userData;
  private static final long serialVersionUID = 1;

  public LoginResponseMessage(boolean successful, String message, User userData) {
    super(ClientMessageType.LOGIN_RESPONSE);
    this.successful = successful;
    this.message = message;
    this.userData = userData;
  }

  public boolean isSuccessful() {
    return this.successful;
  }

  public String getMessage() {
    return this.message;
  }

  public User getUserData() {
    return this.userData;
  }

}
