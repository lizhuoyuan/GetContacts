package li.zhuoyuan.getcontacts;

import android.graphics.Bitmap;

/**
 * Created by 卓原 on 2016/8/2.
 */

public class Contact {
    private String name;
    private String number;
    private String email;
    private Bitmap bitmap;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact(String name, String number, String email, Bitmap bitmap) {
        this.name = name;
        this.number = number;
        this.bitmap = bitmap;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }
}
