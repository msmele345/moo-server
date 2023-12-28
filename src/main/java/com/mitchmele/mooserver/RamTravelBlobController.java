package com.mitchmele.mooserver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class RamTravelBlobController {

    @GetMapping("/travel-blobs")
    public Mono<ResponseEntity<TravelBlobResponse>> getTravelBlobs() {
        return Mono.just(ResponseEntity.ok(TravelBlobResponse.builder().jsonBlobData("test json blob").build()));
    }
}
