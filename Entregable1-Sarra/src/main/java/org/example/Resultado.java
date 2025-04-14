package org.example;

public class Resultado {
   public boolean Success;
   public String Message;

    public void setMessage(String message) {
        Message = message;
    }

    public void setSuccess(boolean success) {Success = success;
    }

    public String getMessage() {
        return Message;
    }

    public boolean getSuccess() {
        return Success;
    }
}
