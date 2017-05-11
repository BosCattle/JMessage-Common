import java.io.Serializable;

/**
 * @class: Message </br>
 * @description:  </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 11/05/2017 22:29</br>
 * @version: 0.0.1 </br>
 **/
public class Message implements Serializable {

  public String message;
  public String type;
  public String url;
  public int time;
  public String latitude;
  public String longitude;
  public String msgSender;
  public String msgReceived;
  public String chatType;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getMsgSender() {
    return msgSender;
  }

  public void setMsgSender(String msgSender) {
    this.msgSender = msgSender;
  }

  public String getMsgReceived() {
    return msgReceived;
  }

  public void setMsgReceived(String msgReceived) {
    this.msgReceived = msgReceived;
  }

  public String getChatType() {
    return chatType;
  }

  public void setChatType(String chatType) {
    this.chatType = chatType;
  }
}
