package com.mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            NotificationService notificationService) {
        this.notificationService = notificationService;
        this.encoder = encoder;
        this.database = database;
    }

    public void process(Video video) {
        encoder.encode(video); // encode the video for different screen sizes
        database.store(video); // store the meta data about the video in a database
        notificationService.notify(video.getUser()); // send an email to the person who uploaded the video
    }
}

