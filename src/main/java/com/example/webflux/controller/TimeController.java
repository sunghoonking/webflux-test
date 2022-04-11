package com.example.webflux.controller;

import com.example.webflux.dto.EventResponseDto;
import com.example.webflux.exception.ContentException;
import com.example.webflux.exception.EventErrorCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TimeController {

    @GetMapping("/events")
    public Mono<List<EventResponseDto>> getEvents(
            @RequestParam("timeMin") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime timeMin,
            @RequestParam("timeMax") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime timeMax) throws ContentException {
        //todo timeMin, timeMax validation 같은 검증 로직 추가 필요
        Duration duration = Duration.between(timeMin, timeMax);

        System.out.println(duration.getSeconds());
        if(duration.getSeconds() <= 0){
            throw new ContentException(EventErrorCode.BROKEN_FORMAT_DATEDATA);
        } else {
            throw new IllegalArgumentException("안녕");
        }

    };




}
