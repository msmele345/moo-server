package com.mitchmele.mooserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RamTravelBlobControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    private RamTravelBlobController ramTravelBlobController;


    @Test
    void shouldReturnOk() {

        webTestClient
                .get()
                .uri("/api/v1/travel-blobs")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(TravelBlobResponse.class);

    }
}