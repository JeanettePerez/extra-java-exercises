package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video(); // create new video object
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor(
                new VideoEncoder2021(),
                new VideoDatabase2021(),
                new NotificationService2021()
        ); // to process the video
        processor.process(video);

        // TODO: extract 3 interfaces and have the video processor talk to those interfaces
    }
}
