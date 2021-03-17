package com.mytube;

public class NotificationService2021 implements NotificationService {
    public NotificationService2021() {
    }

    @Override
    public void notify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
